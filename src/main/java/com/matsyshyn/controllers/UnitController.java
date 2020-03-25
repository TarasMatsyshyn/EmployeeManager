package com.matsyshyn.controllers;

import com.matsyshyn.model.Unit;
import com.matsyshyn.services.UnitService;
import com.matsyshyn.services.impl.UnitServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class UnitController {

    private UnitService unitService = new UnitServiceImpl();

    @GetMapping("/units")
    public List getAllUnits() throws SQLException {
        return unitService.getAll();
    }

    @GetMapping("/units/get")
    public Unit getUnit(@RequestParam(value = "id", defaultValue = "0") Integer id) throws SQLException {
        return unitService.getById(id);
    }

    @RequestMapping(value = "/units/delete", method = {RequestMethod.GET, RequestMethod.PUT})
    public List deleteUnit(@RequestParam(value = "id") int id) throws SQLException {
        unitService.delete(id);
        return unitService.getAll();
    }

}
