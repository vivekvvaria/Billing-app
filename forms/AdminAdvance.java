package PRACTICE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class AdminAdvance extends javax.swing.JFrame {

    Connection con;
    
    database d=new database();
    
    DefaultTableModel model;
    
    public AdminAdvance() {
        initComponents();
        con=d.load();  
        model=(DefaultTableModel)jTable1.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        SEE_TRANSACTION = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        settleAdvance = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADVANCE");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 0));

        SEE_TRANSACTION.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        SEE_TRANSACTION.setText("SEE TRANSACTION");
        SEE_TRANSACTION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEE_TRANSACTIONActionPerformed(evt);
            }
        });
        SEE_TRANSACTION.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SEE_TRANSACTIONKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel1.setText("USERS : ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel2.setText("TOTAL AMOUNT : ");

        settleAdvance.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        settleAdvance.setText("SETTLE ADVANCE");
        settleAdvance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settleAdvanceActionPerformed(evt);
            }
        });
        settleAdvance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                settleAdvanceKeyPressed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill_No", "Date", "Company", "MobileNumber", "BankName", "IFSC", "A/CNumber", "ReceiverName", "SenderName", "Amount", "Commission", "GrandTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setFocusable(false);
        jTable1.setRequestFocusEnabled(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(100);
        }

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel3.setText("DATE : ");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SEE_TRANSACTION)
                                .addGap(18, 18, 18)
                                .addComponent(settleAdvance)
                                .addGap(149, 149, 149)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEE_TRANSACTION)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settleAdvance)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1084, 543));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void loadUsers(){
        try{
        PreparedStatement st;
        String sql="select username from users";
        st=con.prepareStatement(sql);
        ResultSet rs=st.executeQuery();

        while(rs.next()){
            jComboBox1.addItem(rs.getString("username"));
        }
        }
        catch(SQLException e){
            //JOptionPane.showMessageDialog(null,e.toString());
        }
    }    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        loadUsers();
        SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
        Date d=new Date();
        jTextField2.setText(""+s.format(d));
    }//GEN-LAST:event_formWindowOpened

    public void unloadUser(){
        jComboBox1.removeAllItems();
    }
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        unloadUser();
        try{
            con.close();
        }
        catch(SQLException e){
            //JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_formWindowClosed

    // Transaction are displayed from temp_advance table.
    public void seeTrans(){
        try{
            int count,i;
            count=model.getRowCount();
            for(i=1;i<=count;i++){
                model.removeRow(0);
            }

            PreparedStatement ps;

            ps=con.prepareStatement("select * from settleadvance where stat='pending' and username='"+jComboBox1.getSelectedItem()+"'");

            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("bill_no"),rs.getString("date"),rs.getString("company"),rs.getString("mobilenumber"),rs.getString("bankname"),rs.getString("ifsc"),rs.getString("accountnumber"),rs.getString("receivername"),rs.getString("sendername"),rs.getString("amount"),rs.getString("commission"),rs.getString("grandtotal")});
            }

            ps=con.prepareStatement("select sum(grandtotal) as gt from settleadvance where stat='pending' and username='"+jComboBox1.getSelectedItem()+"'");
            ResultSet ans=ps.executeQuery();
            if(ans.next()){
                String gtl=""+ans.getString("gt");
                jTextField1.setText(gtl);
            }
        }
        catch(SQLException e){
            //JOptionPane.showMessageDialog(null,e.toString());
        }
    }
    
    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
        // TODO add your handling code here:
        seeTrans();
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void SEE_TRANSACTIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEE_TRANSACTIONActionPerformed
        // TODO add your handling code here:
        seeTrans();
    }//GEN-LAST:event_SEE_TRANSACTIONActionPerformed

    public void settle(){
        try{
            con.setAutoCommit(false);
            PreparedStatement ps_update;
            String sql="update settleadvance set stat='confirm' where username='"+jComboBox1.getSelectedItem()+"'";
            ps_update=con.prepareStatement(sql);
            ps_update.execute();
            con.commit();
            JOptionPane.showMessageDialog(null,"Successful!");
            
            seeTrans();
        }
        catch(SQLException e){
            try {
                con.rollback();
            } catch (SQLException ex) {
                //Logger.getLogger(AdminAdvance.class.getName()).log(Level.SEVERE, null, ex);
            }
            //JOptionPane.showMessageDialog(null,e.toString());
        }
    }
    
    private void settleAdvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settleAdvanceActionPerformed
        // TODO add your handling code here:
        settle();
    }//GEN-LAST:event_settleAdvanceActionPerformed

    private void SEE_TRANSACTIONKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEE_TRANSACTIONKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==evt.VK_ENTER){
            seeTrans();
        }
        settleAdvance.requestFocus();
    }//GEN-LAST:event_SEE_TRANSACTIONKeyPressed

    private void settleAdvanceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_settleAdvanceKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==evt.VK_ENTER){
            settle();
        }
    }//GEN-LAST:event_settleAdvanceKeyPressed

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
            java.util.logging.Logger.getLogger(AdminAdvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAdvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAdvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAdvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAdvance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SEE_TRANSACTION;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton settleAdvance;
    // End of variables declaration//GEN-END:variables
}
