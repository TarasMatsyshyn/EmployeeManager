package com.matsyshyn.EmployeeManager.controller;

import com.matsyshyn.EmployeeManager.model.Employee;
import com.matsyshyn.EmployeeManager.utils.JSONParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String main() {
        return "Welcome to employee service";
    }

    @GetMapping("/employees")
    public List getAllEmployees() {
        return JSONParser.getAllEmployees();
    }

    @GetMapping("/employees/get")
    public Employee getEmployee(@RequestParam(value = "id", defaultValue = "0") Integer id) {
        return JSONParser.getEmployee(id);
    }

    @PostMapping("/employee/post")
    public Employee putEmployee(@RequestBody Employee employee) {
        return employee;
    }


}
