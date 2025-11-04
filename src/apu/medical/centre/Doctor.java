
package apu.medical.centre;
import javax.swing.*;


public class Doctor extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Doctor.class.getName());
    
    private String username,role,password,fullname,id;
    private String encrypt_password = "";
    private User doctor;
    
    public Doctor(User doctor) {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("APU Medical Center (Doctor)");
        DoctorClass psn = new DoctorClass(doctor);
        psn.viewAppointment(appointmentTable, doctor);
        
        this.doctor = doctor;
        this.doctorNameLabel.setText(doctor.getFullName());
        id = doctor.getId();
        username = doctor.getUsername();
        role = doctor.getRole();
        password = doctor.getPassword();
        fullname = doctor.getFullName();
        this.remove(ProfilePanel);
        this.remove(processPanel);
        this.remove(EditProfilePanel);
        this.remove(viewHistoryPanel);
        this.headerLabel.setText("Hi, " + username);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        backBtn1 = new javax.swing.JButton();
        ProfilePanel = new javax.swing.JPanel();
        userBigPic = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        idUserLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameUserLabel = new javax.swing.JLabel();
        fullNameLabel = new javax.swing.JLabel();
        fullNameUserLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordUserLabel = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();
        roleUserLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        doctorPanel = new javax.swing.JPanel();
        JScrollPane = new javax.swing.JScrollPane();
        appointmentTable = new javax.swing.JTable();
        profileButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        processAppointmentButton = new javax.swing.JButton();
        doctorNameLabel = new javax.swing.JLabel();
        viewHistoryButton = new javax.swing.JButton();
        processPanel = new javax.swing.JPanel();
        userBigPic2 = new javax.swing.JButton();
        customerNameLabel = new javax.swing.JLabel();
        customerNameUserLabel = new javax.swing.JLabel();
        departmentLabel = new javax.swing.JLabel();
        departmentUserLabel = new javax.swing.JLabel();
        chargesLabel = new javax.swing.JLabel();
        chargesTextfield = new javax.swing.JTextField();
        feedbackLabel = new javax.swing.JLabel();
        feedbackTextfield = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        appointmentIDLabel = new javax.swing.JLabel();
        appointmentIDUserLabel = new javax.swing.JLabel();
        EditProfilePanel = new javax.swing.JPanel();
        userBigPic1 = new javax.swing.JButton();
        idLabel1 = new javax.swing.JLabel();
        fullnameUserLabel1 = new javax.swing.JLabel();
        newusernameLabel = new javax.swing.JLabel();
        newfullNameLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        roleLabel1 = new javax.swing.JLabel();
        roleUserLabel1 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        newUsernameTextfield = new javax.swing.JTextField();
        newPasswordTextfield = new javax.swing.JTextField();
        idUserLabel1 = new javax.swing.JLabel();
        viewHistoryPanel = new javax.swing.JPanel();
        JScrollPane1 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        showButton = new javax.swing.JButton();
        refreshButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 900, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        header.setBackground(new java.awt.Color(0, 153, 255));

        headerLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setText("Home Page");

        homeButton.setBackground(new java.awt.Color(0, 153, 255));
        homeButton.setForeground(new java.awt.Color(0, 153, 255));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        homeButton.setBorder(null);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        backBtn1.setBackground(new java.awt.Color(204, 255, 255));
        backBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        backBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backBtn1.setBorderPainted(false);
        backBtn1.setContentAreaFilled(false);
        backBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backBtn1.setFocusPainted(false);
        backBtn1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        backBtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backBtn1.setMaximumSize(new java.awt.Dimension(36, 36));
        backBtn1.setPreferredSize(new java.awt.Dimension(35, 35));
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 385, Short.MAX_VALUE)
                .addComponent(backBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(homeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headerLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        ProfilePanel.setBackground(new java.awt.Color(204, 255, 255));
        ProfilePanel.setMaximumSize(new java.awt.Dimension(900, 600));
        ProfilePanel.setMinimumSize(new java.awt.Dimension(0, 0));
        ProfilePanel.setPreferredSize(new java.awt.Dimension(900, 600));

        userBigPic.setBackground(new java.awt.Color(204, 255, 255));
        userBigPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/userbig.png"))); // NOI18N
        userBigPic.setBorder(null);
        userBigPic.setFocusPainted(false);

        idLabel.setBackground(new java.awt.Color(204, 255, 255));
        idLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        idLabel.setForeground(new java.awt.Color(51, 51, 255));
        idLabel.setText("ID: ");

        idUserLabel.setBackground(new java.awt.Color(204, 255, 255));
        idUserLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        idUserLabel.setForeground(new java.awt.Color(51, 51, 255));

        usernameLabel.setBackground(new java.awt.Color(204, 255, 255));
        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(51, 51, 255));
        usernameLabel.setText("Username: ");

        usernameUserLabel.setBackground(new java.awt.Color(204, 255, 255));
        usernameUserLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        usernameUserLabel.setForeground(new java.awt.Color(51, 51, 255));

        fullNameLabel.setBackground(new java.awt.Color(204, 255, 255));
        fullNameLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        fullNameLabel.setForeground(new java.awt.Color(51, 51, 255));
        fullNameLabel.setText("Full Name: ");

        fullNameUserLabel.setBackground(new java.awt.Color(204, 255, 255));
        fullNameUserLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        fullNameUserLabel.setForeground(new java.awt.Color(51, 51, 255));

        passwordLabel.setBackground(new java.awt.Color(204, 255, 255));
        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 51, 255));
        passwordLabel.setText("Password: ");

        passwordUserLabel.setBackground(new java.awt.Color(204, 255, 255));
        passwordUserLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        passwordUserLabel.setForeground(new java.awt.Color(51, 51, 255));

        roleLabel.setBackground(new java.awt.Color(204, 255, 255));
        roleLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        roleLabel.setForeground(new java.awt.Color(51, 51, 255));
        roleLabel.setText("Role:");

        roleUserLabel.setBackground(new java.awt.Color(204, 255, 255));
        roleUserLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        roleUserLabel.setForeground(new java.awt.Color(51, 51, 255));

        editButton.setBackground(new java.awt.Color(255, 255, 255));
        editButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        editButton.setForeground(new java.awt.Color(51, 51, 255));
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProfilePanelLayout = new javax.swing.GroupLayout(ProfilePanel);
        ProfilePanel.setLayout(ProfilePanelLayout);
        ProfilePanelLayout.setHorizontalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfilePanelLayout.createSequentialGroup()
                .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfilePanelLayout.createSequentialGroup()
                        .addContainerGap(299, Short.MAX_VALUE)
                        .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProfilePanelLayout.createSequentialGroup()
                                .addComponent(fullNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fullNameUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProfilePanelLayout.createSequentialGroup()
                                .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(usernameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idUserLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ProfilePanelLayout.createSequentialGroup()
                                .addComponent(roleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(roleUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProfilePanelLayout.createSequentialGroup()
                                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfilePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(userBigPic, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGap(279, 279, 279))
        );
        ProfilePanelLayout.setVerticalGroup(
            ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfilePanelLayout.createSequentialGroup()
                .addComponent(userBigPic, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fullNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fullNameUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roleUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(editButton)
                .addGap(69, 69, 69))
        );

        doctorPanel.setBackground(new java.awt.Color(204, 255, 255));
        doctorPanel.setMaximumSize(new java.awt.Dimension(900, 600));
        doctorPanel.setPreferredSize(new java.awt.Dimension(900, 600));

        JScrollPane.setBackground(new java.awt.Color(153, 255, 255));
        JScrollPane.setForeground(new java.awt.Color(51, 51, 255));
        JScrollPane.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        appointmentTable.setBackground(new java.awt.Color(204, 255, 255));
        appointmentTable.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        appointmentTable.setForeground(new java.awt.Color(51, 51, 255));
        appointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        appointmentTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        appointmentTable.setRowHeight(25);
        appointmentTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        JScrollPane.setViewportView(appointmentTable);

        profileButton.setBackground(new java.awt.Color(204, 255, 255));
        profileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.png"))); // NOI18N
        profileButton.setToolTipText("");
        profileButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profileButton.setBorderPainted(false);
        profileButton.setContentAreaFilled(false);
        profileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        profileButton.setFocusPainted(false);
        profileButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        profileButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        profileButton.setMaximumSize(new java.awt.Dimension(36, 36));
        profileButton.setPreferredSize(new java.awt.Dimension(35, 35));
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        refreshButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(51, 51, 255));
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        processAppointmentButton.setBackground(new java.awt.Color(255, 255, 255));
        processAppointmentButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        processAppointmentButton.setForeground(new java.awt.Color(51, 51, 255));
        processAppointmentButton.setText("Process Appointment");
        processAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processAppointmentButtonActionPerformed(evt);
            }
        });

        doctorNameLabel.setBackground(new java.awt.Color(204, 255, 255));
        doctorNameLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        doctorNameLabel.setForeground(new java.awt.Color(51, 51, 255));

        viewHistoryButton.setBackground(new java.awt.Color(255, 255, 255));
        viewHistoryButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        viewHistoryButton.setForeground(new java.awt.Color(51, 51, 255));
        viewHistoryButton.setText("View History");
        viewHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHistoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout doctorPanelLayout = new javax.swing.GroupLayout(doctorPanel);
        doctorPanel.setLayout(doctorPanelLayout);
        doctorPanelLayout.setHorizontalGroup(
            doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(processAppointmentButton)
                .addGap(78, 78, 78))
            .addGroup(doctorPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(doctorPanelLayout.createSequentialGroup()
                        .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(doctorNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        doctorPanelLayout.setVerticalGroup(
            doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorPanelLayout.createSequentialGroup()
                .addGroup(doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doctorPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(doctorNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(doctorPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(doctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        processPanel.setBackground(new java.awt.Color(204, 255, 255));

        userBigPic2.setBackground(new java.awt.Color(204, 255, 255));
        userBigPic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/userbig.png"))); // NOI18N
        userBigPic2.setBorder(null);
        userBigPic2.setFocusPainted(false);

        customerNameLabel.setBackground(new java.awt.Color(204, 255, 255));
        customerNameLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        customerNameLabel.setForeground(new java.awt.Color(51, 51, 255));
        customerNameLabel.setText("Customer Name: ");

        customerNameUserLabel.setBackground(new java.awt.Color(204, 255, 255));
        customerNameUserLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        customerNameUserLabel.setForeground(new java.awt.Color(51, 51, 255));

        departmentLabel.setBackground(new java.awt.Color(204, 255, 255));
        departmentLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        departmentLabel.setForeground(new java.awt.Color(51, 51, 255));
        departmentLabel.setText("Specialty:");

        departmentUserLabel.setBackground(new java.awt.Color(204, 255, 255));
        departmentUserLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        departmentUserLabel.setForeground(new java.awt.Color(51, 51, 255));

        chargesLabel.setBackground(new java.awt.Color(204, 255, 255));
        chargesLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chargesLabel.setForeground(new java.awt.Color(51, 51, 255));
        chargesLabel.setText("Charges: ");

        chargesTextfield.setBackground(new java.awt.Color(153, 255, 255));
        chargesTextfield.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chargesTextfield.setForeground(new java.awt.Color(0, 0, 255));
        chargesTextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));
        chargesTextfield.setName(""); // NOI18N
        chargesTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargesTextfieldActionPerformed(evt);
            }
        });

        feedbackLabel.setBackground(new java.awt.Color(204, 255, 255));
        feedbackLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        feedbackLabel.setForeground(new java.awt.Color(51, 51, 255));
        feedbackLabel.setText("Review:");

        feedbackTextfield.setBackground(new java.awt.Color(153, 255, 255));
        feedbackTextfield.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        feedbackTextfield.setForeground(new java.awt.Color(0, 0, 255));
        feedbackTextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));
        feedbackTextfield.setName(""); // NOI18N

        Submit.setBackground(new java.awt.Color(255, 255, 255));
        Submit.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Submit.setForeground(new java.awt.Color(51, 51, 255));
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        appointmentIDLabel.setBackground(new java.awt.Color(204, 255, 255));
        appointmentIDLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        appointmentIDLabel.setForeground(new java.awt.Color(51, 51, 255));
        appointmentIDLabel.setText("Appointment ID: ");

        appointmentIDUserLabel.setBackground(new java.awt.Color(204, 255, 255));
        appointmentIDUserLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        appointmentIDUserLabel.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout processPanelLayout = new javax.swing.GroupLayout(processPanel);
        processPanel.setLayout(processPanelLayout);
        processPanelLayout.setHorizontalGroup(
            processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanelLayout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(userBigPic2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, processPanelLayout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, processPanelLayout.createSequentialGroup()
                        .addComponent(appointmentIDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appointmentIDUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(processPanelLayout.createSequentialGroup()
                            .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(departmentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chargesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(feedbackLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(customerNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(customerNameUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(departmentUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chargesTextfield)
                                .addComponent(feedbackTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(processPanelLayout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(258, 267, Short.MAX_VALUE))
        );
        processPanelLayout.setVerticalGroup(
            processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanelLayout.createSequentialGroup()
                .addComponent(userBigPic2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appointmentIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appointmentIDUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerNameUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processPanelLayout.createSequentialGroup()
                        .addComponent(departmentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chargesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chargesTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(processPanelLayout.createSequentialGroup()
                        .addComponent(departmentUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feedbackLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(feedbackTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(Submit)
                .addGap(66, 66, 66))
        );

        EditProfilePanel.setBackground(new java.awt.Color(204, 255, 255));
        EditProfilePanel.setMaximumSize(new java.awt.Dimension(900, 600));
        EditProfilePanel.setPreferredSize(new java.awt.Dimension(900, 600));

        userBigPic1.setBackground(new java.awt.Color(204, 255, 255));
        userBigPic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/userbig.png"))); // NOI18N
        userBigPic1.setBorder(null);
        userBigPic1.setFocusPainted(false);

        idLabel1.setBackground(new java.awt.Color(204, 255, 255));
        idLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        idLabel1.setForeground(new java.awt.Color(51, 51, 255));
        idLabel1.setText("ID: ");

        fullnameUserLabel1.setBackground(new java.awt.Color(204, 255, 255));
        fullnameUserLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        fullnameUserLabel1.setForeground(new java.awt.Color(51, 51, 255));

        newusernameLabel.setBackground(new java.awt.Color(204, 255, 255));
        newusernameLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        newusernameLabel.setForeground(new java.awt.Color(51, 51, 255));
        newusernameLabel.setText("New Username: ");

        newfullNameLabel.setBackground(new java.awt.Color(204, 255, 255));
        newfullNameLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        newfullNameLabel.setForeground(new java.awt.Color(51, 51, 255));
        newfullNameLabel.setText("Full Name: ");

        newPasswordLabel.setBackground(new java.awt.Color(204, 255, 255));
        newPasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        newPasswordLabel.setForeground(new java.awt.Color(51, 51, 255));
        newPasswordLabel.setText("New Password: ");

        roleLabel1.setBackground(new java.awt.Color(204, 255, 255));
        roleLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        roleLabel1.setForeground(new java.awt.Color(51, 51, 255));
        roleLabel1.setText("Role:");

        roleUserLabel1.setBackground(new java.awt.Color(204, 255, 255));
        roleUserLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        roleUserLabel1.setForeground(new java.awt.Color(51, 51, 255));

        saveButton.setBackground(new java.awt.Color(255, 255, 255));
        saveButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        saveButton.setForeground(new java.awt.Color(51, 51, 255));
        saveButton.setActionCommand("Save");
        saveButton.setLabel("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        newUsernameTextfield.setBackground(new java.awt.Color(153, 255, 255));
        newUsernameTextfield.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        newUsernameTextfield.setForeground(new java.awt.Color(0, 0, 255));
        newUsernameTextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));
        newUsernameTextfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        newUsernameTextfield.setName(""); // NOI18N

        newPasswordTextfield.setBackground(new java.awt.Color(153, 255, 255));
        newPasswordTextfield.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        newPasswordTextfield.setForeground(new java.awt.Color(0, 0, 255));
        newPasswordTextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));
        newPasswordTextfield.setName(""); // NOI18N

        idUserLabel1.setBackground(new java.awt.Color(204, 255, 255));
        idUserLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        idUserLabel1.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout EditProfilePanelLayout = new javax.swing.GroupLayout(EditProfilePanel);
        EditProfilePanel.setLayout(EditProfilePanelLayout);
        EditProfilePanelLayout.setHorizontalGroup(
            EditProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditProfilePanelLayout.createSequentialGroup()
                .addGroup(EditProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditProfilePanelLayout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(userBigPic1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EditProfilePanelLayout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(EditProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EditProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(EditProfilePanelLayout.createSequentialGroup()
                                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(113, 113, 113))
                                .addGroup(EditProfilePanelLayout.createSequentialGroup()
                                    .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(newPasswordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(EditProfilePanelLayout.createSequentialGroup()
                                .addComponent(roleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(roleUserLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditProfilePanelLayout.createSequentialGroup()
                                .addGroup(EditProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(EditProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(idLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(newusernameLabel))
                                    .addComponent(newfullNameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(EditProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newUsernameTextfield)
                                    .addComponent(idUserLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fullnameUserLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(279, Short.MAX_VALUE))
        );
        EditProfilePanelLayout.setVerticalGroup(
            EditProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditProfilePanelLayout.createSequentialGroup()
                .addComponent(userBigPic1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(EditProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditProfilePanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(idLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EditProfilePanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(idUserLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EditProfilePanelLayout.createSequentialGroup()
                        .addGroup(EditProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newusernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newUsernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newfullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fullnameUserLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roleUserLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPasswordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        viewHistoryPanel.setBackground(new java.awt.Color(204, 255, 255));

        JScrollPane1.setBackground(new java.awt.Color(204, 255, 255));
        JScrollPane1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        historyTable.setBackground(new java.awt.Color(204, 255, 255));
        historyTable.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        historyTable.setForeground(new java.awt.Color(51, 51, 255));
        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        historyTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        historyTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        historyTable.setRowHeight(25);
        historyTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        JScrollPane1.setViewportView(historyTable);

        showButton.setBackground(new java.awt.Color(255, 255, 255));
        showButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        showButton.setForeground(new java.awt.Color(51, 51, 255));
        showButton.setText("Show");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        refreshButton1.setBackground(new java.awt.Color(255, 255, 255));
        refreshButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        refreshButton1.setForeground(new java.awt.Color(51, 51, 255));
        refreshButton1.setText("Refresh");
        refreshButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewHistoryPanelLayout = new javax.swing.GroupLayout(viewHistoryPanel);
        viewHistoryPanel.setLayout(viewHistoryPanelLayout);
        viewHistoryPanelLayout.setHorizontalGroup(
            viewHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewHistoryPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(JScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewHistoryPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(showButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
        );
        viewHistoryPanelLayout.setVerticalGroup(
            viewHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewHistoryPanelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(JScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(viewHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doctorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(ProfilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(processPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(EditProfilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(viewHistoryPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(doctorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 40, Short.MAX_VALUE)
                    .addComponent(ProfilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 40, Short.MAX_VALUE)
                    .addComponent(processPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 40, Short.MAX_VALUE)
                    .addComponent(EditProfilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 40, Short.MAX_VALUE)
                    .addComponent(viewHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 560, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        this.headerLabel.setText("Doctor Profile");
        this.remove(doctorPanel);
        this.revalidate();
        this.repaint();
        this.add(ProfilePanel);
        encrypt_password = "";
        this.idUserLabel.setText(id);
        this.usernameUserLabel.setText(username);
        this.fullNameUserLabel.setText(fullname);
        this.roleUserLabel.setText(role);
        for(int i = 0; i < password.length();i++){
            encrypt_password += "*";
        }
        this.passwordUserLabel.setText(encrypt_password);
    }//GEN-LAST:event_profileButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        DoctorClass psn = new DoctorClass(doctor);
        psn.viewAppointment(appointmentTable, doctor);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        // TODO add your handling code here:
        Login user = new Login();
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtn1ActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        this.headerLabel.setText("Edit Profile");
        this.remove(ProfilePanel);
        this.revalidate();
        this.repaint();
        this.add(EditProfilePanel);
        this.idUserLabel1.setText(id);
        this.roleUserLabel1.setText(role);
        this.fullnameUserLabel1.setText(fullname);
    }//GEN-LAST:event_editButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        String newUsernameInput = this.newUsernameTextfield.getText().trim();
        String newPasswordInput = this.newPasswordTextfield.getText().trim();
        if(newUsernameInput.isEmpty()){
            newUsernameInput = doctor.getUsername();
        }
        if(newPasswordInput.isEmpty()){
            newPasswordInput = doctor.getPassword();
        }
        if (newUsernameInput.isEmpty() && newPasswordInput.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter new username and password");
            return;
        }
        DoctorClass psn = new DoctorClass(doctor);
        psn.editProfile(doctor, newUsernameInput, newPasswordInput);
        this.remove(EditProfilePanel);
        this.revalidate();
        this.repaint();
        Login user = new Login();
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void viewHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHistoryButtonActionPerformed
        // TODO add your handling code here:
        this.headerLabel.setText("Appointment History");
        this.remove(doctorPanel);
        this.revalidate();
        this.repaint();
        this.add(viewHistoryPanel);
        DoctorClass psn = new DoctorClass(doctor);
        psn.viewHistory(historyTable, doctor);
    }//GEN-LAST:event_viewHistoryButtonActionPerformed

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = historyTable.getSelectedRow(); 
        if (selectedRow != -1) {
            String id = historyTable.getValueAt(selectedRow, 0).toString();
            String customerName = historyTable.getValueAt(selectedRow, 1).toString();
            String doctorFeedback = historyTable.getValueAt(selectedRow, 2).toString();
            String commentToDoctor = historyTable.getValueAt(selectedRow, 3).toString();
            String charges      = historyTable.getValueAt(selectedRow, 4).toString();
            String date         = historyTable.getValueAt(selectedRow, 5).toString();
            String time         = historyTable.getValueAt(selectedRow, 6).toString();
            String status       = historyTable.getValueAt(selectedRow, 7).toString();
            JOptionPane.showMessageDialog(null, "Appointment ID: " + id + "\n"
                    + "Customer: " + customerName + "\n"
                    + "Doctor Review: " + doctorFeedback + "\n"
                    + "Customer Feedback: " + commentToDoctor + "\n"
                    + "Charges: " + charges + "\n"
                    + "Date: " + date + "\n"
                    + "Time: " + time + "\n"
                    + "Status: " + status, "Appointment Details", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(this, 
            "Please select an appointment first!", 
            "No Selection", 
            JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_showButtonActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        String id = this.appointmentIDUserLabel.getText().trim();
        String charges = this.chargesTextfield.getText().trim();
        String feedback = this.feedbackTextfield.getText().trim();
        if (charges.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in charges!");
            return;
        }
        DoctorClass dc = new DoctorClass(id, charges,feedback);
        boolean chargesSaved = dc.enterCharges();
        boolean feedbackSaved = dc.enterFeedback();

        if (chargesSaved && feedbackSaved) {
            this.headerLabel.setText("Hi, " + username);
            this.remove(processPanel);
            this.revalidate();
            this.repaint();
            this.add(doctorPanel);
        }
        DoctorClass psn = new DoctorClass(doctor);
        psn.viewAppointment(appointmentTable, doctor);
    }//GEN-LAST:event_SubmitActionPerformed

    private void processAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processAppointmentButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = appointmentTable.getSelectedRow();
        if (selectedRow != -1){
            String id = appointmentTable.getValueAt(selectedRow, 0).toString();
            String customerName = appointmentTable.getValueAt(selectedRow, 1).toString();
            String department = appointmentTable.getValueAt(selectedRow, 2).toString();
            this.headerLabel.setText("Current Diagnosis");
            this.remove(doctorPanel);
            this.revalidate();
            this.repaint();
            this.add(processPanel);
            this.appointmentIDUserLabel.setText(id);
            this.customerNameUserLabel.setText(customerName);
            this.departmentUserLabel.setText(department);
            this.chargesTextfield.setText("");
            this.feedbackTextfield.setText("");
        } else {
        JOptionPane.showMessageDialog(this, 
            "Please select an appointment first!", 
            "No Selection", 
            JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_processAppointmentButtonActionPerformed

    private void chargesTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargesTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chargesTextfieldActionPerformed

    private void refreshButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton1ActionPerformed
        DoctorClass psn = new DoctorClass(doctor);
        psn.viewHistory(historyTable, doctor);
    }//GEN-LAST:event_refreshButton1ActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        this.remove(ProfilePanel);
        this.remove(processPanel);
        this.remove(EditProfilePanel);
        this.remove(viewHistoryPanel);
        this.revalidate();
        this.repaint();
        this.add(doctorPanel);
        this.headerLabel.setText("Hi, " + username);
    }//GEN-LAST:event_homeButtonActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> new Doctor().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EditProfilePanel;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JScrollPane JScrollPane1;
    private javax.swing.JPanel ProfilePanel;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel appointmentIDLabel;
    private javax.swing.JLabel appointmentIDUserLabel;
    private javax.swing.JTable appointmentTable;
    private javax.swing.JButton backBtn1;
    private javax.swing.JLabel chargesLabel;
    private javax.swing.JTextField chargesTextfield;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JLabel customerNameUserLabel;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JLabel departmentUserLabel;
    private javax.swing.JLabel doctorNameLabel;
    private javax.swing.JPanel doctorPanel;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel feedbackLabel;
    private javax.swing.JTextField feedbackTextfield;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JLabel fullNameUserLabel;
    private javax.swing.JLabel fullnameUserLabel1;
    private javax.swing.JPanel header;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JTable historyTable;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JLabel idUserLabel;
    private javax.swing.JLabel idUserLabel1;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JTextField newPasswordTextfield;
    private javax.swing.JTextField newUsernameTextfield;
    private javax.swing.JLabel newfullNameLabel;
    private javax.swing.JLabel newusernameLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordUserLabel;
    private javax.swing.JButton processAppointmentButton;
    private javax.swing.JPanel processPanel;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton refreshButton1;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JLabel roleLabel1;
    private javax.swing.JLabel roleUserLabel;
    private javax.swing.JLabel roleUserLabel1;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton showButton;
    private javax.swing.JButton userBigPic;
    private javax.swing.JButton userBigPic1;
    private javax.swing.JButton userBigPic2;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameUserLabel;
    private javax.swing.JButton viewHistoryButton;
    private javax.swing.JPanel viewHistoryPanel;
    // End of variables declaration//GEN-END:variables
}

