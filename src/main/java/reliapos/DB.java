package reliapos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    
    private static String url;

    public static Connection connect() {
         url = "jdbc:sqlite:POS.db";
        Connection conn = null;
        try {

            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
}
