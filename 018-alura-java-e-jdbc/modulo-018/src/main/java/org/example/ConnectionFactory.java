package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection obter() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/java_018?useTimezone=true&serverTimezone=UTC", "root", "");
    }
}
