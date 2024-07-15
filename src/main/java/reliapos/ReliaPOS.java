package reliapos;

import java.sql.*;
import java.text.MessageFormat;
import java.util.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ReliaPOS {
    
    public void addEmployee(String name, String email, String address, String phnumber, String bankacc, String password) {        
        String namePattern = "^[a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+(?: [a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+)*$";
        String emailPattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        String phonePattern = "^\\+\\d{9,}$";
        String bankPattern = "^\\d{6,}/\\d{4}$";
        String passwordPattern = "^[a-zA-Z0-9]{8,}$";
    
    
        if (!name.matches(namePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid name format. Format should be: First Name - Last Name");
        return;
        }
        
        if (!email.matches(emailPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid email format. Format should be: example@example.com");
        return;
        }
        
        if (!phnumber.matches(phonePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid phone number format. Format should be: +000000000");
        return;
        }
        
        if (!bankacc.matches(bankPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid bank account format. Format should be: 000000000/0000");
        return;
        }      
        
        if (!password.matches(passwordPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid password format. Password should contain atleast 8 characters");
        return;
        }      
        
        Statement s = null;
                
        try {
            
            s = DB.connect().createStatement();
            s.executeUpdate("INSERT INTO employees (Name, `E-mail`, Address, `Phone number`, `Bank account`, Password) VALUES ('" + name + "', '" + email + "', '" + address + "', '" + phnumber + "', '" + bankacc + "', '" + password + "')");
           
            JOptionPane.showMessageDialog(null, "Employee sucessfully added !");
            
            
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
    
    public void updateEmployee(String name, String email, String address, String phnumber, String bankacc, String id, String password) {     
        String namePattern = "^[a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+(?: [a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+)*$";
        String emailPattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        String phonePattern = "^\\+\\d{9,}$";
        String bankPattern = "^\\d{6,}/\\d{4}$";
        String passwordPattern = "^[a-zA-Z0-9]{8,}$";
    
        if (!name.matches(namePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid name format. Format should be: First Name - Last Name");
        return;
        }
        
        if (!email.matches(emailPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid email format. Format should be: example@example.com");
        return;
        }
        
        if (!phnumber.matches(phonePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid phone number format. Format should be: +000000000");
        return;
        }
        
        if (!bankacc.matches(bankPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid bank account format. Format should be: 000000000/0000");
        return;
        }
        
        if (!password.matches(passwordPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid password format. Password should contain atleast 8 characters");
        return;
        }      
        
        Statement s = null;
       
        try {
            
        s = DB.connect().createStatement();
        s.executeUpdate("UPDATE employees SET Name = '" + name + "', `E-mail` = '" + email + "', Address =  '" + address + "', `Phone number` = '" + phnumber + "', `Bank account` = '" +bankacc + "', Password = '" + password + "'WHERE Name = '" + id + "'");
           
        JOptionPane.showMessageDialog(null, "Employee sucessfully updated !");
        
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }              
   }
    
    public void addProduct(String name, String category, String cost, String saleprice, String quantity) {  
        String namePattern = "^[a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+(?: [a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+)*$";        
        String costPattern = "^[0-9]+(\\.[0-9]{1,2})?$";
        String salepricePattern = "^[0-9]+(\\.[0-9]{1,2})?$";
        String quantityPattern = "^[0-9]+$";
           
        if (!name.matches(namePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid product name format.");
        return;
        }
                     
        if (!cost.matches(costPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid cost format. Format should be a number with up to 2 decimal places.");
        return;
        }
        
        if (!saleprice.matches(salepricePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid sale price format. Format should be a number with up to 2 decimal places.");
        return;
        }
        
        if (!quantity.matches(quantityPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid quantity format. Format should be an integer.");
        return;
        }
        
        Statement s = null;
                
        try {
            
            s = DB.connect().createStatement();
            s.executeUpdate("INSERT INTO products (Name, Category, Cost, SalePrice, Quantity) VALUES ('" + name + "', '" + category + "', '" + cost + "', '" + saleprice + "', '" + quantity + "')");
           
            JOptionPane.showMessageDialog(null, "Product sucessfully added !");
            
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
    
    public void updateProduct(String name, String category, String cost, String saleprice, String quantity, String id) {
        String namePattern = "^[a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+(?: [a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+)*$";
        String costPattern = "^[0-9]+(\\.[0-9]{1,2})?$";
        String salepricePattern = "^[0-9]+(\\.[0-9]{1,2})?$";
        String quantityPattern = "^[0-9]+$";
          
        if (!name.matches(namePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid product name format.");
        return;
        }
        
        
        if (!cost.matches(costPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid cost format. Format should be a number with up to 2 decimal places.");
        return;
        }
        
        if (!saleprice.matches(salepricePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid sale price format. Format should be a number with up to 2 decimal places.");
        return;
        }
        
        if (!quantity.matches(quantityPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid quantity format. Format should be an integer.");
        return;
        }
        
        Statement s = null;
       
        try {
            
        s = DB.connect().createStatement();
        s.executeUpdate("UPDATE products SET Name = '" + name + "', Category = '" + category + "', Cost =  '" + cost + "', SalePrice = '" + saleprice + "', Quantity = '" + quantity + "' WHERE Name = '" + id + "'");
           
        JOptionPane.showMessageDialog(null, "Product sucessfully updated !");
        
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }              
   }
    
    public void addCategory (String name) { 
        String namePattern = "^[a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+(?: [a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+)*$";
      
        if (!name.matches(namePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid category name format.");
        return;
        }
        
        Statement s = null;
                
        try {
            
            s = DB.connect().createStatement();
            s.executeUpdate("INSERT INTO categories (Name) VALUES ('" + name + "')");
           
            JOptionPane.showMessageDialog(null, "Category sucessfully added !");
            
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
    
    public void updateCategory(String name,String id) {
        String namePattern = "^[a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+(?: [a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+)*$";
        
        if (!name.matches(namePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid category name format.");
        return;
        }
            
        Statement s = null;
       
        try {
            
        s = DB.connect().createStatement();
        s.executeUpdate("UPDATE categories SET Name = '" + name + "' WHERE Name = '" + id + "'");
           
        JOptionPane.showMessageDialog(null, "Category sucessfully updated !");
        
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }              
   }
    
    public void loadCategoriesIntoComboBox(JComboBox<String> comboBox) {
        comboBox.removeAllItems();
        Statement s = null;
        ResultSet rs = null;

        try {
            s = DB.connect().createStatement();
            rs = s.executeQuery("SELECT Name FROM categories");

            while (rs.next()) {
                comboBox.addItem(rs.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
            if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
    
    public void addPaymentType(String name, String code) {        
        String namePattern = "^[a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+(?: [a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+)*$";
        String codePattern = "^[0-9]+$";
            
        if (!name.matches(namePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid name format. Format should be only in letters.");
        return;
        }
        
        if (!code.matches(codePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid code format. Format should be only numbers.");
        return;
        }
        
        Statement s = null;
                
        try {
            
            s = DB.connect().createStatement();
            s.executeUpdate("INSERT INTO paymenttypes (Name, Code) VALUES ('" + name + "', '" + code + "')");
           
            JOptionPane.showMessageDialog(null, "Payment type sucessfully added !");
            
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
    
    public void updatePaymentTypes(String name, String code, String id) {
        String namePattern = "^[a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+(?: [a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+)*$";
        String codePattern = "^[0-9]+$";
       
        if (!name.matches(namePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid product name format.");
        return;
        }
        
        if (!code.matches(codePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid code format. Format should be only numbers.");
        return;
        }
        
        Statement s = null;
       
        try {
            
        s = DB.connect().createStatement();
        s.executeUpdate("UPDATE paymenttypes SET Name = '" + name + "', Code = '" + code + "' WHERE Name = '" + id + "'");
           
        JOptionPane.showMessageDialog(null, "Payment type sucessfully updated !");
        
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }              
   }
    
    public void loadPaymentTypesIntoComboBox(JComboBox<String> comboBox) {
        comboBox.removeAllItems();
        Statement s = null;
        ResultSet rs = null;

        try {
            s = DB.connect().createStatement();
            rs = s.executeQuery("SELECT Name FROM paymenttypes");

            while (rs.next()) {
                comboBox.addItem(rs.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
            if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
    
    public void deleteRecord(String tableName, String columnName, String columnValue) {
        Statement s = null;
        
        try {
            Connection conn = DB.connect();                                
            s = conn.createStatement();
            String query = "DELETE FROM " + tableName + " WHERE " + columnName + " = '" + columnValue + "'";
            s.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "Record successfully deleted from " + tableName + "!");
            
        } catch (SQLException e) {
            e.printStackTrace();           
        } finally {
            if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
    
    public void clearText(JTextField... textFields) {
        for (JTextField tf : textFields) {
        tf.setText("");
            }
        }
    
    public void exportPDF(JTable table, String className) {
        String title = "" + className + " list";
        MessageFormat header = new MessageFormat(title);
        MessageFormat footer = new MessageFormat("{0}");

        try {
            PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
            set.add(OrientationRequested.LANDSCAPE);
            table.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, set, true);
            JOptionPane.showMessageDialog(null,"Printed Successfully");
        } catch (java.awt.print.PrinterException e) {
            JOptionPane.showMessageDialog(null,"Failed to Print");
        }
    } 
    
    public void searchRecord(String tableName, String columnName, String searchValue,JTextField... textFields) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DB.connect();
            stmt = conn.createStatement();

            String query = "SELECT * FROM " + tableName + " WHERE " + columnName + " = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, searchValue);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                              
                for (int i = 0; i < textFields.length; i++) {
                    textFields[i].setText(rs.getString(i + 2));
                }
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Record not found in " + tableName + "!");
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
    }
    
   public void searchRecord(String tableName, String columnName, String searchValue, JComboBox<String> categoryComboBox, JTextField... textFields) {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        conn = DB.connect();
        stmt = conn.createStatement();

        String query = "SELECT * FROM " + tableName + " WHERE " + columnName + " = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, searchValue);
        rs = pstmt.executeQuery();

        if (rs.next()) {           
            textFields[0].setText(rs.getString("Name"));
            categoryComboBox.setSelectedItem(rs.getString("Category"));
            textFields[1].setText(rs.getString("Cost")); 
            textFields[2].setText(rs.getString("SalePrice"));
            textFields[3].setText(rs.getString("Quantity"));
        } else {
            JOptionPane.showMessageDialog(null, "Record not found in " + tableName + "!");
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
}
    
    public void searchRecordInTable(String tableName, String columnName, String searchValue, JTable table) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DB.connect();

            String query = "SELECT * FROM " + tableName + " WHERE " + columnName + " = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, searchValue);
            rs = pstmt.executeQuery();

           
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            
            DefaultTableModel model = new DefaultTableModel();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(rsmd.getColumnName(i));
            }

            
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            
            table.setModel(model);

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Record not found in " + tableName + "!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void tb_load(DefaultTableModel tableModel, String query) {        
        Statement s = null;
        ResultSet rs = null;
        
        try {
            tableModel.setRowCount(0);
            s = DB.connect().createStatement();
            rs = s.executeQuery(query);

            int columnCount = rs.getMetaData().getColumnCount();
            
            while (rs.next()) {
                Vector<String> row = new Vector<>();
                for (int i = 1; i <= columnCount; i++) {
                    row.add(rs.getString(i));
                }
                tableModel.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (s != null) s.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void slideInPanel(JLayeredPane layeredPane, JPanel panel, JComponent table) {
    if (!panel.isVisible()) {       
        layeredPane.setLayer(table, JLayeredPane.MODAL_LAYER);
        layeredPane.setLayer(panel, JLayeredPane.PALETTE_LAYER);
        panel.setVisible(true);
    }
}
     public void slideInPanel2(JLayeredPane layeredPane, JPanel panel) {
    if (!panel.isVisible()) {               
        layeredPane.setLayer(panel, JLayeredPane.PALETTE_LAYER);
        panel.setVisible(true);
    } else { 
        panel.setVisible(false);
    }    
}
    
    public void companySettings(String name, String email, String address, String phnumber) {        
        String emailPattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        String phonePattern = "^\\+\\d{9,}$";
        
        if (!email.matches(emailPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid email format. Format should be: example@example.com");
        return;
        }
        
        if (!phnumber.matches(phonePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid phone number format. Format should be: +000000000");
        return;
        }     
        
        Statement s = null;
                
        try {           
            s = DB.connect().createStatement();
            s.executeUpdate("INSERT INTO company (Name, `E-mail`, Address, `Phone number`) VALUES ('" + name + "', '" + email + "', '" + address + "', '" + phnumber + "')");
           
            JOptionPane.showMessageDialog(null, "Company information sucessfully updated !");
            
            
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
    
    public void LoadCompanySettings(JTextField nameTf, JTextField emailTf, JTextField addressTf, JTextField phoneNumberTf) {                 
        Statement s = null;
        ResultSet rs = null;
                
        try {           
            s = DB.connect().createStatement();
            rs = s.executeQuery("SELECT * FROM company ");

            if (rs.next()) {
            String name = rs.getString("Name");
            String email = rs.getString("E-mail");
            String address = rs.getString("Address");
            String phoneNumber = rs.getString("Phone number");
            

            nameTf.setText(name);
            emailTf.setText(email);
            addressTf.setText(address);
            phoneNumberTf.setText(phoneNumber);            
          }  
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
   
}




