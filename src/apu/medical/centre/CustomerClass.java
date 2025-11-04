// Hao
package apu.medical.centre;
import com.toedter.calendar.JDateChooser;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CustomerClass extends User implements Individual{
    private String[] columnNames;

    public CustomerClass(User customer) {
        super(customer.getId(), customer.getUsername(), customer.getPassword(),customer.getRole(), customer.getFullName());
    }
    
    // Cancel appointment
    public boolean cancelAppointment(String appointmentId, User customer) {
        if (JOptionPane.showConfirmDialog(
            null, 
            "Are you sure you want to cancel this appointment?", 
            "Confirm Cancellation", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE) != JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Cancellation aborted.");
            return false;
        }
        // get the current date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        String currentDate = dateFormat.format(new Date());
        String currentTime = timeFormat.format(new Date());
        try {
            List<String> lines = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("src/appointment.txt"));
            String line;
            boolean found = false;    
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(appointmentId) && 
                    data[1].equals(customer.getFullName()) &&
                    data[7].trim().equalsIgnoreCase("Scheduled")) {
                    // Update status to Canceled and add cancellation reason
                    data[4] = "Patient requested cancellation.";
                    data[7] = "Canceled";
                    line = String.join(",", data);
                    found = true;
                }
                lines.add(line);
            }
            br.close();
            if (found) {
                BufferedWriter bw = new BufferedWriter(new FileWriter("src/appointment.txt"));
                for (String l : lines) {
                    bw.write(l);
                    bw.newLine();
                }
                bw.close();
                
                try (BufferedWriter pw = new BufferedWriter(new FileWriter("src/payment.txt", true))) {
                    String paymentRecord = String.join(",", appointmentId, "N/A", currentDate, currentTime, "N/A", "N/A");
                    pw.newLine();
                    pw.write(paymentRecord);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error saving cancellation.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            return found;
        } catch (IOException e) {
            System.err.println("Error cancelling appointment: " + e.getMessage());
            return false;
        }
    }
    
    // Reschedule appointment
    public boolean rescheduleAppointment(String appointmentId, User customer, String newDate, String newTime) {
        try {
            List<String> lines = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("src/appointment.txt"));
            String line;
            boolean found = false;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(appointmentId) && 
                    data[1].equals(customer.getFullName()) && 
                    data[7].trim().equalsIgnoreCase("Scheduled")) {
                    data[5] = newDate;
                    data[6] = newTime;
                    line = String.join(",", data);
                    found = true;
                }
                lines.add(line);
            }
            br.close();
            if (found) {
                BufferedWriter bw = new BufferedWriter(new FileWriter("src/appointment.txt"));
                for (String l : lines) {
                    bw.write(l);
                    bw.newLine();
                }
                bw.close();
                JOptionPane.showMessageDialog(null, "Appointment rescheduled successfully!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Appointment not found or cannot be rescheduled!");
                return false;
            }    
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error rescheduling appointment: " + e.getMessage());
            return false;
        }
    }
    
    // Load feedback table for submit comment panel
    public void loadFeedbackTable(JTable table, User customer) {
        try {
            List<String[]> feedbacks = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("src/appointment.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 8) {
                    String appointmentId = data[0];
                    String customerName = data[1];
                    String doctorName = data[2];
                    String date = data[5];
                    String status = data[7];
                    // Show completed appointments that customer can comment on
                    if (customerName.equals(customer.getFullName()) && 
                        status.trim().equalsIgnoreCase("Completed")) {
                        feedbacks.add(new String[]{
                            appointmentId, doctorName, date, status
                        });
                    }
                }
            }
            br.close();
            String[] columnNames = {"Appointment ID", "Doctor", "Date", "Status"};
            String[][] tableData = new String[feedbacks.size()][columnNames.length];
            for (int i = 0; i < feedbacks.size(); i++) {
                tableData[i] = feedbacks.get(i);
            }
            table.setModel(new DefaultTableModel(tableData, columnNames));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading feedback data: " + e.getMessage());
        }
        tableStyle(table);
        sortTable(table);
    }
    // Submit feedback/comments
    public boolean submitFeedback(String appointmentId, User customer, 
                                String staffComment, String doctorComment) {
        if ((staffComment == null || staffComment.trim().isEmpty()) && 
            (doctorComment == null || doctorComment.trim().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Please enter at least one comment!");
            return false;
        }
        try {
            // Check if payment record exists for this appointment
            List<String> paymentLines = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("src/payment.txt"));
            String line;
            boolean paymentExists = false;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(appointmentId)) {
                    // Update existing payment record with comments
                    if (data.length >= 6) {
                        data[4] = staffComment != null ? staffComment.trim() : "null";
                        data[5] = doctorComment != null ? doctorComment.trim() : "null";
                    }
                    line = String.join(",", data);
                    paymentExists = true;
                }
                paymentLines.add(line);
            }
            br.close();
            // Write back to payment file
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/payment.txt"));
            for (String l : paymentLines) {
                bw.write(l);
                bw.newLine();
            }
            bw.close();
            if (paymentExists) {
                JOptionPane.showMessageDialog(null, "Feedback submitted successfully!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No payment record found for this appointment!");
                return false;
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error submitting feedback: " + e.getMessage());
            return false;
        }
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

    
    
    // implements Individual interface
    @Override
    public void viewAppointment(JTable table, User user) {
        List<String[]> appointments = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/appointment.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 8) {
                    String appointmentId = data[0];
                    String customerName = data[1];
                    String doctorName = data[2];
                    String specialty = data[3];
                    String date = data[5];
                    String time = data[6];
                    String status = data[7];

                    if (user.getRole().equalsIgnoreCase("Customer")) {
                        if (customerName.equals(user.getFullName()) && status.trim().equals("Scheduled")) {
                            appointments.add(new String[]{appointmentId, doctorName, specialty, date, time, status});
                            columnNames = new String[]{"ID", "Doctor Name", "Specialty", "Date", "Time", "Status"};
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading appointment file: " + e.getMessage());
            e.printStackTrace();
        }
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        for (String[] rowData : appointments) {
            model.addRow(rowData);
        }
        table.setModel(model);
        tableStyle(table);
    }

    @Override
    public void viewHistory(JTable table, User user) {
        List<String[]> history = new ArrayList<>();
        Map<String, String[]> paymentMap = new HashMap<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader("src/payment.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 6) {
                    String appointmentId = data[0];
                    String charges = data[1];
                    String commentToStaff = data[4];
                    String commentToDoctor = data[5];
                    paymentMap.put(appointmentId, new String[]{charges, commentToStaff, commentToDoctor});
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading payment file: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("src/appointment.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 8) {
                    String appointmentId = data[0];
                    String customerName = data[1];
                    String doctorName = data[2];
                    String doctorFeedback = data[4];
                    String date = data[5];
                    String time = data[6];
                    String status = data[7];
                    String[] paymentData = paymentMap.get(appointmentId);

                    if (paymentData != null) {
                        String charges = paymentData[0];
                        String commentToStaff = paymentData[1];
                        String commentToDoctor = paymentData[2];
                        if (user.getRole().equalsIgnoreCase("Customer")) {
                            if (customerName.equals(user.getFullName()) && 
                               (status.equalsIgnoreCase("Completed") || status.equalsIgnoreCase("Outstanding") ||status.equalsIgnoreCase("Canceled"))) {
                                history.add(new String[]{appointmentId, doctorName, doctorFeedback, commentToStaff, commentToDoctor, charges, date, time, status});
                                columnNames = new String[]{"ID", "Doctor Name", "Doctor Review", "Comment to Staff", "Comment to Doctor", "Charges", "Date", "Time", "Status"};
                                System.out.println(user.getFullName());
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading appointment file: " + e.getMessage());
        }
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        for (String[] rowData : history) {
            model.addRow(rowData);
        }
        table.setModel(model);
        tableStyle(table);
    }
}    
