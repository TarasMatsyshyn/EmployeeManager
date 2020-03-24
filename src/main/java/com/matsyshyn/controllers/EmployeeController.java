package com.matsyshyn.controllers;

import com.matsyshyn.model.Employee;
import com.matsyshyn.dao.impl.EmployeeDaoImpl;
import com.matsyshyn.services.EmployeeService;
import com.matsyshyn.services.impl.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.*;

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
    public List deleteEmployee(@RequestParam(value = "id") int id) throws SQLException {
        employeeService.delete(id);
        return employeeService.getAll();
    }

    @RequestMapping(value = "/employee/post", method = {RequestMethod.GET, RequestMethod.POST})
    public List postEmployee(@RequestParam(value = "name") String name,
                                 @RequestParam(value = "surname") String surname,
                                 @RequestParam(value = "skill") String skill,
                                 @RequestParam(value = "title") String title,
                                 @RequestParam(value = "unit") int unit_id,
                                 @RequestParam(value = "rm") int rm_id) throws SQLException {

        employeeService.add(name, surname, skill, title, unit_id, rm_id);
        return getAllEmployees();
    }

}
