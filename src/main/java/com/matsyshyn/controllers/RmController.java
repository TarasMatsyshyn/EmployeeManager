package com.matsyshyn.controllers;

import com.matsyshyn.model.Rm;
import com.matsyshyn.dao.impl.RmDaoImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class RmController {

    private RmDaoImpl rmDao = new RmDaoImpl();

    @GetMapping("/rm")
    public List getAllEmployees() throws SQLException {
        return rmDao.getAll();
    }

    @GetMapping("/rm/get")
    public Rm getEmployee(@RequestParam(value = "id", defaultValue = "0") Integer id) throws SQLException {
        return rmDao.getById(id);
    }

}
