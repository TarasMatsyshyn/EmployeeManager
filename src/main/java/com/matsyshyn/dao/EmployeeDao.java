package com.matsyshyn.dao;

import com.matsyshyn.model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
    void add(Employee employee) throws SQLException;

    void update(Employee employee) throws SQLException;

    void delete(int id) throws SQLException;

    Employee getById(int id) throws SQLException;

    List<Employee> getAll() throws SQLException;
}
