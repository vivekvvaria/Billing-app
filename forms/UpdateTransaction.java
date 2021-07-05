package PRACTICE;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class UpdateTransaction extends javax.swing.JFrame {
    
    Connection con;
    database db=new database();
    
    public UpdateTransaction() {
        initComponents();
        con=db.load();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bill_no = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        mobno = new javax.swing.JTextField();
        sender = new javax.swing.JTextField();
        receiver = new javax.swing.JTextField();
        accnt = new javax.swing.JTextField();
        reference = new javax.swing.JTextField();
        amnt = new javax.swing.JTextField();
        comision = new javax.swing.JTextField();
        grandt = new javax.swing.JTextField();
        del = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        comp = new javax.swing.JComboBox<>();
        bank = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EDIT");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("RECEIVER NAME : ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("BANK NAME : ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("MOBILE NUMBER : ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("SENDER NAME : ");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("GRAND TOTAL : ");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("COMMISSION : ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("A\\C NUMBER : ");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("AMOUNT : ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("REFERENCE NUMBER : ");

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PRACTICE/search_icon.png"))); // NOI18N
        search.setToolTipText("Search");
        search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 0, 0), null, null));
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("BILL NUMBER : ");

        bill_no.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bill_no.setText("jTextField1");
        bill_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bill_noKeyPressed(evt);
            }
        });

        mobno.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        mobno.setText("jTextField2");

        sender.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sender.setText("jTextField3");

        receiver.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        receiver.setText("jTextField4");

        accnt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        accnt.setText("jTextField6");

        reference.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        reference.setText("jTextField7");

        amnt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        amnt.setText("jTextField8");
        amnt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                amntFocusLost(evt);
            }
        });
        amnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amntKeyReleased(evt);
            }
        });

        comision.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        comision.setText("jTextField9");
        comision.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comisionFocusLost(evt);
            }
        });
        comision.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comisionKeyReleased(evt);
            }
        });

        grandt.setEditable(false);
        grandt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        grandt.setText("jTextField10");
        grandt.setEnabled(false);
        grandt.setFocusable(false);

        del.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        del.setText("DELETE");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("COMPANY : ");

        comp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sender, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(receiver, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accnt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reference, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(amnt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comision, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(grandt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 69, Short.MAX_VALUE)
                                .addComponent(update)
                                .addGap(18, 18, 18)
                                .addComponent(del))
                            .addComponent(bank, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(bill_no)
                        .addGap(18, 18, 18)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mobno))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bill_no)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mobno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(receiver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(accnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(reference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(amnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(grandt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(del))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void clear(){
        mobno.setText("");
        sender.setText("");
        receiver.setText("");
        accnt.setText("");
        reference.setText("");
        amnt.setText("");
        comision.setText("");
        grandt.setText("");
    }
    
    public void searching(){
        clear();
        if(bill_no.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter bill number first.","Error!",JOptionPane.ERROR_MESSAGE);
        }
        else if(!Pattern.matches("[0-9]{1,6}",bill_no.getText())){
            JOptionPane.showMessageDialog(null,"Please enter only Digits.","Error!",JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                int s=Integer.parseInt(bill_no.getText().trim());
                String query="select company,mobilenumber,bankname,accountnumber,receivername,sendername,amount,commission,grandtotal,referencenumber from inward where bill_no='"+s+"'";
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(query);

                while(rs.next()){
                    comp.setSelectedItem(rs.getString("company"));
                    mobno.setText(rs.getString("mobilenumber"));
                    bank.setSelectedItem(rs.getString("bankname"));
                    accnt.setText(rs.getString("accountnumber"));
                    receiver.setText(rs.getString("receivername"));
                    sender.setText(rs.getString("sendername"));
                    amnt.setText(rs.getString("amount"));
                    comision.setText(rs.getString("commission"));
                    grandt.setText(rs.getString("grandtotal"));
                    reference.setText(rs.getString("referencenumber"));
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,e.toString());
            }
        }
        bill_no.requestFocus();
    }
    
    public void updation(){
        if(bill_no.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Enter bill number first.");
        }
        else if(amnt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"amount can't be empty!!!");
            amnt.requestFocus();
        }
        else if(!Pattern.matches("[0-9]{1,10}",amnt.getText())){
            JOptionPane.showMessageDialog(null,"amount should be numeric values!!!");
            amnt.requestFocus();
        }
        else if(mobno.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Mobile number can't be empty!!!");
            mobno.requestFocus();
        }
        else if(!Pattern.matches("[0-9]{10}",mobno.getText())){
            JOptionPane.showMessageDialog(null,"Mobile number have only numeric values & total 10 numbers!!!");
            mobno.requestFocus();
        }
        else if(accnt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"A/C number can't be empty!!!");
            mobno.requestFocus();
        }
        else if(!Pattern.matches("[0-9]{1,50}",accnt.getText())){
            JOptionPane.showMessageDialog(null,"A/C number have only numeric values & total 10 numbers!!!");
            mobno.requestFocus();
        }
        else if(comision.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Only numeric values or can't be empty!!!");
            comision.requestFocus();
        }
        else if(!Pattern.matches("[0-9]{1,10}",comision.getText())){
            JOptionPane.showMessageDialog(null,"Only numeric values!!!");
            comision.requestFocus();
        }
        else if(reference.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Reference number can't be empty!!!");
            reference.requestFocus();
        }
        else if(sender.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Sender name can't be empty!!!");
            sender.requestFocus();
        }
        else if(receiver.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Receiver name can't be empty!!!");
            receiver.requestFocus();
        }
        else{
            try{
                PreparedStatement st=con.prepareStatement("update inward set mobilenumber='"+mobno.getText()+
                        "' , company='"+comp.getSelectedItem()+
                        "' , sendername='"+sender.getText()+
                        "' , receivername='"+receiver.getText()+
                        "' , bankname='"+bank.getSelectedItem()+
                        "' , accountnumber='"+accnt.getText()+
                        "' , referencenumber='"+reference.getText()+
                        "' , amount='"+amnt.getText()+
                        "' , commission='"+comision.getText()+
                        "' , grandtotal='"+grandt.getText()+
                        "' where bill_no='"+bill_no.getText()+"'");
                st.executeUpdate();
                JOptionPane.showMessageDialog(null,"Successfully updated.");
                clear();
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,e.toString());
            }
        }
        bill_no.requestFocus();
    }
    
    public void deletion(){
        if(bill_no.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Enter bill number first.");
        }
        else{
            try{
                PreparedStatement st=con.prepareStatement("delete from inward where bill_no='"+bill_no.getText()+"'");
                st.execute();
                JOptionPane.showMessageDialog(null,"Successfully deleted.");
                clear();
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,e.toString());
            }            
        }
        bill_no.requestFocus();
    }
    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        updation();
    }//GEN-LAST:event_updateActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
        deletion();
    }//GEN-LAST:event_delActionPerformed

    private void bill_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bill_noKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==evt.VK_ENTER){
            searching();
        }
    }//GEN-LAST:event_bill_noKeyPressed

    int amount=0,commission=0,gt;
    
    private void amntFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amntFocusLost
        // TODO add your handling code here:
        if(amnt.getText().isEmpty()){
            amount=0;
            gt=amount+commission;
            grandt.setText(""+gt);            
        }        
        else{
            amount=Integer.parseInt(amnt.getText());
            gt=amount+commission;
            grandt.setText(""+gt);            
        }
    }//GEN-LAST:event_amntFocusLost

    private void amntKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amntKeyReleased
        // TODO add your handling code here:
        if(Pattern.matches("[0-9]{1,10}",amnt.getText())){
            amount=Integer.parseInt(amnt.getText());
            gt=amount+commission;
            grandt.setText(""+gt);            
        }
        else{
            amount=0;
            gt=amount+commission;
            grandt.setText(""+gt);
        }        
    }//GEN-LAST:event_amntKeyReleased

    private void comisionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comisionFocusLost
        // TODO add your handling code here:
        if(comision.getText().isEmpty()){
            commission=0;
            gt=amount+commission;
            grandt.setText(""+gt);            
        }
        else{
            commission=Integer.parseInt(comision.getText());
            gt=amount+commission;
            grandt.setText(""+gt);            
        }
    }//GEN-LAST:event_comisionFocusLost

    private void comisionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comisionKeyReleased
        // TODO add your handling code here:
        if(Pattern.matches("[0-9]{1,10}",comision.getText())){
            commission=Integer.parseInt(comision.getText());
            gt=amount+commission;
            grandt.setText(""+gt);            
        }
        else{
            commission=0;
            gt=amount+commission;
            grandt.setText(""+gt);
        }
    }//GEN-LAST:event_comisionKeyReleased

    public void loadCompany(){
        comp.removeAllItems();
        try{
            PreparedStatement st=con.prepareStatement("select company from companys");
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                comp.addItem(rs.getString("company"));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Cannot be load.");
        }
    }    
    
    public void loadBank()
    {
        bank.removeAllItems();
        try{
            PreparedStatement st=con.prepareStatement("select bank from banks");
            ResultSet rs=st.executeQuery();

            while(rs.next()){
                bank.addItem(rs.getString("bank"));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Cannot be load.");
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        bill_no.setText("");
        clear();
        loadBank();
        loadCompany();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateTransaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        searching();
    }//GEN-LAST:event_searchActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(UpdateTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateTransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accnt;
    private javax.swing.JTextField amnt;
    private javax.swing.JComboBox<String> bank;
    private javax.swing.JTextField bill_no;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField comision;
    private javax.swing.JComboBox<String> comp;
    private javax.swing.JButton del;
    private javax.swing.JTextField grandt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField mobno;
    private javax.swing.JTextField receiver;
    private javax.swing.JTextField reference;
    private javax.swing.JButton search;
    private javax.swing.JTextField sender;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
