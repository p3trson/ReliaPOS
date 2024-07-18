package reliapos;

import javax.swing.table.DefaultTableModel;

public class Category extends javax.swing.JPanel{

    private ReliaPOS reliapos;
    private String query = "SELECT * FROM categories";
   
    public Category() {   
        reliapos = new ReliaPOS();
        initComponents();        
        reliapos.tb_load((DefaultTableModel) dbTable.getModel(), query);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layeredPane = new javax.swing.JLayeredPane();
        mainPanel = new javax.swing.JPanel();
        dbTablePane = new javax.swing.JScrollPane();
        dbTable = new javax.swing.JTable();
        searchLabel = new javax.swing.JLabel();
        searchTf = new javax.swing.JTextField();
        refreshBtn = new javax.swing.JButton();
        addBtnPanel = new javax.swing.JButton();
        editBtnPanel = new javax.swing.JButton();
        savePdfBtn = new javax.swing.JButton();
        addPanel = new javax.swing.JPanel();
        addCategory = new javax.swing.JLabel();
        add_nameTf = new javax.swing.JTextField();
        add_nameL = new javax.swing.JLabel();
        add_addBtn = new javax.swing.JButton();
        add_cancelBtn = new javax.swing.JButton();
        add_backBtn = new javax.swing.JButton();
        editPanel = new javax.swing.JPanel();
        editCategory = new javax.swing.JLabel();
        edit_nameTf = new javax.swing.JTextField();
        edit_nameL = new javax.swing.JLabel();
        edit_saveBtn = new javax.swing.JButton();
        edit_cancelBtn = new javax.swing.JButton();
        edit_searchTf = new javax.swing.JTextField();
        edit_searchL = new javax.swing.JLabel();
        edit_deleteBtn = new javax.swing.JButton();
        edit_backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(52, 52, 52));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        layeredPane.setBackground(new java.awt.Color(52, 52, 52));
        layeredPane.setPreferredSize(new java.awt.Dimension(1280, 720));

        mainPanel.setBackground(new java.awt.Color(42, 42, 42));

        dbTablePane.setBackground(new java.awt.Color(51, 51, 51));

        dbTable.setAutoCreateRowSorter(true);
        dbTable.setBackground(new java.awt.Color(42, 42, 42));
        dbTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dbTable.setForeground(new java.awt.Color(255, 255, 255));
        dbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
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
        dbTable.setRowSelectionAllowed(false);
        dbTablePane.setViewportView(dbTable);

        searchLabel.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchLabel.setText("Search :");

        searchTf.setBackground(new java.awt.Color(40, 40, 40));
        searchTf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        searchTf.setForeground(new java.awt.Color(255, 255, 255));
        searchTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));
        searchTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTfActionPerformed(evt);
            }
        });

        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Refresh.png"))); // NOI18N
        refreshBtn.setBorder(null);
        refreshBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Rollover refresh.png"))); // NOI18N
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        addBtnPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        addBtnPanel.setBorder(null);
        addBtnPanel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Rollover add.png"))); // NOI18N
        addBtnPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnPanelActionPerformed(evt);
            }
        });

        editBtnPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Edit.png"))); // NOI18N
        editBtnPanel.setBorder(null);
        editBtnPanel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Rollover edit.png"))); // NOI18N
        editBtnPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnPanelActionPerformed(evt);
            }
        });

        savePdfBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save PDF.png"))); // NOI18N
        savePdfBtn.setBorder(null);
        savePdfBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Rollover pdf.png"))); // NOI18N
        savePdfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePdfBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dbTablePane, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(savePdfBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(searchLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savePdfBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(searchTf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dbTablePane, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );

        addPanel.setBackground(new java.awt.Color(42, 42, 42));
        addPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));
        addPanel.setVisible(false);

        addCategory.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addCategory.setForeground(new java.awt.Color(255, 255, 255));
        addCategory.setText("Add Category");

        add_nameTf.setBackground(new java.awt.Color(40, 40, 40));
        add_nameTf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add_nameTf.setForeground(new java.awt.Color(255, 255, 255));
        add_nameTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));
        add_nameTf.setCaretColor(new java.awt.Color(255, 255, 255));

        add_nameL.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        add_nameL.setForeground(new java.awt.Color(255, 255, 255));
        add_nameL.setText("Name:");

        add_addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        add_addBtn.setBorder(null);
        add_addBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Rollover add.png"))); // NOI18N
        add_addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_addBtnActionPerformed(evt);
            }
        });

        add_cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel.png"))); // NOI18N
        add_cancelBtn.setBorder(null);
        add_cancelBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Rollover Cancel.png"))); // NOI18N
        add_cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_cancelBtnActionPerformed(evt);
            }
        });

        add_backBtn.setBackground(new java.awt.Color(42, 42, 42));
        add_backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Back.png"))); // NOI18N
        add_backBtn.setBorder(null);
        add_backBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Rollover back.png"))); // NOI18N
        add_backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(addCategory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add_backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_nameL)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(add_addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(add_cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add_nameL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 499, Short.MAX_VALUE)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        editPanel.setBackground(new java.awt.Color(42, 42, 42));
        editPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));
        editPanel.setVisible(false);

        editCategory.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        editCategory.setForeground(new java.awt.Color(255, 255, 255));
        editCategory.setText("Edit Category");

        edit_nameTf.setBackground(new java.awt.Color(40, 40, 40));
        edit_nameTf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edit_nameTf.setForeground(new java.awt.Color(255, 255, 255));
        edit_nameTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));
        edit_nameTf.setCaretColor(new java.awt.Color(255, 255, 255));

        edit_nameL.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        edit_nameL.setForeground(new java.awt.Color(255, 255, 255));
        edit_nameL.setText("Name:");

        edit_saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save.png"))); // NOI18N
        edit_saveBtn.setBorder(null);
        edit_saveBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Rollover save.png"))); // NOI18N
        edit_saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_saveBtnActionPerformed(evt);
            }
        });

        edit_cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel.png"))); // NOI18N
        edit_cancelBtn.setBorder(null);
        edit_cancelBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Rollover Cancel.png"))); // NOI18N
        edit_cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_cancelBtnActionPerformed(evt);
            }
        });

        edit_searchTf.setBackground(new java.awt.Color(40, 40, 40));
        edit_searchTf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edit_searchTf.setForeground(new java.awt.Color(255, 255, 255));
        edit_searchTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));
        edit_searchTf.setCaretColor(new java.awt.Color(255, 255, 255));
        edit_searchTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_searchTfActionPerformed(evt);
            }
        });

        edit_searchL.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        edit_searchL.setForeground(new java.awt.Color(255, 255, 255));
        edit_searchL.setText("Search by name:");

        edit_deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Delete.png"))); // NOI18N
        edit_deleteBtn.setBorder(null);
        edit_deleteBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Rollover delete.png"))); // NOI18N
        edit_deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_deleteBtnActionPerformed(evt);
            }
        });

        edit_backBtn.setBackground(new java.awt.Color(42, 42, 42));
        edit_backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Back.png"))); // NOI18N
        edit_backBtn.setBorder(null);
        edit_backBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Rollover back.png"))); // NOI18N
        edit_backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addComponent(editCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(edit_backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit_searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit_searchL)
                            .addComponent(edit_nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit_nameL)
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addComponent(edit_saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edit_cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edit_deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edit_searchL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edit_nameL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 428, Short.MAX_VALUE)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edit_saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edit_cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        layeredPane.setLayer(mainPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(addPanel, javax.swing.JLayeredPane.POPUP_LAYER);
        layeredPane.setLayer(editPanel, javax.swing.JLayeredPane.POPUP_LAYER);

        javax.swing.GroupLayout layeredPaneLayout = new javax.swing.GroupLayout(layeredPane);
        layeredPane.setLayout(layeredPaneLayout);
        layeredPaneLayout.setHorizontalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPaneLayout.createSequentialGroup()
                    .addGap(0, 890, Short.MAX_VALUE)
                    .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPaneLayout.createSequentialGroup()
                    .addGap(0, 890, Short.MAX_VALUE)
                    .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layeredPaneLayout.setVerticalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(editPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnPanelActionPerformed
        reliapos.slideInPanel(layeredPane, addPanel, dbTable);
    }//GEN-LAST:event_addBtnPanelActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        reliapos.tb_load((DefaultTableModel) dbTable.getModel(), query);
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void edit_saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_saveBtnActionPerformed
        String name = edit_nameTf.getText();       
        String id = edit_searchTf.getText();
        
        reliapos.updateCategory(name, id);
        reliapos.tb_load((DefaultTableModel) dbTable.getModel(), query);
        reliapos.clearText(edit_nameTf);
    }//GEN-LAST:event_edit_saveBtnActionPerformed

    private void edit_cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_cancelBtnActionPerformed
       editPanel.setVisible(false); 
    }//GEN-LAST:event_edit_cancelBtnActionPerformed

    private void editBtnPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnPanelActionPerformed
       reliapos.slideInPanel(layeredPane, editPanel, dbTable);
    }//GEN-LAST:event_editBtnPanelActionPerformed

    private void edit_searchTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_searchTfActionPerformed
       reliapos.searchRecord("categories", "Name", edit_searchTf.getText(), edit_nameTf);
    }//GEN-LAST:event_edit_searchTfActionPerformed

    private void edit_deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_deleteBtnActionPerformed
        reliapos.deleteRecord("categories", "Name", edit_searchTf.getText());
        reliapos.tb_load((DefaultTableModel) dbTable.getModel(), query);
        reliapos.clearText(edit_nameTf);
    }//GEN-LAST:event_edit_deleteBtnActionPerformed

    private void searchTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTfActionPerformed
        reliapos.searchRecordInTable("categories", "Name", searchTf.getText(), dbTable);
    }//GEN-LAST:event_searchTfActionPerformed

    private void savePdfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePdfBtnActionPerformed
        reliapos.exportPDF(dbTable, "categories");
    }//GEN-LAST:event_savePdfBtnActionPerformed

    private void add_cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_cancelBtnActionPerformed
        addPanel.setVisible(false);
    }//GEN-LAST:event_add_cancelBtnActionPerformed

    private void add_addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_addBtnActionPerformed
        String name = add_nameTf.getText();

        reliapos.addCategory(name);
        reliapos.tb_load((DefaultTableModel) dbTable.getModel(), query);
        reliapos.clearText(add_nameTf);
    }//GEN-LAST:event_add_addBtnActionPerformed

    private void add_backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_backBtnActionPerformed
        addPanel.setVisible(false);
    }//GEN-LAST:event_add_backBtnActionPerformed

    private void edit_backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_backBtnActionPerformed
        editPanel.setVisible(false);
    }//GEN-LAST:event_edit_backBtnActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtnPanel;
    private javax.swing.JLabel addCategory;
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton add_addBtn;
    private javax.swing.JButton add_backBtn;
    private javax.swing.JButton add_cancelBtn;
    private javax.swing.JLabel add_nameL;
    private javax.swing.JTextField add_nameTf;
    private javax.swing.JTable dbTable;
    private javax.swing.JScrollPane dbTablePane;
    private javax.swing.JButton editBtnPanel;
    private javax.swing.JLabel editCategory;
    private javax.swing.JPanel editPanel;
    private javax.swing.JButton edit_backBtn;
    private javax.swing.JButton edit_cancelBtn;
    private javax.swing.JButton edit_deleteBtn;
    private javax.swing.JLabel edit_nameL;
    private javax.swing.JTextField edit_nameTf;
    private javax.swing.JButton edit_saveBtn;
    private javax.swing.JLabel edit_searchL;
    private javax.swing.JTextField edit_searchTf;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton savePdfBtn;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField searchTf;
    // End of variables declaration//GEN-END:variables
}
