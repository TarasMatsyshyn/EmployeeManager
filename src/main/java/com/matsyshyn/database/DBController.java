package com.matsyshyn.database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBController {

    public ResultSet getFromDB(String query) throws SQLException {
        return DBConnector.getInstance().getConnection().createStatement().executeQuery(query);
    }
}
