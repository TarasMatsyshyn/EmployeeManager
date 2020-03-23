package com.matsyshyn.services;

import com.matsyshyn.model.Rm;
import com.matsyshyn.model.Unit;

import java.util.List;

public interface UnitService {
    void add(String name, String surname, Rm rm, int count);

    void update(int id, String name, Rm rm, int count);

    void delete(int id);

    Unit getById(int id);

    List<Unit> getAll();

}
