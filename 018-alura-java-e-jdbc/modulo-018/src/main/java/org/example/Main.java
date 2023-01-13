package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conectando com o banco de dados...");

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/java_018?useTimezone=true&serverTimezone=UTC", "root", "");
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}