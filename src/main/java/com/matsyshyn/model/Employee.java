package com.matsyshyn.model;

public class Employee {

    private int id;
    private String name;
    private String surname;
    private String skill;
    private String title;
    private Unit unit;
    private Rm rm;

    public Employee() {
        super();
    }

    public Employee(int id, String name, String surname, String skill, String title, Unit unit, Rm rm) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.skill = skill;
        this.title = title;
        this.unit = unit;
        this.rm = rm;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Rm getRm() {
        return rm;
    }

    public void setRm(Rm rm) {
        this.rm = rm;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", skill='" + skill + '\'' +
                ", title='" + title + '\'' +
                ", unit=" + unit +
                ", rm=" + rm +
                '}';
    }
}
