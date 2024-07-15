package reliapos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CashRegister extends javax.swing.JPanel {
    
    private JpanelLoader panelLoader;
    private ReliaPOS reliapos;
    private Home home;
    private int currentInvoiceID;
    private boolean isEmployee;

    public CashRegister(boolean isEmployee) {
        panelLoader = new JpanelLoader();
        this.isEmployee = isEmployee;
        reliapos = new ReliaPOS();
        initComponents();
        generateTabsFromDatabase();
        reliapos.loadPaymentTypesIntoComboBox(paymentC); 
        currentInvoiceID = getLastInvoiceID() + 1;
        invoiceID.setText(String.format("%02d", currentInvoiceID));
        
         if (isEmployee) {
            edit_backBtn.setVisible(true); 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        edit_backBtn = new javax.swing.JButton();
        invoiceLable = new javax.swing.JLabel();
        invoiceID = new javax.swing.JLabel();
        categoryListPanel = new javax.swing.JPanel();
        categoryTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        productScrollPane = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        totalLabel = new javax.swing.JLabel();
        payBtn = new javax.swing.JButton();
        stornoBtn = new javax.swing.JButton();
        paymentC = new javax.swing.JComboBox<>();
        paymentLabel = new javax.swing.JLabel();
        cashLabel = new javax.swing.JLabel();
        changeTf = new javax.swing.JTextField();
        changeLabel = new javax.swing.JLabel();
        totalpriceTf = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        cBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        oneBtn = new javax.swing.JButton();
        twoBtn = new javax.swing.JButton();
        fourBtn = new javax.swing.JButton();
        fiveBtn = new javax.swing.JButton();
        sixBtn = new javax.swing.JButton();
        threeBtn = new javax.swing.JButton();
        eightBtn = new javax.swing.JButton();
        nineBtn = new javax.swing.JButton();
        sevenBtn = new javax.swing.JButton();
        cBtn1 = new javax.swing.JButton();
        paidamountTf = new javax.swing.JTextField();
        removeBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(92, 92, 92));

        backgroundPanel.setBackground(new java.awt.Color(42, 42, 42));

        edit_backBtn.setBackground(new java.awt.Color(42, 42, 42));
        edit_backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Back2.png")); // NOI18N
        edit_backBtn.setBorder(null);
        edit_backBtn.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover back2.png")); // NOI18N
        edit_backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_backBtnActionPerformed(evt);
            }
        });

        invoiceLable.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        invoiceLable.setForeground(new java.awt.Color(255, 255, 255));
        invoiceLable.setText("Invoice : ");

        invoiceID.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        invoiceID.setForeground(new java.awt.Color(255, 255, 255));
        invoiceID.setText("01");

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edit_backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invoiceLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invoiceID)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invoiceLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invoiceID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        categoryListPanel.setBackground(new java.awt.Color(40, 40, 40));
        categoryListPanel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                categoryListPanelComponentAdded(evt);
            }
        });
        categoryListPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryListPanelMouseClicked(evt);
            }
        });

        categoryTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        categoryTabbedPane.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout categoryListPanelLayout = new javax.swing.GroupLayout(categoryListPanel);
        categoryListPanel.setLayout(categoryListPanelLayout);
        categoryListPanelLayout.setHorizontalGroup(
            categoryListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoryTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );
        categoryListPanelLayout.setVerticalGroup(
            categoryListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoryTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel2.setBackground(new java.awt.Color(42, 42, 42));

        productsTable.setBackground(new java.awt.Color(42, 42, 42));
        productsTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice ID", "Name", "Quantity", "Price", "Total Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productScrollPane.setViewportView(productsTable);

        totalLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalLabel.setText("Total ");

        payBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Pay.png")); // NOI18N
        payBtn.setBorder(null);
        payBtn.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover pay.png")); // NOI18N
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        stornoBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Cancel.png")); // NOI18N
        stornoBtn.setBorder(null);
        stornoBtn.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover Cancel.png")); // NOI18N
        stornoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stornoBtnActionPerformed(evt);
            }
        });

        paymentC.setBackground(new java.awt.Color(40, 40, 40));
        paymentC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        paymentC.setForeground(new java.awt.Color(255, 255, 255));
        paymentC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        paymentC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));
        paymentC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                paymentCItemStateChanged(evt);
            }
        });

        paymentLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        paymentLabel.setForeground(new java.awt.Color(255, 255, 255));
        paymentLabel.setText("Payment method");

        cashLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cashLabel.setForeground(new java.awt.Color(255, 255, 255));
        cashLabel.setText("Paid amount");

        changeTf.setEditable(false);
        changeTf.setBackground(new java.awt.Color(40, 40, 40));
        changeTf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        changeTf.setForeground(new java.awt.Color(255, 255, 255));
        changeTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));
        changeTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeTfActionPerformed(evt);
            }
        });

        changeLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        changeLabel.setForeground(new java.awt.Color(255, 255, 255));
        changeLabel.setText("Change");

        totalpriceTf.setBackground(new java.awt.Color(40, 40, 40));
        totalpriceTf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        totalpriceTf.setForeground(new java.awt.Color(255, 255, 255));
        totalpriceTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));
        totalpriceTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalpriceTfActionPerformed(evt);
            }
        });
        totalpriceTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                totalpriceTfKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        cBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cBtn.setText("C");
        cBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBtnActionPerformed(evt);
            }
        });

        zeroBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        zeroBtn.setText("0");
        zeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBtnActionPerformed(evt);
            }
        });

        oneBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        oneBtn.setText("1");
        oneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBtnActionPerformed(evt);
            }
        });

        twoBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        twoBtn.setText("2");
        twoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBtnActionPerformed(evt);
            }
        });

        fourBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fourBtn.setText("4");
        fourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBtnActionPerformed(evt);
            }
        });

        fiveBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fiveBtn.setText("5");
        fiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBtnActionPerformed(evt);
            }
        });

        sixBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sixBtn.setText("6");
        sixBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBtnActionPerformed(evt);
            }
        });

        threeBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        threeBtn.setText("3");
        threeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBtnActionPerformed(evt);
            }
        });

        eightBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eightBtn.setText("8");
        eightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBtnActionPerformed(evt);
            }
        });

        nineBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nineBtn.setText("9");
        nineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBtnActionPerformed(evt);
            }
        });

        sevenBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sevenBtn.setText("7");
        sevenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBtnActionPerformed(evt);
            }
        });

        cBtn1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oneBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(fourBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sevenBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zeroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(eightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(twoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(threeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sixBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sevenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sixBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zeroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        paidamountTf.setBackground(new java.awt.Color(40, 40, 40));
        paidamountTf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        paidamountTf.setForeground(new java.awt.Color(255, 255, 255));
        paidamountTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));
        paidamountTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidamountTfActionPerformed(evt);
            }
        });
        paidamountTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paidamountTfKeyReleased(evt);
            }
        });

        removeBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Delete Row.png")); // NOI18N
        removeBtn.setBorder(null);
        removeBtn.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover deleteRow.png")); // NOI18N
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paymentC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changeTf)
                    .addComponent(paidamountTf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalpriceTf)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalLabel)
                            .addComponent(changeLabel)
                            .addComponent(cashLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(stornoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(productScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(totalLabel)
                        .addGap(0, 0, 0)
                        .addComponent(totalpriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(paymentLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paymentC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cashLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paidamountTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(changeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(removeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(stornoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backgroundPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryListPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(categoryListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void categoryListPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryListPanelMouseClicked
        
    }//GEN-LAST:event_categoryListPanelMouseClicked

    private void categoryListPanelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_categoryListPanelComponentAdded
        
    }//GEN-LAST:event_categoryListPanelComponentAdded

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        updateChange();
        addCartToDatabase();
        DefaultTableModel model = (DefaultTableModel) productsTable.getModel();
        model.setRowCount(0);
        reliapos.clearText(totalpriceTf, paidamountTf, changeTf);
        currentInvoiceID++;
        invoiceID.setText(String.format("%02d", currentInvoiceID));
    }//GEN-LAST:event_payBtnActionPerformed

    private void changeTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeTfActionPerformed
       
    }//GEN-LAST:event_changeTfActionPerformed

    private void totalpriceTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalpriceTfActionPerformed
        
    }//GEN-LAST:event_totalpriceTfActionPerformed

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBtnActionPerformed
         appendNumberToPaidAmount(sevenBtn.getText());
    }//GEN-LAST:event_sevenBtnActionPerformed

    private void eightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBtnActionPerformed
        appendNumberToPaidAmount(eightBtn.getText());
    }//GEN-LAST:event_eightBtnActionPerformed

    private void nineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBtnActionPerformed
        appendNumberToPaidAmount(nineBtn.getText());
    }//GEN-LAST:event_nineBtnActionPerformed

    private void fourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBtnActionPerformed
        appendNumberToPaidAmount(fourBtn.getText());
    }//GEN-LAST:event_fourBtnActionPerformed

    private void fiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBtnActionPerformed
        appendNumberToPaidAmount(fiveBtn.getText());
    }//GEN-LAST:event_fiveBtnActionPerformed

    private void sixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBtnActionPerformed
        appendNumberToPaidAmount(sixBtn.getText());
    }//GEN-LAST:event_sixBtnActionPerformed

    private void oneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBtnActionPerformed
        appendNumberToPaidAmount(oneBtn.getText());
    }//GEN-LAST:event_oneBtnActionPerformed

    private void twoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBtnActionPerformed
        appendNumberToPaidAmount(twoBtn.getText());
    }//GEN-LAST:event_twoBtnActionPerformed

    private void threeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBtnActionPerformed
        appendNumberToPaidAmount(threeBtn.getText());
    }//GEN-LAST:event_threeBtnActionPerformed

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtnActionPerformed
        appendNumberToPaidAmount(zeroBtn.getText());
    }//GEN-LAST:event_zeroBtnActionPerformed

    private void cBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBtnActionPerformed
        paidamountTf.setText("");
    }//GEN-LAST:event_cBtnActionPerformed

    private void totalpriceTfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalpriceTfKeyReleased
        
    }//GEN-LAST:event_totalpriceTfKeyReleased

    private void paidamountTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidamountTfActionPerformed
        
    }//GEN-LAST:event_paidamountTfActionPerformed

    private void paidamountTfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidamountTfKeyReleased
        
    }//GEN-LAST:event_paidamountTfKeyReleased

    private void paymentCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_paymentCItemStateChanged
        itemStateChanged(evt);
    }//GEN-LAST:event_paymentCItemStateChanged

    private void edit_backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_backBtnActionPerformed
        if (!isEmployee) { 
        home = new Home();
        panelLoader.jPanelLoader(this, home.jLayeredPane);
    } else {
        JOptionPane.showMessageDialog(this, "Access Denied: Employees cannot access the Home panel.");
    }
    }//GEN-LAST:event_edit_backBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        try {

            DefaultTableModel model = (DefaultTableModel) productsTable.getModel();
            int row = productsTable.getSelectedRow();
            String id = model.getValueAt(row, 0).toString();
            model.removeRow(row);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void stornoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stornoBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) productsTable.getModel();
        model.setRowCount(0);
        reliapos.clearText(totalpriceTf, paidamountTf, changeTf);
    }//GEN-LAST:event_stornoBtnActionPerformed

    private void generateTabsFromDatabase() {
        Statement s = null;
        ResultSet rs = null;

        try {
            Connection connection = DB.connect();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT Name FROM categories");

            while (rs.next()) {
                String categoryName = rs.getString("Name");
                addTab(categoryName);
            }

            addProductsToTabsFromDatabase(); 

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
            if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }

    private void addTab(String categoryName) {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(42, 42, 42));
        panel.setLayout(new FlowLayout(FlowLayout.LEFT)); 
        categoryTabbedPane.addTab(categoryName, panel);
        categoryTabbedPane.setBackground(new Color(42,42,42));
    }

    private void addProductsToTabsFromDatabase() {
    Statement s = null;
    ResultSet rs = null;

    try {
        Connection connection = DB.connect();
        s = connection.createStatement();
        rs = s.executeQuery("SELECT Name, SalePrice, Category FROM products");


        for (int i = 0; i < categoryTabbedPane.getTabCount(); i++) {
            JPanel categoryPanel = (JPanel) categoryTabbedPane.getComponentAt(i);
            categoryPanel.removeAll();
        }

        while (rs.next()) {
            String productName = rs.getString("Name");
            String salePrice = rs.getString("SalePrice");
            String categoryName = rs.getString("Category");

            for (int i = 0; i < categoryTabbedPane.getTabCount(); i++) {
                if (categoryTabbedPane.getTitleAt(i).equals(categoryName)) {
                    JPanel categoryPanel = (JPanel) categoryTabbedPane.getComponentAt(i);
                    JPanel newProductPanel = createProductPanel(productName, salePrice);
                    categoryPanel.add(newProductPanel);
                    categoryPanel.revalidate();
                    categoryPanel.repaint();
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
        if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
    }
}

    private JPanel createProductPanel(String productName, String salePrice) {
    JPanel productPanel = new JPanel();
    productPanel.setLayout(new BoxLayout(productPanel, BoxLayout.Y_AXIS));
    productPanel.setPreferredSize(new Dimension(150, 115));
    productPanel.setBackground(new Color(32, 32, 32));
    
    JLabel nameLabel = new JLabel(productName);
    JLabel priceLabel = new JLabel(salePrice);
    nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
    priceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
    
    productPanel.add(Box.createVerticalGlue());
    productPanel.add(nameLabel);
    productPanel.add(priceLabel);
    productPanel.add(Box.createVerticalGlue());
    
    productPanel.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            handleProductClick(productName, salePrice);
        }
    });
    
    return productPanel;
    }
    
    private int getProductQuantity(String productName) {
    Statement s = null;
    ResultSet rs = null;
    int quantity = 0;

    try {
        Connection connection = DB.connect();
        s = connection.createStatement();
        rs = s.executeQuery("SELECT Quantity FROM products WHERE Name = '" + productName + "'");
        
        if (rs.next()) {
            quantity = Integer.parseInt(rs.getString("Quantity"));
        }
    } catch (SQLException | NumberFormatException e) {
        e.printStackTrace();
    } finally {
        if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
        if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
    }
    
    return quantity;
}

    private void updateProductQuantity(String productName, int newQuantity) {
    Statement s = null;

    try {
        Connection connection = DB.connect();
        s = connection.createStatement();
        s.executeUpdate("UPDATE products SET Quantity = '" + newQuantity + "' WHERE Name = '" + productName + "'");
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
    }
    }
    
    private void handleProductClick(String productName, String salePrice) {
    int currentQuantity = getProductQuantity(productName);

    if (currentQuantity > 0) {

        boolean productExistsInTable = false;
        DefaultTableModel model = (DefaultTableModel) productsTable.getModel();
        
        String invoiceId = invoiceID.getText();

        for (int i = 0; i < model.getRowCount(); i++) {
            Object invoiceIdInTable = model.getValueAt(i, 0);
            Object productNameInTable = model.getValueAt(i, 1);
            Object quantityInTable = model.getValueAt(i, 2);

            if (productNameInTable != null && productNameInTable.equals(productName)) {
                int newQuantity = Integer.parseInt((String) quantityInTable) + 1;
                model.setValueAt(String.valueOf(newQuantity), i, 2);
                productExistsInTable = true;
                break;
            }
        }

        if (!productExistsInTable) {
            model.addRow(new Object[]{invoiceId, productName, "1", salePrice});
        }

        updateProductQuantity(productName, currentQuantity - 1);

        updateTotalPrice();

    } else {
        JOptionPane.showMessageDialog(null, "This product is out of stock.");
    }
}
  
    private void updateTotalPrice() {
    DefaultTableModel model = (DefaultTableModel) productsTable.getModel();
    double totalPrice = 0.0;

    for (int i = 0; i < model.getRowCount(); i++) {
        String quantityString = (String) model.getValueAt(i, 2);
        String priceString = (String) model.getValueAt(i, 3);

        int quantity = Integer.parseInt(quantityString);
        double price = Double.parseDouble(priceString);

        double rowTotalPrice = quantity * price;
        model.setValueAt(String.valueOf(rowTotalPrice), i, 4);

        totalPrice += rowTotalPrice;
    }

    totalpriceTf.setText(String.valueOf(totalPrice));
}
 
    private void updateChange() {
        
    try {
        String totalText = totalpriceTf.getText();
        String paidAmountText = paidamountTf.getText();

        double totalPrice = Double.parseDouble(totalText);
        double paidAmount = Double.parseDouble(paidAmountText);

        double change = paidAmount - totalPrice;

        changeTf.setText(String.valueOf(change));
    } catch (NumberFormatException e) {
        changeTf.setText("Invalid input");
    }
}
 
    private void setPaidAmountFromTotalPrice(String paymentType) {      
    if (paymentType.equals("Credit Card") || paymentType.equals("Debit Card") || paymentType.equals("Check")) {
        
        String totalPrice = totalpriceTf.getText().trim();

        if (!totalPrice.isEmpty()) {

            paidamountTf.setText(totalPrice);
        }
    }
}
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String paymentType = (String) e.getItem();

            setPaidAmountFromTotalPrice(paymentType);
        }
    }
    
   public void addCartToDatabase() {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            DefaultTableModel model = (DefaultTableModel) productsTable.getModel();
            int rc = model.getRowCount();

            conn = DB.connect();
            pstmt = conn.prepareStatement("INSERT INTO cart (InvoiceID, ProductName, Quantity, Price, TotalPrice) VALUES (?, ?, ?, ?, ?)");

            for (int i = 0; i < rc; i++) {
                pstmt.setInt(1, currentInvoiceID);
                pstmt.setString(2, model.getValueAt(i, 1).toString());
                pstmt.setInt(3, Integer.parseInt(model.getValueAt(i, 2).toString()));
                pstmt.setDouble(4, Double.parseDouble(model.getValueAt(i, 3).toString()));
                pstmt.setDouble(5, Double.parseDouble(model.getValueAt(i, 4).toString()));
                pstmt.addBatch();
            }

            pstmt.executeBatch();
            JOptionPane.showMessageDialog(null, "Successfully paid");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void appendNumberToPaidAmount(String number) {
        String currentText = paidamountTf.getText();
        paidamountTf.setText(currentText + number);
    }
    
     public int getLastInvoiceID() {
        int lastInvoiceID = 1;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DB.connect();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT MAX(InvoiceID) FROM cart");

            if (rs.next()) {
                lastInvoiceID = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return lastInvoiceID;
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton cBtn;
    private javax.swing.JButton cBtn1;
    private javax.swing.JLabel cashLabel;
    private javax.swing.JPanel categoryListPanel;
    private javax.swing.JTabbedPane categoryTabbedPane;
    private javax.swing.JLabel changeLabel;
    private javax.swing.JTextField changeTf;
    private javax.swing.JButton edit_backBtn;
    private javax.swing.JButton eightBtn;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JButton fourBtn;
    private javax.swing.JLabel invoiceID;
    private javax.swing.JLabel invoiceLable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nineBtn;
    private javax.swing.JButton oneBtn;
    private javax.swing.JTextField paidamountTf;
    private javax.swing.JButton payBtn;
    private javax.swing.JComboBox<String> paymentC;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JScrollPane productScrollPane;
    private javax.swing.JTable productsTable;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JButton sixBtn;
    private javax.swing.JButton stornoBtn;
    private javax.swing.JButton threeBtn;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalpriceTf;
    private javax.swing.JButton twoBtn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables
}
