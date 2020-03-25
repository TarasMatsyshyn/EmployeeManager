package com.matsyshyn.services.impl;

import com.matsyshyn.dao.UnitDao;
import com.matsyshyn.dao.impl.UnitDaoImpl;
import com.matsyshyn.model.Rm;
import com.matsyshyn.model.Unit;
import com.matsyshyn.services.UnitService;

import java.sql.SQLException;
import java.util.List;

public class UnitServiceImpl implements UnitService {

    private UnitDao unitDao = new UnitDaoImpl();

    @Override
    public void add(String name, String surname, Rm rm, int count) {

    }

    @Override
    public void update(int id, String name, Rm rm, int count) {

    }

    @Override
    public void delete(int id) throws SQLException {
        unitDao.delete(id);
    }

    @Override
    public Unit getById(int id) throws SQLException {
        return unitDao.getById(id);
    }

    @Override
    public List<Unit> getAll() throws SQLException {
        return unitDao.getAll();
    }
}
