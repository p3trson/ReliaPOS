package reliapos;



public class CashRegister extends javax.swing.JPanel {

    public CashRegister() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productList = new javax.swing.JPanel();
        checkoutPanel = new javax.swing.JPanel();
        categoryListPanel = new javax.swing.JPanel();
        productListPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(92, 92, 92));

        productList.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout productListLayout = new javax.swing.GroupLayout(productList);
        productList.setLayout(productListLayout);
        productListLayout.setHorizontalGroup(
            productListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        productListLayout.setVerticalGroup(
            productListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        checkoutPanel.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout checkoutPanelLayout = new javax.swing.GroupLayout(checkoutPanel);
        checkoutPanel.setLayout(checkoutPanelLayout);
        checkoutPanelLayout.setHorizontalGroup(
            checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        checkoutPanelLayout.setVerticalGroup(
            checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
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

        productListPanel.setBackground(new java.awt.Color(40, 40, 40));
        productListPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productListPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout productListPanelLayout = new javax.swing.GroupLayout(productListPanel);
        productListPanel.setLayout(productListPanelLayout);
        productListPanelLayout.setHorizontalGroup(
            productListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
        );
        productListPanelLayout.setVerticalGroup(
            productListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout categoryListPanelLayout = new javax.swing.GroupLayout(categoryListPanel);
        categoryListPanel.setLayout(categoryListPanelLayout);
        categoryListPanelLayout.setHorizontalGroup(
            categoryListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        categoryListPanelLayout.setVerticalGroup(
            categoryListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(productList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(checkoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(categoryListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void categoryListPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryListPanelMouseClicked
        
    }//GEN-LAST:event_categoryListPanelMouseClicked

    private void productListPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productListPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_productListPanelMouseClicked

    private void categoryListPanelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_categoryListPanelComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryListPanelComponentAdded

     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel categoryListPanel;
    private javax.swing.JPanel checkoutPanel;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel productList;
    private javax.swing.JPanel productListPanel;
    // End of variables declaration//GEN-END:variables
}
