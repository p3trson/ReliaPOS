package reliapos;


import java.io.File;
import java.sql.*;
import java.text.MessageFormat;
import java.util.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class ReliaPOS {
        
    public void addEmployee(String name, String email, String address, String phnumber, String bankacc, String taxn) {        
        String namePattern = "^[A-ZÁÉÍÓÚÝČĎĚŇŘŠŤŽ][a-záéíóúýčďěňřšťž]+[A-ZÁÉÍÓÚÝČĎĚŇŘŠŤŽ][a-záéíóúýčďěňřšťž]+$";
        String emailPattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        String phonePattern = "^\\+\\d{9,}$";
        String bankPattern = "^\\d{6,}/\\d{4}$";
        String taxPattern = "^CZ\\d{8}$";
    
    
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
        
        if (!taxn.matches(taxPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid tax number format. Format should be: CZ00000000");
        return;
        }
        
        Statement s = null;
                
        try {
            
            s = DB.connect().createStatement();
            s.executeUpdate("INSERT INTO employees (Name, Address, `E-mail`, `Phone number`, `Bank account`, `Tax number` ) VALUES ('" + name + "', '" + address + "', '" + email + "', '" + phnumber + "', '" + bankacc + "', '" + taxn + "')");
           
            JOptionPane.showMessageDialog(null, "Employee sucessfully added !");
            
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
    
    public void updateEmployee(String name, String email, String address, String phnumber, String bankacc, String taxn, String id) {     
        String namePattern = "^[A-ZÁÉÍÓÚÝČĎĚŇŘŠŤŽ][a-záéíóúýčďěňřšťž]+[A-ZÁÉÍÓÚÝČĎĚŇŘŠŤŽ][a-záéíóúýčďěňřšťž]+$";
        String emailPattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        String phonePattern = "^\\+\\d{9,}$";
        String bankPattern = "^\\d{6,}/\\d{4}$";
        String taxPattern = "^CZ\\d{8}$";
    
    
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
        
        if (!taxn.matches(taxPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid tax number format. Format should be: CZ00000000");
        return;
        }
        
        Statement s = null;
       
        try {
            
        s = DB.connect().createStatement();
        s.executeUpdate("UPDATE employees SET Name = '" + name + "', Address = '" + address + "', `E-mail` =  '" + email + "', `Phone number` = '" + phnumber + "', `Bank account` = '" +bankacc + "', `Tax number` = '" + taxn + "' WHERE ID = '" + id + "'");
           
        JOptionPane.showMessageDialog(null, "Employee sucessfully updated !");
        
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }              
   }
     
     public void searchRecord(String tableName, String columnName, String searchValue, JTextField... textFields) {
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
                    textFields[i].setText(rs.getString(i + 1));
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
     
     public void addProduct(String name, String group, String cost, String saleprice, String quantity) {  
        String namePattern = "^[a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+(?: [a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+)*$";
        String groupPattern = "^[A-Z][a-zA-Z ]*$";  
        String costPattern = "^[0-9]+(\\.[0-9]{1,2})?$";
        String salepricePattern = "^[0-9]+(\\.[0-9]{1,2})?$";
        String quantityPattern = "^[0-9]+$";
      
    
        
        if (!name.matches(namePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid product name format.");
        return;
        }
        
        if (!group.matches(groupPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid product group format. Group cannot contain numbers.");
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
        
        int option = JOptionPane.showConfirmDialog(null, "Do you want to add an image to the product?", "Add Image", JOptionPane.YES_NO_OPTION);

        String imagePath = null;
        if (option == JOptionPane.YES_OPTION) {
        
        imagePath = importImage();
        }
        
        Statement s = null;
                
        try {
            
            s = DB.connect().createStatement();
            s.executeUpdate("INSERT INTO products (Name, \"Group\", Cost, SalePrice, Quantity, ImagePath) VALUES ('" + name + "', '" + group + "', '" + cost + "', '" + saleprice + "', '" + quantity + "', '" + imagePath + "')");
           
            JOptionPane.showMessageDialog(null, "Product sucessfully added !");
            
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
     
     public void updateProduct(String name, String group, String cost, String saleprice, String quantity, String id) {
        String namePattern = "^[a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+(?: [a-zA-ZáéíóúýčďěňřšťžÁÉÍÓÚÝČĎĚŇŘŠŤŽ]+)*$";
        String groupPattern = "^[A-Z][a-zA-Z ]*$";  
        String costPattern = "^[0-9]+(\\.[0-9]{1,2})?$";
        String salepricePattern = "^[0-9]+(\\.[0-9]{1,2})?$";
        String quantityPattern = "^[0-9]+$";
    
        
        if (!name.matches(namePattern)) {
        JOptionPane.showMessageDialog(null, "Invalid product name format.");
        return;
        }
        
        if (!group.matches(groupPattern)) {
        JOptionPane.showMessageDialog(null, "Invalid product group format. Group cannot contain numbers.");
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
        s.executeUpdate("UPDATE products SET Name = '" + name + "', \"Group\" = '" + group + "', Cost =  '" + cost + "', SalePrice = '" + saleprice + "', Quantity = '" + quantity + "' WHERE ID = '" + id + "'");
           
        JOptionPane.showMessageDialog(null, "Product sucessfully updated !");
        
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
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
      
      public void addCustomer(String name, String address, String email, String phnumber) {
        String namePattern = "^[A-ZÁÉÍÓÚÝČĎĚŇŘŠŤŽ][a-záéíóúýčďěňřšťž]+[A-ZÁÉÍÓÚÝČĎĚŇŘŠŤŽ][a-záéíóúýčďěňřšťž]+$";
        String emailPattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        String phonePattern = "^\\+\\d{9,}$";
        
        
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
        
        Statement s = null;
                
        try {
            
            s = DB.connect().createStatement();
            s.executeUpdate("INSERT INTO customers (Name, Address, `E-mail`, `Phone number`) VALUES ('" + name + "', '" + address + "', '" + email + "', '" + phnumber + "')");
           
            JOptionPane.showMessageDialog(null, "Customer sucessfully added !");
            
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
      
    public void updateCustomer(String name, String address, String email, String phnumber, String id) {   
        String namePattern = "^[A-ZÁÉÍÓÚÝČĎĚŇŘŠŤŽ][a-záéíóúýčďěňřšťž]+[A-ZÁÉÍÓÚÝČĎĚŇŘŠŤŽ][a-záéíóúýčďěňřšťž]+$";
        String emailPattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        String phonePattern = "^\\+\\d{9,}$";
        
        
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
        
        Statement s = null;
       
        try {
            
        s = DB.connect().createStatement();
        s.executeUpdate("UPDATE customers SET Name = '" + name + "', Address = '" + address + "', `E-mail` =  '" + email + "', `Phone number` = '" + phnumber + "' WHERE ID = '" + id + "'");
           
        JOptionPane.showMessageDialog(null, "Customer sucessfully updated !");
        
        } catch (SQLException e) {
          System.out.println(e);
        } finally {
             if (s != null) try { s.close(); } catch (SQLException e) { e.printStackTrace(); }
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
            JOptionPane.showMessageDialog(null, "\n" + "Printed Successfully");
        } catch (java.awt.print.PrinterException e) {
            JOptionPane.showMessageDialog(null, "\n" + "Failed to Print");
        }
    } 
    
    public String importImage() {
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose Image File");        

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);
                
        int returnValue = fileChooser.showOpenDialog(null);
        
        if (returnValue == JFileChooser.APPROVE_OPTION) {           
            File selectedFile = fileChooser.getSelectedFile();     
            
            return selectedFile.getAbsolutePath();
        } else {
            JOptionPane.showMessageDialog(null, "No file selected");
            return null;
        }
    }
}

