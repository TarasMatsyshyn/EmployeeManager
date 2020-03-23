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
    public Employee getById(int id) throws SQLException {
        return mapper.mapToEmployeeList(
                dbController.getFromDB(Queries.SELECT_BY_ID.getWithParam(String.valueOf(id))))
                .get(0);
    }

    @Override
    public List<Employee> getAll() throws SQLException {
        return mapper.mapToEmployeeList(dbController.getFromDB(Queries.SELECT_ALL.query));
    }

    public enum Queries {
        SELECT_ALL("SELECT * FROM employee"),
        SELECT_BY_ID("SELECT * FROM employee WHERE ID = %s");

        private String query;

        Queries(String query) {
            this.query = query;
        }

        public String getQuery() {
            return query;
        }

        public String getWithParam(String param) {
            return String.format(query, param);
        }

    }
}
