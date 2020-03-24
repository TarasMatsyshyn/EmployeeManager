package com.matsyshyn.controllers;

import com.matsyshyn.model.Employee;
import com.matsyshyn.dao.impl.EmployeeDaoImpl;
import com.matsyshyn.services.EmployeeService;
import com.matsyshyn.services.impl.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class EmployeeController {

    private EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
    private EmployeeService employeeService = new EmployeeServiceImpl();

    @GetMapping("/")
    public String main() {
        return "Welcome to employee service";
    }

    @GetMapping("/employees")
    public List getAllEmployees() throws SQLException {
        return employeeService.getAll();
    }

    @GetMapping("/employees/get")
    public Employee getEmployee(@RequestParam(value = "id", defaultValue = "0") Integer id) throws SQLException {
        return employeeService.getById(id);
    }

    @GetMapping("/employees/delete")
    public List deleteEmployee(@RequestParam(value = "id") Integer id) throws SQLException {
        employeeService.delete(id);
        return employeeService.getAll();
    }

    @PostMapping("/employee/post")
    public Employee putEmployee(@RequestBody Employee employee) {
        return null;
    }

}
