package com.matsyshyn.dao;

import com.matsyshyn.model.Unit;

import java.sql.SQLException;
import java.util.List;

public interface UnitDao {

    void add(Unit unit);

    void update(Unit unit);

    void delete(Unit unit);

    Unit findById(int id) throws SQLException;

    List<Unit> getAll() throws SQLException;

}
