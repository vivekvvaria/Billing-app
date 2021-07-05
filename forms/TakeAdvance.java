package PRACTICE;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TakeAdvance extends javax.swing.JFrame {
    
    static Connection con;
    public static int sequence,count;
    
    database db=new database();
    DefaultTableModel model;
    
    public TakeAdvance() {
        initComponents();
        con=db.load();
        model=(DefaultTableModel)jTable1.getModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        user = new javax.swing.JLabel();

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

        jLabel1.setText("MOBILE NUMBER : ");

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        jLabel2.setText("SENDER NAME : ");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel4.setText("DATE : ");

        jTextField3.setEditable(false);
        jTextField3.setFocusable(false);
        jTextField3.setRequestFocusEnabled(false);

        jLabel5.setText("COMPANY : ");

        jLabel6.setText("AMOUNT : ");

        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });

        jLabel7.setText("COMMISSION : ");

        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });

        jLabel8.setText("IFSC : ");

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });

        jLabel9.setText("BANK NAME : ");

        jLabel10.setText("A/C NUMBER : ");

        jLabel11.setText("GRAND TOTAL : ");

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
        });

        jLabel12.setText("RECEIVER NAME : ");

        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
        });

        jTextField10.setEditable(false);
        jTextField10.setFocusable(false);
        jTextField10.setRequestFocusEnabled(false);

        jLabel13.setText("CALCULATOR : ");

        jLabel14.setText("TOTAL : ");

        jTextField19.setEditable(false);
        jTextField19.setFocusable(false);
        jTextField19.setRequestFocusEnabled(false);

        jLabel15.setText("1000");

        jTextField12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField12FocusLost(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField12KeyReleased(evt);
            }
        });

        jLabel16.setText("500");

        jTextField13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField13FocusLost(evt);
            }
        });
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField13KeyReleased(evt);
            }
        });

        jLabel17.setText("100");

        jTextField14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField14FocusLost(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField14KeyReleased(evt);
            }
        });

        jLabel18.setText("50");

        jTextField15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField15FocusLost(evt);
            }
        });
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField15KeyReleased(evt);
            }
        });

        jLabel19.setText("20");

        jTextField16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField16FocusLost(evt);
            }
        });
        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField16KeyReleased(evt);
            }
        });

        jLabel20.setText("10");

        jTextField17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField17FocusLost(evt);
            }
        });
        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField17KeyReleased(evt);
            }
        });

        jLabel21.setText("5");

        jTextField18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField18FocusLost(evt);
            }
        });
        jTextField18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField18KeyReleased(evt);
            }
        });

        jCheckBox1.setText("CHECH AMOUNT");

        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill_No", "Date", "Company", "MobileNumber", "BankName", "IFSC", "A/CNumber", "ReceiverName", "SenderName", "Amount", "Commission", "GrandTotal", "User"
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
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(12).setPreferredWidth(100);
        }

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        billno.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        billno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        user.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        user.setText("username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(billno, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submit)
                        .addGap(18, 18, 18)
                        .addComponent(clear)
                        .addGap(18, 18, 18)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(257, 257, 257)
                                .addComponent(jLabel14))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jCheckBox1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(submit)
                    .addComponent(billno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        setSize(new java.awt.Dimension(880, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Statement st;
    PreparedStatement pr;
    ResultSet rs;

    public void companyLoad(){        
        try{
            st=con.createStatement();
            
            rs = st.executeQuery("select company from companys");
            while(rs.next()){
                jComboBox1.addItem(rs.getString("company"));
            }
        }
        catch(SQLException eCompLoad){
            JOptionPane.showMessageDialog(null,"Cannot be load.");
        }
    }
    
    public void bankLoad(){
        try{
            st=con.createStatement();

            rs=st.executeQuery("select bank from banks");
            while(rs.next()){
                jComboBox2.addItem(rs.getString("bank"));
            }
        }
        catch(SQLException eBankLoad){
            JOptionPane.showMessageDialog(null,"Cannot be load.");
        }
    }

    public void companyUnload(){
        jComboBox1.removeAllItems();
    }
    
    public void bankUnload(){
        jComboBox2.removeAllItems();
    }
    
    public void clear(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
    }
    
    public void submit(){
        if(jTextField1.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Please enter mobile number.");
        jTextField1.requestFocus();
        }
        else if(!Pattern.matches("[0-9]{10}",jTextField1.getText())){
            JOptionPane.showMessageDialog(null,"Please enter mobile number in digits or enter only 10 digits.");
            jTextField1.requestFocus();
        }
        else if(jTextField2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter the sender name.");
            jTextField2.requestFocus();
        }
        else if(jTextField5.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter amount.");
            jTextField5.requestFocus();
        }
        else if(!Pattern.matches("[0-9]{1,10}",jTextField5.getText())){
            JOptionPane.showMessageDialog(null,"Please enter amount in digits.");
            jTextField5.requestFocus();
        }
        else if(jTextField6.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter commission.");
            jTextField6.requestFocus();
        }
        else if(!Pattern.matches("[0-9]{1,10}",jTextField6.getText())){
            JOptionPane.showMessageDialog(null,"Please enter commission in digits.");
            jTextField6.requestFocus();
        }
        else if(jTextField7.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter IFSC code.");
            jTextField7.requestFocus();
        }
        else if(jTextField8.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter the A/C number.");
            jTextField8.requestFocus();
        }
        else if(!Pattern.matches("[0-9]{1,30}",jTextField8.getText())){
            JOptionPane.showMessageDialog(null,"Please enter the A/C number in digits.");
            jTextField8.requestFocus();
        }
        else if(jTextField9.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter the receiver name.");
            jTextField9.requestFocus();
        }
        else{
            try{
                con.setAutoCommit(false);

                st=con.createStatement();

                st.execute("insert into settleadvance values('"
                        +jTextField3.getText()+"','"+jComboBox1.getSelectedItem()+"','"
                        +jTextField1.getText()+"','"+jComboBox2.getSelectedItem()+"','"
                        +jTextField7.getText()+"','"+jTextField8.getText()+"','"
                        +jTextField9.getText()+"','"+jTextField2.getText()+"','"
                        +jTextField5.getText()+"','"+jTextField6.getText()+"','"
                        +jTextField10.getText()+"','"+user.getText()+"','pending')");

                con.commit();

                clear();
                                
                int num=1;
                
                String sql1="SELECT TOP 1 bill_no FROM settleadvance ORDER BY bill_no DESC";
                pr=con.prepareStatement(sql1);
                rs=pr.executeQuery();
                while(rs.next()){
                    num=rs.getInt("bill_no");
                }
                
                billno.setText(""+num);
                
                JOptionPane.showMessageDialog(null,"Successful !!!");

                AdvanceBill bill=new AdvanceBill();
                bill.setVisible(true);

            }
            
            catch(SQLException eSubmit){
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    Logger.getLogger(TakeAdvance.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null,eSubmit.toString());
            }        
        }
    }
    
    public void seq(){
        try{
            String sql="SELECT TOP 1 bill_no FROM settleadvance ORDER BY bill_no DESC";
            pr=con.prepareStatement(sql);
            rs=pr.executeQuery();
            while(rs.next()){
                count=rs.getInt("bill_no");
            }
        }
        catch(SQLException eSeq){
            JOptionPane.showMessageDialog(null, eSeq.toString());
        }    
        count++;
        billno.setText(""+count);
    }   
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
        Date d_date=new Date();
        jTextField3.setText(""+s.format(d_date));                        
        user.setText(UserWindow.currentuser);
        companyLoad();
        bankLoad();
        seq();
    }//GEN-LAST:event_formWindowOpened
    
    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        if(Pattern.matches("[0-9]{10}",jTextField1.getText())){
            int count_mob,i;
            count_mob=model.getRowCount();
            for(i=0;i<count_mob;i++){
                model.removeRow(0);
            } 
            try{
                String sql="select * from inward where mobilenumber ='"+jTextField1.getText()+"'";
                pr=con.prepareStatement(sql);
                rs=pr.executeQuery();
                while(rs.next())
                {
                    model.addRow(new Object[]{rs.getString("bill_no"),rs.getString("date"),rs.getString("company"),rs.getString("mobilenumber"),rs.getString("bankname"),rs.getString("ifsc"),rs.getString("accountnumber"),rs.getString("receivername"),rs.getString("sendername"),rs.getString("amount"),rs.getString("commission"),rs.getString("grandtotal"),rs.getString("username")});
                }        
            }
            catch(SQLException eMobFocusLost){
                JOptionPane.showMessageDialog(null,eMobFocusLost.toString());
            }
        }
        else if(jTextField1.getText().isEmpty()){
            
        }
    }//GEN-LAST:event_jTextField1FocusLost

    int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h;
    
    private void jTextField12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyReleased
        // TODO add your handling code here:
        if(Pattern.matches("[0-9]{1,10}",jTextField12.getText())){
            a=Integer.parseInt(jTextField12.getText())*1000;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
        else{
            a=0;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
    }//GEN-LAST:event_jTextField12KeyReleased

    private void jTextField12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusLost
        // TODO add your handling code here:
        if(jTextField12.getText().isEmpty()){
            a=0;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);        
        }
        else{
            a=Integer.parseInt(jTextField12.getText())*1000;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
    }//GEN-LAST:event_jTextField12FocusLost

    private void jTextField13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyReleased
        // TODO add your handling code here:
        if(Pattern.matches("[0-9]{1,10}",jTextField13.getText())){
            b=Integer.parseInt(jTextField13.getText())*500;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
        else{
            b=0;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
    }//GEN-LAST:event_jTextField13KeyReleased

    private void jTextField13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusLost
        // TODO add your handling code here:
        if(jTextField13.getText().isEmpty()){
            b=0;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
        else{
            b=Integer.parseInt(jTextField13.getText())*500;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
    }//GEN-LAST:event_jTextField13FocusLost

    private void jTextField14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyReleased
        // TODO add your handling code here:
        if(Pattern.matches("[0-9]{1,10}",jTextField14.getText())){
            c=Integer.parseInt(jTextField14.getText())*100;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
        else if(jTextField14.getText().isEmpty()){
            c=0;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
    }//GEN-LAST:event_jTextField14KeyReleased

    private void jTextField14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusLost
        // TODO add your handling code here:
        if(jTextField14.getText().isEmpty()){
            c=0;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);  
        }
        else{
            c=Integer.parseInt(jTextField14.getText())*100;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
    }//GEN-LAST:event_jTextField14FocusLost

    private void jTextField15KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyReleased
        // TODO add your handling code here:
        if(Pattern.matches("[0-9]{1,10}",jTextField15.getText())){
            d=Integer.parseInt(jTextField15.getText())*50;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
        else if(jTextField15.getText().isEmpty()){
            d=0;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
    }//GEN-LAST:event_jTextField15KeyReleased

    private void jTextField15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusLost
        // TODO add your handling code here:
        if(jTextField15.getText().isEmpty()){
            d=0;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);        
        }
        else{
            d=Integer.parseInt(jTextField15.getText())*50;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
    }//GEN-LAST:event_jTextField15FocusLost

    private void jTextField16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyReleased
        // TODO add your handling code here:
        if(Pattern.matches("[0-9]{1,10}",jTextField16.getText())){
            e=Integer.parseInt(jTextField16.getText())*20;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
        else if(jTextField16.getText().isEmpty()){
            e=0;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
    }//GEN-LAST:event_jTextField16KeyReleased

    private void jTextField16FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField16FocusLost
        // TODO add your handling code here:
        if(jTextField16.getText().isEmpty()){
            e=0;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);        
        }
        else{
            e=Integer.parseInt(jTextField16.getText())*20;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
    }//GEN-LAST:event_jTextField16FocusLost

    private void jTextField17KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyReleased
        // TODO add your handling code here:
        if(Pattern.matches("[0-9]{1,10}",jTextField17.getText())){
            f=Integer.parseInt(jTextField17.getText())*10;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
        else if(jTextField17.getText().isEmpty()){
            f=0;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);        
        }
    }//GEN-LAST:event_jTextField17KeyReleased

    private void jTextField17FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField17FocusLost
        // TODO add your handling code here:
        if(jTextField17.getText().isEmpty()){
            f=0;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);        
        }
        else{
            f=Integer.parseInt(jTextField17.getText())*10;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);
        }
    }//GEN-LAST:event_jTextField17FocusLost

    private void jTextField18KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField18KeyReleased
        // TODO add your handling code here:
        if(Pattern.matches("[0-9]{1,10}",jTextField18.getText())){
            g=Integer.parseInt(jTextField18.getText())*5;
            h=a+b+c+d+e+f;
            jTextField19.setText(""+h);
        }
        else if(jTextField18.getText().isEmpty()){
            g=0;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);        
        }
    }//GEN-LAST:event_jTextField18KeyReleased

    private void jTextField18FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField18FocusLost
        // TODO add your handling code here:
        if(jTextField18.getText().isEmpty()){
            g=0;
            h=a+b+c+d+e+f+g;
            jTextField19.setText(""+h);        
        }
        else{
            g=Integer.parseInt(jTextField18.getText())*5;
            h=a+b+c+d+e+f;
            jTextField19.setText(""+h);
        }
    }//GEN-LAST:event_jTextField18FocusLost

    int amount=0,commission=0,gt;
    
    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // TODO adsd your handling code here:
        if(Pattern.matches("[0-9]{1,10}",jTextField5.getText())){
            amount=Integer.parseInt(jTextField5.getText());
            gt=amount+commission;
            jTextField10.setText(""+gt);            
        }
        else{
            amount=0;
            gt=amount+commission;
            jTextField10.setText(""+gt);
        }
    }//GEN-LAST:event_jTextField5KeyReleased

    
    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        // TODO add your handling code here:
        if(jTextField5.getText().isEmpty()){
            amount=0;
            gt=amount+commission;
            jTextField10.setText(""+gt);            
        }
        else{
            amount=Integer.parseInt(jTextField5.getText());
            gt=amount+commission;
            jTextField10.setText(""+gt);            
        }
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
        if(Pattern.matches("[0-9]{1,10}",jTextField6.getText())){
            commission=Integer.parseInt(jTextField6.getText());
            gt=amount+commission;
            jTextField10.setText(""+gt);            
        }
        else{
            commission=0;
            gt=amount+commission;
            jTextField10.setText(""+gt);            
        }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        // TODO add your handling code here:
        if(jTextField6.getText().isEmpty()){
            commission=0;
            gt=amount+commission;
            jTextField10.setText(""+gt);            
        }
        else{
            commission=Integer.parseInt(jTextField6.getText());
            gt=amount+commission;
            jTextField10.setText(""+gt);            
        }
    }//GEN-LAST:event_jTextField6FocusLost
    
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clearActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        submit();
    }//GEN-LAST:event_submitActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        user.setText("");
        companyUnload();
        bankUnload();
        try{
            con.close();
        }
        catch(SQLException eWinClosed){
            JOptionPane.showMessageDialog(null,eWinClosed.toString());
        }
    }//GEN-LAST:event_formWindowClosed

    int rowno;
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        rowno=jTable1.getSelectedRow();
        jTextField1.setText(""+model.getValueAt(rowno, 3).toString());
        jTextField2.setText(""+model.getValueAt(rowno, 8).toString());
        jComboBox2.setSelectedItem(model.getValueAt(rowno, 4).toString());
        jTextField7.setText(""+model.getValueAt(rowno, 5).toString());
        jTextField8.setText(""+model.getValueAt(rowno, 6).toString());
        jTextField9.setText(""+model.getValueAt(rowno, 7).toString());
        jComboBox1.requestFocus();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            submit();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            submit();
        }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            submit();
        }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            submit();
        }
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            submit();
        }
    }//GEN-LAST:event_jTextField8KeyPressed

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            submit();
        }
    }//GEN-LAST:event_jTextField9KeyPressed

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
            java.util.logging.Logger.getLogger(TakeAdvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeAdvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeAdvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeAdvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeAdvance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JLabel billno = new javax.swing.JLabel();
    private javax.swing.JButton clear;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton submit;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
