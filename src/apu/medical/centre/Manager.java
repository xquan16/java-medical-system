
package apu.medical.centre;

import static apu.medical.centre.User.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;


public class Manager extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Manager.class.getName());
    private String currentRole;
    private User currentManager;

    
    public Manager(User currentManager) {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("APU Medical Center (Manager)");
        hiLbl.setText("Hi, " + currentManager.getUsername());
        this.currentManager = currentManager;
        this.currentRole = currentManager.getRole();
        initializeTableListener();
    }

    private void initializeTableListener() {
        UsersTable1.getSelectionModel().addListSelectionListener(event -> {
            if (!event.getValueIsAdjusting() && UsersTable1.getSelectedRow() != -1) {
                int selectedRow = UsersTable1.getSelectedRow();
                String id = UsersTable1.getValueAt(selectedRow, 0).toString(); 
            }
        });
    }      
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel1 = new javax.swing.JPanel();
        ManagerPanel = new javax.swing.JPanel();
        manageUsersBtn = new javax.swing.JButton();
        FeedbackBtn = new javax.swing.JButton();
        ReportBtn = new javax.swing.JButton();
        AppointmentsBtn = new javax.swing.JButton();
        headerP1 = new javax.swing.JPanel();
        back4 = new javax.swing.JButton();
        hiLbl = new javax.swing.JLabel();
        logoutBtn2 = new javax.swing.JButton();
        manageUsersPanel = new javax.swing.JPanel();
        headerP = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        logoutBtn1 = new javax.swing.JButton();
        sidebarP = new javax.swing.JPanel();
        createBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jTabbedP = new javax.swing.JTabbedPane();
        createTab = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        idLbl = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        fullNameLbl = new javax.swing.JLabel();
        fullNameTxt = new javax.swing.JTextField();
        usernameLbl = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        searchbarTxt = new javax.swing.JTextField();
        createUserBtn1 = new javax.swing.JButton();
        filterComboBox = new javax.swing.JComboBox<>();
        roleLbl = new javax.swing.JLabel();
        roleCombo = new javax.swing.JComboBox<>();
        updateTab = new javax.swing.JPanel();
        idLbl1 = new javax.swing.JLabel();
        idTxt1 = new javax.swing.JTextField();
        fullNameLbl1 = new javax.swing.JLabel();
        fullNameTxt1 = new javax.swing.JTextField();
        usernameLbl1 = new javax.swing.JLabel();
        usernameTxt1 = new javax.swing.JTextField();
        passwordLbl1 = new javax.swing.JLabel();
        passwordTxt1 = new javax.swing.JTextField();
        searchBtn1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        UsersTable1 = new javax.swing.JTable();
        searchbarTxt1 = new javax.swing.JTextField();
        UpdateUserbtn = new javax.swing.JButton();
        filterComboBox1 = new javax.swing.JComboBox<>();
        roleLbl1 = new javax.swing.JLabel();
        roleCombo1 = new javax.swing.JComboBox<>();
        deleteTab = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        UsersTable2 = new javax.swing.JTable();
        DeleteUserbtn1 = new javax.swing.JButton();
        searchbarTxt2 = new javax.swing.JTextField();
        filterComboBox2 = new javax.swing.JComboBox<>();
        searchBtn2 = new javax.swing.JButton();
        ViewAppointmentPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentTable1 = new javax.swing.JTable();
        headerP2 = new javax.swing.JPanel();
        back5 = new javax.swing.JButton();
        titleLbl1 = new javax.swing.JLabel();
        logoutBtn3 = new javax.swing.JButton();
        ViewFeedbackPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        FeedbackTable = new javax.swing.JTable();
        headerP3 = new javax.swing.JPanel();
        back6 = new javax.swing.JButton();
        titleLbl2 = new javax.swing.JLabel();
        logoutBtn4 = new javax.swing.JButton();
        GenerateReportPanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ReportTable = new javax.swing.JTable();
        headerP4 = new javax.swing.JPanel();
        back7 = new javax.swing.JButton();
        titleLbl3 = new javax.swing.JLabel();
        logoutBtn5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        rootPanel1.setBackground(new java.awt.Color(51, 51, 255));
        rootPanel1.setLayout(new java.awt.CardLayout());

        ManagerPanel.setBackground(new java.awt.Color(204, 255, 255));
        ManagerPanel.setAlignmentX(0.0F);
        ManagerPanel.setAlignmentY(0.0F);
        ManagerPanel.setMinimumSize(new java.awt.Dimension(900, 600));
        ManagerPanel.setPreferredSize(new java.awt.Dimension(900, 600));

        manageUsersBtn.setBackground(new java.awt.Color(255, 255, 255));
        manageUsersBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        manageUsersBtn.setForeground(new java.awt.Color(51, 51, 255));
        manageUsersBtn.setText("Manage Users");
        manageUsersBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        manageUsersBtn.setFocusable(false);
        manageUsersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUsersBtnActionPerformed(evt);
            }
        });

        FeedbackBtn.setBackground(new java.awt.Color(255, 255, 255));
        FeedbackBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        FeedbackBtn.setForeground(new java.awt.Color(51, 51, 255));
        FeedbackBtn.setText("View feedback & comments");
        FeedbackBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        FeedbackBtn.setFocusable(false);
        FeedbackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedbackBtnActionPerformed(evt);
            }
        });

        ReportBtn.setBackground(new java.awt.Color(255, 255, 255));
        ReportBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        ReportBtn.setForeground(new java.awt.Color(51, 51, 255));
        ReportBtn.setText("Generate Reports");
        ReportBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        ReportBtn.setFocusable(false);
        ReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportBtnActionPerformed(evt);
            }
        });

        AppointmentsBtn.setBackground(new java.awt.Color(255, 255, 255));
        AppointmentsBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        AppointmentsBtn.setForeground(new java.awt.Color(51, 51, 255));
        AppointmentsBtn.setText("View Appoinments");
        AppointmentsBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        AppointmentsBtn.setFocusable(false);
        AppointmentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentsBtnActionPerformed(evt);
            }
        });

        headerP1.setBackground(new java.awt.Color(51, 153, 255));
        headerP1.setPreferredSize(new java.awt.Dimension(900, 40));

        back4.setBackground(new java.awt.Color(51, 153, 255));
        back4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        back4.setAlignmentY(0.0F);
        back4.setBorder(null);
        back4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back4ActionPerformed(evt);
            }
        });

        hiLbl.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        hiLbl.setForeground(new java.awt.Color(255, 255, 255));
        hiLbl.setText("Manager Users");
        hiLbl.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        hiLbl.setAlignmentY(0.0F);
        hiLbl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        logoutBtn2.setBackground(new java.awt.Color(204, 255, 255));
        logoutBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        logoutBtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        logoutBtn2.setBorderPainted(false);
        logoutBtn2.setContentAreaFilled(false);
        logoutBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logoutBtn2.setFocusable(false);
        logoutBtn2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        logoutBtn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutBtn2.setMaximumSize(new java.awt.Dimension(36, 36));
        logoutBtn2.setPreferredSize(new java.awt.Dimension(35, 35));
        logoutBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerP1Layout = new javax.swing.GroupLayout(headerP1);
        headerP1.setLayout(headerP1Layout);
        headerP1Layout.setHorizontalGroup(
            headerP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerP1Layout.createSequentialGroup()
                .addComponent(back4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(hiLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerP1Layout.setVerticalGroup(
            headerP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(logoutBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(hiLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ManagerPanelLayout = new javax.swing.GroupLayout(ManagerPanel);
        ManagerPanel.setLayout(ManagerPanelLayout);
        ManagerPanelLayout.setHorizontalGroup(
            ManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagerPanelLayout.createSequentialGroup()
                .addContainerGap(307, Short.MAX_VALUE)
                .addGroup(ManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FeedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageUsersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(307, 307, 307))
            .addComponent(headerP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ManagerPanelLayout.setVerticalGroup(
            ManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagerPanelLayout.createSequentialGroup()
                .addComponent(headerP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(manageUsersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(AppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(FeedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(ReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        rootPanel1.add(ManagerPanel, "card2");

        manageUsersPanel.setBackground(new java.awt.Color(204, 255, 255));
        manageUsersPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerP.setBackground(new java.awt.Color(51, 153, 255));

        back.setBackground(new java.awt.Color(51, 153, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        back.setAlignmentY(0.0F);
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        titleLbl.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl.setText("Manager Users");
        titleLbl.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        titleLbl.setAlignmentY(0.0F);
        titleLbl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        logoutBtn1.setBackground(new java.awt.Color(204, 255, 255));
        logoutBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        logoutBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        logoutBtn1.setBorderPainted(false);
        logoutBtn1.setContentAreaFilled(false);
        logoutBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logoutBtn1.setFocusable(false);
        logoutBtn1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        logoutBtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutBtn1.setMaximumSize(new java.awt.Dimension(36, 36));
        logoutBtn1.setPreferredSize(new java.awt.Dimension(35, 35));
        logoutBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPLayout = new javax.swing.GroupLayout(headerP);
        headerP.setLayout(headerPLayout);
        headerPLayout.setHorizontalGroup(
            headerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPLayout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 493, Short.MAX_VALUE)
                .addComponent(logoutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerPLayout.setVerticalGroup(
            headerPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(logoutBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(titleLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        manageUsersPanel.add(headerP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 40));

        sidebarP.setBackground(new java.awt.Color(51, 255, 255));
        sidebarP.setPreferredSize(new java.awt.Dimension(194, 600));

        createBtn.setBackground(new java.awt.Color(51, 255, 255));
        createBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        createBtn.setForeground(new java.awt.Color(51, 51, 255));
        createBtn.setText("            Create");
        createBtn.setAlignmentY(0.0F);
        createBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        createBtn.setFocusable(false);
        createBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        createBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createBtn.setMargin(new java.awt.Insets(2, 100, 2, 14));
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(51, 255, 255));
        updateBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(51, 51, 255));
        updateBtn.setText("            Update");
        updateBtn.setAlignmentY(0.0F);
        updateBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        updateBtn.setBorderPainted(false);
        updateBtn.setFocusable(false);
        updateBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        updateBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateBtn.setMargin(new java.awt.Insets(2, 100, 2, 14));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(51, 255, 255));
        deleteBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(51, 51, 255));
        deleteBtn.setText("            Delete");
        deleteBtn.setAlignmentY(0.0F);
        deleteBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        deleteBtn.setBorderPainted(false);
        deleteBtn.setFocusable(false);
        deleteBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        deleteBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteBtn.setMargin(new java.awt.Insets(2, 100, 2, 14));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarPLayout = new javax.swing.GroupLayout(sidebarP);
        sidebarP.setLayout(sidebarPLayout);
        sidebarPLayout.setHorizontalGroup(
            sidebarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
            .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarPLayout.setVerticalGroup(
            sidebarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(394, Short.MAX_VALUE))
        );

        manageUsersPanel.add(sidebarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 30, -1, 580));

        jTabbedP.setBackground(new java.awt.Color(204, 255, 255));
        jTabbedP.setPreferredSize(new java.awt.Dimension(700, 600));

        createTab.setBackground(new java.awt.Color(204, 255, 255));
        createTab.setPreferredSize(new java.awt.Dimension(900, 600));

        jScrollPane2.setBackground(new java.awt.Color(51, 153, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 255));
        jScrollPane2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        UsersTable.setBackground(new java.awt.Color(153, 255, 255));
        UsersTable.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        UsersTable.setForeground(new java.awt.Color(51, 51, 255));
        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Username", "Full Name", "Role"
            }
        ));
        UsersTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        UsersTable.setGridColor(new java.awt.Color(0, 0, 153));
        UsersTable.setRowHeight(25);
        UsersTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane2.setViewportView(UsersTable);

        idLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        idLbl.setForeground(new java.awt.Color(51, 51, 255));
        idLbl.setText("ID:");
        idLbl.setAlignmentY(0.0F);

        idTxt.setBackground(new java.awt.Color(255, 255, 255));
        idTxt.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        idTxt.setForeground(new java.awt.Color(0, 0, 255));
        idTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        fullNameLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        fullNameLbl.setForeground(new java.awt.Color(51, 51, 255));
        fullNameLbl.setText("Full Name: ");
        fullNameLbl.setAlignmentY(0.0F);

        fullNameTxt.setBackground(new java.awt.Color(255, 255, 255));
        fullNameTxt.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        fullNameTxt.setForeground(new java.awt.Color(0, 0, 255));
        fullNameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        usernameLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        usernameLbl.setForeground(new java.awt.Color(51, 51, 255));
        usernameLbl.setText("Username: ");
        usernameLbl.setAlignmentY(0.0F);

        usernameTxt.setBackground(new java.awt.Color(255, 255, 255));
        usernameTxt.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        usernameTxt.setForeground(new java.awt.Color(0, 0, 255));
        usernameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        passwordLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(51, 51, 255));
        passwordLbl.setText("Password:");
        passwordLbl.setAlignmentY(0.0F);

        passwordTxt.setBackground(new java.awt.Color(255, 255, 255));
        passwordTxt.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        passwordTxt.setForeground(new java.awt.Color(0, 0, 255));
        passwordTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        searchBtn.setBackground(new java.awt.Color(255, 255, 255));
        searchBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(51, 51, 255));
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        searchBtn.setAlignmentY(0.0F);
        searchBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        searchBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchBtn.setMargin(new java.awt.Insets(1, 14, 1, 14));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        searchbarTxt.setBackground(new java.awt.Color(255, 255, 255));
        searchbarTxt.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        searchbarTxt.setForeground(new java.awt.Color(0, 0, 255));
        searchbarTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));
        searchbarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbarTxtActionPerformed(evt);
            }
        });

        createUserBtn1.setBackground(new java.awt.Color(255, 255, 255));
        createUserBtn1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        createUserBtn1.setForeground(new java.awt.Color(51, 51, 255));
        createUserBtn1.setText("Create");
        createUserBtn1.setAlignmentY(0.0F);
        createUserBtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        createUserBtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createUserBtn1.setMargin(new java.awt.Insets(1, 14, 1, 14));
        createUserBtn1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        createUserBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserBtn1ActionPerformed(evt);
            }
        });

        filterComboBox.setBackground(new java.awt.Color(255, 255, 255));
        filterComboBox.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        filterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Username", "Full Name" }));
        filterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterComboBoxActionPerformed(evt);
            }
        });

        roleLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        roleLbl.setForeground(new java.awt.Color(51, 51, 255));
        roleLbl.setText("Role:");
        roleLbl.setAlignmentY(0.0F);

        roleCombo.setBackground(new java.awt.Color(255, 255, 255));
        roleCombo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        roleCombo.setForeground(new java.awt.Color(0, 0, 255));
        roleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Staff", "Doctor" }));

        javax.swing.GroupLayout createTabLayout = new javax.swing.GroupLayout(createTab);
        createTab.setLayout(createTabLayout);
        createTabLayout.setHorizontalGroup(
            createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createTabLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createTabLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullNameLbl)
                            .addComponent(usernameLbl)
                            .addComponent(idLbl)
                            .addComponent(passwordLbl)
                            .addComponent(roleLbl))
                        .addGap(31, 31, 31)
                        .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createTabLayout.createSequentialGroup()
                                .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75))
                            .addGroup(createTabLayout.createSequentialGroup()
                                .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createUserBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createTabLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane2))
                    .addGroup(createTabLayout.createSequentialGroup()
                        .addComponent(searchbarTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        createTabLayout.setVerticalGroup(
            createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createTabLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(filterComboBox, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(searchbarTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createTabLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(createTabLayout.createSequentialGroup()
                        .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(createTabLayout.createSequentialGroup()
                        .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fullNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createTabLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(roleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createTabLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(createUserBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38))
        );

        jTabbedP.addTab("tab1", createTab);

        updateTab.setBackground(new java.awt.Color(204, 255, 255));

        idLbl1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        idLbl1.setForeground(new java.awt.Color(51, 51, 255));
        idLbl1.setText("ID:");
        idLbl1.setAlignmentY(0.0F);

        idTxt1.setBackground(new java.awt.Color(255, 255, 255));
        idTxt1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        idTxt1.setForeground(new java.awt.Color(0, 0, 255));
        idTxt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));
        idTxt1.setDisabledTextColor(new java.awt.Color(102, 153, 255));
        idTxt1.setEnabled(false);

        fullNameLbl1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        fullNameLbl1.setForeground(new java.awt.Color(51, 51, 255));
        fullNameLbl1.setText("Full Name: ");
        fullNameLbl1.setAlignmentY(0.0F);

        fullNameTxt1.setBackground(new java.awt.Color(255, 255, 255));
        fullNameTxt1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        fullNameTxt1.setForeground(new java.awt.Color(0, 0, 255));
        fullNameTxt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        usernameLbl1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        usernameLbl1.setForeground(new java.awt.Color(51, 51, 255));
        usernameLbl1.setText("Username: ");
        usernameLbl1.setAlignmentY(0.0F);

        usernameTxt1.setBackground(new java.awt.Color(255, 255, 255));
        usernameTxt1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        usernameTxt1.setForeground(new java.awt.Color(0, 0, 255));
        usernameTxt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        passwordLbl1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        passwordLbl1.setForeground(new java.awt.Color(51, 51, 255));
        passwordLbl1.setText("Password:");
        passwordLbl1.setAlignmentY(0.0F);

        passwordTxt1.setBackground(new java.awt.Color(255, 255, 255));
        passwordTxt1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        passwordTxt1.setForeground(new java.awt.Color(0, 0, 255));
        passwordTxt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        searchBtn1.setBackground(new java.awt.Color(255, 255, 255));
        searchBtn1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        searchBtn1.setForeground(new java.awt.Color(51, 51, 255));
        searchBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        searchBtn1.setAlignmentY(0.0F);
        searchBtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        searchBtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchBtn1.setMargin(new java.awt.Insets(1, 14, 1, 14));
        searchBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn1ActionPerformed(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(51, 153, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jScrollPane3.setForeground(new java.awt.Color(0, 0, 255));
        jScrollPane3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        UsersTable1.setBackground(new java.awt.Color(153, 255, 255));
        UsersTable1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        UsersTable1.setForeground(new java.awt.Color(51, 51, 255));
        UsersTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Username", "Full Name", "Role"
            }
        ));
        UsersTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        UsersTable1.setGridColor(new java.awt.Color(0, 0, 153));
        UsersTable1.setRowHeight(25);
        UsersTable1.setSelectionBackground(new java.awt.Color(153, 204, 255));
        UsersTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(UsersTable1);

        searchbarTxt1.setBackground(new java.awt.Color(255, 255, 255));
        searchbarTxt1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        searchbarTxt1.setForeground(new java.awt.Color(0, 0, 255));
        searchbarTxt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));
        searchbarTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbarTxt1ActionPerformed(evt);
            }
        });

        UpdateUserbtn.setBackground(new java.awt.Color(255, 255, 255));
        UpdateUserbtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        UpdateUserbtn.setForeground(new java.awt.Color(51, 51, 255));
        UpdateUserbtn.setText("Update");
        UpdateUserbtn.setAlignmentY(0.0F);
        UpdateUserbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        UpdateUserbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UpdateUserbtn.setMargin(new java.awt.Insets(1, 14, 1, 14));
        UpdateUserbtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        UpdateUserbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateUserbtnActionPerformed(evt);
            }
        });

        filterComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        filterComboBox1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        filterComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Username", "Full Name" }));

        roleLbl1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        roleLbl1.setForeground(new java.awt.Color(51, 51, 255));
        roleLbl1.setText("Role:");
        roleLbl1.setAlignmentY(0.0F);

        roleCombo1.setBackground(new java.awt.Color(255, 255, 255));
        roleCombo1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        roleCombo1.setForeground(new java.awt.Color(0, 0, 255));
        roleCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Staff", "Doctor" }));

        javax.swing.GroupLayout updateTabLayout = new javax.swing.GroupLayout(updateTab);
        updateTab.setLayout(updateTabLayout);
        updateTabLayout.setHorizontalGroup(
            updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateTabLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(updateTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullNameLbl1)
                            .addComponent(usernameLbl1)
                            .addComponent(idLbl1)
                            .addComponent(passwordLbl1)
                            .addComponent(roleLbl1))
                        .addGap(31, 31, 31)
                        .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(updateTabLayout.createSequentialGroup()
                                .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fullNameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86))
                            .addGroup(updateTabLayout.createSequentialGroup()
                                .addComponent(roleCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UpdateUserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(updateTabLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane3))
                    .addGroup(updateTabLayout.createSequentialGroup()
                        .addComponent(searchbarTxt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        updateTabLayout.setVerticalGroup(
            updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateTabLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateTabLayout.createSequentialGroup()
                        .addComponent(searchBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fullNameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fullNameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateTabLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(roleCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roleLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateTabLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpdateUserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(filterComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchbarTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );

        jTabbedP.addTab("tab2", updateTab);

        deleteTab.setBackground(new java.awt.Color(204, 255, 255));

        jScrollPane4.setBackground(new java.awt.Color(51, 153, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jScrollPane4.setForeground(new java.awt.Color(0, 0, 255));
        jScrollPane4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        UsersTable2.setBackground(new java.awt.Color(153, 255, 255));
        UsersTable2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        UsersTable2.setForeground(new java.awt.Color(51, 51, 255));
        UsersTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Username", "Full Name", "Role"
            }
        ));
        UsersTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        UsersTable2.setGridColor(new java.awt.Color(0, 0, 153));
        UsersTable2.setRowHeight(25);
        UsersTable2.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane4.setViewportView(UsersTable2);

        DeleteUserbtn1.setBackground(new java.awt.Color(255, 255, 255));
        DeleteUserbtn1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        DeleteUserbtn1.setForeground(new java.awt.Color(51, 51, 255));
        DeleteUserbtn1.setText("Delete");
        DeleteUserbtn1.setAlignmentY(0.0F);
        DeleteUserbtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        DeleteUserbtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DeleteUserbtn1.setMargin(new java.awt.Insets(1, 14, 1, 14));
        DeleteUserbtn1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        DeleteUserbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserbtn1ActionPerformed(evt);
            }
        });

        searchbarTxt2.setBackground(new java.awt.Color(255, 255, 255));
        searchbarTxt2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        searchbarTxt2.setForeground(new java.awt.Color(0, 0, 255));
        searchbarTxt2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));
        searchbarTxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbarTxt2ActionPerformed(evt);
            }
        });

        filterComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        filterComboBox2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        filterComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Username", "Full Name" }));

        searchBtn2.setBackground(new java.awt.Color(255, 255, 255));
        searchBtn2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        searchBtn2.setForeground(new java.awt.Color(51, 51, 255));
        searchBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        searchBtn2.setAlignmentY(0.0F);
        searchBtn2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        searchBtn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchBtn2.setMargin(new java.awt.Insets(1, 14, 1, 14));
        searchBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteTabLayout = new javax.swing.GroupLayout(deleteTab);
        deleteTab.setLayout(deleteTabLayout);
        deleteTabLayout.setHorizontalGroup(
            deleteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteTabLayout.createSequentialGroup()
                .addGroup(deleteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(deleteTabLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteUserbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, deleteTabLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(deleteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(deleteTabLayout.createSequentialGroup()
                                .addComponent(searchbarTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filterComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        deleteTabLayout.setVerticalGroup(
            deleteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteTabLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(deleteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(deleteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(filterComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchbarTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(DeleteUserbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jTabbedP.addTab("tab3", deleteTab);

        manageUsersPanel.add(jTabbedP, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, -40, 720, 650));

        rootPanel1.add(manageUsersPanel, "card3");

        ViewAppointmentPanel.setBackground(new java.awt.Color(204, 255, 255));
        ViewAppointmentPanel.setPreferredSize(new java.awt.Dimension(900, 600));
        ViewAppointmentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appointmentTable1.setBackground(new java.awt.Color(153, 255, 255));
        appointmentTable1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        appointmentTable1.setForeground(new java.awt.Color(51, 51, 255));
        appointmentTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "CustomerName", "DoctorName", "Speciality", "Doctor Review", "Date", "Time", "Status"
            }
        ));
        appointmentTable1.setRowHeight(25);
        appointmentTable1.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setViewportView(appointmentTable1);
        if (appointmentTable1.getColumnModel().getColumnCount() > 0) {
            appointmentTable1.getColumnModel().getColumn(0).setResizable(false);
            appointmentTable1.getColumnModel().getColumn(2).setResizable(false);
            appointmentTable1.getColumnModel().getColumn(4).setResizable(false);
            appointmentTable1.getColumnModel().getColumn(4).setPreferredWidth(350);
            appointmentTable1.getColumnModel().getColumn(5).setHeaderValue("Date");
            appointmentTable1.getColumnModel().getColumn(6).setHeaderValue("Time");
            appointmentTable1.getColumnModel().getColumn(7).setHeaderValue("Status");
        }

        ViewAppointmentPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 770, 460));

        headerP2.setBackground(new java.awt.Color(51, 153, 255));

        back5.setBackground(new java.awt.Color(51, 153, 255));
        back5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        back5.setAlignmentY(0.0F);
        back5.setBorder(null);
        back5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back5ActionPerformed(evt);
            }
        });

        titleLbl1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        titleLbl1.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl1.setText("Appointments Data");
        titleLbl1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        titleLbl1.setAlignmentY(0.0F);
        titleLbl1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        logoutBtn3.setBackground(new java.awt.Color(204, 255, 255));
        logoutBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        logoutBtn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        logoutBtn3.setBorderPainted(false);
        logoutBtn3.setContentAreaFilled(false);
        logoutBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logoutBtn3.setFocusable(false);
        logoutBtn3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        logoutBtn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutBtn3.setMaximumSize(new java.awt.Dimension(36, 36));
        logoutBtn3.setPreferredSize(new java.awt.Dimension(35, 35));
        logoutBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerP2Layout = new javax.swing.GroupLayout(headerP2);
        headerP2.setLayout(headerP2Layout);
        headerP2Layout.setHorizontalGroup(
            headerP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerP2Layout.createSequentialGroup()
                .addComponent(back5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(titleLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 489, Short.MAX_VALUE)
                .addComponent(logoutBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerP2Layout.setVerticalGroup(
            headerP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(logoutBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(titleLbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ViewAppointmentPanel.add(headerP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        rootPanel1.add(ViewAppointmentPanel, "card3");

        ViewFeedbackPanel.setBackground(new java.awt.Color(204, 255, 255));
        ViewFeedbackPanel.setPreferredSize(new java.awt.Dimension(900, 600));
        ViewFeedbackPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FeedbackTable.setBackground(new java.awt.Color(153, 255, 255));
        FeedbackTable.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        FeedbackTable.setForeground(new java.awt.Color(51, 51, 255));
        FeedbackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "AppointmentID", "FeedbackToStaff", "FeedbackToDoctor"
            }
        ));
        FeedbackTable.setRowHeight(25);
        FeedbackTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane5.setViewportView(FeedbackTable);
        if (FeedbackTable.getColumnModel().getColumnCount() > 0) {
            FeedbackTable.getColumnModel().getColumn(0).setResizable(false);
            FeedbackTable.getColumnModel().getColumn(1).setResizable(false);
            FeedbackTable.getColumnModel().getColumn(1).setPreferredWidth(350);
            FeedbackTable.getColumnModel().getColumn(2).setResizable(false);
            FeedbackTable.getColumnModel().getColumn(2).setPreferredWidth(350);
        }

        ViewFeedbackPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 840, 460));

        headerP3.setBackground(new java.awt.Color(51, 153, 255));

        back6.setBackground(new java.awt.Color(51, 153, 255));
        back6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        back6.setAlignmentY(0.0F);
        back6.setBorder(null);
        back6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back6ActionPerformed(evt);
            }
        });

        titleLbl2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        titleLbl2.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl2.setText("Feedback  Data");
        titleLbl2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        titleLbl2.setAlignmentY(0.0F);
        titleLbl2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        logoutBtn4.setBackground(new java.awt.Color(204, 255, 255));
        logoutBtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        logoutBtn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        logoutBtn4.setBorderPainted(false);
        logoutBtn4.setContentAreaFilled(false);
        logoutBtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logoutBtn4.setFocusable(false);
        logoutBtn4.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        logoutBtn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutBtn4.setMaximumSize(new java.awt.Dimension(36, 36));
        logoutBtn4.setPreferredSize(new java.awt.Dimension(35, 35));
        logoutBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerP3Layout = new javax.swing.GroupLayout(headerP3);
        headerP3.setLayout(headerP3Layout);
        headerP3Layout.setHorizontalGroup(
            headerP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerP3Layout.createSequentialGroup()
                .addComponent(back6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(titleLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 489, Short.MAX_VALUE)
                .addComponent(logoutBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerP3Layout.setVerticalGroup(
            headerP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(logoutBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(titleLbl2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ViewFeedbackPanel.add(headerP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        rootPanel1.add(ViewFeedbackPanel, "card3");

        GenerateReportPanel.setBackground(new java.awt.Color(204, 255, 255));
        GenerateReportPanel.setPreferredSize(new java.awt.Dimension(900, 600));
        GenerateReportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReportTable.setBackground(new java.awt.Color(153, 255, 255));
        ReportTable.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        ReportTable.setForeground(new java.awt.Color(51, 51, 255));
        ReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ReportTable.setRowHeight(25);
        ReportTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane6.setViewportView(ReportTable);

        GenerateReportPanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 840, 460));

        headerP4.setBackground(new java.awt.Color(51, 153, 255));

        back7.setBackground(new java.awt.Color(51, 153, 255));
        back7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        back7.setAlignmentY(0.0F);
        back7.setBorder(null);
        back7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back7ActionPerformed(evt);
            }
        });

        titleLbl3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        titleLbl3.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl3.setText("Report Data");
        titleLbl3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        titleLbl3.setAlignmentY(0.0F);
        titleLbl3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        logoutBtn5.setBackground(new java.awt.Color(204, 255, 255));
        logoutBtn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        logoutBtn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        logoutBtn5.setBorderPainted(false);
        logoutBtn5.setContentAreaFilled(false);
        logoutBtn5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logoutBtn5.setFocusable(false);
        logoutBtn5.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        logoutBtn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutBtn5.setMaximumSize(new java.awt.Dimension(36, 36));
        logoutBtn5.setPreferredSize(new java.awt.Dimension(35, 35));
        logoutBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtn5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerP4Layout = new javax.swing.GroupLayout(headerP4);
        headerP4.setLayout(headerP4Layout);
        headerP4Layout.setHorizontalGroup(
            headerP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerP4Layout.createSequentialGroup()
                .addComponent(back7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(titleLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 489, Short.MAX_VALUE)
                .addComponent(logoutBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerP4Layout.setVerticalGroup(
            headerP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(logoutBtn5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(titleLbl3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GenerateReportPanel.add(headerP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        rootPanel1.add(GenerateReportPanel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rootPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rootPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void showPanel(JPanel panelName) {
        ManagerPanel.setVisible(false);
        manageUsersPanel.setVisible(false);
        ManagerPanel.setVisible(false);
        manageUsersPanel.setVisible(false);
        ViewAppointmentPanel.setVisible(false);
        ViewFeedbackPanel.setVisible(false);
        GenerateReportPanel.setVisible(false);
        
        panelName.setVisible(true);
    }
    
    // sidebar button color control
    public void buttonColor(JButton btnName) {
        createBtn.setBackground(new Color(51,255,255));
        updateBtn.setBackground(new Color(51,255,255));
        deleteBtn.setBackground(new Color(51,255,255));
                
        btnName.setBackground(new Color(255,255,255));
    }
    
    private void manageUsersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUsersBtnActionPerformed
        showPanel(manageUsersPanel);
        buttonColor(createBtn);
        titleLbl.setText("Create User");
        jTabbedP.setSelectedIndex(0);
 
        ManagerClass loadTable = new ManagerClass(currentManager);
        loadTable.loadDataToTable(UsersTable);  
    }//GEN-LAST:event_manageUsersBtnActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        showPanel(ManagerPanel);
    }//GEN-LAST:event_backActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        jTabbedP.setSelectedIndex(0);
        buttonColor(createBtn);

        manageUsersBtnActionPerformed(evt);
    }//GEN-LAST:event_createBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        jTabbedP.setSelectedIndex(1);
        buttonColor(updateBtn);
        titleLbl.setText("Update User");
         
        ManagerClass loadTable = new ManagerClass(currentManager);
        loadTable.loadDataToTable(UsersTable1);  
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        jTabbedP.setSelectedIndex(2);
        buttonColor(deleteBtn);
        titleLbl.setText("Delete User");
        
        ManagerClass loadTable = new ManagerClass(currentManager);
        loadTable.loadDataToTable(UsersTable2);  
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        ManagerClass read = new ManagerClass(currentManager);
        read.readUser(UsersTable, searchbarTxt, filterComboBox);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void searchbarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbarTxtActionPerformed
        searchBtn.doClick();
    }//GEN-LAST:event_searchbarTxtActionPerformed

    private void createUserBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserBtn1ActionPerformed
        ManagerClass createU = new ManagerClass(currentManager);
        createU.createUser(idTxt, usernameTxt, passwordTxt, (String)roleCombo.getSelectedItem(), fullNameTxt);
        createU.loadDataToTable(UsersTable);
    }//GEN-LAST:event_createUserBtn1ActionPerformed

    private void AppointmentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentsBtnActionPerformed
        // TODO add your handling code here:
        showPanel(ViewAppointmentPanel);
        buttonColor(createBtn);
        this.setTitle("APU Medical Center");
        ManagerClass manager = new ManagerClass(currentManager);
        appointmentTable1.setModel(manager.loadAppointmentsModel());
        
        tableStyle(appointmentTable1);
        sortTable(appointmentTable1);
    }//GEN-LAST:event_AppointmentsBtnActionPerformed

    private void searchBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn1ActionPerformed
        ManagerClass read = new ManagerClass(currentManager);
        read.readUser(UsersTable1, searchbarTxt1, filterComboBox1);
    }//GEN-LAST:event_searchBtn1ActionPerformed

    private void searchbarTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbarTxt1ActionPerformed
        searchBtn1.doClick();
    }//GEN-LAST:event_searchbarTxt1ActionPerformed

    private void UpdateUserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateUserbtnActionPerformed
        ManagerClass update = new ManagerClass(currentManager);
        update.updateUser(UsersTable1, idTxt1, usernameTxt1, passwordTxt1, fullNameTxt1, roleCombo1);
    }//GEN-LAST:event_UpdateUserbtnActionPerformed

    private void DeleteUserbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserbtn1ActionPerformed
        ManagerClass dlt = new ManagerClass(currentManager);
        dlt.deleteUser(UsersTable2);
        dlt.loadDataToTable(UsersTable2);
    }//GEN-LAST:event_DeleteUserbtn1ActionPerformed

    private void filterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterComboBoxActionPerformed

    private void FeedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedbackBtnActionPerformed
        // TODO add your handling code here:
        showPanel(ViewFeedbackPanel);
        buttonColor(createBtn);
        this.setTitle("APU Medical Center");
        ManagerClass manager = new ManagerClass(currentManager);
        FeedbackTable.setModel(manager.loadPaymentsModel());
        
        tableStyle(FeedbackTable);
        sortTable(FeedbackTable);
    }//GEN-LAST:event_FeedbackBtnActionPerformed

    private void ReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportBtnActionPerformed
        // TODO add your handling code here:
        showPanel(GenerateReportPanel);
        buttonColor(createBtn);
        this.setTitle("APU Medical Center");
        ManagerClass manager = new ManagerClass(currentManager); 
        DefaultTableModel reportModel = manager.generateReport();

        if (reportModel != null) {
            ReportTable.setModel(reportModel);
        }    
        tableStyle(ReportTable);
        sortTable(ReportTable);
    }//GEN-LAST:event_ReportBtnActionPerformed

    private void logoutBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn1ActionPerformed
        Login user = new Login();
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtn1ActionPerformed

    private void back4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_back4ActionPerformed

    private void logoutBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn2ActionPerformed
        Login user = new Login();
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtn2ActionPerformed

    private void back5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back5ActionPerformed
        showPanel(ManagerPanel);
    }//GEN-LAST:event_back5ActionPerformed

    private void logoutBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn3ActionPerformed
        Login logout = new Login();
        logout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtn3ActionPerformed

    private void back6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back6ActionPerformed
        showPanel(ManagerPanel);
    }//GEN-LAST:event_back6ActionPerformed

    private void logoutBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn4ActionPerformed
        Login logout = new Login();
        logout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtn4ActionPerformed

    private void back7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back7ActionPerformed
        showPanel(ManagerPanel);
    }//GEN-LAST:event_back7ActionPerformed

    private void logoutBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn5ActionPerformed
        Login logout = new Login();
        logout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtn5ActionPerformed

    private void searchbarTxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbarTxt2ActionPerformed
        searchBtn2.doClick();
    }//GEN-LAST:event_searchbarTxt2ActionPerformed

    private void searchBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn2ActionPerformed
        ManagerClass read = new ManagerClass(currentManager);
        read.readUser(UsersTable2, searchbarTxt2, filterComboBox2);
    }//GEN-LAST:event_searchBtn2ActionPerformed

    private void UsersTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersTable1MouseClicked
        ManagerClass show = new ManagerClass(currentManager);
        show.userData(UsersTable1, idTxt1, fullNameTxt1, usernameTxt1, passwordTxt1, roleCombo1);
    }//GEN-LAST:event_UsersTable1MouseClicked

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
//        java.awt.EventQueue.invokeLater(() -> new Manager().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AppointmentsBtn;
    private javax.swing.JButton DeleteUserbtn1;
    private javax.swing.JButton FeedbackBtn;
    private javax.swing.JTable FeedbackTable;
    private javax.swing.JPanel GenerateReportPanel;
    private javax.swing.JPanel ManagerPanel;
    private javax.swing.JButton ReportBtn;
    private javax.swing.JTable ReportTable;
    private javax.swing.JButton UpdateUserbtn;
    private javax.swing.JTable UsersTable;
    private javax.swing.JTable UsersTable1;
    private javax.swing.JTable UsersTable2;
    private javax.swing.JPanel ViewAppointmentPanel;
    private javax.swing.JPanel ViewFeedbackPanel;
    private javax.swing.JTable appointmentTable1;
    private javax.swing.JButton back;
    private javax.swing.JButton back4;
    private javax.swing.JButton back5;
    private javax.swing.JButton back6;
    private javax.swing.JButton back7;
    private javax.swing.JButton createBtn;
    private javax.swing.JPanel createTab;
    private javax.swing.JButton createUserBtn1;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JPanel deleteTab;
    private javax.swing.JComboBox<String> filterComboBox;
    private javax.swing.JComboBox<String> filterComboBox1;
    private javax.swing.JComboBox<String> filterComboBox2;
    private javax.swing.JLabel fullNameLbl;
    private javax.swing.JLabel fullNameLbl1;
    private javax.swing.JTextField fullNameTxt;
    private javax.swing.JTextField fullNameTxt1;
    private javax.swing.JPanel headerP;
    private javax.swing.JPanel headerP1;
    private javax.swing.JPanel headerP2;
    private javax.swing.JPanel headerP3;
    private javax.swing.JPanel headerP4;
    private javax.swing.JLabel hiLbl;
    private javax.swing.JLabel idLbl;
    private javax.swing.JLabel idLbl1;
    private javax.swing.JTextField idTxt;
    private javax.swing.JTextField idTxt1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedP;
    private javax.swing.JButton logoutBtn1;
    private javax.swing.JButton logoutBtn2;
    private javax.swing.JButton logoutBtn3;
    private javax.swing.JButton logoutBtn4;
    private javax.swing.JButton logoutBtn5;
    private javax.swing.JButton manageUsersBtn;
    private javax.swing.JPanel manageUsersPanel;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel passwordLbl1;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField passwordTxt1;
    private javax.swing.JComboBox<String> roleCombo;
    private javax.swing.JComboBox<String> roleCombo1;
    private javax.swing.JLabel roleLbl;
    private javax.swing.JLabel roleLbl1;
    private javax.swing.JPanel rootPanel1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton searchBtn1;
    private javax.swing.JButton searchBtn2;
    private javax.swing.JTextField searchbarTxt;
    private javax.swing.JTextField searchbarTxt1;
    private javax.swing.JTextField searchbarTxt2;
    private javax.swing.JPanel sidebarP;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel titleLbl1;
    private javax.swing.JLabel titleLbl2;
    private javax.swing.JLabel titleLbl3;
    private javax.swing.JButton updateBtn;
    private javax.swing.JPanel updateTab;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JLabel usernameLbl1;
    private javax.swing.JTextField usernameTxt;
    private javax.swing.JTextField usernameTxt1;
    // End of variables declaration//GEN-END:variables
}
