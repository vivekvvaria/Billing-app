package PRACTICE;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginWindow extends javax.swing.JFrame {
    
    Connection con;
    
    public LoginWindow() {
        initComponents();
        database d=new database();
        con=d.load();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LoGiN = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prathmesh Enetrprise");
        setBackground(new java.awt.Color(184, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        setForeground(new java.awt.Color(255, 0, 0));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("User Name : ");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.setNextFocusableComponent(jPasswordField1);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Password : ");

        LoGiN.setBackground(new java.awt.Color(255, 255, 255));
        LoGiN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LoGiN.setForeground(new java.awt.Color(0, 0, 255));
        LoGiN.setText("LOGIN");
        LoGiN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoGiN.setSelected(true);
        LoGiN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoGiNActionPerformed(evt);
            }
        });
        LoGiN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoGiNKeyPressed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPasswordField1.setNextFocusableComponent(LoGiN);
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PRACTICE/logicon.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoGiN)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(LoGiN)))
                .addGap(40, 40, 40))
        );

        setSize(new java.awt.Dimension(525, 322));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void login(){
        if (jTextField1.getText().isEmpty() && jPasswordField1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please Enter username and password.");
            jTextField1.requestFocus();
        }
        else if(jTextField1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please Enter username.");
            jTextField1.requestFocus();
        }
        else if(jPasswordField1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please Enter password.");
            jPasswordField1.requestFocus();
        }
        else
        {
            try
            {
                String us="",pw="";
                PreparedStatement stmt=con.prepareStatement("select * from users where username='"+jTextField1.getText()+"'");
                ResultSet rs=stmt.executeQuery();
                while(rs.next())
                {
                    us=rs.getString("username");
                    pw=rs.getString("password");        
                }
                if(us.equals(jTextField1.getText().trim())){
                    if(pw.equals(jPasswordField1.getText().trim()))
                    {
                        if(us.equals("admin"))
                        {
                            AdminWindow aw=new AdminWindow(jTextField1.getText());
                            aw.setVisible(true);
                            this.dispose();
                        }
                        else
                        {
                            UserWindow uw=new UserWindow(jTextField1.getText());
                            uw.setVisible(true);
                            this.dispose();                            
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Invalid Password.","Error.",JOptionPane.ERROR_MESSAGE);
                        jPasswordField1.setText("");
                        jPasswordField1.requestFocus();                            
                    }                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid User.","Error.",JOptionPane.ERROR_MESSAGE);
                    jTextField1.setText("");
                    jTextField1.requestFocus();
                }            
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"error_login");
            }
        }
    }
    
    private void LoGiNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoGiNActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_LoGiNActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void LoGiNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoGiNKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_LoGiNKeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            login();
        }        
    }//GEN-LAST:event_jTextField1KeyPressed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoGiN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
