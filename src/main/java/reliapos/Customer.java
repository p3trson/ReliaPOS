package reliapos;

import java.awt.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class Customer extends javax.swing.JPanel{

    
   
    public Customer() {
        initComponents();       
        tb_load();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        p_allCus = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dbTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        all_searchTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        all_nameTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        all_mailTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        all_numberTf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        all_addressTf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        p_manageCus = new javax.swing.JPanel();
        p_addCus = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        add_nameTf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        add_mailTf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        add_adressTf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        add_numberTF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        p_editCus = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        edit_nameTf = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        edit_emailTf = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        edit_addressTf = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        edit_numberTf = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        edit_searchTf = new javax.swing.JTextField();
        delBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(72, 72, 72));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPane1.setBackground(new java.awt.Color(72, 72, 72));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setToolTipText("");

        p_allCus.setBackground(new java.awt.Color(72, 72, 72));
        p_allCus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));

        dbTable.setAutoCreateRowSorter(true);
        dbTable.setBackground(new java.awt.Color(51, 51, 51));
        dbTable.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dbTable.setForeground(new java.awt.Color(255, 255, 255));
        dbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "E-mail", "Phone number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dbTable.setGridColor(new java.awt.Color(255, 255, 255));
        dbTable.setName(""); // NOI18N
        jScrollPane1.setViewportView(dbTable);

        jPanel2.setBackground(new java.awt.Color(72, 72, 72));

        all_searchTf.setBackground(new java.awt.Color(72, 72, 72));
        all_searchTf.setForeground(new java.awt.Color(255, 255, 255));
        all_searchTf.setToolTipText("");
        all_searchTf.setCaretColor(new java.awt.Color(255, 255, 255));
        all_searchTf.setName(""); // NOI18N
        all_searchTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_searchTfActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search :");

        jPanel1.setBackground(new java.awt.Color(72, 72, 72));

        all_nameTf.setEditable(false);
        all_nameTf.setBackground(new java.awt.Color(72, 72, 72));
        all_nameTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        all_nameTf.setForeground(new java.awt.Color(255, 255, 255));
        all_nameTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name :");

        all_mailTf.setEditable(false);
        all_mailTf.setBackground(new java.awt.Color(72, 72, 72));
        all_mailTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        all_mailTf.setForeground(new java.awt.Color(255, 255, 255));
        all_mailTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("E-mail :");

        all_numberTf.setEditable(false);
        all_numberTf.setBackground(new java.awt.Color(72, 72, 72));
        all_numberTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        all_numberTf.setForeground(new java.awt.Color(255, 255, 255));
        all_numberTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone number :");

        all_addressTf.setEditable(false);
        all_addressTf.setBackground(new java.awt.Color(72, 72, 72));
        all_addressTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        all_addressTf.setForeground(new java.awt.Color(255, 255, 255));
        all_addressTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(all_nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(all_mailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(all_numberTf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(all_addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(all_nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(all_mailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(all_numberTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(all_addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(all_searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(all_searchTf, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        all_searchTf.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout p_allCusLayout = new javax.swing.GroupLayout(p_allCus);
        p_allCus.setLayout(p_allCusLayout);
        p_allCusLayout.setHorizontalGroup(
            p_allCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_allCusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_allCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_allCusLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1196, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        p_allCusLayout.setVerticalGroup(
            p_allCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_allCusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("All Customers", p_allCus);

        p_manageCus.setBackground(new java.awt.Color(72, 72, 72));

        p_addCus.setBackground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Add Customer");

        add_nameTf.setBackground(new java.awt.Color(72, 72, 72));
        add_nameTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add_nameTf.setForeground(new java.awt.Color(255, 255, 255));
        add_nameTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Name:");

        add_mailTf.setBackground(new java.awt.Color(72, 72, 72));
        add_mailTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add_mailTf.setForeground(new java.awt.Color(255, 255, 255));
        add_mailTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("E-mail:");

        add_adressTf.setBackground(new java.awt.Color(72, 72, 72));
        add_adressTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add_adressTf.setForeground(new java.awt.Color(255, 255, 255));
        add_adressTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Address:");

        add_numberTF.setBackground(new java.awt.Color(72, 72, 72));
        add_numberTF.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add_numberTF.setForeground(new java.awt.Color(255, 255, 255));
        add_numberTF.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Phone number:");

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_addCusLayout = new javax.swing.GroupLayout(p_addCus);
        p_addCus.setLayout(p_addCusLayout);
        p_addCusLayout.setHorizontalGroup(
            p_addCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_addCusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_addCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(add_nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(add_mailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(add_adressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(add_numberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addGroup(p_addCusLayout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        p_addCusLayout.setVerticalGroup(
            p_addCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_addCusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_mailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_adressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_numberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_addCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_editCus.setBackground(new java.awt.Color(51, 51, 51));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Edit Customer");

        edit_nameTf.setBackground(new java.awt.Color(72, 72, 72));
        edit_nameTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edit_nameTf.setForeground(new java.awt.Color(255, 255, 255));
        edit_nameTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Name:");

        edit_emailTf.setBackground(new java.awt.Color(72, 72, 72));
        edit_emailTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edit_emailTf.setForeground(new java.awt.Color(255, 255, 255));
        edit_emailTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("E-mail:");

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Address:");

        edit_addressTf.setBackground(new java.awt.Color(72, 72, 72));
        edit_addressTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edit_addressTf.setForeground(new java.awt.Color(255, 255, 255));
        edit_addressTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Phone number:");

        edit_numberTf.setBackground(new java.awt.Color(72, 72, 72));
        edit_numberTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edit_numberTf.setForeground(new java.awt.Color(255, 255, 255));
        edit_numberTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Search:");

        edit_searchTf.setBackground(new java.awt.Color(72, 72, 72));
        edit_searchTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edit_searchTf.setForeground(new java.awt.Color(255, 255, 255));
        edit_searchTf.setCaretColor(new java.awt.Color(255, 255, 255));
        edit_searchTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_searchTfActionPerformed(evt);
            }
        });

        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_editCusLayout = new javax.swing.GroupLayout(p_editCus);
        p_editCus.setLayout(p_editCusLayout);
        p_editCusLayout.setHorizontalGroup(
            p_editCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_editCusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_editCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(edit_nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(edit_emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(edit_addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(edit_numberTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel23)
                    .addComponent(edit_searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p_editCusLayout.createSequentialGroup()
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        p_editCusLayout.setVerticalGroup(
            p_editCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_editCusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_numberTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_editCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p_manageCusLayout = new javax.swing.GroupLayout(p_manageCus);
        p_manageCus.setLayout(p_manageCusLayout);
        p_manageCusLayout.setHorizontalGroup(
            p_manageCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_manageCusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_addCus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_editCus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );
        p_manageCusLayout.setVerticalGroup(
            p_manageCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_manageCusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_manageCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p_editCus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p_addCus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Manage Customers", p_manageCus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void all_searchTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_searchTfActionPerformed
       all_SearchCustomer();
    }//GEN-LAST:event_all_searchTfActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
       deleteCustomer();
       tb_load();
    }//GEN-LAST:event_delBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
       updateCustomer();
       tb_load(); 
       clearText(edit_nameTf, edit_emailTf, edit_addressTf, edit_numberTf);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        addEmployee();
        tb_load();   
        clearText(add_nameTf, add_mailTf, add_adressTf, add_numberTF);
    }//GEN-LAST:event_addBtnActionPerformed

    private void edit_searchTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_searchTfActionPerformed
       edit_SearchCustomer();
    }//GEN-LAST:event_edit_searchTfActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearText(add_nameTf, add_mailTf, add_adressTf, add_numberTF);
    }//GEN-LAST:event_clearBtnActionPerformed

    public void all_SearchCustomer() {
        
        String search = all_searchTf.getText();
        Statement s = null;
        ResultSet rs = null;
        
        try {
            
            s = DB.connect().createStatement();
            
            rs = s.executeQuery("SELECT * FROM customers WHERE ID = '" +search+ "'");
           
            if (rs.next()) {
            all_nameTf.setText(rs.getString("Name"));
            all_mailTf.setText(rs.getString("E-mail"));
            all_numberTf.setText(rs.getString("Phone number"));
            all_addressTf.setText(rs.getString("Address"));
            
            }
            
        } catch (SQLException e) {
          System.out.println(e); 
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
             if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
             
        }
    }
    
    public void edit_SearchCustomer() {
        
        String search = edit_searchTf.getText();
        Statement s = null;
        ResultSet rs = null;
        
        try {
            
            s = DB.connect().createStatement();
            
            rs = s.executeQuery("SELECT * FROM customers WHERE ID = '" +search+ "'");
           
            if (rs.next()) {
            edit_nameTf.setText(rs.getString("Name"));
            edit_emailTf.setText(rs.getString("E-mail"));
            edit_numberTf.setText(rs.getString("Phone number"));
            edit_addressTf.setText(rs.getString("Address"));
            
            }
            
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
             if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
             
        }
    }
    
    
    
    public void addEmployee() {
        String name = add_nameTf.getText();
        String email = add_mailTf.getText();
        String address = add_adressTf.getText();
        String phnumber = add_numberTF.getText();
        
        
       
        Statement s = null;
        
        
        try {
            
            s = DB.connect().createStatement();
            s.executeUpdate("INSERT INTO customers (Name, Address, `E-mail`, `Phone number`) VALUES ('" + name + "', '" + address + "', '" + email + "', '" + phnumber + "')");
           
            JOptionPane.showMessageDialog(p_addCus, "Customer sucessfully added !");
            
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
    
    public void clearText(JTextField... textFields) {
    for (JTextField tf : textFields) {
        tf.setText("");
    }
}
    
    public void tb_load() {
        
        Statement s = null;
        ResultSet rs = null;
        
        try {
            
            DefaultTableModel dt = (DefaultTableModel) dbTable.getModel();
            dt.setRowCount(0);
            
            s = DB.connect().createStatement();
            rs = s.executeQuery("SELECT * FROM customers");
           
            while (rs.next()) {
                
                Vector v = new Vector();
                
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));

                
                dt.addRow(v);
                       
            }
                
            
        } catch (SQLException e) {
          System.out.println(e);
        }  finally {
        if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
        if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }

   public void updateCustomer() {      
        String name = edit_nameTf.getText();
        String email = edit_emailTf.getText();
        String address = edit_addressTf.getText();
        String phnumber = edit_numberTf.getText();
        String id = edit_searchTf.getText();
        
        Statement s = null;
       
        try {
            
        s = DB.connect().createStatement();
        s.executeUpdate("UPDATE customers SET Name = '" + name + "', Address = '" + address + "', `E-mail` =  '" + email + "', `Phone number` = '" + phnumber + "' WHERE ID = '" + id + "'");
           
        JOptionPane.showMessageDialog(p_editCus, "Customer sucessfully updated !");
        
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
       
       
   }
   
   public void deleteCustomer() {
       String id = edit_searchTf.getText();
       Statement s = null;
       
       try {
           
       s = DB.connect().createStatement();
       s.executeUpdate("DELETE FROM customers WHERE ID = '" + id + "'");
       
       JOptionPane.showMessageDialog(p_editCus, "Customer sucessfully deleted !");
       
       } catch (SQLException e) {
        System.out.println(e);
       } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
}   
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField add_adressTf;
    private javax.swing.JTextField add_mailTf;
    private javax.swing.JTextField add_nameTf;
    private javax.swing.JTextField add_numberTF;
    private javax.swing.JTextField all_addressTf;
    private javax.swing.JTextField all_mailTf;
    private javax.swing.JTextField all_nameTf;
    private javax.swing.JTextField all_numberTf;
    private javax.swing.JTextField all_searchTf;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTable dbTable;
    private javax.swing.JButton delBtn;
    private javax.swing.JTextField edit_addressTf;
    private javax.swing.JTextField edit_emailTf;
    private javax.swing.JTextField edit_nameTf;
    private javax.swing.JTextField edit_numberTf;
    private javax.swing.JTextField edit_searchTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel p_addCus;
    private javax.swing.JPanel p_allCus;
    private javax.swing.JPanel p_editCus;
    private javax.swing.JPanel p_manageCus;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}