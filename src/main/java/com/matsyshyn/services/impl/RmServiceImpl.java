package com.matsyshyn.services.impl;

import com.matsyshyn.dao.EmployeeDao;
import com.matsyshyn.dao.RmDao;
import com.matsyshyn.dao.UnitDao;
import com.matsyshyn.dao.impl.EmployeeDaoImpl;
import com.matsyshyn.dao.impl.RmDaoImpl;
import com.matsyshyn.dao.impl.UnitDaoImpl;
import com.matsyshyn.model.Rm;
import com.matsyshyn.services.RmService;

import java.sql.SQLException;
import java.util.List;

public class RmServiceImpl implements RmService {

    private EmployeeDao employeeDao = new EmployeeDaoImpl();
    private RmDao rmDao = new RmDaoImpl();
    private UnitDao unitDao = new UnitDaoImpl();

    @Override
    public void add(String name, String surname) {

    }

    @Override
    public void update(int id, String name, String surname) {

    }

    @Override
    public void delete(int id) throws SQLException {
        rmDao.delete(id);
    }

    @Override
    public Rm getById(int id) throws SQLException {
        return rmDao.getById(id);
    }

    @Override
    public List<Rm> getAll() throws SQLException {
        return rmDao.getAll();
    }
}
