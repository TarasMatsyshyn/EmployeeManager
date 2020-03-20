package com.matsyshyn.database.dao;

import com.matsyshyn.EmployeeManager.model.Rm;

import java.rmi.server.RMIClassLoader;
import java.util.List;

public interface RmDao {

    void add(Rm rm);

    void update(Rm rm);

    void delete(Rm rm);

    Rm findById(int id);

    List<RMIClassLoader> getAll();

}
