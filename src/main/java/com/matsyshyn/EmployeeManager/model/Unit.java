package com.matsyshyn.EmployeeManager.model;

public class Unit {

    private Integer id;
    private String name;
    private Rm rm;
    private Integer count;

    public Unit() {
        super();
    }

    public Unit(Integer id, String name, Rm rm, Integer count) {
        this.id = id;
        this.name = name;
        this.rm = rm;
        this.count = count;
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

    public Rm getRm() {
        return rm;
    }

    public void setRm(Rm rm) {
        this.rm = rm;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
