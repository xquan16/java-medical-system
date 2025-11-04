// Rijesh
package apu.medical.centre;

import static apu.medical.centre.User.*;
import java.io.*;
import javax.swing.*;
import javax.swing.table.*;

public class ManagerClass extends User implements CRUD{
    public ManagerClass(User Manager){
        super(Manager.getId(), Manager.getUsername(), Manager.getPassword(),Manager.getRole(), Manager.getFullName());
    }
    
    public DefaultTableModel generateReport() {
        int rowCount = 0;
        double totalAmount = 0;
        int feedbackCount = 0;

        try {
            InputStream is = getClass().getResourceAsStream("/payment.txt");
            if (is == null) {
                JOptionPane.showMessageDialog(null, "payment.txt not found in classpath!");
                return null;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", -1);
                if (data.length == 6) {
                    rowCount++;

                    // Amount (column 2)
                    try {
                        totalAmount += Double.parseDouble(data[1].trim());
                    } catch (Exception e) {}

                    // Feedback (columns 5, 6)
                    String staff = data[4].trim();
                    String doctor = data[5].trim();

                    if (!staff.equalsIgnoreCase("null") && !staff.isEmpty()) {
                        feedbackCount++;
                    } else if (!doctor.equalsIgnoreCase("null") && !doctor.isEmpty()) {
                        feedbackCount++;
                    }
                }
            }

            // Build Table Model
            DefaultTableModel reportModel = new DefaultTableModel();
            reportModel.addColumn("Metric");
            reportModel.addColumn("Value");

            reportModel.addRow(new Object[]{"Total Appointments", rowCount});
            reportModel.addRow(new Object[]{"Total Revenue", totalAmount});
            reportModel.addRow(new Object[]{"Feedback Provided", feedbackCount + "/" + rowCount});

            return reportModel;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error reading payment data: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel loadAppointmentsModel() {
        DefaultTableModel model = new DefaultTableModel(
            new String[]{"Id", "Customer", "DoctorName", "Speciality", "Doctor Review", "Date", "Time", "Status"}, 0);

        try {
            InputStream is = getClass().getResourceAsStream("/appointment.txt");
            if (is == null) {
                JOptionPane.showMessageDialog(null, "appointment.txt not found in classpath!");
                return model;
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",", -1);
                    if (data.length == 8) {
                        // Trim whitespace
                        for (int i = 0; i < data.length; i++) {
                            data[i] = data[i].trim();
                        }
                        // Add row directly
                        model.addRow(new Object[]{
                            data[0], // Id
                            data[1], // Customer
                            data[2], // DoctorName
                            data[3], // Speciality
                            data[4], // Doctor Review (Notes)
                            data[5], // Date
                            data[6], // Time
                            data[7]  // Status
                        });
                    } else {
                        System.out.println("Skipping line (wrong column count): " + line);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                "Error reading appointment data: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
        return model;
    }

    public DefaultTableModel loadPaymentsModel() {
        DefaultTableModel model = new DefaultTableModel(
            new String[]{"AppointmentID", "StaffFeedback", "DoctorFeedback"}, 0);

        try {
            InputStream is = getClass().getResourceAsStream("/payment.txt");
            if (is == null) {
                JOptionPane.showMessageDialog(null, "payment.txt not found in classpath!");
                return model;
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",", -1);
                    if (data.length == 6) {
                        // AppointmentID = index 0
                        // StaffFeedback = index 4
                        // DoctorFeedback = index 5
                        String appointmentID = data[0].trim();
                        String staffFeedback = data[4].trim();
                        String doctorFeedback = data[5].trim();

                        model.addRow(new Object[]{appointmentID, staffFeedback, doctorFeedback});
                    } else {
                        System.out.println("Skipping line (wrong column count): " + line);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                "Error reading payment data: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
        return model;
    }


    
    // implements CRUD interface
    @Override
    public void loadDataToTable(JTable table) {
        String[] columnNames = {"ID", "Username", "Role", "Full Name"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        try (BufferedReader br = new BufferedReader(new FileReader("src/user.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 5 && (data[3].equals("Manager") || data[3].equals("Staff") || data[3].equals("Doctor"))) {
                    Object[] userInfo = {data[0], data[1], data[3], data[4]};
                    model.addRow(userInfo);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading user.txt: " + e.getMessage());
        }
        table.setModel(model);
        tableStyle(table);
        sortTable(table);
    }

    @Override
    public void readUser(JTable table, JTextField searchTxt, JComboBox<String> filter) {
        if (searchTxt.getText().trim().isEmpty()){
            loadDataToTable(table);
            JOptionPane.showMessageDialog(null, "Please enter somethings to search.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String searchText = searchTxt.getText().trim().toLowerCase();
        String filterBy = filter.getSelectedItem().toString().toLowerCase();

        String[] columnNames = {"ID", "Username", "Role", "Full Name"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader("src/user.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 5) {
                    String column = "";
                    // get data, match filterBy with searchText
                    switch (filterBy) {
                        case "id" -> column = data[0];
                        case "username" -> column = data[1];
                        case "role" -> column = data[3];
                        case "full name" -> column = data[4];
                    }
                    if (column.toLowerCase().contains(searchText) && (data[3].equalsIgnoreCase("Manager") || data[3].equalsIgnoreCase("Staff") || data[3].equalsIgnoreCase("Doctor"))) {
                        model.addRow(new Object[] {data[0], data[1], data[3], data[4]});
                        found = true;
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading user.txt: " + e.getMessage());
        }
        table.setModel(model);
        tableStyle(table);
        sortTable(table);

        if (!found){
            JOptionPane.showMessageDialog(null, "No results found for your search.", "No Results", JOptionPane.INFORMATION_MESSAGE);
            loadDataToTable(table);
        }
    }

}


