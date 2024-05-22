package reliapos;

import java.awt.*;
import java.sql.*;
import java.text.MessageFormat;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class Employee extends javax.swing.JPanel{

    private ReliaPOS reliapos;
    private String query = "SELECT * FROM employees";
    
    
   
    public Employee() {   
        reliapos = new ReliaPOS();
        initComponents();             
        reliapos.tb_load((DefaultTableModel) dbTable.getModel(), query);        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        p_allEmp = new javax.swing.JPanel();
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
        savePDF = new javax.swing.JButton();
        p_manageEmp = new javax.swing.JPanel();
        p_addEmp = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        add_nameTf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        add_mailTf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        add_adressTf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        add_numberTF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        add_bankTf = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        add_taxTf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        p_editEmp = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        edit_nameTf = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        edit_emailTf = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        edit_addressTf = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        edit_numberTf = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        edit_bankTf = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        edit_taxTf = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        edit_searchTf = new javax.swing.JTextField();
        delBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(72, 72, 72));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPane1.setBackground(new java.awt.Color(72, 72, 72));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setToolTipText("");

        p_allEmp.setBackground(new java.awt.Color(72, 72, 72));
        p_allEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));

        dbTable.setAutoCreateRowSorter(true);
        dbTable.setBackground(new java.awt.Color(51, 51, 51));
        dbTable.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dbTable.setForeground(new java.awt.Color(255, 255, 255));
        dbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "E-mail", "Phone number", "Bank account", "Tax number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
                .addGap(0, 92, Short.MAX_VALUE))
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

        savePDF.setText("Save PDF");
        savePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePDFActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(savePDF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(all_searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savePDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        all_searchTf.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout p_allEmpLayout = new javax.swing.GroupLayout(p_allEmp);
        p_allEmp.setLayout(p_allEmpLayout);
        p_allEmpLayout.setHorizontalGroup(
            p_allEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_allEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_allEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_allEmpLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1196, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        p_allEmpLayout.setVerticalGroup(
            p_allEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_allEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("All Employee´s", p_allEmp);

        p_manageEmp.setBackground(new java.awt.Color(72, 72, 72));

        p_addEmp.setBackground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Add Employee");

        add_nameTf.setBackground(new java.awt.Color(72, 72, 72));
        add_nameTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add_nameTf.setForeground(new java.awt.Color(255, 255, 255));
        add_nameTf.setCaretColor(new java.awt.Color(255, 255, 255));
        add_nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_nameTfActionPerformed(evt);
            }
        });

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

        add_bankTf.setBackground(new java.awt.Color(72, 72, 72));
        add_bankTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add_bankTf.setForeground(new java.awt.Color(255, 255, 255));
        add_bankTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Bank account:");

        add_taxTf.setBackground(new java.awt.Color(72, 72, 72));
        add_taxTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add_taxTf.setForeground(new java.awt.Color(255, 255, 255));
        add_taxTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Tax number:");

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

        javax.swing.GroupLayout p_addEmpLayout = new javax.swing.GroupLayout(p_addEmp);
        p_addEmp.setLayout(p_addEmpLayout);
        p_addEmpLayout.setHorizontalGroup(
            p_addEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_addEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_addEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(add_nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(add_mailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(add_adressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(add_numberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(add_bankTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addGroup(p_addEmpLayout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(add_taxTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        p_addEmpLayout.setVerticalGroup(
            p_addEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_addEmpLayout.createSequentialGroup()
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
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_bankTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_taxTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_addEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_editEmp.setBackground(new java.awt.Color(51, 51, 51));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Edit Employee");

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

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Bank account:");

        edit_bankTf.setBackground(new java.awt.Color(72, 72, 72));
        edit_bankTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edit_bankTf.setForeground(new java.awt.Color(255, 255, 255));
        edit_bankTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Tax number:");

        edit_taxTf.setBackground(new java.awt.Color(72, 72, 72));
        edit_taxTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edit_taxTf.setForeground(new java.awt.Color(255, 255, 255));
        edit_taxTf.setCaretColor(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout p_editEmpLayout = new javax.swing.GroupLayout(p_editEmp);
        p_editEmp.setLayout(p_editEmpLayout);
        p_editEmpLayout.setHorizontalGroup(
            p_editEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_editEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_editEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(edit_nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(edit_emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(edit_addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(edit_numberTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(edit_bankTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(edit_taxTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(edit_searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p_editEmpLayout.createSequentialGroup()
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        p_editEmpLayout.setVerticalGroup(
            p_editEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_editEmpLayout.createSequentialGroup()
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
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_bankTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_taxTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_editEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p_manageEmpLayout = new javax.swing.GroupLayout(p_manageEmp);
        p_manageEmp.setLayout(p_manageEmpLayout);
        p_manageEmpLayout.setHorizontalGroup(
            p_manageEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_manageEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_addEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_editEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );
        p_manageEmpLayout.setVerticalGroup(
            p_manageEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_manageEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_manageEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p_editEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p_addEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Manage Employee´s", p_manageEmp);

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
       reliapos.searchRecord("employees", "ID", all_searchTf.getText(), all_nameTf, all_mailTf, all_numberTf, all_addressTf);
    }//GEN-LAST:event_all_searchTfActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
       reliapos.deleteRecord("employees", "ID", edit_searchTf.getText());
       reliapos.tb_load((DefaultTableModel) dbTable.getModel(), query); 
    }//GEN-LAST:event_delBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
       String name = edit_nameTf.getText();
       String email = edit_emailTf.getText();
       String address = edit_addressTf.getText();
       String phnumber = edit_numberTf.getText();
       String bankacc = edit_bankTf.getText();
       String taxn = edit_taxTf.getText();
       String id = edit_searchTf.getText();
       
       reliapos.updateEmployee(name, email, address, phnumber, bankacc, taxn, id);
       reliapos.tb_load((DefaultTableModel) dbTable.getModel(), query); 
       reliapos.clearText(edit_nameTf, edit_emailTf, edit_addressTf, edit_numberTf, edit_bankTf, edit_taxTf );
    }//GEN-LAST:event_saveBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String name = add_nameTf.getText();
        String email = add_mailTf.getText();
        String address = add_adressTf.getText();
        String phnumber = add_numberTF.getText();
        String bankacc = add_bankTf.getText();
        String taxn = add_taxTf.getText();
        
        
        reliapos.addEmployee(name, email, address, phnumber, bankacc, taxn);
        reliapos.tb_load((DefaultTableModel) dbTable.getModel(), query); 
        reliapos.clearText(add_nameTf, add_mailTf, add_adressTf, add_numberTF, add_bankTf, add_taxTf);
    }//GEN-LAST:event_addBtnActionPerformed

    private void edit_searchTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_searchTfActionPerformed
       reliapos.searchRecord("employees", "ID", edit_searchTf.getText(), edit_nameTf, edit_emailTf, edit_addressTf, edit_numberTf, edit_bankTf, edit_taxTf);
    }//GEN-LAST:event_edit_searchTfActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
       reliapos.clearText(add_nameTf, add_mailTf, add_adressTf, add_numberTF, add_bankTf, add_taxTf);
    }//GEN-LAST:event_clearBtnActionPerformed

    private void savePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePDFActionPerformed
      reliapos.exportPDF(dbTable, "Employees");
    }//GEN-LAST:event_savePDFActionPerformed

    private void add_nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_nameTfActionPerformed
       
    }//GEN-LAST:event_add_nameTfActionPerformed

   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField add_adressTf;
    private javax.swing.JTextField add_bankTf;
    private javax.swing.JTextField add_mailTf;
    private javax.swing.JTextField add_nameTf;
    private javax.swing.JTextField add_numberTF;
    private javax.swing.JTextField add_taxTf;
    private javax.swing.JTextField all_addressTf;
    private javax.swing.JTextField all_mailTf;
    private javax.swing.JTextField all_nameTf;
    private javax.swing.JTextField all_numberTf;
    private javax.swing.JTextField all_searchTf;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTable dbTable;
    private javax.swing.JButton delBtn;
    private javax.swing.JTextField edit_addressTf;
    private javax.swing.JTextField edit_bankTf;
    private javax.swing.JTextField edit_emailTf;
    private javax.swing.JTextField edit_nameTf;
    private javax.swing.JTextField edit_numberTf;
    private javax.swing.JTextField edit_searchTf;
    private javax.swing.JTextField edit_taxTf;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JPanel p_addEmp;
    private javax.swing.JPanel p_allEmp;
    private javax.swing.JPanel p_editEmp;
    private javax.swing.JPanel p_manageEmp;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton savePDF;
    // End of variables declaration//GEN-END:variables
}
