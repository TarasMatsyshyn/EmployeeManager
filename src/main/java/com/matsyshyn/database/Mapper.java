package com.matsyshyn.database;

import com.matsyshyn.EmployeeManager.model.Employee;
import com.matsyshyn.EmployeeManager.model.Rm;
import com.matsyshyn.EmployeeManager.model.Unit;
import com.matsyshyn.database.dao.impl.RmDaoImpl;
import com.matsyshyn.database.dao.impl.UnitDaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Mapper {
    private RmDaoImpl rmDao = new RmDaoImpl();
    private UnitDaoImpl unitDao = new UnitDaoImpl();

    public List<Employee> mapToEmployeeList(ResultSet resultSet) throws SQLException {
        Employee employee = new Employee();
        List<Employee> employeeList = new ArrayList<>();

        while (resultSet.next()) {
            employee.setId(resultSet.getInt(1));
            employee.setName(resultSet.getString(2));
            employee.setSurname(resultSet.getString(3));
            employee.setSkill(resultSet.getString(4));
            employee.setTitle(resultSet.getString(5));
            employee.setUnit(unitDao.findById(resultSet.getInt(6)));
            employee.setRm(rmDao.getById(resultSet.getInt(7)));

            employeeList.add(employee);
        }
        return employeeList;
    }

    public List<Rm> mapToRmList(ResultSet resultSet) throws SQLException {
        Rm rm = new Rm();
        List<Rm> rmList = new ArrayList<>();

        while (resultSet.next()) {
            rm.setId(resultSet.getInt(1));
            rm.setName(resultSet.getString(2));
            rm.setSurname(resultSet.getString(3));

            rmList.add(rm);
        }
        return rmList;
    }

    public List<Unit> mapToUnitList(ResultSet resultSet) throws SQLException {
        Unit unit = new Unit();
        List<Unit> unitList = new ArrayList<>();

        while (resultSet.next()) {
            unit.setId(resultSet.getInt(1));
            unit.setName(resultSet.getString(2));
            unit.setRm(rmDao.getById(resultSet.getInt(3)));
            unit.setCount(resultSet.getInt(4));

            unitList.add(unit);
        }
        return unitList;
    }


}
