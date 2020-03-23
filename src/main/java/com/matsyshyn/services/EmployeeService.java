package com.matsyshyn.services;

import com.matsyshyn.model.Employee;
import com.matsyshyn.model.Rm;
import com.matsyshyn.model.Unit;

import java.util.List;

public interface EmployeeService {

    void add(String name, String surname, String skill, String title, Unit unit, Rm rm);

    void update(int id, String name, String surname, String skill, String title, Unit unit, Rm rm);

    void delete(int id);

    Employee getById(int id);

    List<Employee> getAll();
}
