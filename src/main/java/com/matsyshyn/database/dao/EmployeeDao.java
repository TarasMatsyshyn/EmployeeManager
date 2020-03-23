package com.matsyshyn.database.dao;

import com.matsyshyn.EmployeeManager.model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
    void add(Employee employee);

    void update(Employee employee);

    void delete(Employee employee);

    Employee getById(int id) throws SQLException;

    List<Employee> getAll() throws SQLException;
}
