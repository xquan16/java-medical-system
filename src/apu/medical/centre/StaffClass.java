// Chris
package apu.medical.centre;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;


public class StaffClass extends User implements CRUD{
    public StaffClass(User staff) {
        super(staff.getId(), staff.getUsername(), staff.getPassword(),staff.getRole(), staff.getFullName());
    }
    
    // auto generate appointment id
    public static void autoGenerateId(JTextField appontmentIDtxt) {
        int maxId = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("src/appointment.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length > 0 && data[0].startsWith("A")) {
                    try {
                        int num = Integer.parseInt(data[0].substring(1)); // Extract number (e.g., 002 from A002)
                        maxId = Math.max(maxId, num);
                    } catch (NumberFormatException e) {
                        // Ignore malformed IDs
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading appointments.txt: " + e.getMessage());
        }
        appontmentIDtxt.setText(String.format("A%03d", maxId + 1));
    }
           
    // load doctor in system
    public static void loadDoctor(JComboBox doctorNames){
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/user.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 5 && "Doctor".equalsIgnoreCase(data[3])) {
                    model.addElement("Dr. " + data[4]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading user.txt: " + e.getMessage());
        }
        doctorNames.setModel(model);
    }
            
    // only can select the future date
    public static void dateChooser(JDateChooser dateChooser) {
        Calendar tmr = Calendar.getInstance();
        tmr.add(Calendar.DAY_OF_MONTH, 1); // Set to tomorrow
        dateChooser.setMinSelectableDate(tmr.getTime());
    }        
    
    // available time
    public static void availableTime(JComboBox time, JDateChooser date) {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        if (date.getDate() == null) {
            time.setModel(model); // clear the model
            time.setEnabled(false);
            return;
        }
        // generate time slots from 10:00 AM to 7:00 PM
        for (int hour = 10; hour <= 19; hour++) {
            model.addElement(String.format("%02d:00", hour));
            if (hour < 19) {
                model.addElement(String.format("%02d:30", hour));
            }
        }
        // check booked time slot then remove it
        try (BufferedReader br = new BufferedReader(new FileReader("src/appointment.txt"))) {
            String line;
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // define date format
            String selectedDateStr = dateFormat.format(date.getDate());
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 8 && selectedDateStr.equals(data[5])) {
                    String bookedTime = data[6]; // time column
                    model.removeElement(bookedTime); // remove booked time
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading appointments.txt: " + e.getMessage());
        }
        time.setModel(model);
        time.setEnabled(true);
    }
    
    // book appointment, write into appointment.txt(appoinmentId, customerName, doctorName, specialty, doctor review, date, time, status)
    public void bookAppointment(JTable table, JTextField id, JComboBox specialty, JComboBox doctorName, JComboBox time, JDateChooser date) {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a customer from the table.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (date.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please select a date.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (specialty.getSelectedItem() == null || doctorName.getSelectedItem() == null || time.getSelectedItem() == null  ){
            JOptionPane.showMessageDialog(null, "Please filled all the appoinment details.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // retrieve customer info from  selected row
        String customerFullName = table.getValueAt(selectedRow, 3).toString();
        // retrieve info from combo boxes and date chooser
        String selectedSpecialty = specialty.getSelectedItem().toString();
        String selectedDoctor = doctorName.getSelectedItem().toString();
        String selectedTime = time.getSelectedItem().toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // date format
        String selectedDate = dateFormat.format(date.getDate());
        

        // appointment data
        String doctorReview = "N/A"; // default review
        String status = "Scheduled"; // default status
        String appointmentData = String.join(",", id.getText(), customerFullName, selectedDoctor, selectedSpecialty, doctorReview, selectedDate, selectedTime, status);
        // Confirmation dialog
        int confirmation = JOptionPane.showConfirmDialog(null,
                "<html>Are you sure you want to book this appointment?<br><br>" +
                "<b>Customer:</b> " + customerFullName + "<br>" +
                "<b>Specialty:</b> " + selectedSpecialty + "<br>" +
                "<b>Doctor:</b> " + selectedDoctor + "<br>" +
                "<b>Date:</b> " + selectedDate + "<br>" +
                "<b>Time:</b> " + selectedTime + "</html>",
                "Confirm Appointment",
                JOptionPane.YES_NO_OPTION);

        if (confirmation == JOptionPane.YES_OPTION) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/appointment.txt", true))) {
                bw.write(appointmentData);
                bw.newLine();
                JOptionPane.showMessageDialog(null, "Appointment booked successfully for " + customerFullName, "Success", JOptionPane.INFORMATION_MESSAGE);
                
                // clear fields 
                table.clearSelection();
                id.setText("");
                specialty.setSelectedIndex(-1);
                doctorName.setSelectedIndex(-1);
                time.setSelectedIndex(-1);
                time.disable();
                date.setDate(null);
            } catch (IOException e) {
                System.err.println("Error writing to appointment.txt: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Error saving appointment.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            return;
        }
        availableTime(time, date);
        autoGenerateId(id);
    }
    
    // load appointment.txt data to table(appoinmentId, customerName, doctorName - specialty, doctor review, status)
    public void loadPaymentData(JTable table) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Appointment ID", "Customer Name", "Doctor Name", "Doctor Review", "Status"},0);
        try (BufferedReader br = new BufferedReader(new FileReader("src/appointment.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 8) {
                    String status = data[7].trim();
                    if ("Outstanding".equals(status) || "Completed".equals(status)) {
                        String appointmentId = data[0];
                        String customerName = data[1];   
                        String doctorName = data[2];     
                        String specialty = data[3];      
                        String doctorReview = data[4]; 
                        model.addRow(new Object[]{appointmentId, customerName, doctorName + " - " + specialty, doctorReview, status});
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading appointment.txt: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (model.getRowCount() == 0){
            model = new DefaultTableModel(new String[]{"No found any outstanding or completed appointment records"},0);
        }
        tableStyle(table);
        table.setModel(model);
    }
    
    // search/filter payment or receipt
    public void search(JTable table, JComboBox filterBy, JTextField searchTxt){
        DefaultTableModel model = new DefaultTableModel(new String[]{"Appointment ID", "Customer Name", "Doctor Name", "Doctor Review", "Status"},0);
        String searchText = searchTxt.getText().trim().toLowerCase();
        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter something to search.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String filterby = filterBy.getSelectedItem().toString();
        boolean found = false;
        try (BufferedReader br = new BufferedReader(new FileReader("src/appointment.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 8) {
                    String appointmentId = data[0];
                    String customerName = data[1];
                    String status = data[7];

                    boolean matches = false;
                    if ("ID".equals(filterby) && appointmentId.toLowerCase().contains(searchText)) {
                        matches = true;
                    } else if ("Customer Name".equals(filterby) && customerName.toLowerCase().contains(searchText)) {
                        matches = true;
                    }
                    
                    if (matches && ("Outstanding".equals(status) || "Completed".equals(status))) {
                        String doctor = data[2] + " - " + data[3];
                        model.addRow(new Object[]{appointmentId, customerName, doctor, data[4], status});
                        found = true;
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading appointment.txt: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "No matching records found for " + searchText + ".", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            table.setModel(model);
        }
        
    }
    
    // show charges
    public void showCharge(JTable table, JPanel chargePanel, JLabel doctorReview, JLabel charge){
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            chargePanel.setVisible(false);
            return;
        }
        String status = table.getValueAt(selectedRow, 4).toString(); 
        if (!"Outstanding".equals(status)) {
            chargePanel.setVisible(false);
            return;
        }

        // get id and doctor review from table
        String appointmentId = table.getValueAt(selectedRow, 0).toString();
        String doctorReviewTxt = table.getValueAt(selectedRow, 3).toString();
        double amount = 0.0;
        // read payment.txt to get the amount
        try (BufferedReader br = new BufferedReader(new FileReader("src/payment.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 5 && appointmentId.equals(data[0])) {
                    amount = Double.parseDouble(data[1]);
                    break;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading payment.txt: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        doctorReview.setText(doctorReviewTxt);
        charge.setText(String.format("RM %.2f", amount));
        chargePanel.setVisible(true);
    } 
    
    //pay
    public void payment(JTable table, JPanel chargePanel, JLabel charge){
        String appointmentId = table.getValueAt(table.getSelectedRow(), 0).toString();
        String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new java.util.Date());

        // update status then store into array
        ArrayList<String> appointmentMemory = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/appointment.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 8 && data[0].equals(appointmentId)) {
                    data[7] = "Completed";
                    line = String.join(",", data);
                }
                appointmentMemory.add(line);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading appointment.txt: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // update date, time then store into array
        ArrayList<String> paymentMemory = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/payment.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 6 && data[0].equals(appointmentId)) {
                    data[2] = dateTime.split(" ")[0];
                    data[3] = dateTime.split(" ")[1]; 
                    data[4] = "N/A";
                    data[5] = "N/A";
                    line = String.join(",", data);
                }
                paymentMemory.add(line);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading payment.txt: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // overwrite appointment.txt
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/appointment.txt"))) {
            for (String line : appointmentMemory) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error updating appointment.txt: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // overwrite payment.txt
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/payment.txt"))) {
            for (String line : paymentMemory) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error updating payment.txt: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "Payment recorded for " + appointmentId, "Success", JOptionPane.INFORMATION_MESSAGE);
        loadPaymentData(table);
        chargePanel.setVisible(false);
    }
    
    // show receipt
    public void showReceipt(JTable table, JDialog receipt, JLabel paymentDate, JLabel id, JLabel customerName, JLabel doctor, JLabel review, JLabel amount){
        int selectedRow = table.getSelectedRow();
        String appointmentId = table.getValueAt(selectedRow, 0).toString();
        id.setText(appointmentId);
        customerName.setText(table.getValueAt(selectedRow, 1).toString());
        doctor.setText(table.getValueAt(selectedRow, 2).toString());
        review.setText("<html>" + table.getValueAt(selectedRow, 3).toString() + "</html>");

        try (BufferedReader br = new BufferedReader(new FileReader("src/payment.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 6 && data[0].equals(appointmentId)) {
                    paymentDate.setText(data[2] + " " + data[3]);
                    amount.setText("RM " + data[1]);
                    amount.setHorizontalAlignment(JLabel.RIGHT);
                    break;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading payment.txt: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String status = table.getValueAt(selectedRow, 4).toString();
        if(status.equals("Completed")){
            receipt.setVisible(true);
            receipt.setLocationRelativeTo(null);
        }
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
                if (data.length >= 5 && data[3].equals("Customer")) { // Only customers
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
                    // staff can only manage customer
                    if (column.toLowerCase().contains(searchText) && data[3].equalsIgnoreCase("Customer")) {
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
