package com.matsyshyn.database.dao;

import com.matsyshyn.EmployeeManager.model.Unit;

import java.util.List;

public interface UnitDao {

    void add(Unit unit);

    void update(Unit unit);

    void delete(Unit unit);

    Unit findById(int id);

    List<Unit> getAll();

}
