package com.matsyshyn.dbManipulator;

import com.matsyshyn.model.Employee;
import com.matsyshyn.model.Rm;
import com.matsyshyn.model.Unit;
import com.matsyshyn.dao.impl.RmDaoImpl;
import com.matsyshyn.dao.impl.UnitDaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Mapper {
    private RmDaoImpl rmDao = new RmDaoImpl();
    private UnitDaoImpl unitDao = new UnitDaoImpl();

    public List<Employee> mapToEmployeeList(ResultSet resultSet) throws SQLException {
        List<Employee> employeeList = new ArrayList<>();

        while (resultSet.next()) {
            Employee employee = new Employee();

            employee.setId(resultSet.getInt(1));
            employee.setName(resultSet.getString(2));
            employee.setSurname(resultSet.getString(3));
            employee.setSkill(resultSet.getString(4));
            employee.setTitle(resultSet.getString(5));
            employee.setUnit(unitDao.getById(resultSet.getInt(6)));
            employee.setRm(rmDao.getById(resultSet.getInt(7)));

            employeeList.add(employee);
        }
        return employeeList;
    }

    public List<Rm> mapToRmList(ResultSet resultSet) throws SQLException {
        List<Rm> rmList = new ArrayList<>();

        while (resultSet.next()) {
            Rm rm = new Rm();

            rm.setId(resultSet.getInt(1));
            rm.setName(resultSet.getString(2));
            rm.setSurname(resultSet.getString(3));

            rmList.add(rm);
        }
        return rmList;
    }

    public List<Unit> mapToUnitList(ResultSet resultSet) throws SQLException {
        List<Unit> unitList = new ArrayList<>();

        while (resultSet.next()) {
            Unit unit = new Unit();

            unit.setId(resultSet.getInt(1));
            unit.setName(resultSet.getString(2));
            unit.setRm(rmDao.getById(resultSet.getInt(3)));
            unit.setCount(resultSet.getInt(4));

            unitList.add(unit);
        }
        return unitList;
    }


}
