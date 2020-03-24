package com.matsyshyn.services;

import com.matsyshyn.model.Employee;
import com.matsyshyn.model.Rm;
import com.matsyshyn.model.Unit;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {

    void add(String name, String surname, String skill, String title, int unitID, int rmID) throws SQLException;

    void update(int id, String name, String surname, String skill, String title, int unitID, int rmID) throws SQLException;

    void delete(int id) throws SQLException;

    Employee getById(int id) throws SQLException;

    List<Employee> getAll() throws SQLException;
}
