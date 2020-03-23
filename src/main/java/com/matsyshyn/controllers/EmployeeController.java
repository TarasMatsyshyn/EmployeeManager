package com.matsyshyn.controllers;

import com.matsyshyn.model.Employee;
import com.matsyshyn.dao.impl.EmployeeDaoImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class EmployeeController {

    private EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();

    @GetMapping("/")
    public String main() {
        return "Welcome to employee service";
    }

    @GetMapping("/employees")
    public List getAllEmployees() throws SQLException {
        return employeeDao.getAll();
    }

    @GetMapping("/employees/get")
    public Employee getEmployee(@RequestParam(value = "id", defaultValue = "0") Integer id) throws SQLException {
        return employeeDao.getById(id);
    }

    @PostMapping("/employee/post")
    public Employee putEmployee(@RequestBody Employee employee) {
        return null;
    }

}
