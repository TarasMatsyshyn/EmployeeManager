package com.matsyshyn.services;

import com.matsyshyn.model.Rm;

import java.sql.SQLException;
import java.util.List;

public interface RmService {
    void add(String name, String surname);

    void update(int id, String name, String surname);

    void delete(int id) throws SQLException;

    Rm getById(int id) throws SQLException;

    List<Rm> getAll() throws SQLException;

}
