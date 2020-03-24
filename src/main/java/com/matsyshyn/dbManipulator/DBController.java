package com.matsyshyn.dbManipulator;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBController {

    public ResultSet executeQuery(String query) throws SQLException {
        return DBConnector.getInstance().getConnection().createStatement().executeQuery(query);
    }

    public int executeUpdate(String query) throws SQLException {
        return DBConnector.getInstance().getConnection().createStatement().executeUpdate(query);
    }

}
