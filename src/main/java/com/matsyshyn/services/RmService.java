package com.matsyshyn.services;

import com.matsyshyn.model.Rm;

import java.util.List;

public interface RmService {
    void add(String name, String surname);

    void update(int id, String name, String surname);

    void delete(int id);

    Rm getById(int id);

    List<Rm> getAll();

}
