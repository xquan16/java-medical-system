
package apu.medical.centre;
import java.awt.*;
import javax.swing.*;



public class Staff extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Staff.class.getName());
    private final String role;
    private final User currentRole;
    
    public Staff(User currentStaff) {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("APU Medical Center (Staff)");
        titleLbl0.setText("Hi, " + currentStaff.getUsername());
        
        this.role = currentStaff.getRole();  // pass to CRUD, for Manager & Staff, to limit who they can manage
        this.currentRole = currentStaff;
        
        // for book appointment info
        StaffClass.autoGenerateId(appointmentIdTxt); //auto-generate ID
        StaffClass.loadDoctor(doctorComboBox); //load available doctor from user.txt
        StaffClass.dateChooser(jDateChooser);  //set data chooser
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        receiptDialog = new javax.swing.JDialog();
        receiptPanel = new javax.swing.JPanel();
        dateR = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idR = new javax.swing.JLabel();
        customerNameR = new javax.swing.JLabel();
        doctorR = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        chargeR = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        reviewR = new javax.swing.JLabel();
        rootPanel = new javax.swing.JPanel();
        staffHomePanel = new javax.swing.JPanel();
        headerP0 = new javax.swing.JPanel();
        homeBtn0 = new javax.swing.JButton();
        titleLbl0 = new javax.swing.JLabel();
        logoutBtn0 = new javax.swing.JButton();
        manageCustomerBtn = new javax.swing.JButton();
        bookAppointmentBtn = new javax.swing.JButton();
        paymentBtn = new javax.swing.JButton();
        crudPanel = new javax.swing.JPanel();
        headerP1 = new javax.swing.JPanel();
        homeBtn1 = new javax.swing.JButton();
        titleLbl1 = new javax.swing.JLabel();
        logoutBtn1 = new javax.swing.JButton();
        sidebarP = new javax.swing.JPanel();
        createBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jTabbedP = new javax.swing.JTabbedPane();
        createTab = new javax.swing.JPanel();
        idLbl = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        fullNameLbl = new javax.swing.JLabel();
        fullNameTxt = new javax.swing.JTextField();
        usernameLbl = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        createSearchBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        createSearchbarTxt = new javax.swing.JTextField();
        createCustomerBtn = new javax.swing.JButton();
        createFilterComboBox = new javax.swing.JComboBox<>();
        updateTab = new javax.swing.JPanel();
        idLbl1 = new javax.swing.JLabel();
        idTxt1 = new javax.swing.JTextField();
        fullNameLbl1 = new javax.swing.JLabel();
        fullNameTxt1 = new javax.swing.JTextField();
        usernameLbl1 = new javax.swing.JLabel();
        usernameTxt1 = new javax.swing.JTextField();
        passwordLbl1 = new javax.swing.JLabel();
        passwordTxt1 = new javax.swing.JTextField();
        updateSearchBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        customerTable1 = new javax.swing.JTable();
        updateSearchbarTxt = new javax.swing.JTextField();
        updateCustomerBtn = new javax.swing.JButton();
        updateFilterComboBox = new javax.swing.JComboBox<>();
        roleLbl1 = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox<>();
        deleteTab = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        customerTable2 = new javax.swing.JTable();
        deleteSearchbarTxt = new javax.swing.JTextField();
        deleteFilterComboBox = new javax.swing.JComboBox<>();
        deleteSearchBtn = new javax.swing.JButton();
        deleteCustomerBtn = new javax.swing.JButton();
        bookAppointmentPanel = new javax.swing.JPanel();
        headerP2 = new javax.swing.JPanel();
        homeBtn2 = new javax.swing.JButton();
        titleLbl2 = new javax.swing.JLabel();
        logoutBtn2 = new javax.swing.JButton();
        bookBtn = new javax.swing.JButton();
        specialtyLbl = new javax.swing.JLabel();
        doctorNameLbl = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        timeLbl = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        appointmentCustomerTable = new javax.swing.JTable();
        doctorComboBox = new javax.swing.JComboBox<>();
        specialtyComboBox = new javax.swing.JComboBox<>();
        timeComboBox = new javax.swing.JComboBox<>();
        appointmentIdLbl = new javax.swing.JLabel();
        appointmentIdTxt = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        bookCustomerSearchbarTxt = new javax.swing.JTextField();
        bookFilterComboBox = new javax.swing.JComboBox<>();
        bookSearchBtn = new javax.swing.JButton();
        paymentPanel = new javax.swing.JPanel();
        headerP3 = new javax.swing.JPanel();
        homeBtn3 = new javax.swing.JButton();
        titleLbl3 = new javax.swing.JLabel();
        logoutBtn3 = new javax.swing.JButton();
        paymentSearchBarTxt = new javax.swing.JTextField();
        paymentFilterComboBox = new javax.swing.JComboBox<>();
        paymentSearchBtn = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        paymentTable = new javax.swing.JTable();
        chargePanel = new javax.swing.JPanel();
        chargeLbl = new javax.swing.JLabel();
        payBtn = new javax.swing.JButton();
        doctorReviewLbl = new javax.swing.JLabel();
        doctorReviewLbl2 = new javax.swing.JLabel();
        chargeLbl2 = new javax.swing.JLabel();

        receiptDialog.setTitle("Receipt");
        receiptDialog.setSize(new java.awt.Dimension(450, 500));

        receiptPanel.setBackground(new java.awt.Color(204, 255, 255));
        receiptPanel.setPreferredSize(new java.awt.Dimension(450, 500));

        dateR.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        dateR.setForeground(new java.awt.Color(102, 102, 102));
        dateR.setText("xxxx-xx-xx");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Receipt No:");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("APU MEDICAL CENTER RECEIPT");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Doctor:");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Date:");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Customer Name:");

        idR.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        idR.setForeground(new java.awt.Color(102, 102, 102));
        idR.setText("Axxx");

        customerNameR.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        customerNameR.setForeground(new java.awt.Color(102, 102, 102));
        customerNameR.setText("XXXX XXXX XXXX");

        doctorR.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        doctorR.setForeground(new java.awt.Color(102, 102, 102));
        doctorR.setText("XXXX XXXX XXXX");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Paid:");

        chargeR.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        chargeR.setForeground(new java.awt.Color(102, 102, 102));
        chargeR.setText("RMxxx");
        chargeR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        chargeR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jPanel1.setBackground(new java.awt.Color(220, 255, 255));

        reviewR.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        reviewR.setForeground(new java.awt.Color(102, 102, 102));
        reviewR.setText("review");
        reviewR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reviewR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(reviewR, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(reviewR, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout receiptPanelLayout = new javax.swing.GroupLayout(receiptPanel);
        receiptPanel.setLayout(receiptPanelLayout);
        receiptPanelLayout.setHorizontalGroup(
            receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doctorR, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idR, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateR, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerNameR, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, receiptPanelLayout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chargeR, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
            .addGroup(receiptPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        receiptPanelLayout.setVerticalGroup(
            receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idR))
                .addGap(20, 20, 20)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dateR))
                .addGap(20, 20, 20)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(customerNameR))
                .addGap(20, 20, 20)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(doctorR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(chargeR))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout receiptDialogLayout = new javax.swing.GroupLayout(receiptDialog.getContentPane());
        receiptDialog.getContentPane().setLayout(receiptDialogLayout);
        receiptDialogLayout.setHorizontalGroup(
            receiptDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(receiptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        receiptDialogLayout.setVerticalGroup(
            receiptDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptDialogLayout.createSequentialGroup()
                .addComponent(receiptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        rootPanel.setBackground(new java.awt.Color(51, 51, 255));
        rootPanel.setPreferredSize(new java.awt.Dimension(900, 600));
        rootPanel.setLayout(new java.awt.CardLayout());

        staffHomePanel.setBackground(new java.awt.Color(204, 255, 255));
        staffHomePanel.setAlignmentX(0.0F);
        staffHomePanel.setAlignmentY(0.0F);
        staffHomePanel.setPreferredSize(new java.awt.Dimension(900, 600));

        headerP0.setBackground(new java.awt.Color(51, 153, 255));

        homeBtn0.setBackground(new java.awt.Color(51, 153, 255));
        homeBtn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        homeBtn0.setAlignmentY(0.0F);
        homeBtn0.setBorder(null);
        homeBtn0.setFocusable(false);
        homeBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtn0ActionPerformed(evt);
            }
        });

        titleLbl0.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        titleLbl0.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl0.setText("Create Customer");
        titleLbl0.setAlignmentY(0.0F);
        titleLbl0.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        logoutBtn0.setBackground(new java.awt.Color(204, 255, 255));
        logoutBtn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        logoutBtn0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        logoutBtn0.setBorderPainted(false);
        logoutBtn0.setContentAreaFilled(false);
        logoutBtn0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logoutBtn0.setFocusable(false);
        logoutBtn0.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        logoutBtn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutBtn0.setMaximumSize(new java.awt.Dimension(36, 36));
        logoutBtn0.setPreferredSize(new java.awt.Dimension(35, 35));
        logoutBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtn0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerP0Layout = new javax.swing.GroupLayout(headerP0);
        headerP0.setLayout(headerP0Layout);
        headerP0Layout.setHorizontalGroup(
            headerP0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerP0Layout.createSequentialGroup()
                .addComponent(homeBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(titleLbl0, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerP0Layout.setVerticalGroup(
            headerP0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeBtn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutBtn0, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerP0Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titleLbl0))
        );

        manageCustomerBtn.setBackground(new java.awt.Color(255, 255, 255));
        manageCustomerBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        manageCustomerBtn.setForeground(new java.awt.Color(51, 51, 255));
        manageCustomerBtn.setText("Manage Customer");
        manageCustomerBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        manageCustomerBtn.setFocusable(false);
        manageCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomerBtnActionPerformed(evt);
            }
        });

        bookAppointmentBtn.setBackground(new java.awt.Color(255, 255, 255));
        bookAppointmentBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        bookAppointmentBtn.setForeground(new java.awt.Color(51, 51, 255));
        bookAppointmentBtn.setText("Book Appointment");
        bookAppointmentBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        bookAppointmentBtn.setFocusable(false);
        bookAppointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAppointmentBtnActionPerformed(evt);
            }
        });

        paymentBtn.setBackground(new java.awt.Color(255, 255, 255));
        paymentBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        paymentBtn.setForeground(new java.awt.Color(51, 51, 255));
        paymentBtn.setText("Payment/Receipt");
        paymentBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        paymentBtn.setFocusable(false);
        paymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout staffHomePanelLayout = new javax.swing.GroupLayout(staffHomePanel);
        staffHomePanel.setLayout(staffHomePanelLayout);
        staffHomePanelLayout.setHorizontalGroup(
            staffHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerP0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(staffHomePanelLayout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addGroup(staffHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookAppointmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageCustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        staffHomePanelLayout.setVerticalGroup(
            staffHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffHomePanelLayout.createSequentialGroup()
                .addComponent(headerP0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(manageCustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(bookAppointmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );

        rootPanel.add(staffHomePanel, "card2");

        crudPanel.setBackground(new java.awt.Color(255, 255, 255));
        crudPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerP1.setBackground(new java.awt.Color(51, 153, 255));

        homeBtn1.setBackground(new java.awt.Color(51, 153, 255));
        homeBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        homeBtn1.setAlignmentY(0.0F);
        homeBtn1.setBorder(null);
        homeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtn1ActionPerformed(evt);
            }
        });

        titleLbl1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        titleLbl1.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl1.setText("Create Customer");
        titleLbl1.setAlignmentY(0.0F);
        titleLbl1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        javax.swing.GroupLayout headerP1Layout = new javax.swing.GroupLayout(headerP1);
        headerP1.setLayout(headerP1Layout);
        headerP1Layout.setHorizontalGroup(
            headerP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerP1Layout.createSequentialGroup()
                .addComponent(homeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(titleLbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 618, Short.MAX_VALUE)
                .addComponent(logoutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerP1Layout.setVerticalGroup(
            headerP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerP1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titleLbl1))
        );

        titleLbl1.getAccessibleContext().setAccessibleName("");

        crudPanel.add(headerP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

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
            .addGroup(sidebarPLayout.createSequentialGroup()
                .addGroup(sidebarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(sidebarPLayout.createSequentialGroup()
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidebarPLayout.setVerticalGroup(
            sidebarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(393, Short.MAX_VALUE))
        );

        crudPanel.add(sidebarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 570));

        jTabbedP.setBackground(new java.awt.Color(204, 255, 255));
        jTabbedP.setPreferredSize(new java.awt.Dimension(700, 600));

        createTab.setBackground(new java.awt.Color(204, 255, 255));

        idLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        idLbl.setForeground(new java.awt.Color(51, 51, 255));
        idLbl.setText("ID:");
        idLbl.setAlignmentY(0.0F);

        idTxt.setBackground(new java.awt.Color(255, 255, 255));
        idTxt.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        idTxt.setForeground(new java.awt.Color(0, 0, 255));
        idTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        fullNameLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        fullNameLbl.setForeground(new java.awt.Color(51, 51, 255));
        fullNameLbl.setText("Full Name: ");
        fullNameLbl.setAlignmentY(0.0F);

        fullNameTxt.setBackground(new java.awt.Color(255, 255, 255));
        fullNameTxt.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        fullNameTxt.setForeground(new java.awt.Color(0, 0, 255));
        fullNameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        usernameLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        usernameLbl.setForeground(new java.awt.Color(51, 51, 255));
        usernameLbl.setText("Username: ");
        usernameLbl.setAlignmentY(0.0F);

        usernameTxt.setBackground(new java.awt.Color(255, 255, 255));
        usernameTxt.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        usernameTxt.setForeground(new java.awt.Color(0, 0, 255));
        usernameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        passwordLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(51, 51, 255));
        passwordLbl.setText("Password:");
        passwordLbl.setAlignmentY(0.0F);

        passwordTxt.setBackground(new java.awt.Color(255, 255, 255));
        passwordTxt.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        passwordTxt.setForeground(new java.awt.Color(0, 0, 255));
        passwordTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        createSearchBtn.setBackground(new java.awt.Color(255, 255, 255));
        createSearchBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        createSearchBtn.setForeground(new java.awt.Color(51, 51, 255));
        createSearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        createSearchBtn.setAlignmentY(0.0F);
        createSearchBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        createSearchBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createSearchBtn.setMargin(new java.awt.Insets(1, 14, 1, 14));
        createSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSearchBtnActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(51, 153, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 255));
        jScrollPane2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        customerTable.setBackground(new java.awt.Color(153, 255, 255));
        customerTable.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        customerTable.setForeground(new java.awt.Color(51, 51, 255));
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
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
        customerTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        customerTable.setGridColor(new java.awt.Color(0, 0, 153));
        customerTable.setRowHeight(25);
        customerTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane2.setViewportView(customerTable);

        createSearchbarTxt.setBackground(new java.awt.Color(255, 255, 255));
        createSearchbarTxt.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        createSearchbarTxt.setForeground(new java.awt.Color(0, 0, 255));
        createSearchbarTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));
        createSearchbarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSearchbarTxtActionPerformed(evt);
            }
        });

        createCustomerBtn.setBackground(new java.awt.Color(255, 255, 255));
        createCustomerBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        createCustomerBtn.setForeground(new java.awt.Color(51, 51, 255));
        createCustomerBtn.setText("Create");
        createCustomerBtn.setAlignmentY(0.0F);
        createCustomerBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        createCustomerBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createCustomerBtn.setMargin(new java.awt.Insets(1, 14, 1, 14));
        createCustomerBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        createCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCustomerBtnActionPerformed(evt);
            }
        });

        createFilterComboBox.setBackground(new java.awt.Color(255, 255, 255));
        createFilterComboBox.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createFilterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Username", "Full Name" }));

        javax.swing.GroupLayout createTabLayout = new javax.swing.GroupLayout(createTab);
        createTab.setLayout(createTabLayout);
        createTabLayout.setHorizontalGroup(
            createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createTabLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fullNameLbl)
                    .addComponent(usernameLbl)
                    .addComponent(idLbl)
                    .addComponent(passwordLbl))
                .addGap(31, 31, 31)
                .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createTabLayout.createSequentialGroup()
                .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(createTabLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createCustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createTabLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(createTabLayout.createSequentialGroup()
                                .addComponent(createSearchbarTxt)
                                .addGap(5, 5, 5)
                                .addComponent(createFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        createTabLayout.setVerticalGroup(
            createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createTabLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(createSearchbarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(createFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(createTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
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
                .addGap(18, 18, 18)
                .addComponent(createCustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jTabbedP.addTab("tab1", createTab);

        updateTab.setBackground(new java.awt.Color(204, 255, 255));

        idLbl1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        idLbl1.setForeground(new java.awt.Color(51, 51, 255));
        idLbl1.setText("ID:");
        idLbl1.setAlignmentY(0.0F);

        idTxt1.setBackground(new java.awt.Color(255, 255, 255));
        idTxt1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        idTxt1.setForeground(new java.awt.Color(0, 0, 255));
        idTxt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));
        idTxt1.setDisabledTextColor(new java.awt.Color(102, 153, 255));
        idTxt1.setEnabled(false);

        fullNameLbl1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        fullNameLbl1.setForeground(new java.awt.Color(51, 51, 255));
        fullNameLbl1.setText("Full Name: ");
        fullNameLbl1.setAlignmentY(0.0F);

        fullNameTxt1.setBackground(new java.awt.Color(255, 255, 255));
        fullNameTxt1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        fullNameTxt1.setForeground(new java.awt.Color(0, 0, 255));
        fullNameTxt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        usernameLbl1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        usernameLbl1.setForeground(new java.awt.Color(51, 51, 255));
        usernameLbl1.setText("Username: ");
        usernameLbl1.setAlignmentY(0.0F);

        usernameTxt1.setBackground(new java.awt.Color(255, 255, 255));
        usernameTxt1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        usernameTxt1.setForeground(new java.awt.Color(0, 0, 255));
        usernameTxt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        passwordLbl1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        passwordLbl1.setForeground(new java.awt.Color(51, 51, 255));
        passwordLbl1.setText("Password:");
        passwordLbl1.setAlignmentY(0.0F);

        passwordTxt1.setBackground(new java.awt.Color(255, 255, 255));
        passwordTxt1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        passwordTxt1.setForeground(new java.awt.Color(0, 0, 255));
        passwordTxt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        updateSearchBtn.setBackground(new java.awt.Color(255, 255, 255));
        updateSearchBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        updateSearchBtn.setForeground(new java.awt.Color(51, 51, 255));
        updateSearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        updateSearchBtn.setAlignmentY(0.0F);
        updateSearchBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        updateSearchBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateSearchBtn.setMargin(new java.awt.Insets(1, 14, 1, 14));
        updateSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSearchBtnActionPerformed(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(51, 153, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jScrollPane3.setForeground(new java.awt.Color(0, 0, 255));
        jScrollPane3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        customerTable1.setBackground(new java.awt.Color(153, 255, 255));
        customerTable1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        customerTable1.setForeground(new java.awt.Color(51, 51, 255));
        customerTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        customerTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        customerTable1.setGridColor(new java.awt.Color(0, 0, 153));
        customerTable1.setRowHeight(25);
        customerTable1.setSelectionBackground(new java.awt.Color(153, 204, 255));
        customerTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedDisplayData(evt);
            }
        });
        jScrollPane3.setViewportView(customerTable1);

        updateSearchbarTxt.setBackground(new java.awt.Color(255, 255, 255));
        updateSearchbarTxt.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        updateSearchbarTxt.setForeground(new java.awt.Color(0, 0, 255));
        updateSearchbarTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));
        updateSearchbarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSearchbarTxtActionPerformed(evt);
            }
        });

        updateCustomerBtn.setBackground(new java.awt.Color(255, 255, 255));
        updateCustomerBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        updateCustomerBtn.setForeground(new java.awt.Color(51, 51, 255));
        updateCustomerBtn.setText("Update");
        updateCustomerBtn.setAlignmentY(0.0F);
        updateCustomerBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        updateCustomerBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateCustomerBtn.setMargin(new java.awt.Insets(1, 14, 1, 14));
        updateCustomerBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        updateCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomerBtnActionPerformed(evt);
            }
        });

        updateFilterComboBox.setBackground(new java.awt.Color(255, 255, 255));
        updateFilterComboBox.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        updateFilterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Username", "Full Name" }));

        roleLbl1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        roleLbl1.setForeground(new java.awt.Color(51, 51, 255));
        roleLbl1.setText("Role:");
        roleLbl1.setAlignmentY(0.0F);

        roleComboBox.setBackground(new java.awt.Color(255, 255, 255));
        roleComboBox.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer" }));

        javax.swing.GroupLayout updateTabLayout = new javax.swing.GroupLayout(updateTab);
        updateTab.setLayout(updateTabLayout);
        updateTabLayout.setHorizontalGroup(
            updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateTabLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateTabLayout.createSequentialGroup()
                        .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addGroup(updateTabLayout.createSequentialGroup()
                                .addComponent(updateSearchbarTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateTabLayout.createSequentialGroup()
                        .addGap(0, 71, Short.MAX_VALUE)
                        .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLbl1)
                            .addComponent(fullNameLbl1)
                            .addComponent(usernameLbl1)
                            .addComponent(passwordLbl1)
                            .addComponent(roleLbl1))
                        .addGap(18, 18, 18)
                        .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateTabLayout.createSequentialGroup()
                                    .addComponent(updateCustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateTabLayout.createSequentialGroup()
                                    .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fullNameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(100, 100, 100)))
                            .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        updateTabLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fullNameTxt1, idTxt1, passwordTxt1, usernameTxt1});

        updateTabLayout.setVerticalGroup(
            updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateTabLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateSearchBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(updateSearchbarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fullNameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullNameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(updateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateCustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jTabbedP.addTab("tab2", updateTab);

        deleteTab.setBackground(new java.awt.Color(204, 255, 255));

        jScrollPane4.setBackground(new java.awt.Color(51, 153, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jScrollPane4.setForeground(new java.awt.Color(0, 0, 255));
        jScrollPane4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        customerTable2.setBackground(new java.awt.Color(153, 255, 255));
        customerTable2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        customerTable2.setForeground(new java.awt.Color(51, 51, 255));
        customerTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        customerTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        customerTable2.setGridColor(new java.awt.Color(0, 0, 153));
        customerTable2.setRowHeight(25);
        customerTable2.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane4.setViewportView(customerTable2);

        deleteSearchbarTxt.setBackground(new java.awt.Color(255, 255, 255));
        deleteSearchbarTxt.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        deleteSearchbarTxt.setForeground(new java.awt.Color(0, 0, 255));
        deleteSearchbarTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));
        deleteSearchbarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSearchbarTxtActionPerformed(evt);
            }
        });

        deleteFilterComboBox.setBackground(new java.awt.Color(255, 255, 255));
        deleteFilterComboBox.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        deleteFilterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Username", "Full Name" }));

        deleteSearchBtn.setBackground(new java.awt.Color(255, 255, 255));
        deleteSearchBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        deleteSearchBtn.setForeground(new java.awt.Color(51, 51, 255));
        deleteSearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        deleteSearchBtn.setAlignmentY(0.0F);
        deleteSearchBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        deleteSearchBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteSearchBtn.setMargin(new java.awt.Insets(1, 14, 1, 14));
        deleteSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSearchBtnActionPerformed(evt);
            }
        });

        deleteCustomerBtn.setBackground(new java.awt.Color(255, 255, 255));
        deleteCustomerBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        deleteCustomerBtn.setForeground(new java.awt.Color(51, 51, 255));
        deleteCustomerBtn.setText("Delete");
        deleteCustomerBtn.setAlignmentY(0.0F);
        deleteCustomerBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        deleteCustomerBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteCustomerBtn.setMargin(new java.awt.Insets(1, 14, 1, 14));
        deleteCustomerBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        deleteCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteTabLayout = new javax.swing.GroupLayout(deleteTab);
        deleteTab.setLayout(deleteTabLayout);
        deleteTabLayout.setHorizontalGroup(
            deleteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteTabLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(deleteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(deleteTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteCustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deleteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4)
                        .addGroup(deleteTabLayout.createSequentialGroup()
                            .addComponent(deleteSearchbarTxt)
                            .addGap(5, 5, 5)
                            .addComponent(deleteFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deleteSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
        deleteTabLayout.setVerticalGroup(
            deleteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteTabLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(deleteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(deleteTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteSearchbarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteCustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedP.addTab("tab3", deleteTab);

        crudPanel.add(jTabbedP, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, -40, 706, 640));

        rootPanel.add(crudPanel, "card3");

        bookAppointmentPanel.setBackground(new java.awt.Color(204, 255, 255));

        headerP2.setBackground(new java.awt.Color(51, 153, 255));

        homeBtn2.setBackground(new java.awt.Color(51, 153, 255));
        homeBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        homeBtn2.setAlignmentY(0.0F);
        homeBtn2.setBorder(null);
        homeBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtn2ActionPerformed(evt);
            }
        });

        titleLbl2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        titleLbl2.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl2.setText("Book Appointment");
        titleLbl2.setAlignmentY(0.0F);
        titleLbl2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        javax.swing.GroupLayout headerP2Layout = new javax.swing.GroupLayout(headerP2);
        headerP2.setLayout(headerP2Layout);
        headerP2Layout.setHorizontalGroup(
            headerP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerP2Layout.createSequentialGroup()
                .addComponent(homeBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(titleLbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerP2Layout.setVerticalGroup(
            headerP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerP2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titleLbl2))
            .addComponent(logoutBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bookBtn.setBackground(new java.awt.Color(255, 255, 255));
        bookBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        bookBtn.setForeground(new java.awt.Color(51, 51, 255));
        bookBtn.setText("Book");
        bookBtn.setAlignmentY(0.0F);
        bookBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        bookBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bookBtn.setMargin(new java.awt.Insets(1, 14, 1, 14));
        bookBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bookBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        specialtyLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        specialtyLbl.setForeground(new java.awt.Color(51, 51, 255));
        specialtyLbl.setText("Specialty: ");
        specialtyLbl.setAlignmentY(0.0F);
        specialtyLbl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        doctorNameLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        doctorNameLbl.setForeground(new java.awt.Color(51, 51, 255));
        doctorNameLbl.setText("Doctor: ");
        doctorNameLbl.setAlignmentY(0.0F);
        doctorNameLbl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        dateLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        dateLbl.setForeground(new java.awt.Color(51, 51, 255));
        dateLbl.setText("Date: ");
        dateLbl.setAlignmentY(0.0F);
        dateLbl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        timeLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        timeLbl.setForeground(new java.awt.Color(51, 51, 255));
        timeLbl.setText("Time: ");
        timeLbl.setAlignmentY(0.0F);
        timeLbl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jScrollPane5.setBackground(new java.awt.Color(51, 153, 255));
        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jScrollPane5.setForeground(new java.awt.Color(0, 0, 255));
        jScrollPane5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        appointmentCustomerTable.setBackground(new java.awt.Color(153, 255, 255));
        appointmentCustomerTable.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        appointmentCustomerTable.setForeground(new java.awt.Color(51, 51, 255));
        appointmentCustomerTable.setModel(new javax.swing.table.DefaultTableModel(
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
        appointmentCustomerTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        appointmentCustomerTable.setGridColor(new java.awt.Color(0, 0, 153));
        appointmentCustomerTable.setRowHeight(25);
        appointmentCustomerTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane5.setViewportView(appointmentCustomerTable);

        doctorComboBox.setBackground(new java.awt.Color(255, 255, 255));
        doctorComboBox.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        doctorComboBox.setForeground(new java.awt.Color(51, 51, 255));

        specialtyComboBox.setBackground(new java.awt.Color(255, 255, 255));
        specialtyComboBox.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        specialtyComboBox.setForeground(new java.awt.Color(51, 51, 255));
        specialtyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General Medicine", "Cardiology", "Orthopedics", "Pediatrics", "Dermatology" }));

        timeComboBox.setBackground(new java.awt.Color(255, 255, 255));
        timeComboBox.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        timeComboBox.setForeground(new java.awt.Color(51, 51, 255));

        appointmentIdLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        appointmentIdLbl.setForeground(new java.awt.Color(51, 51, 255));
        appointmentIdLbl.setText("Appointment ID:");
        appointmentIdLbl.setAlignmentY(0.0F);
        appointmentIdLbl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        appointmentIdTxt.setBackground(new java.awt.Color(255, 255, 255));
        appointmentIdTxt.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        appointmentIdTxt.setForeground(new java.awt.Color(0, 0, 255));
        appointmentIdTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));
        appointmentIdTxt.setEnabled(false);

        jDateChooser.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser.setForeground(new java.awt.Color(51, 51, 255));
        jDateChooser.setDateFormatString("EEEE, MMMM dd, yyyy");
        jDateChooser.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserPropertyChange(evt);
            }
        });

        bookCustomerSearchbarTxt.setBackground(new java.awt.Color(255, 255, 255));
        bookCustomerSearchbarTxt.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bookCustomerSearchbarTxt.setForeground(new java.awt.Color(0, 0, 255));
        bookCustomerSearchbarTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));
        bookCustomerSearchbarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookCustomerSearchbarTxtActionPerformed(evt);
            }
        });

        bookFilterComboBox.setBackground(new java.awt.Color(255, 255, 255));
        bookFilterComboBox.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bookFilterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Username", "Full Name" }));

        bookSearchBtn.setBackground(new java.awt.Color(255, 255, 255));
        bookSearchBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        bookSearchBtn.setForeground(new java.awt.Color(51, 51, 255));
        bookSearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        bookSearchBtn.setAlignmentY(0.0F);
        bookSearchBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        bookSearchBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bookSearchBtn.setMargin(new java.awt.Insets(1, 14, 1, 14));
        bookSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookSearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookAppointmentPanelLayout = new javax.swing.GroupLayout(bookAppointmentPanel);
        bookAppointmentPanel.setLayout(bookAppointmentPanelLayout);
        bookAppointmentPanelLayout.setHorizontalGroup(
            bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerP2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookAppointmentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(bookAppointmentPanelLayout.createSequentialGroup()
                        .addComponent(appointmentIdLbl)
                        .addGap(18, 18, 18)
                        .addComponent(appointmentIdTxt))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bookAppointmentPanelLayout.createSequentialGroup()
                        .addComponent(doctorNameLbl)
                        .addGap(23, 23, 23)
                        .addComponent(doctorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bookAppointmentPanelLayout.createSequentialGroup()
                        .addComponent(specialtyLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(specialtyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(bookAppointmentPanelLayout.createSequentialGroup()
                            .addComponent(timeLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(timeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(bookAppointmentPanelLayout.createSequentialGroup()
                            .addComponent(dateLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bookBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
            .addGroup(bookAppointmentPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookAppointmentPanelLayout.createSequentialGroup()
                        .addComponent(bookCustomerSearchbarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        bookAppointmentPanelLayout.setVerticalGroup(
            bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookAppointmentPanelLayout.createSequentialGroup()
                .addComponent(headerP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bookCustomerSearchbarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bookFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(specialtyLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(specialtyComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doctorNameLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(bookAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appointmentIdTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appointmentIdLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        ((JTextField) jDateChooser.getDateEditor().getUiComponent()).setBackground(Color.WHITE);

        rootPanel.add(bookAppointmentPanel, "card4");

        paymentPanel.setBackground(new java.awt.Color(204, 255, 255));

        headerP3.setBackground(new java.awt.Color(51, 153, 255));

        homeBtn3.setBackground(new java.awt.Color(51, 153, 255));
        homeBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        homeBtn3.setAlignmentY(0.0F);
        homeBtn3.setBorder(null);
        homeBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtn3ActionPerformed(evt);
            }
        });

        titleLbl3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        titleLbl3.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl3.setText("Payment/Receipt");
        titleLbl3.setAlignmentY(0.0F);
        titleLbl3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        javax.swing.GroupLayout headerP3Layout = new javax.swing.GroupLayout(headerP3);
        headerP3.setLayout(headerP3Layout);
        headerP3Layout.setHorizontalGroup(
            headerP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerP3Layout.createSequentialGroup()
                .addComponent(homeBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(titleLbl3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 612, Short.MAX_VALUE)
                .addComponent(logoutBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerP3Layout.setVerticalGroup(
            headerP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerP3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        paymentSearchBarTxt.setBackground(new java.awt.Color(255, 255, 255));
        paymentSearchBarTxt.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        paymentSearchBarTxt.setForeground(new java.awt.Color(0, 0, 255));
        paymentSearchBarTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));
        paymentSearchBarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentSearchBarTxtActionPerformed(evt);
            }
        });

        paymentFilterComboBox.setBackground(new java.awt.Color(255, 255, 255));
        paymentFilterComboBox.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        paymentFilterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Customer Name" }));

        paymentSearchBtn.setBackground(new java.awt.Color(255, 255, 255));
        paymentSearchBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        paymentSearchBtn.setForeground(new java.awt.Color(51, 51, 255));
        paymentSearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        paymentSearchBtn.setAlignmentY(0.0F);
        paymentSearchBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        paymentSearchBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        paymentSearchBtn.setMargin(new java.awt.Insets(1, 14, 1, 14));
        paymentSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentSearchBtnActionPerformed(evt);
            }
        });

        jScrollPane6.setBackground(new java.awt.Color(51, 153, 255));
        jScrollPane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jScrollPane6.setForeground(new java.awt.Color(0, 0, 255));
        jScrollPane6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        paymentTable.setBackground(new java.awt.Color(153, 255, 255));
        paymentTable.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        paymentTable.setForeground(new java.awt.Color(51, 51, 255));
        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
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
        paymentTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        paymentTable.setGridColor(new java.awt.Color(0, 0, 153));
        paymentTable.setRowHeight(25);
        paymentTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        paymentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(paymentTable);

        chargePanel.setBackground(new java.awt.Color(153, 255, 255));
        chargePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        chargeLbl.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        chargeLbl.setForeground(new java.awt.Color(51, 51, 255));
        chargeLbl.setText("Charges:");
        chargeLbl.setAlignmentY(0.0F);

        payBtn.setBackground(new java.awt.Color(255, 255, 255));
        payBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        payBtn.setForeground(new java.awt.Color(51, 51, 255));
        payBtn.setText("Pay");
        payBtn.setAlignmentY(0.0F);
        payBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        payBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        payBtn.setMargin(new java.awt.Insets(3, 14, 0, 14));
        payBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        payBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        doctorReviewLbl.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        doctorReviewLbl.setForeground(new java.awt.Color(51, 51, 255));
        doctorReviewLbl.setText("Doctor Review:");
        doctorReviewLbl.setAlignmentY(0.0F);

        doctorReviewLbl2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        doctorReviewLbl2.setForeground(new java.awt.Color(153, 153, 153));
        doctorReviewLbl2.setText("Doctor Review");
        doctorReviewLbl2.setAlignmentY(0.0F);

        chargeLbl2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        chargeLbl2.setForeground(new java.awt.Color(153, 153, 153));
        chargeLbl2.setText("RM0.00");
        chargeLbl2.setAlignmentY(0.0F);

        javax.swing.GroupLayout chargePanelLayout = new javax.swing.GroupLayout(chargePanel);
        chargePanel.setLayout(chargePanelLayout);
        chargePanelLayout.setHorizontalGroup(
            chargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chargePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(chargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(doctorReviewLbl)
                    .addComponent(chargeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(chargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chargePanelLayout.createSequentialGroup()
                        .addComponent(chargeLbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(chargePanelLayout.createSequentialGroup()
                        .addComponent(doctorReviewLbl2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        chargePanelLayout.setVerticalGroup(
            chargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chargePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(chargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chargePanelLayout.createSequentialGroup()
                        .addGroup(chargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doctorReviewLbl)
                            .addComponent(doctorReviewLbl2))
                        .addGap(15, 15, 15)
                        .addGroup(chargePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chargeLbl)
                            .addComponent(chargeLbl2))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chargePanelLayout.createSequentialGroup()
                        .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        javax.swing.GroupLayout paymentPanelLayout = new javax.swing.GroupLayout(paymentPanel);
        paymentPanel.setLayout(paymentPanelLayout);
        paymentPanelLayout.setHorizontalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerP3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentPanelLayout.createSequentialGroup()
                        .addComponent(paymentSearchBarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paymentFilterComboBox, 0, 145, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paymentSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6)
                    .addComponent(chargePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        paymentPanelLayout.setVerticalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentPanelLayout.createSequentialGroup()
                .addComponent(headerP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(paymentSearchBarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(paymentFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(paymentSearchBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chargePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        rootPanel.add(paymentPanel, "card5");

        getContentPane().add(rootPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // panel control
    public void showPanel(JPanel panelName) {
        staffHomePanel.setVisible(false);
        crudPanel.setVisible(false);
        bookAppointmentPanel.setVisible(false);
        paymentPanel.setVisible(false);
        chargePanel.setVisible(false);
        
        panelName.setVisible(true);
    }
    
    // sidebar button color control
    public void buttonColor(JButton btnName) {
        createBtn.setBackground(new Color(51,255,255));
        updateBtn.setBackground(new Color(51,255,255));
        deleteBtn.setBackground(new Color(51,255,255));
                
        btnName.setBackground(new Color(255,255,255));
    }
    
    private void logoutBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn0ActionPerformed
        Login user = new Login();
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtn0ActionPerformed

    private void manageCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomerBtnActionPerformed
        showPanel(crudPanel);
        buttonColor(createBtn);
        titleLbl1.setText("Create Customer");
        
        StaffClass loadTable = new StaffClass(currentRole);
        loadTable.loadDataToTable(customerTable); 
    }//GEN-LAST:event_manageCustomerBtnActionPerformed

    private void homeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtn1ActionPerformed
        showPanel(staffHomePanel);
    }//GEN-LAST:event_homeBtn1ActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        jTabbedP.setSelectedIndex(0);
        buttonColor(createBtn);
        
        manageCustomerBtnActionPerformed(evt); 
    }//GEN-LAST:event_createBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        jTabbedP.setSelectedIndex(1);
        buttonColor(updateBtn);
        titleLbl1.setText("Update Customer");
        
        StaffClass loadTable = new StaffClass(currentRole);
        loadTable.loadDataToTable(customerTable1); 
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        jTabbedP.setSelectedIndex(2);
        buttonColor(deleteBtn);
        titleLbl1.setText("Delete Customer");
        
        StaffClass loadTable = new StaffClass(currentRole);
        loadTable.loadDataToTable(customerTable2); 
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void createSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSearchBtnActionPerformed
        StaffClass read = new StaffClass(currentRole);
        read.readUser(customerTable, createSearchbarTxt, createFilterComboBox);
    }//GEN-LAST:event_createSearchBtnActionPerformed

    private void createCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCustomerBtnActionPerformed
        StaffClass createC = new StaffClass(currentRole);
        createC.createUser(idTxt, usernameTxt, passwordTxt, "Customer", fullNameTxt);
        createC.loadDataToTable(customerTable);
    }//GEN-LAST:event_createCustomerBtnActionPerformed

    private void createSearchbarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSearchbarTxtActionPerformed
        createSearchBtn.doClick();
    }//GEN-LAST:event_createSearchbarTxtActionPerformed

    private void homeBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtn0ActionPerformed
        showPanel(staffHomePanel);
    }//GEN-LAST:event_homeBtn0ActionPerformed

    private void updateSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSearchBtnActionPerformed
        StaffClass read = new StaffClass(currentRole);
        read.readUser(customerTable1, updateSearchbarTxt, updateFilterComboBox);
    }//GEN-LAST:event_updateSearchBtnActionPerformed

    private void updateSearchbarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSearchbarTxtActionPerformed
        updateSearchBtn.doClick();
    }//GEN-LAST:event_updateSearchbarTxtActionPerformed

    private void updateCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustomerBtnActionPerformed
        StaffClass update = new StaffClass(currentRole);
        update.updateUser(customerTable1, idTxt1, usernameTxt1, passwordTxt1, fullNameTxt1, roleComboBox);
    }//GEN-LAST:event_updateCustomerBtnActionPerformed

    private void deleteSearchbarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSearchbarTxtActionPerformed
        deleteSearchBtn.doClick();
    }//GEN-LAST:event_deleteSearchbarTxtActionPerformed

    private void deleteSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSearchBtnActionPerformed
        StaffClass read = new StaffClass(currentRole);
        read.readUser(customerTable2, deleteSearchbarTxt, deleteFilterComboBox);
    }//GEN-LAST:event_deleteSearchBtnActionPerformed

    private void deleteCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerBtnActionPerformed
        StaffClass dlt = new StaffClass(currentRole);
        dlt.deleteUser(customerTable2);
        dlt.loadDataToTable(customerTable2);
    }//GEN-LAST:event_deleteCustomerBtnActionPerformed

    private void mouseClickedDisplayData(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickedDisplayData
        StaffClass show = new StaffClass(currentRole);
        show.userData(customerTable1, idTxt1, fullNameTxt1, usernameTxt1, passwordTxt1, roleComboBox);
    }//GEN-LAST:event_mouseClickedDisplayData

    private void homeBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtn2ActionPerformed
        showPanel(staffHomePanel);
    }//GEN-LAST:event_homeBtn2ActionPerformed

    private void bookAppointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAppointmentBtnActionPerformed
        showPanel(bookAppointmentPanel);
        StaffClass loadTable = new StaffClass(currentRole);
        loadTable.loadDataToTable(appointmentCustomerTable); 
    }//GEN-LAST:event_bookAppointmentBtnActionPerformed

    private void logoutBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn1ActionPerformed
        Login user = new Login();
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtn1ActionPerformed

    private void logoutBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn2ActionPerformed
        Login user = new Login();
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtn2ActionPerformed

    private void homeBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtn3ActionPerformed
        showPanel(staffHomePanel);
    }//GEN-LAST:event_homeBtn3ActionPerformed

    private void logoutBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn3ActionPerformed
        Login user = new Login();
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtn3ActionPerformed

    private void paymentSearchBarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentSearchBarTxtActionPerformed
        paymentSearchBtn.doClick();
    }//GEN-LAST:event_paymentSearchBarTxtActionPerformed

    private void paymentSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentSearchBtnActionPerformed
        StaffClass search = new StaffClass(currentRole);
        search.search(paymentTable, paymentFilterComboBox, paymentSearchBarTxt);
    }//GEN-LAST:event_paymentSearchBtnActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        StaffClass pay = new StaffClass(currentRole);
        pay.payment(paymentTable, chargePanel, chargeLbl2);
    }//GEN-LAST:event_payBtnActionPerformed

    private void paymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBtnActionPerformed
        showPanel(paymentPanel);
        StaffClass loadTable = new StaffClass(currentRole);
        loadTable.loadPaymentData(paymentTable);
    }//GEN-LAST:event_paymentBtnActionPerformed

    private void bookCustomerSearchbarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookCustomerSearchbarTxtActionPerformed
        bookSearchBtn.doClick();
    }//GEN-LAST:event_bookCustomerSearchbarTxtActionPerformed

    private void bookSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookSearchBtnActionPerformed
        StaffClass search = new StaffClass(currentRole);
        search.readUser(appointmentCustomerTable, bookCustomerSearchbarTxt, bookFilterComboBox);
    }//GEN-LAST:event_bookSearchBtnActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        StaffClass book = new StaffClass(currentRole);
        book.bookAppointment(appointmentCustomerTable, appointmentIdTxt, specialtyComboBox, doctorComboBox, timeComboBox, jDateChooser);
    }//GEN-LAST:event_bookBtnActionPerformed

    private void jDateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserPropertyChange
        StaffClass.availableTime(timeComboBox, jDateChooser);
    }//GEN-LAST:event_jDateChooserPropertyChange

    private void paymentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentTableMouseClicked
        StaffClass check = new StaffClass(currentRole);
        check.showCharge(paymentTable, chargePanel, doctorReviewLbl2, chargeLbl2);
        check.showReceipt(paymentTable, receiptDialog, dateR, idR, customerNameR, doctorR, reviewR, chargeR);
    }//GEN-LAST:event_paymentTableMouseClicked

   
    
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
//        java.awt.EventQueue.invokeLater(() -> new Staff().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointmentCustomerTable;
    private javax.swing.JLabel appointmentIdLbl;
    private javax.swing.JTextField appointmentIdTxt;
    private javax.swing.JButton bookAppointmentBtn;
    private javax.swing.JPanel bookAppointmentPanel;
    private javax.swing.JButton bookBtn;
    private javax.swing.JTextField bookCustomerSearchbarTxt;
    private javax.swing.JComboBox<String> bookFilterComboBox;
    private javax.swing.JButton bookSearchBtn;
    private javax.swing.JLabel chargeLbl;
    private javax.swing.JLabel chargeLbl2;
    private javax.swing.JPanel chargePanel;
    private javax.swing.JLabel chargeR;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton createCustomerBtn;
    private javax.swing.JComboBox<String> createFilterComboBox;
    private javax.swing.JButton createSearchBtn;
    private javax.swing.JTextField createSearchbarTxt;
    private javax.swing.JPanel createTab;
    private javax.swing.JPanel crudPanel;
    private javax.swing.JLabel customerNameR;
    private javax.swing.JTable customerTable;
    private javax.swing.JTable customerTable1;
    private javax.swing.JTable customerTable2;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel dateR;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton deleteCustomerBtn;
    private javax.swing.JComboBox<String> deleteFilterComboBox;
    private javax.swing.JButton deleteSearchBtn;
    private javax.swing.JTextField deleteSearchbarTxt;
    private javax.swing.JPanel deleteTab;
    private javax.swing.JComboBox<String> doctorComboBox;
    private javax.swing.JLabel doctorNameLbl;
    private javax.swing.JLabel doctorR;
    private javax.swing.JLabel doctorReviewLbl;
    private javax.swing.JLabel doctorReviewLbl2;
    private javax.swing.JLabel fullNameLbl;
    private javax.swing.JLabel fullNameLbl1;
    private javax.swing.JTextField fullNameTxt;
    private javax.swing.JTextField fullNameTxt1;
    private javax.swing.JPanel headerP0;
    private javax.swing.JPanel headerP1;
    private javax.swing.JPanel headerP2;
    private javax.swing.JPanel headerP3;
    private javax.swing.JButton homeBtn0;
    private javax.swing.JButton homeBtn1;
    private javax.swing.JButton homeBtn2;
    private javax.swing.JButton homeBtn3;
    private javax.swing.JLabel idLbl;
    private javax.swing.JLabel idLbl1;
    private javax.swing.JLabel idR;
    private javax.swing.JTextField idTxt;
    private javax.swing.JTextField idTxt1;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedP;
    private javax.swing.JButton logoutBtn0;
    private javax.swing.JButton logoutBtn1;
    private javax.swing.JButton logoutBtn2;
    private javax.swing.JButton logoutBtn3;
    private javax.swing.JButton manageCustomerBtn;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel passwordLbl1;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField passwordTxt1;
    private javax.swing.JButton payBtn;
    private javax.swing.JButton paymentBtn;
    private javax.swing.JComboBox<String> paymentFilterComboBox;
    private javax.swing.JPanel paymentPanel;
    private javax.swing.JTextField paymentSearchBarTxt;
    private javax.swing.JButton paymentSearchBtn;
    private javax.swing.JTable paymentTable;
    private javax.swing.JDialog receiptDialog;
    private javax.swing.JPanel receiptPanel;
    private javax.swing.JLabel reviewR;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JLabel roleLbl1;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JPanel sidebarP;
    private javax.swing.JComboBox<String> specialtyComboBox;
    private javax.swing.JLabel specialtyLbl;
    private javax.swing.JPanel staffHomePanel;
    private javax.swing.JComboBox<String> timeComboBox;
    private javax.swing.JLabel timeLbl;
    private javax.swing.JLabel titleLbl0;
    private javax.swing.JLabel titleLbl1;
    private javax.swing.JLabel titleLbl2;
    private javax.swing.JLabel titleLbl3;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton updateCustomerBtn;
    private javax.swing.JComboBox<String> updateFilterComboBox;
    private javax.swing.JButton updateSearchBtn;
    private javax.swing.JTextField updateSearchbarTxt;
    private javax.swing.JPanel updateTab;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JLabel usernameLbl1;
    private javax.swing.JTextField usernameTxt;
    private javax.swing.JTextField usernameTxt1;
    // End of variables declaration//GEN-END:variables
}
