
package apu.medical.centre;
import java.io.*;
import java.util.*;
import javax.swing.*;

public interface Individual {
    void viewAppointment(JTable table, User user);
    
    default void editProfile(User user, String newUsername, String newPassword){
        user.setPassword(newPassword);
        user.setUsername(newUsername);
        try {
            List<String> lines = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("src/user.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    if (data[0].trim().equals(user.getId())) {
                        line = user.getId() + "," + newUsername + "," + newPassword + "," + user.getRole() + "," + user.getFullName();
                    }
                    lines.add(line);
                }
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/user.txt"))) {
                for (String l : lines) {
                    bw.write(l);
                    bw.newLine();
                }
            }
            JOptionPane.showMessageDialog(null, "Profile updated successfully...Please login again...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    void viewHistory(JTable table, User user);
}
