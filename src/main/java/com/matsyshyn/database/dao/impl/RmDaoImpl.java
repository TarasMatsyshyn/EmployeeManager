package com.matsyshyn.database.dao.impl;

import com.matsyshyn.EmployeeManager.model.Rm;
import com.matsyshyn.database.DBController;
import com.matsyshyn.database.Mapper;
import com.matsyshyn.database.dao.RmDao;

import java.sql.SQLException;
import java.util.List;

public class RmDaoImpl implements RmDao {
    private static DBController dbController = new DBController();
    private static Mapper mapper = new Mapper();

    @Override
    public void add(Rm rm) {

    }

    @Override
    public void update(Rm rm) {

    }

    @Override
    public void delete(Rm rm) {

    }

    @Override
    public Rm getById(int id) throws SQLException {
        return mapper.mapToRmList(
                dbController.getFromDB(Queries.SELECT_BY_ID.getWithParam(String.valueOf(id))))
                .get(0);
    }

    @Override
    public List<Rm> getAll() throws SQLException {
        return mapper.mapToRmList(dbController.getFromDB(Queries.SELECT_ALL.query));
    }

    public enum Queries {
        SELECT_ALL("SELECT * FROM rm"),
        SELECT_BY_ID("SELECT * FROM rm WHERE ID = %s");

        private String query;

        Queries(String query) {
            this.query = query;
        }

        public String getQuery() {
            return query;
        }

        public String getWithParam(String param) {
            return String.format(query, param);
        }

    }
}
