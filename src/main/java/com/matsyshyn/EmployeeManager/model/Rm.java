package com.matsyshyn.EmployeeManager.model;

public class Rm {

    private Integer id;
    private String name;
    private String surname;
    private Unit unit;

    public Rm() {
        super();
    }

    public Rm(Integer id, String name, String surname, Unit unit) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.unit = unit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}