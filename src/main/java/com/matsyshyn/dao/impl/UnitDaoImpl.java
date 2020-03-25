package com.matsyshyn.dao.impl;

import com.matsyshyn.dao.UnitDao;
import com.matsyshyn.dbManipulator.DBController;
import com.matsyshyn.dbManipulator.Mapper;
import com.matsyshyn.model.Unit;

import java.sql.SQLException;
import java.util.List;

public class UnitDaoImpl implements UnitDao {
    private static DBController dbController = new DBController();
    private static Mapper mapper = new Mapper();
    private final int FIRST_ELEMENT = 0;

    @Override
    public void add(Unit unit) {

    }

    @Override
    public void update(Unit unit) {

    }

    @Override
    public void delete(int id) throws SQLException {
        dbController.executeUpdate(Queries.DELETE_BY_ID.getWithParam(String.valueOf(id)));
    }

    @Override
    public Unit getById(int id) throws SQLException {
        return mapper.mapToUnitList(
                dbController.executeQuery(Queries.SELECT_BY_ID.getWithParam(String.valueOf(id))))
                .get(FIRST_ELEMENT);
    }

    @Override
    public List<Unit> getAll() throws SQLException {
        return mapper.mapToUnitList(dbController.executeQuery(UnitDaoImpl.Queries.SELECT_ALL.query));
    }

    public enum Queries {
        SELECT_ALL("SELECT * FROM unit"),
        SELECT_BY_ID("SELECT * FROM unit WHERE ID = %s"),
        DELETE_BY_ID("DELETE FROM unit WHERE ID = %s"),
        ;
        private String query;

        Queries(String query) {
            this.query = query;
        }

        public String getWithParam(String param) {
            return String.format(query, param);
        }

    }
}
