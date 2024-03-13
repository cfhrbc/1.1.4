package jm.task.core.jdbc.util;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/task_1";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }
}
