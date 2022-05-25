package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionDB {
    private static Connection connection;
    public PreparedStatement prepareStatement;

    private ConnectionDB () {}
    public static Connection getInstance() throws SQLException {
        if(connection == null) {
            String url = "jdbc:mysql://localhost:3306/proiect_java";
            String username = "root";
            String password = "ciocolataCuRom";
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }

    public PreparedStatement prepareStatement(String query) {
        return null;
    }
}
