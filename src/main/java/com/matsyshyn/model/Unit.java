package com.matsyshyn.model;

public class Unit {

    private int id;
    private String name;
    private Rm rm;
    private int count;

    public Unit() {
        super();
    }

    public Unit(int id, String name, Rm rm, int count) {
        this.id = id;
        this.name = name;
        this.rm = rm;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
