package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHandler {

    private static final String DB_URL = "jdbc:mariadb://localhost:3306/animals";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Password123!";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}
