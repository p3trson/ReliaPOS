package reliapos;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ReliaPOS {
    
   
    
    public void addEmployee(String name, String email, String address, String phnumber, String bankacc, String taxn) {
               
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
    
     public void deleteEmployee(String id) {
       Statement s = null;
       
       try {
           
       s = DB.connect().createStatement();
       s.executeUpdate("DELETE FROM employees WHERE ID = '" + id + "'");
       
       JOptionPane.showMessageDialog(null, "Employee sucessfully deleted !");
       
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
}
