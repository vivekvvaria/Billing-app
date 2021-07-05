package PRACTICE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdvanceSettle extends javax.swing.JFrame {

    Connection con;
    int count;
    DefaultTableModel model;
    
    database d=new database();
    
    public AdvanceSettle() {
        initComponents();
        con=d.load();
        model=(DefaultTableModel)jTable1.getModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MobNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        datefield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rnumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        gtotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        coms = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        amnt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        rname = new javax.swing.JTextField();
        ifscno = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        acnt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        note = new javax.swing.JTextField();
        mark = new javax.swing.JButton();
        seeAdvance = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        billno = new javax.swing.JLabel();
        user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADVANCE SETTLE");
        setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        setIconImages(null);
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("MOBILE NUMBER : ");

        MobNo.setEditable(false);
        MobNo.setFocusable(false);

        jLabel2.setText("SENDER NAME : ");

        sname.setEditable(false);
        sname.setFocusable(false);

        jLabel4.setText("DATE : ");

        datefield.setEditable(false);
        datefield.setFocusable(false);

        jLabel3.setText("TIME : ");

        jTextField4.setEditable(false);
        jTextField4.setFocusable(false);

        jLabel5.setText("REFERENCE NUMBER : ");

        rnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rnumberKeyPressed(evt);
            }
        });

        jLabel11.setText("GRAND TOTAL : ");

        gtotal.setEditable(false);
        gtotal.setFocusable(false);

        jLabel7.setText("COMMISSION : ");

        coms.setEditable(false);
        coms.setFocusable(false);

        jLabel6.setText("AMOUNT : ");

        amnt.setEditable(false);
        amnt.setFocusable(false);

        jLabel8.setText("COMPANY : ");

        jComboBox1.setFocusable(false);
        jComboBox1.setRequestFocusEnabled(false);

        rname.setEditable(false);
        rname.setFocusable(false);

        ifscno.setEditable(false);
        ifscno.setFocusable(false);

        jLabel15.setText("IFCS : ");

        jLabel16.setText("RECEIVER NAME : ");

        jLabel13.setText("BANK NAME : ");

        jComboBox2.setFocusable(false);

        jLabel14.setText("A/C NUMBER : ");

        acnt.setEditable(false);
        acnt.setFocusable(false);

        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill_No", "Date", "Commpany", "MobileNumber", "BankName", "IFSC", "A/CNumber", "ReceiverName", "SenderName", "Amount", "Commission", "GrandTotal", "User"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setRequestFocusEnabled(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
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
            jTable1.getColumnModel().getColumn(12).setPreferredWidth(100);
        }

        jLabel9.setText("NOTE : ");

        mark.setText("MARK ENTRY");

        seeAdvance.setText("SEE ADVANCE");
        seeAdvance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeAdvanceActionPerformed(evt);
            }
        });

        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        billno.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        user.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(acnt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(ifscno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(rname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(billno, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(MobNo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(rnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(amnt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(coms, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(gtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(datefield)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(note))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submit)
                        .addGap(18, 18, 18)
                        .addComponent(seeAdvance)
                        .addGap(18, 18, 18)
                        .addComponent(mark)
                        .addGap(165, 165, 165)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(billno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(MobNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(datefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(amnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(coms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(gtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(acnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(ifscno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(rname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mark)
                    .addComponent(seeAdvance)
                    .addComponent(submit)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1050, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void companyLoad(){        
        try{
            Statement st=con.createStatement();
            
            ResultSet rs = st.executeQuery("select company from companys");
            
            while(rs.next()){
                jComboBox1.addItem(rs.getString("company"));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Cannot be load.");
        }
    }
    
    public void bankLoad(){
        try{
            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery("select bank from banks");

            while(rs.next()){
                jComboBox2.addItem(rs.getString("bank"));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Cannot be load.");
        }
    }

    SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
    Date date=new Date();
    String dt=s.format(date);
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        companyLoad();
        bankLoad();
        datefield.setText(""+s.format(date));
        user.setText(UserWindow.currentuser);
    }//GEN-LAST:event_formWindowOpened

    public void companyUnload(){
        jComboBox1.removeAllItems();
    }
    
    public void bankUnload(){
        jComboBox2.removeAllItems();
    }
    
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        user.setText("");
        companyUnload();
        bankUnload();
        try{
            con.close();
        }
        catch(SQLException e){}
    }//GEN-LAST:event_formWindowClosed

    public void clear(){
        MobNo.setText("");
        ifscno.setText("");
        acnt.setText("");
        rname.setText("");
        sname.setText("");
        amnt.setText("");
        coms.setText("");
        gtotal.setText("");
        rnumber.setText("");
        note.setText("");
    }
    public void see(){
        try{
            int count,i;
            count=model.getRowCount();
            for(i=1;i<=count;i++){
                model.removeRow(0);
            } 

            String see="select * from settleadvance where stat='confirm'";
            PreparedStatement st=con.prepareStatement(see);
            ResultSet rs=st.executeQuery();
            
            while(rs.next()){
                model.addRow(new Object[] {rs.getString("bill_no"),rs.getString("date"),rs.getString("company"),rs.getString("mobilenumber"),rs.getString("bankname"),rs.getString("ifsc"),rs.getString("accountnumber"),rs.getString("receivername"),rs.getString("sendername"),rs.getString("amount"),rs.getString("commission"),rs.getString("grandtotal"),rs.getString("username")});
            }
        }
        catch(SQLException e){
            try {
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(AdvanceSettle.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,e.toString(),"Error.",JOptionPane.ERROR_MESSAGE);
        }        
        rnumber.requestFocus();
        clear();
    }
    
    private void seeAdvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeAdvanceActionPerformed
        // TODO add your handling code here:
        see();
    }//GEN-LAST:event_seeAdvanceActionPerformed

    int rowno;
    
        //Submited values directly goto to Inward table.
    public void submit() {
        if(rnumber.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter the reference number first.");
            rnumber.requestFocus();
        }
        else{
            int bsn=Integer.parseInt(billno.getText());
            try{
                con.setAutoCommit(false);
                
                Statement st=con.createStatement();
                st.execute("insert into inward values('"
                +dt+"','"+jComboBox1.getSelectedItem()
                +"','"+MobNo.getText()+"','"+jComboBox2.getSelectedItem()        
                +"','"+ifscno.getText()+"','"+acnt.getText()+"','"+rname.getText()
                +"','"+sname.getText()+"','"+amnt.getText()+"','"+coms.getText()
                +"','"+gtotal.getText()+"','"+rnumber.getText()
                +"','"+user.getText()+"','"+note.getText()+"','confirm')");
                
                st.execute("delete from settleadvance where bill_no='"+bsn+"'");
                con.commit();
                
                JOptionPane.showMessageDialog(null,"Successful !!!");                
                
                see();
            }
            catch(SQLException e){
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    Logger.getLogger(AdvanceSettle.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null,e.toString(),"Error.",JOptionPane.ERROR_MESSAGE);
            }            
        }
    }
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        submit();
    }//GEN-LAST:event_submitActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        rowno=jTable1.getSelectedRow();
        billno.setText(""+model.getValueAt(rowno, 0).toString());
        MobNo.setText(""+model.getValueAt(rowno, 3).toString());
        jComboBox1.setSelectedItem(model.getValueAt(rowno, 2).toString());
        jComboBox2.setSelectedItem(model.getValueAt(rowno, 4).toString());
        sname.setText(""+model.getValueAt(rowno, 8).toString());
        coms.setText(""+model.getValueAt(rowno, 10).toString());
        amnt.setText(""+model.getValueAt(rowno, 9).toString());
        ifscno.setText(""+model.getValueAt(rowno, 5).toString());
        rname.setText(""+model.getValueAt(rowno, 7).toString());
        gtotal.setText(""+model.getValueAt(rowno, 11).toString());
        acnt.setText(""+model.getValueAt(rowno, 6).toString());        
        rnumber.requestFocus();
    }//GEN-LAST:event_jTable1MouseClicked

    private void rnumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rnumberKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==evt.VK_ENTER){
            submit();
        }
    }//GEN-LAST:event_rnumberKeyPressed

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
            java.util.logging.Logger.getLogger(AdvanceSettle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdvanceSettle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdvanceSettle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvanceSettle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdvanceSettle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MobNo;
    private javax.swing.JTextField acnt;
    private javax.swing.JTextField amnt;
    private javax.swing.JLabel billno;
    private javax.swing.JTextField coms;
    private javax.swing.JTextField datefield;
    private javax.swing.JTextField gtotal;
    private javax.swing.JTextField ifscno;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField4;
    private javax.swing.JButton mark;
    private javax.swing.JTextField note;
    private javax.swing.JTextField rname;
    private javax.swing.JTextField rnumber;
    private javax.swing.JButton seeAdvance;
    private javax.swing.JTextField sname;
    private javax.swing.JButton submit;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
