package com.matsyshyn.dbManipulator;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBController {

    public ResultSet getFromDB(String query) throws SQLException {
        return DBConnector.getInstance().getConnection().createStatement().executeQuery(query);
    }

    public void insertToDb(String query) throws SQLException {
        DBConnector.getInstance().getConnection().createStatement().executeQuery(query);
    }
}
