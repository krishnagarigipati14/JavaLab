import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class week_12SimpleJDBCConnection {
    // JDBC URL, username and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/testdb"; // Change according to your setup
    private static final String USER = "yourUsername"; // Replace with your MySQL username
    private static final String PASSWORD = "yourPassword"; // Replace with your MySQL password

    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Establishing a connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database successfully!");
        } catch (SQLException e) {
            // Handle SQL exceptions
            System.out.println("Connection failed!");
            e.printStackTrace();
        } finally {
            // Clean up resources
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
