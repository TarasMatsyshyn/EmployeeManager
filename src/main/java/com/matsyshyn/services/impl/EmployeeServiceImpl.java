package com.matsyshyn.services.impl;

import com.matsyshyn.dao.EmployeeDao;
import com.matsyshyn.dao.RmDao;
import com.matsyshyn.dao.UnitDao;
import com.matsyshyn.dao.impl.EmployeeDaoImpl;
import com.matsyshyn.dao.impl.RmDaoImpl;
import com.matsyshyn.dao.impl.UnitDaoImpl;
import com.matsyshyn.model.Employee;
import com.matsyshyn.services.EmployeeService;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDaoImpl();
    private RmDao rmDao = new RmDaoImpl();
    private UnitDao unitDao = new UnitDaoImpl();

    @Override
    public void add(String name, String surname, String skill, String title, int unitID, int rmID) throws SQLException {
        Employee employee = new Employee();

        employee.setName(name);
        employee.setSurname(surname);
        employee.setSkill(skill);
        employee.setTitle(title);
        employee.setUnit(unitDao.getById(unitID));
        employee.setRm(rmDao.getById(rmID));

        employeeDao.add(employee);
    }

    @Override
    public void update(int id, String name, String surname, String skill, String title, int unitID, int rmID) throws SQLException {
        Employee employee = employeeDao.getById(id);

        employee.setName(name);
        employee.setSurname(surname);
        employee.setSkill(skill);
        employee.setTitle(title);
        employee.setUnit(unitDao.getById(unitID));
        employee.setRm(rmDao.getById(rmID));

        employeeDao.update(employee);
    }

    @Override
    public void delete(int id) throws SQLException {
        employeeDao.delete(id);
    }

    @Override
    public Employee getById(int id) throws SQLException {
        return employeeDao.getById(id);
    }

    @Override
    public List<Employee> getAll() throws SQLException {
        return employeeDao.getAll();
    }
}
