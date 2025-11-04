// GUI
package apu.medical.centre;
import java.awt.*;
import javax.swing.*;


public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    public Login() {
        initComponents();
        login.requestFocusInWindow(); // set initial focus on panel
        setLocationRelativeTo(null); // set window pop out from screen center
        getRootPane().setDefaultButton(loginBtn);
        this.setTitle("Login");
        
        usernameTxt.setText(" Username");
        usernameTxt.setForeground(new Color(153,153,153));
        pwTxt.setText(" Password");
        pwTxt.setForeground(new Color(153,153,153));
        pwTxt.setEchoChar((char) 0); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        loginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        pwTxt = new javax.swing.JPasswordField();
        pwBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        login.setBackground(new java.awt.Color(204, 255, 255));
        login.setNextFocusableComponent(jLabel1);

        loginBtn.setBackground(new java.awt.Color(255, 255, 255));
        loginBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(51, 51, 255));
        loginBtn.setText("Login");
        loginBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        loginBtn.setNextFocusableComponent(usernameTxt);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("<html>\n<center>\nAPU Medical Centre\n</center>\n</html>");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        usernameTxt.setBackground(new java.awt.Color(153, 255, 255));
        usernameTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usernameTxt.setForeground(new java.awt.Color(0, 0, 255));
        usernameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));
        usernameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTxtFocusLost(evt);
            }
        });

        pwTxt.setBackground(new java.awt.Color(153, 255, 255));
        pwTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pwTxt.setForeground(new java.awt.Color(0, 0, 255));
        pwTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));
        pwTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwTxtFocusLost(evt);
            }
        });

        pwBtn.setBackground(new java.awt.Color(204, 255, 255));
        pwBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/show.png"))); // NOI18N
        pwBtn.setBorder(null);
        pwBtn.setFocusPainted(false);
        pwBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameTxt)
                    .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pwTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwBtn)
                .addGap(287, 287, 287))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        getContentPane().add(login, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String username = usernameTxt.getText();
        String password = pwTxt.getText();

        User user = User.login(username, password); // create user object
        String role = user.getRole();
        try{
            if (role != null && role.equals("Manager")){
                Manager manager = new Manager(user);
                manager.setVisible(true);
            }
            else if (role != null && role.equals("Staff")){
                Staff staff = new Staff(user);
                staff.setVisible(true);
            }
            else if (role != null && role.equals("Doctor")){
                Doctor doctor = new Doctor(user);
                doctor.setVisible(true);
            }
            else if (role != null && role.equals("Customer")){
                Customer customer = new Customer(user);
                customer.setVisible(true);
            }  
        }finally {
            this.dispose();
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    // hint text
    private void usernameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTxtFocusGained
        if (usernameTxt.getText().equals(" Username")) {
            usernameTxt.setText("");
            usernameTxt.setForeground(new Color(0,0,255));
        }
    }//GEN-LAST:event_usernameTxtFocusGained

    private void usernameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTxtFocusLost
        if (usernameTxt.getText().isEmpty()) {
            usernameTxt.setText(" Username");
            usernameTxt.setForeground(new Color(153,153,153));
        } 
    }//GEN-LAST:event_usernameTxtFocusLost

    private void pwTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwTxtFocusGained
        if (new String(pwTxt.getPassword()).equals(" Password")) {
            pwTxt.setText(""); // Clear the hint text
            pwTxt.setForeground(new Color(0, 0, 255)); // Set a new foreground color
            pwTxt.setEchoChar('*'); // Set the echo character back to hide the text

            // Load the icon for "show" since the text is now hidden
            pwBtn.setIcon(new ImageIcon(getClass().getResource("/image/show.png")));
        }
    }//GEN-LAST:event_pwTxtFocusGained

    private void pwTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwTxtFocusLost
        if (pwTxt.getPassword().length == 0) {
            pwTxt.setEchoChar((char) 0); // Set the echo character to 0 to show plain text
            pwTxt.setText(" Password"); // Set the hint text
            pwTxt.setForeground(new Color(153, 153, 153)); // Set a gray foreground color

            // The text is now visible, so the button should be a "hide" button
            pwBtn.setIcon(new ImageIcon(getClass().getResource("/image/hide.png")));
        }
    }//GEN-LAST:event_pwTxtFocusLost

    private void pwBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwBtnActionPerformed
        char echoChar = pwTxt.getEchoChar();

        // If the current character is '*' (hidden), set it to 0 (visible)
        if (echoChar == '*') {
            pwTxt.setEchoChar((char) 0);
            pwBtn.setIcon(new ImageIcon(getClass().getResource("/image/hide.png")));
        }
        // If it's a 0 (visible), set it back to '*' (hidden)
        else {
            pwTxt.setEchoChar('*');
            pwBtn.setIcon(new ImageIcon(getClass().getResource("/image/show.png")));
        }
    }//GEN-LAST:event_pwBtnActionPerformed

    
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
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel login;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton pwBtn;
    private javax.swing.JPasswordField pwTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
