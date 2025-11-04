
package apu.medical.centre;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;



public abstract class User {
    protected String id;
    protected String username;
    protected String password;
    protected String role;
    protected String fullName;
    
    // constructor
    public User(){}
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public User(String id, String username, String password, String role, String fullName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.fullName = fullName;
    }

    // getter & setter
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    // login
    public static User login(String username,String password){
        try (BufferedReader br = new BufferedReader(new FileReader("src/user.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 5) {
                    String storedId = data[0].trim();
                    String storedUsername = data[1].trim(); 
                    String storedPassword = data[2].trim(); 
                    String storedRole = data[3].trim();
                    String storedFullName = data[4].trim();
                    if (storedUsername.equals(username) && storedPassword.equals(password)) {
                        User authenticateUser = new User() {};
                        
                        authenticateUser.setId(storedId);
                        authenticateUser.setUsername(storedUsername);
                        authenticateUser.setPassword(storedPassword);
                        authenticateUser.setRole(storedRole);
                        authenticateUser.setFullName(storedFullName);
                        return authenticateUser;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error accessing user data file: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;        
    }
    
    // table header properties
    protected static void tableStyle(JTable tb) {
        JTableHeader header = tb.getTableHeader();
        header.setBackground(new Color(51, 51, 255));
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Calibri", Font.BOLD, 14));
        tb.setDefaultEditor(Object.class, null);  // make table uneditable
    }
    
    // sortd table by default
    protected static void sortTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);

        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();

        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
    }
}
