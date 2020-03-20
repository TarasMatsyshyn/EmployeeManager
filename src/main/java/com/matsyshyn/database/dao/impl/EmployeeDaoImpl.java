package com.matsyshyn.database.dao.impl;

import com.matsyshyn.EmployeeManager.model.Employee;
import com.matsyshyn.database.DBController;
import com.matsyshyn.database.Mapper;
import com.matsyshyn.database.dao.EmployeeDao;

import java.sql.SQLException;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private static DBController dbController = new DBController();
    private static Mapper mapper = new Mapper();

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(Employee employee) {

    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public List<Employee> getAll() {
        try {
            return mapper.mapToEmployeeList(dbController.getFromDB(Queries.SELECT_ALL.query));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public enum Queries {
        SELECT_ALL("SELECT * FROM employee"),
        ;

        private String query;

        Queries(String query) {
            this.query = query;
        }

        public String getQuery() {
            return query;
        }
    }
}
