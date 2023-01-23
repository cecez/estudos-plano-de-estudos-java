package org.example.factory;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

    private final DataSource dataSource;

    public ConnectionFactory() {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/java_018?useTimezone=true&serverTimezone=UTC");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("");

        this.dataSource = comboPooledDataSource;
    }

    public Connection obter() {
        try {
            return this.dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
