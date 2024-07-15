package reliapos;

import com.formdev.flatlaf.FlatDarkLaf;

public class Home extends javax.swing.JFrame {
    
    private ReliaPOS reliapos;
    private JpanelLoader panelLoader;
    private Employee em;
    private Product pr;
    private Category cr;
    private PaymentType pt;
    private CashRegister ch;
            
    public Home() {
        reliapos = new ReliaPOS();
        panelLoader = new JpanelLoader();
        em = new Employee();
        pr = new Product();
        cr = new Category();
        pt = new PaymentType();
        ch = new CashRegister(false);
        initComponents();
        this.setExtendedState(Home.MAXIMIZED_BOTH);        
        panelLoader.jPanelLoader(loadPanel, em);
        company.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane = new javax.swing.JLayeredPane();
        company = new javax.swing.JPanel();
        companyL = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        nameL = new javax.swing.JLabel();
        mailTf = new javax.swing.JTextField();
        emailL = new javax.swing.JLabel();
        addressTf = new javax.swing.JTextField();
        addressL = new javax.swing.JLabel();
        numberTf = new javax.swing.JTextField();
        numberL = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        homeIcon = new javax.swing.JLabel();
        tabName = new javax.swing.JLabel();
        settingsBtn = new javax.swing.JButton();
        categoryPanel = new javax.swing.JPanel();
        employeeBtn = new javax.swing.JToggleButton();
        productBtn = new javax.swing.JToggleButton();
        categoryBtn = new javax.swing.JToggleButton();
        paymentBtn = new javax.swing.JToggleButton();
        cashierBtn = new javax.swing.JToggleButton();
        loadPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        company.setBackground(new java.awt.Color(42, 42, 42));
        company.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));
        company.setPreferredSize(new java.awt.Dimension(390, 720));
        company.setVisible(false);

        companyL.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        companyL.setForeground(new java.awt.Color(255, 255, 255));
        companyL.setText("Company settings");

        nameTf.setBackground(new java.awt.Color(40, 40, 40));
        nameTf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameTf.setForeground(new java.awt.Color(255, 255, 255));
        nameTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));
        nameTf.setCaretColor(new java.awt.Color(255, 255, 255));

        nameL.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        nameL.setForeground(new java.awt.Color(255, 255, 255));
        nameL.setText("Name:");

        mailTf.setBackground(new java.awt.Color(40, 40, 40));
        mailTf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mailTf.setForeground(new java.awt.Color(255, 255, 255));
        mailTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));
        mailTf.setCaretColor(new java.awt.Color(255, 255, 255));

        emailL.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        emailL.setForeground(new java.awt.Color(255, 255, 255));
        emailL.setText("E-mail:");

        addressTf.setBackground(new java.awt.Color(40, 40, 40));
        addressTf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addressTf.setForeground(new java.awt.Color(255, 255, 255));
        addressTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));
        addressTf.setCaretColor(new java.awt.Color(255, 255, 255));

        addressL.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        addressL.setForeground(new java.awt.Color(255, 255, 255));
        addressL.setText("Address:");

        numberTf.setBackground(new java.awt.Color(40, 40, 40));
        numberTf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        numberTf.setForeground(new java.awt.Color(255, 255, 255));
        numberTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 92, 92)));
        numberTf.setCaretColor(new java.awt.Color(255, 255, 255));

        numberL.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        numberL.setForeground(new java.awt.Color(255, 255, 255));
        numberL.setText("Phone number:");

        cancelBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Cancel.png")); // NOI18N
        cancelBtn.setBorder(null);
        cancelBtn.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover Cancel.png")); // NOI18N
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(42, 42, 42));
        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Back.png")); // NOI18N
        backBtn.setBorder(null);
        backBtn.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover back.png")); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        saveBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Save.png")); // NOI18N
        saveBtn.setBorder(null);
        saveBtn.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover save.png")); // NOI18N
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout companyLayout = new javax.swing.GroupLayout(company);
        company.setLayout(companyLayout);
        companyLayout.setHorizontalGroup(
            companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(companyLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(companyLayout.createSequentialGroup()
                        .addComponent(companyL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(111, 111, 111)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(companyLayout.createSequentialGroup()
                        .addGroup(companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameL)
                            .addComponent(mailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailL)
                            .addComponent(addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressL)
                            .addComponent(numberTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberL)
                            .addGroup(companyLayout.createSequentialGroup()
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        companyLayout.setVerticalGroup(
            companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(companyLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companyL, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addressL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numberL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addGroup(companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        mainPanel.setBackground(new java.awt.Color(92, 92, 92));

        topPanel.setBackground(new java.awt.Color(42, 42, 42));

        homeIcon.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        homeIcon.setForeground(new java.awt.Color(255, 255, 255));
        homeIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Downloads\\system-solid-41-home (2).png")); // NOI18N

        tabName.setBackground(new java.awt.Color(42, 42, 42));
        tabName.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tabName.setForeground(new java.awt.Color(255, 255, 255));
        tabName.setText("Employees");

        settingsBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Settings.png")); // NOI18N
        settingsBtn.setBorder(null);
        settingsBtn.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Settings rollover.png")); // NOI18N
        settingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(homeIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 984, Short.MAX_VALUE)
                .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(tabName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        categoryPanel.setBackground(new java.awt.Color(42, 42, 42));

        employeeBtn.setBackground(new java.awt.Color(52, 52, 52));
        buttonGroup1.add(employeeBtn);
        employeeBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Employee.png")); // NOI18N
        employeeBtn.setSelected(true);
        employeeBtn.setBorder(null);
        employeeBtn.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover employees.png")); // NOI18N
        employeeBtn.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover employees.png")); // NOI18N
        employeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeBtnActionPerformed(evt);
            }
        });

        productBtn.setBackground(new java.awt.Color(52, 52, 52));
        buttonGroup1.add(productBtn);
        productBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Products.png")); // NOI18N
        productBtn.setBorder(null);
        productBtn.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover products.png")); // NOI18N
        productBtn.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover products.png")); // NOI18N
        productBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productBtnActionPerformed(evt);
            }
        });

        categoryBtn.setBackground(new java.awt.Color(52, 52, 52));
        buttonGroup1.add(categoryBtn);
        categoryBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Categories.png")); // NOI18N
        categoryBtn.setBorder(null);
        categoryBtn.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover categories.png")); // NOI18N
        categoryBtn.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover categories.png")); // NOI18N
        categoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryBtnActionPerformed(evt);
            }
        });

        paymentBtn.setBackground(new java.awt.Color(52, 52, 52));
        buttonGroup1.add(paymentBtn);
        paymentBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Payments.png")); // NOI18N
        paymentBtn.setBorder(null);
        paymentBtn.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover payments.png")); // NOI18N
        paymentBtn.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover payments.png")); // NOI18N
        paymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBtnActionPerformed(evt);
            }
        });

        cashierBtn.setBackground(new java.awt.Color(52, 52, 52));
        buttonGroup1.add(cashierBtn);
        cashierBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Cashier.png")); // NOI18N
        cashierBtn.setBorder(null);
        cashierBtn.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover cashier.png")); // NOI18N
        cashierBtn.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\kostak\\Documents\\NetBeansProjects\\ReliaPOS\\src\\main\\java\\icons\\Rollover cashier.png")); // NOI18N
        cashierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout categoryPanelLayout = new javax.swing.GroupLayout(categoryPanel);
        categoryPanel.setLayout(categoryPanelLayout);
        categoryPanelLayout.setHorizontalGroup(
            categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoryPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(productBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employeeBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paymentBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashierBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        categoryPanelLayout.setVerticalGroup(
            categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryPanelLayout.createSequentialGroup()
                .addComponent(employeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(productBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(categoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cashierBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loadPanel.setBackground(new java.awt.Color(42, 42, 42));
        loadPanel.setPreferredSize(new java.awt.Dimension(1280, 720));

        javax.swing.GroupLayout loadPanelLayout = new javax.swing.GroupLayout(loadPanel);
        loadPanel.setLayout(loadPanelLayout);
        loadPanelLayout.setHorizontalGroup(
            loadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1029, Short.MAX_VALUE)
        );
        loadPanelLayout.setVerticalGroup(
            loadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(categoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(loadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                    .addComponent(categoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jLayeredPane.setLayer(company, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(mainPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneLayout = new javax.swing.GroupLayout(jLayeredPane);
        jLayeredPane.setLayout(jLayeredPaneLayout);
        jLayeredPaneLayout.setHorizontalGroup(
            jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPaneLayout.createSequentialGroup()
                    .addGap(0, 891, Short.MAX_VALUE)
                    .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jLayeredPaneLayout.setVerticalGroup(
            jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(company, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void employeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeBtnActionPerformed
        panelLoader.jPanelLoader(loadPanel, em);
        updateTabName("Employees");
    }//GEN-LAST:event_employeeBtnActionPerformed

    private void productBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productBtnActionPerformed
        panelLoader.jPanelLoader(loadPanel, pr);
        updateTabName("Products");
    }//GEN-LAST:event_productBtnActionPerformed

    private void categoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryBtnActionPerformed
        panelLoader.jPanelLoader(loadPanel, cr);
        updateTabName("Categories");
    }//GEN-LAST:event_categoryBtnActionPerformed

    private void paymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBtnActionPerformed
        panelLoader.jPanelLoader(loadPanel, pt);
        updateTabName("Payments");
    }//GEN-LAST:event_paymentBtnActionPerformed

    private void cashierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashierBtnActionPerformed
        panelLoader.jPanelLoader(mainPanel, ch);
    }//GEN-LAST:event_cashierBtnActionPerformed

    private void settingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsBtnActionPerformed
        reliapos.slideInPanel2(jLayeredPane, company);
        reliapos.LoadCompanySettings(nameTf, mailTf, addressTf, numberTf);
        updateTabName("Settings");
    }//GEN-LAST:event_settingsBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        company.setVisible(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        company.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String name = nameTf.getText();
        String email = mailTf.getText();
        String address = addressTf.getText();
        String phnumber = numberTf.getText();
        
        reliapos.companySettings(name, email, address, phnumber);
    }//GEN-LAST:event_saveBtnActionPerformed

    
    private void updateTabName(String panelName) {
        tabName.setText(panelName);
    }
    
    public static void main(String args[]) {        
        FlatDarkLaf.setup();
                   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressL;
    private javax.swing.JTextField addressTf;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JToggleButton cashierBtn;
    private javax.swing.JToggleButton categoryBtn;
    private javax.swing.JPanel categoryPanel;
    private javax.swing.JPanel company;
    private javax.swing.JLabel companyL;
    private javax.swing.JLabel emailL;
    private javax.swing.JToggleButton employeeBtn;
    private javax.swing.JLabel homeIcon;
    public javax.swing.JLayeredPane jLayeredPane;
    private javax.swing.JPanel loadPanel;
    private javax.swing.JTextField mailTf;
    public javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameL;
    private javax.swing.JTextField nameTf;
    private javax.swing.JLabel numberL;
    private javax.swing.JTextField numberTf;
    private javax.swing.JToggleButton paymentBtn;
    private javax.swing.JToggleButton productBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton settingsBtn;
    private javax.swing.JLabel tabName;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
