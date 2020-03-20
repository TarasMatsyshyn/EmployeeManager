package com.matsyshyn.database;

import com.matsyshyn.EmployeeManager.model.Employee;
import com.matsyshyn.EmployeeManager.model.Rm;
import com.matsyshyn.EmployeeManager.model.Unit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Mapper {

    public List<Employee> mapToEmployeeList(ResultSet resultSet) throws SQLException {
        Employee employee = new Employee();
        List<Employee> employeeList = new ArrayList<>();

        while (resultSet.next()) {
            employee.setId(resultSet.getInt(1));
            employee.setName(resultSet.getString(2));
            employee.setSurname(resultSet.getString(3));
            employee.setSkill(resultSet.getString(4));
            employee.setTitle(resultSet.getString(5));
            employee.setUnit((Unit) resultSet.getObject(6));
            employee.setRm((Rm) resultSet.getObject(7));

            employeeList.add(employee);
        }

        return employeeList;

    }
}
