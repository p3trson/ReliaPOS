package reliapos;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;



public class Register extends javax.swing.JFrame {
    
    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        AddressTf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        emailTf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        phoneTf = new javax.swing.JTextField();
        passTf = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Relia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel3)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(72, 72, 72));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTER");

        nameTf.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");

        loginBtn.setBackground(new java.awt.Color(52, 52, 52));
        loginBtn.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        registerBtn.setBackground(new java.awt.Color(52, 52, 52));
        registerBtn.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("Sign Up");
        registerBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        AddressTf.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        AddressTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTfActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("E-mail");

        emailTf.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        emailTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTfActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone number");

        phoneTf.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        phoneTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTfActionPerformed(evt);
            }
        });

        passTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailTf)
                    .addComponent(phoneTf, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(AddressTf)
                    .addComponent(nameTf)
                    .addComponent(passTf, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameTf, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddressTf, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailTf, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phoneTf, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTfActionPerformed
        
    }//GEN-LAST:event_nameTfActionPerformed

    private void AddressTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTfActionPerformed
        
    }//GEN-LAST:event_AddressTfActionPerformed

    private void emailTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTfActionPerformed
        
    }//GEN-LAST:event_emailTfActionPerformed

    private void phoneTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTfActionPerformed
       
    }//GEN-LAST:event_phoneTfActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
      register();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void passTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTfActionPerformed
        
    }//GEN-LAST:event_passTfActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginBtnActionPerformed

    public void register() {
    String name = nameTf.getText();
    String adrs = AddressTf.getText();
    String email = emailTf.getText();
    String phone = phoneTf.getText();
    char[] passwordChars = passTf.getPassword();
    String pass = new String(passwordChars);

    Argon2PasswordEncoder encoder = new Argon2PasswordEncoder(32, 64, 1, 15 * 1024, 2);
    String encodedPassword = encoder.encode(pass);

    try {
        Statement s = DB.connect().createStatement();
        s.executeUpdate("INSERT INTO users (Name, Address, `E-mail`, `Phone number`, Password ) VALUES ('" + name + "', '" + adrs + "', '" + email + "', '" + phone + "', '" + encodedPassword + "')");

        JOptionPane.showMessageDialog(rootPane, "Your account has been created.");

        this.setVisible(false);
        new Login().setVisible(true);

    } catch (HeadlessException | SQLException e) {
        e.printStackTrace();
    } 
}
    

    public static void main(String args[]) {
        
        FlatDarkLaf.setup();
            
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTf;
    private javax.swing.JTextField emailTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField nameTf;
    private javax.swing.JPasswordField passTf;
    private javax.swing.JTextField phoneTf;
    private javax.swing.JButton registerBtn;
    // End of variables declaration//GEN-END:variables
}
