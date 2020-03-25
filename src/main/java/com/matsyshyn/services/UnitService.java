package com.matsyshyn.services;

import com.matsyshyn.model.Rm;
import com.matsyshyn.model.Unit;

import java.sql.SQLException;
import java.util.List;

public interface UnitService {
    void add(String name, String surname, Rm rm, int count);

    void update(int id, String name, Rm rm, int count);

    void delete(int id) throws SQLException;

    Unit getById(int id) throws SQLException;

    List<Unit> getAll() throws SQLException;

}
