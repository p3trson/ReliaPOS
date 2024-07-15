package reliapos;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;


public class Login extends javax.swing.JFrame {    
    JpanelLoader panelLoader = new JpanelLoader();
    Connection con = null;
    PreparedStatement s = null;
    ResultSet rs = null;

    public Login() {
        initComponents();
        con = DB.connect();
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
        sgnBtn = new javax.swing.JButton();
        lgnBtn = new javax.swing.JButton();
        passTf = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Relia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel3)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(42, 42, 42));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");

        nameTf.setBackground(new java.awt.Color(40, 40, 40));
        nameTf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nameTf.setForeground(new java.awt.Color(255, 255, 255));
        nameTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));
        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");

        sgnBtn.setBackground(new java.awt.Color(52, 52, 52));
        sgnBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        sgnBtn.setForeground(new java.awt.Color(255, 255, 255));
        sgnBtn.setText("Sign Up");
        sgnBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        sgnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgnBtnActionPerformed(evt);
            }
        });

        lgnBtn.setBackground(new java.awt.Color(52, 52, 52));
        lgnBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lgnBtn.setForeground(new java.awt.Color(255, 255, 255));
        lgnBtn.setText("Login");
        lgnBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        lgnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgnBtnActionPerformed(evt);
            }
        });

        passTf.setBackground(new java.awt.Color(40, 40, 40));
        passTf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        passTf.setForeground(new java.awt.Color(255, 255, 255));
        passTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(nameTf, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lgnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(sgnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passTf)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2)))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passTf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lgnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sgnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void sgnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgnBtnActionPerformed
        Register registerFrame = new Register();
        registerFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sgnBtnActionPerformed

    private void lgnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgnBtnActionPerformed
        login();   
    }//GEN-LAST:event_lgnBtnActionPerformed

    public void login() {
    String name = nameTf.getText();
    char[] passwordChars = passTf.getPassword();
    String pass = new String(passwordChars); 

    try {

        String sql = "SELECT * FROM users WHERE Name=?";
        s = con.prepareStatement(sql);
        s.setString(1, name);
        rs = s.executeQuery();
        
        if (rs.next()) {
            String storedEncodedPassword = rs.getString("Password");
            Argon2PasswordEncoder encoder = new Argon2PasswordEncoder(32, 64, 1, 15 * 1024, 2);
            
            if (encoder.matches(pass, storedEncodedPassword)) {
                JOptionPane.showMessageDialog(rootPane, "Logged in");
                new Home().setVisible(true);
                this.dispose();
                return;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Your login failed");
                return;
            }
        }
        
        sql = "SELECT * FROM employees WHERE Name=?";
        s = con.prepareStatement(sql);
        s.setString(1, name);
        rs = s.executeQuery();
        
        if (rs.next()) {
            String storedPassword = rs.getString("Password");
            
            if (pass.equals(storedPassword)) {
                JOptionPane.showMessageDialog(rootPane, "Logged in");
                
                Home hm = new Home();
                CashRegister cr = new CashRegister(true);
                hm.setVisible(true);
                
                panelLoader.jPanelLoader(hm.mainPanel, cr);
                
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Your login failed");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "User not found");
        }
    } catch (HeadlessException | SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (s != null) s.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    public static void main(String args[]) {       
        FlatDarkLaf.setup();
                   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton lgnBtn;
    private javax.swing.JTextField nameTf;
    private javax.swing.JPasswordField passTf;
    private javax.swing.JButton sgnBtn;
    // End of variables declaration//GEN-END:variables
}
