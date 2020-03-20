package com.matsyshyn.database.dao;

import com.matsyshyn.EmployeeManager.model.Employee;

import java.util.List;

public interface EmployeeDao {
    void add(Employee employee);

    void update(Employee employee);

    void delete(Employee employee);

    Employee findById(int id);

    List<Employee> getAll();
}
