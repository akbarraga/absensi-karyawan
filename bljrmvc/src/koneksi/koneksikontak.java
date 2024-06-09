package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksikontak {
    // JDBC URL, username, and password of MySQL server
    private static final String DB_URL = "jdbc:mysql://localhost:3306/kontakpplg";
    private static final String USER = "root";
    private static final String PASS = "";

    // JDBC variables for opening and managing connection
    private static Connection connection;

    // Method to get the connection
    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(DB_URL, USER, PASS);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static Connection connection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}