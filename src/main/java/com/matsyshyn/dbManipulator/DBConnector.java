package com.matsyshyn.dbManipulator;

import com.matsyshyn.utils.PropertyParser;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    private static final String URL = PropertyParser.getProperty("db.url");
    private static final String USER_NAME = PropertyParser.getProperty("db.user");
    private static final String USER_PASSWORD = PropertyParser.getProperty("db.password");
    private static DBConnector instance;
    private Connection connection;

    private DBConnector() {
        try {
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DBConnector getInstance() throws SQLException {
        if (instance == null) {
            instance = new DBConnector();
        } else if (instance.getConnection().isClosed()) {
            instance = new DBConnector();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
