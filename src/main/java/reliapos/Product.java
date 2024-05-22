package reliapos;

import java.awt.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Product extends javax.swing.JPanel {

    private ReliaPOS reliapos;
    private String query = "SELECT * FROM products";
   
    public Product() {
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
        all_groupTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        all_costTf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        all_salepriceTf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        all_quantityTf = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        savePDF = new javax.swing.JButton();
        p_manageEmp = new javax.swing.JPanel();
        p_addEmp = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        add_nameTf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        add_groupTf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        add_costTf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        add_salepriceTf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        add_quantityTf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        p_editEmp = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        edit_searchTf = new javax.swing.JTextField();
        delBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        edit_nameTf = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        edit_groupTf = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        edit_costTf = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        edit_salepriceTf = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        edit_quantityTf = new javax.swing.JTextField();

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
                "ID", "Name", "Group", "Cost", "SalePrice", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        all_searchTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        all_nameTf.setEditable(false);
        all_nameTf.setBackground(new java.awt.Color(72, 72, 72));
        all_nameTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        all_nameTf.setForeground(new java.awt.Color(255, 255, 255));
        all_nameTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        all_nameTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name :");

        all_groupTf.setEditable(false);
        all_groupTf.setBackground(new java.awt.Color(72, 72, 72));
        all_groupTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        all_groupTf.setForeground(new java.awt.Color(255, 255, 255));
        all_groupTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        all_groupTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Group :");

        all_costTf.setEditable(false);
        all_costTf.setBackground(new java.awt.Color(72, 72, 72));
        all_costTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        all_costTf.setForeground(new java.awt.Color(255, 255, 255));
        all_costTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        all_costTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cost :");

        all_salepriceTf.setEditable(false);
        all_salepriceTf.setBackground(new java.awt.Color(72, 72, 72));
        all_salepriceTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        all_salepriceTf.setForeground(new java.awt.Color(255, 255, 255));
        all_salepriceTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        all_salepriceTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sale price: ");

        all_quantityTf.setEditable(false);
        all_quantityTf.setBackground(new java.awt.Color(72, 72, 72));
        all_quantityTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        all_quantityTf.setForeground(new java.awt.Color(255, 255, 255));
        all_quantityTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        all_quantityTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Quantity: ");

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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(all_nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(all_groupTf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(all_costTf, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(all_salepriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(all_quantityTf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addComponent(savePDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(all_searchTf))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(all_nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(all_groupTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(all_costTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(all_salepriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(all_quantityTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("All Products", p_allEmp);

        p_manageEmp.setBackground(new java.awt.Color(72, 72, 72));

        p_addEmp.setBackground(new java.awt.Color(51, 51, 51));
        p_addEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Add Product");

        add_nameTf.setBackground(new java.awt.Color(72, 72, 72));
        add_nameTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add_nameTf.setForeground(new java.awt.Color(255, 255, 255));
        add_nameTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        add_nameTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Name:");

        add_groupTf.setBackground(new java.awt.Color(72, 72, 72));
        add_groupTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add_groupTf.setForeground(new java.awt.Color(255, 255, 255));
        add_groupTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        add_groupTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Group:");

        add_costTf.setBackground(new java.awt.Color(72, 72, 72));
        add_costTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add_costTf.setForeground(new java.awt.Color(255, 255, 255));
        add_costTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        add_costTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cost:");

        add_salepriceTf.setBackground(new java.awt.Color(72, 72, 72));
        add_salepriceTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add_salepriceTf.setForeground(new java.awt.Color(255, 255, 255));
        add_salepriceTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        add_salepriceTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sale Price:");

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

        add_quantityTf.setBackground(new java.awt.Color(72, 72, 72));
        add_quantityTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add_quantityTf.setForeground(new java.awt.Color(255, 255, 255));
        add_quantityTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        add_quantityTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Quantity:");

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
                    .addComponent(add_groupTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(add_costTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(add_salepriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addGroup(p_addEmpLayout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(add_quantityTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(287, Short.MAX_VALUE))
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
                .addComponent(add_groupTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_costTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_salepriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_quantityTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_addEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_editEmp.setBackground(new java.awt.Color(51, 51, 51));
        p_editEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Edit Product");

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Search:");

        edit_searchTf.setBackground(new java.awt.Color(72, 72, 72));
        edit_searchTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edit_searchTf.setForeground(new java.awt.Color(255, 255, 255));
        edit_searchTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
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

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Name:");

        edit_nameTf.setBackground(new java.awt.Color(72, 72, 72));
        edit_nameTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edit_nameTf.setForeground(new java.awt.Color(255, 255, 255));
        edit_nameTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        edit_nameTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Group:");

        edit_groupTf.setBackground(new java.awt.Color(72, 72, 72));
        edit_groupTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edit_groupTf.setForeground(new java.awt.Color(255, 255, 255));
        edit_groupTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        edit_groupTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cost:");

        edit_costTf.setBackground(new java.awt.Color(72, 72, 72));
        edit_costTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edit_costTf.setForeground(new java.awt.Color(255, 255, 255));
        edit_costTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        edit_costTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Sale Price:");

        edit_salepriceTf.setBackground(new java.awt.Color(72, 72, 72));
        edit_salepriceTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edit_salepriceTf.setForeground(new java.awt.Color(255, 255, 255));
        edit_salepriceTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        edit_salepriceTf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Quantity:");

        edit_quantityTf.setBackground(new java.awt.Color(72, 72, 72));
        edit_quantityTf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edit_quantityTf.setForeground(new java.awt.Color(255, 255, 255));
        edit_quantityTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)));
        edit_quantityTf.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p_editEmpLayout = new javax.swing.GroupLayout(p_editEmp);
        p_editEmp.setLayout(p_editEmpLayout);
        p_editEmpLayout.setHorizontalGroup(
            p_editEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_editEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_editEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel23)
                    .addComponent(edit_searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(edit_groupTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(edit_costTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(edit_salepriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(edit_quantityTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addGroup(p_editEmpLayout.createSequentialGroup()
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(286, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_groupTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_costTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_salepriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_quantityTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_editEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
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

        jTabbedPane1.addTab("Manage Products", p_manageEmp);

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
       reliapos.searchRecord("products", "ID", all_searchTf.getText(), all_nameTf, all_groupTf, all_costTf, all_salepriceTf, all_quantityTf);
    }//GEN-LAST:event_all_searchTfActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
       reliapos.deleteRecord("products", "ID", edit_searchTf.getText());
       reliapos.tb_load((DefaultTableModel) dbTable.getModel(), query); 
       reliapos.clearText(edit_nameTf, edit_groupTf, edit_costTf, edit_salepriceTf, edit_quantityTf);
    }//GEN-LAST:event_delBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
       String name = edit_nameTf.getText();
       String group = edit_groupTf.getText();
       String cost = edit_costTf.getText();
       String saleprice = edit_salepriceTf.getText();
       String quantity = edit_quantityTf.getText();
       String id = edit_searchTf.getText();
       
       reliapos.updateProduct(name, group, cost, saleprice, quantity, id);
       reliapos.tb_load((DefaultTableModel) dbTable.getModel(), query);  
       reliapos.clearText(edit_nameTf, edit_groupTf, edit_costTf, edit_salepriceTf, edit_quantityTf);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String name = add_nameTf.getText();
        String group = add_groupTf.getText();
        String cost = add_costTf.getText();
        String saleprice = add_salepriceTf.getText();
        String quantity = add_quantityTf.getText();
        
        reliapos.addProduct(name, group, cost, saleprice, quantity);
        reliapos.tb_load((DefaultTableModel) dbTable.getModel(), query);    
        reliapos.clearText(edit_nameTf, edit_groupTf, edit_costTf, edit_salepriceTf, edit_quantityTf);
    }//GEN-LAST:event_addBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        reliapos.clearText(edit_nameTf, edit_groupTf, edit_costTf, edit_salepriceTf, edit_quantityTf);
    }//GEN-LAST:event_clearBtnActionPerformed

    private void edit_searchTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_searchTfActionPerformed
        reliapos.searchRecord("products", "ID", edit_searchTf.getText(), edit_nameTf, edit_groupTf, edit_costTf, edit_salepriceTf, edit_quantityTf);
    }//GEN-LAST:event_edit_searchTfActionPerformed

    private void savePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePDFActionPerformed
        reliapos.exportPDF(dbTable, "Products");
    }//GEN-LAST:event_savePDFActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField add_costTf;
    private javax.swing.JTextField add_groupTf;
    private javax.swing.JTextField add_nameTf;
    private javax.swing.JTextField add_quantityTf;
    private javax.swing.JTextField add_salepriceTf;
    private javax.swing.JTextField all_costTf;
    private javax.swing.JTextField all_groupTf;
    private javax.swing.JTextField all_nameTf;
    private javax.swing.JTextField all_quantityTf;
    private javax.swing.JTextField all_salepriceTf;
    private javax.swing.JTextField all_searchTf;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTable dbTable;
    private javax.swing.JButton delBtn;
    private javax.swing.JTextField edit_costTf;
    private javax.swing.JTextField edit_groupTf;
    private javax.swing.JTextField edit_nameTf;
    private javax.swing.JTextField edit_quantityTf;
    private javax.swing.JTextField edit_salepriceTf;
    private javax.swing.JTextField edit_searchTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
