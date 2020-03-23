package com.matsyshyn.database.dao;

import com.matsyshyn.EmployeeManager.model.Rm;

import java.rmi.server.RMIClassLoader;
import java.sql.SQLException;
import java.util.List;

public interface RmDao {

    void add(Rm rm);

    void update(Rm rm);

    void delete(Rm rm);

    Rm getById(int id) throws SQLException;

    List<Rm> getAll() throws SQLException;

}
