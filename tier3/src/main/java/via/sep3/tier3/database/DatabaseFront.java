package via.sep3.tier3.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseFront {
    private static DatabaseFront instance;
    public final String URL = "jdbc:postgresql://localhost:5432/postgres?currentSchema=\"sep3\"";
    public final String USER = "postgres";
    public final String PASSWORD = "Nowak315252";

    private DatabaseFront() {
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public synchronized static DatabaseFront getInstance() {
        if (instance == null) {
            instance = new DatabaseFront();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
