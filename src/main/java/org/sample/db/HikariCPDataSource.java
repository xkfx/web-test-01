package org.sample.db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class HikariCPDataSource {
    private static final String HIKARI_PROPERTIES_FILE_PATH = "/hikari.properties";
    private static HikariConfig config = new HikariConfig(HIKARI_PROPERTIES_FILE_PATH);
    private static HikariDataSource ds = new HikariDataSource(config);

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
