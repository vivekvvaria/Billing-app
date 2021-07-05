package PRACTICE;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
        
public class TakeInward extends javax.swing.JFrame {

    static Connection con;
    public static int sequence,count;
    
    database db=new database();
    
    DefaultTableModel model;
    public TakeInward() {
        initComponents();
        con=db.load();
        model=(DefaultTableModel)jTable1.getModel();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        todayTran = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField18 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INWARD");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        clear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clearKeyPressed(evt);
            }
        });

        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        submit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                submitKeyPressed(evt);
            }
        });

        todayTran.setText("Todays Transactions");
        todayTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todayTranActionPerformed(evt);
            }
        });
        todayTran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                todayTranKeyPressed(evt);
            }
        });

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

        jLabel25.setText("AMOUNT : ");

        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField10KeyPressed(evt);
            }
        });

        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField11KeyPressed(evt);
            }
        });

        jLabel26.setText("COMPANY : ");

        jLabel13.setText("BANK NAME : ");

        jLabel15.setText("IFSC : ");

        jLabel16.setText("RECEIVER NAME : ");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel2.setText("SENDER NAME : ");

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel1.setText("MOBILE NUMBER : ");

        jLabel4.setText("DATE : ");

        jLabel14.setText("A/C NUMBER : ");

        jLabel28.setText("REFERENCE NUMBER : ");

        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFocusable(false);
        jTextField3.setRequestFocusEnabled(false);

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });

        jLabel11.setText("GRAND TOTAL : ");

        jTextField8.setEditable(false);
        jTextField8.setFocusable(false);
        jTextField8.setRequestFocusEnabled(false);

        jLabel29.setText("COMMISSION : ");

        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });

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

        jLabel19.setText("20");

        jCheckBox1.setText("CHECH AMOUNT");

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

        jLabel21.setText("5");

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

        jLabel30.setText("CALCULATOR : ");

        jLabel31.setText("TOTAL : ");

        jTextField19.setEditable(false);
        jTextField19.setEnabled(false);
        jTextField19.setFocusable(false);
        jTextField19.setRequestFocusEnabled(false);

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

        jLabel32.setText("1000");

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

        jLabel33.setText("500");

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

        jLabel34.setText("100");

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

        jLabel18.setText("50");

        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill_No", "Date", "Company", "MobileNumber", "BankName", "IFSC", "A/C Number", "ReceiverName", "SenderName", "Amount", "Commission", "GrandTotal", "ReferenceNumber", "User ", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(12).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(13).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(14).setPreferredWidth(150);
        }

        billno.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        billno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        billno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        user.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel30)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34)
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
                        .addGap(39, 39, 39)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(billno, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(todayTran)
                        .addGap(18, 18, 18)
                        .addComponent(submit)
                        .addGap(18, 18, 18)
                        .addComponent(clear)
                        .addGap(18, 18, 18)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel31)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(submit)
                        .addComponent(todayTran)
                        .addComponent(clear)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        setSize(new java.awt.Dimension(1039, 691));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//    public static String bill_no_print;
//    public static String date_print;
//    public static String company_print;
//    public static String mobilenumber_print;
//    public static String bankname_print;
//    public static String accountnumber_print;
//    public static String receivername_print;
//    public static String sendername_print;
//    public static String amount_print;
//    public static String commission_print;
//    public static String grandtotal_print;
//    public static String referncenumber_print;
//    public static String username_print;
    
    PreparedStatement pr;
    Statement st;
    ResultSet rs;
    
    public void submit(){
        if(jTextField1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter mobile number.");
            jTextField1.requestFocus();
        }
        else if(!Pattern.matches("[0-9]{10}",jTextField1.getText())){
            JOptionPane.showMessageDialog(null,"Please enter mobile number in digits or enter only 10 digits.");
            jTextField1.requestFocus();
        }
        else if(jTextField2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter the sender name.");
            jTextField2.requestFocus();
        }
        else if(jTextField5.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter the reference name.");
            jTextField5.requestFocus();
        }
        else if(jTextField6.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter amount.");
            jTextField6.requestFocus();
        }
        else if(!Pattern.matches("[0-9]{1,10}",jTextField6.getText())){
            JOptionPane.showMessageDialog(null,"Please enter amount in digits.");
            jTextField6.requestFocus();
        }
        else if(jTextField7.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter commission.");
            jTextField7.requestFocus();
        }
        else if(!Pattern.matches("[0-9]{1,10}",jTextField7.getText())){
            JOptionPane.showMessageDialog(null,"Please enter commission in digits.");
            jTextField7.requestFocus();
        }
        else if(jTextField9.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter the A/C number.");
            jTextField9.requestFocus();
        }
        else if(!Pattern.matches("[0-9]{1,30}",jTextField9.getText())){
            JOptionPane.showMessageDialog(null,"Please enter the A/C number in digits.");
            jTextField9.requestFocus();
        }
        else if(jTextField10.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter IFSC code.");
            jTextField10.requestFocus();
        }
        else if(jTextField11.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter the receiver name.");
            jTextField11.requestFocus();
        }
        else{
            try{
                
//                bill_no_print = ""+billno.getText();
//                date_print = ""+jTextField3.getText();
//                company_print = ""+jComboBox1.getSelectedItem();
//                mobilenumber_print = ""+jTextField1.getText();
//                bankname_print = ""+jComboBox2.getSelectedItem();
//                accountnumber_print = ""+jTextField9.getText();
//                receivername_print = ""+jTextField11.getText();
//                sendername_print = ""+jTextField2.getText();
//                amount_print = ""+jTextField6.getText();
//                commission_print = ""+jTextField7.getText();
//                grandtotal_print = ""+jTextField8.getText();
//                referncenumber_print = ""+jTextField5.getText();
//                username_print = ""+user.getText();
                
                con.setAutoCommit(false);
                
                st=con.createStatement();
                st.execute("insert into inward (date,company,mobilenumber,bankname,ifsc,accountnumber,receivername,sendername,amount,commission,grandtotal,referencenumber,username,stat) values('"+dt+"','"+jComboBox1.getSelectedItem()+"','"+jTextField1.getText()+"','"+jComboBox2.getSelectedItem()
                +"','"+jTextField10.getText()+"','"+jTextField9.getText()+"','"+jTextField11.getText()
                +"','"+jTextField2.getText()+"','"+jTextField6.getText()+"','"+jTextField7.getText()
                +"','"+jTextField8.getText()+"','"+jTextField5.getText()+"','"+user.getText()+"','pending')");
                
                con.commit();
                
                clear();                
                
                int num=1;
                
                String sql1="SELECT TOP 1 bill_no FROM inward ORDER BY bill_no DESC";
                pr=con.prepareStatement(sql1);
                rs=pr.executeQuery();
                while(rs.next()){
                    num=rs.getInt("bill_no");
                }
                
                billno.setText(""+num);
                
                JOptionPane.showMessageDialog(null,"Successful !!!");
                
                InwardBill bill=new InwardBill();
                bill.setVisible(true);

            }
            
            catch(SQLException eSubmit){
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    Logger.getLogger(TakeInward.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null,eSubmit.toString());
            }            
        }
    }

    public void clear(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
    } 

    public void companyLoad(){        
        try{
            st=con.createStatement();
            
            rs=st.executeQuery("select company from companys");
            
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
    
    SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
    Date date=new Date();
    String dt=s.format(date);
    
    public void seq(){
        try{
            String sql="SELECT TOP 1 bill_no FROM inward ORDER BY bill_no DESC;";
            pr=con.prepareStatement(sql);
            rs=pr.executeQuery();
            while(rs.next()){
                count=rs.getInt("bill_no");
            }
        }
        catch(SQLException eSeqFunc){
            JOptionPane.showMessageDialog(null, eSeqFunc.toString());
        }    
        count++;
        billno.setText(""+count);
    }
    
    public void companyUnload(){
        jComboBox1.removeAllItems();
    }
    
    public void bankUnload(){
        jComboBox2.removeAllItems();
    }

    void todayTransaction()
    {
        DefaultTableModel modelTable=(DefaultTableModel)jTable1.getModel();
        int countRow,i;
        countRow=modelTable.getRowCount();
        for(i=0;i<countRow;i++){
            modelTable.removeRow(0);
        } 
        try{
            //PreparedStatement pr;
            String today="SELECT * FROM inward WHERE date='"+dt+"' ORDER BY bill_no DESC";
            //ResultSet rs;
            pr=con.prepareStatement(today);
            rs=pr.executeQuery();
            while(rs.next())
            {
                modelTable.addRow(new Object[]{rs.getString("bill_no"),rs.getString("date"),rs.getString("company"),rs.getString("mobilenumber"),rs.getString("bankname"),rs.getString("ifsc"),rs.getString("accountnumber"),rs.getString("receivername"),rs.getString("sendername"),rs.getString("amount"),rs.getString("commission"),rs.getString("grandtotal"),rs.getString("referencenumber"),rs.getString("username"),rs.getString("note")});
            }
        }
        catch(SQLException eTodayTran){
            JOptionPane.showMessageDialog(null,eTodayTran.toString());
        }
    }            
            
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        submit();
    }//GEN-LAST:event_submitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clearActionPerformed
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jTextField3.setText(""+s.format(date));
        user.setText(UserWindow.currentuser);
        companyLoad();
        bankLoad();
        seq();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        user.setText("");
        companyUnload();
        bankUnload();
        try{
            con.close();
        }
        catch(SQLException eWinClosed){}
    }//GEN-LAST:event_formWindowClosed
    
    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        if(Pattern.matches("[0-9]{10}",jTextField1.getText())){
            int count_mob,i;
            count_mob=model.getRowCount();
            for(i=0;i<count_mob;i++){
                model.removeRow(0);
            } 
            try{
                String select="select * from inward where mobilenumber ='"+jTextField1.getText()+"'";
                pr=con.prepareStatement(select);
                rs=pr.executeQuery();
                while(rs.next())
                {
                    model.addRow(new Object[]{rs.getString("bill_no"),rs.getString("date"),rs.getString("company"),rs.getString("mobilenumber"),rs.getString("bankname"),rs.getString("ifsc"),rs.getString("accountnumber"),rs.getString("receivername"),rs.getString("sendername"),rs.getString("amount"),rs.getString("commission"),rs.getString("grandtotal"),rs.getString("referencenumber"),rs.getString("username"),rs.getString("note")});
                }
            }
            catch(SQLException eMobFocusLost){
                JOptionPane.showMessageDialog(null,eMobFocusLost.toString());
            }
        }
        else if(!Pattern.matches("[0-9]{10}",jTextField1.getText())){
           // JOptionPane.showMessageDialog(null,"Please enter only ten numbers..");
        }
        else if(jTextField1.getText().isEmpty()){
            
        }
    }//GEN-LAST:event_jTextField1FocusLost
    
    int amount=0,commission=0,gt;
    
    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        // TODO add your handling code here:
        if(jTextField6.getText().isEmpty()){
            amount=0;
            gt=amount+commission;
            jTextField8.setText(""+gt);            
        }
        else{
            amount=Integer.parseInt(jTextField6.getText());
            gt=amount+commission;
            jTextField8.setText(""+gt);            
        }
    }//GEN-LAST:event_jTextField6FocusLost

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
        if(Pattern.matches("[0-9]{1,10}",jTextField6.getText())){
            amount=Integer.parseInt(jTextField6.getText());
            gt=amount+commission;
            jTextField8.setText(""+gt);            
        }
        else{
            amount=0;
            gt=amount+commission;
            jTextField8.setText(""+gt);
        }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
        // TODO add your handling code here:
        if(jTextField7.getText().isEmpty()){
            commission=0;
            gt=amount+commission;
            jTextField8.setText(""+gt);            
        }
        else{
            commission=Integer.parseInt(jTextField7.getText());
            gt=amount+commission;
            jTextField8.setText(""+gt);            
        }
    }//GEN-LAST:event_jTextField7FocusLost

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        // TODO add your handling code here:
        if(Pattern.matches("[0-9]{1,10}",jTextField7.getText())){
            commission=Integer.parseInt(jTextField7.getText());
            gt=amount+commission;
            jTextField8.setText(""+gt);            
        }
        else{
            commission=0;
            gt=amount+commission;
            jTextField8.setText(""+gt);
        }
    }//GEN-LAST:event_jTextField7KeyReleased

    int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h;

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

    private void todayTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todayTranActionPerformed
        // TODO add your handling code here:
        todayTransaction();
    }//GEN-LAST:event_todayTranActionPerformed

    int rowno;
            
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try{
            jTextField1.setText(""+model.getValueAt(rowno, 3).toString());
            rowno=jTable1.getSelectedRow();
            jTextField2.setText(""+model.getValueAt(rowno, 8).toString());
            jComboBox2.setSelectedItem(model.getValueAt(rowno, 4).toString());
            jComboBox1.setSelectedItem(model.getValueAt(rowno, 2).toString());
            jTextField9.setText(""+model.getValueAt(rowno, 6).toString());
            jTextField10.setText(""+model.getValueAt(rowno, 5).toString());
            jTextField11.setText(""+model.getValueAt(rowno, 7).toString());
            jTextField5.requestFocus();            
        }
        catch(Exception eTableMouseClicked){
            JOptionPane.showMessageDialog(null,eTableMouseClicked.toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            submit();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

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

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            submit();
        }
    }//GEN-LAST:event_jTextField9KeyPressed

    private void jTextField10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            submit();
        }
    }//GEN-LAST:event_jTextField10KeyPressed

    private void jTextField11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            submit();
        }
    }//GEN-LAST:event_jTextField11KeyPressed

    private void submitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_submitKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            submit();
        }
    }//GEN-LAST:event_submitKeyPressed

    private void todayTranKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_todayTranKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            todayTransaction();
        }
    }//GEN-LAST:event_todayTranKeyPressed

    private void clearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clearKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            clear();
        }
    }//GEN-LAST:event_clearKeyPressed
    
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
            java.util.logging.Logger.getLogger(TakeInward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeInward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeInward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeInward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TakeInward().setVisible(true);
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
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
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
    private javax.swing.JButton todayTran;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
