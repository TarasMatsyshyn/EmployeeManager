package com.matsyshyn.dao.impl;

import com.matsyshyn.dao.UnitDao;
import com.matsyshyn.model.Unit;
import com.matsyshyn.dbManipulator.DBController;
import com.matsyshyn.dbManipulator.Mapper;

import java.sql.SQLException;
import java.util.List;

public class UnitDaoImpl implements UnitDao {
    private static DBController dbController = new DBController();
    private static Mapper mapper = new Mapper();

    @Override
    public void add(Unit unit) {

    }

    @Override
    public void update(Unit unit) {

    }

    @Override
    public void delete(Unit unit) {

    }

    @Override
    public Unit findById(int id) throws SQLException {
        return mapper.mapToUnitList(
                dbController.getFromDB(Queries.SELECT_BY_ID.getWithParam(String.valueOf(id))))
                .get(0);
    }

    @Override
    public List<Unit> getAll() throws SQLException {
        return mapper.mapToUnitList(dbController.getFromDB(UnitDaoImpl.Queries.SELECT_ALL.query));
    }

    public enum Queries {
        SELECT_ALL("SELECT * FROM unit"),
        SELECT_BY_ID("SELECT * FROM unit WHERE ID = %s");

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
