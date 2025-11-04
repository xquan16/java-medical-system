// Kaemon
package apu.medical.centre;
import static apu.medical.centre.User.tableStyle;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class DoctorClass extends User implements Individual{
    private String id;
    private String charges;
    private String feedback;
    private String[] columnNames;
    
    public DoctorClass(User doctor) {
        super(doctor.getId(), doctor.getUsername(), doctor.getPassword(),doctor.getRole(), doctor.getFullName());
    }
    
    public DoctorClass(String id, String charges, String feedback){
        super();
        this.id = id;
        this.charges = charges;
        if (feedback.isEmpty()) {
            this.feedback = "N/A";
        } else {
            this.feedback = feedback;
        }
    }
    
    // enter feedback, default N/A
    public boolean enterFeedback(){
        List<String> updatedlines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/appointment.txt"))) {
            String line;
             while((line = br.readLine()) != null){
                String[] data = line.split(",",-1);
                if(data[0].equals(id)){
                    data[4] = feedback;
                    line = String.join(",", data);
                }
                updatedlines.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/appointment.txt"))){
            for(String lines:updatedlines){
                bw.write(lines);
                bw.newLine();
            }
            if (!"N/A".equals(feedback)) {
                JOptionPane.showMessageDialog(null, "Feedback saved successfully!");
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error saving feedback!");
            return false;
        }
    }
    
    // enter charges, and update appointment status = Outstanding
    public boolean enterCharges() {
        List<String> updatedAppointmentLines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/appointment.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", -1);
                if (data.length >= 8 && data[0].equals(id)) {
                        data[7] = "Outstanding"; // update status
                        line = String.join(",", data);
                }
                updatedAppointmentLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        // overwrite appointment.txt
        try (BufferedWriter bwA = new BufferedWriter(new FileWriter("src/appointment.txt"))) {
            for (String line : updatedAppointmentLines) {
                bwA.write(line);
                bwA.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error updating appointment status!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        // update charges
        try (BufferedWriter bwP = new BufferedWriter(new FileWriter("src/payment.txt", true))) {
            bwP.newLine();
            bwP.write(id + "," + charges + "," + "N/A,N/A,N/A,N/A");
            JOptionPane.showMessageDialog(null, "Charges saved successfully!");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error saving charges!");
            return false;
        }
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

                    if (user.getRole().equalsIgnoreCase("Doctor")) {
                        if (doctorName.equals("Dr. " + user.getFullName()) && status.trim().equals("Scheduled")) {
                            appointments.add(new String[]{appointmentId, customerName, specialty, date, time, status});
                            columnNames = new String[]{"ID", "Customer Name", "Specialty", "Date", "Time", "Status"};
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
                        String commentToDoctor = paymentData[2];
                        if (user.getRole().equalsIgnoreCase("Doctor")) {
                            if (doctorName.equals("Dr. " + user.getFullName()) && 
                               (status.equalsIgnoreCase("Completed") || status.equalsIgnoreCase("Outstanding"))) {
                                history.add(new String[]{appointmentId, customerName, doctorFeedback, commentToDoctor, charges, date, time, status});
                                columnNames = new String[]{"ID", "Customer Name", "Doctor Review", "Customer Feedback", "Charges", "Date", "Time", "Status"};
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

