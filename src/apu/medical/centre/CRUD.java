
package apu.medical.centre;
import java.io.*;
import java.util.*;
import javax.swing.*;


public interface CRUD {
    // validate id unique
    static boolean uniqueId(JTextField id) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/user.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length > 0 && data[0].equals(id.getText().trim())) {
                    JOptionPane.showMessageDialog(null, "ID already exists in system.", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading user file: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    // validate username unique
    static boolean uniqueUsername(JTextField username) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/user.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length > 1 && data[1].equals(username.getText().trim())) {
                    JOptionPane.showMessageDialog(null, "Username already exists in system.", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading user file: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    // load user data to JTable
    void loadDataToTable(JTable table);

    // create user
    default void createUser(JTextField id, JTextField username, JTextField password, String role, JTextField fullName){
        // validate text field
        if (id.getText().trim().isEmpty() || username.getText().trim().isEmpty() || password.getText().trim().isEmpty() || fullName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!uniqueId(id) || !uniqueUsername(username)) {
            return;
        }
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/user.txt", true))) {
            String newUser = String.join(",", id.getText(), username.getText(), password.getText(), role, fullName.getText());
            bw.newLine();
            bw.write(newUser);

            JOptionPane.showMessageDialog(null, "User added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing to file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally{
            id.setText("");
            username.setText("");
            password.setText("");
            fullName.setText("");
        }
    }

    // read/search user (*must be search/read after login, if not role will be null)
    void readUser(JTable table, JTextField searchTxt, JComboBox<String> filter);

    // delete user
    default void deleteUser(JTable table){
        int selectedRow = table.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a user to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String userId = table.getValueAt(selectedRow, 0).toString();
        String userName = table.getValueAt(selectedRow, 1).toString();
        
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete user: " 
                + userName + " (ID: " + userId + ")?", "Confirm Delete", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) {
            return;
        }
        
        ArrayList<String> non_delete_users = new ArrayList<>();  // create for store non-delete users
        
        try (BufferedReader br = new BufferedReader(new FileReader("src/user.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length > 0 && !data[0].equals(userId)) {
                    non_delete_users.add(line);  //if data[0] != id, write non-delete users into array
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading user.txt: " + e.getMessage());
            return;
        }
        
        // then overwrite non-delete users in array
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/user.txt"))) {
            for (int i = 0; i < non_delete_users.size(); i++) {
                bw.write(non_delete_users.get(i));
                if (i < non_delete_users.size() - 1) {
                    bw.newLine();
                }
            }
            JOptionPane.showMessageDialog(null, "User deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing to user.txt: " + e.getMessage());
        }
    }

    // display user data
    default void userData(JTable table, JTextField id, JTextField fullName, JTextField username, JTextField password, JComboBox role) {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            String userId = table.getValueAt(selectedRow, 0).toString();
            
            try (BufferedReader br = new BufferedReader(new FileReader("src/user.txt"))) {
                String line;
                boolean found = false;
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    if (data.length >= 5 && data[0].equals(userId)) {
                        id.setText(data[0]);
                        username.setText(data[1]);
                        password.setText(data[2]);
                        role.setSelectedItem(data[3]);
                        fullName.setText(data[4]);
                        id.setEnabled(false);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(null, "User data not found in system.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading user details: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // update user (concept: store (old version + updete the specific user)->became new version into arraylist first, then overwrite the user.txt)
    default void updateUser(JTable table, JTextField id, JTextField username, JTextField password, JTextField fullName, JComboBox<String> role) {
        int selectedRow = table.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a user to update.", "No User Selected", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (username.getText().trim().isEmpty() || password.getText().trim().isEmpty() || fullName.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill in all fields to update.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (selectedRow >= 0 && !table.getValueAt(selectedRow, 1).toString().equals(username.getText())) {
            if (!uniqueUsername(username)) {
                return;
            }
        }
        
        ArrayList<String> updatedUsers = new ArrayList<>();
        boolean userFound = false;
        try (BufferedReader br = new BufferedReader(new FileReader("src/user.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 5 && data[0].equals(id.getText())) {
                    String updatedLine = String.join(",", id.getText(), username.getText(), password.getText(), role.getSelectedItem().toString(), fullName.getText());
                    updatedUsers.add(updatedLine);
                    userFound = true;
                } else {
                    updatedUsers.add(line);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading user data file: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!userFound) {
            JOptionPane.showMessageDialog(null, "User not found.", "Update Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/user.txt"))) {
            for (int i = 0; i < updatedUsers.size(); i++) {
                bw.write(updatedUsers.get(i));
                // add new line after one user
                if (i < updatedUsers.size() - 1) {
                    bw.newLine();
                }
            }
            JOptionPane.showMessageDialog(null, "User updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing to user data file: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
        } finally{
            id.setText("");
            username.setText("");
            password.setText("");
            fullName.setText("");
            loadDataToTable(table);
        }
    }
}
