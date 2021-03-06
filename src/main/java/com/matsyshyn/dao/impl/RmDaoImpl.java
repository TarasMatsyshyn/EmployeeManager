package com.matsyshyn.dao.impl;

import com.matsyshyn.dao.RmDao;
import com.matsyshyn.dbManipulator.DBController;
import com.matsyshyn.dbManipulator.Mapper;
import com.matsyshyn.model.Rm;

import java.sql.SQLException;
import java.util.List;

public class RmDaoImpl implements RmDao {
    private static DBController dbController = new DBController();
    private static Mapper mapper = new Mapper();
    private final int FIRST_ELEMENT = 0;

    @Override
    public void add(Rm rm) {
    }

    @Override
    public void update(Rm rm) {
    }

    @Override
    public void delete(int id) throws SQLException {
        dbController.executeUpdate(Queries.DELETE_BY_ID.getWithParam(String.valueOf(id)));
    }

    @Override
    public Rm getById(int id) throws SQLException {
        return mapper.mapToRmList(
                dbController.executeQuery(Queries.SELECT_BY_ID.getWithParam(String.valueOf(id))))
                .get(FIRST_ELEMENT);
    }

    @Override
    public List<Rm> getAll() throws SQLException {
        return mapper.mapToRmList(dbController.executeQuery(Queries.SELECT_ALL.query));
    }

    public enum Queries {
        SELECT_ALL("SELECT * FROM rm"),
        SELECT_BY_ID("SELECT * FROM rm WHERE ID = %s"),
        DELETE_BY_ID("DELETE FROM rm WHERE ID = %s"),
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
