package jm.task.core.jdbc.util;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/task_1";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";


    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Ошибка при установлении соединения с базой данных: " + e.getMessage());
        }
        return connection;
    }
}