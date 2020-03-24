package com.matsyshyn.dao;

import com.matsyshyn.model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
    void add(Employee employee);

    void update(Employee employee);

    void delete(int id) throws SQLException;

    Employee getById(int id) throws SQLException;

    List<Employee> getAll() throws SQLException;
}
