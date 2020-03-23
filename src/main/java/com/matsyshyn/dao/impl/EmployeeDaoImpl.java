package com.matsyshyn.dao.impl;

import com.matsyshyn.model.Employee;
import com.matsyshyn.dbManipulator.DBController;
import com.matsyshyn.dbManipulator.Mapper;
import com.matsyshyn.dao.EmployeeDao;

import java.sql.ResultSet;
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
        ResultSet employeeResultSet = dbController.getFromDB(Queries.SELECT_BY_ID.getWithParam(String.valueOf(id)));
        Employee employee = mapper.mapToEmployeeList(employeeResultSet).get(0);

        return employee;
    }

    @Override
    public List<Employee> getAll() throws SQLException {
        ResultSet employeesResultSet = dbController.getFromDB(Queries.SELECT_ALL.query);
        List<Employee> employees = mapper.mapToEmployeeList(employeesResultSet);

        return employees;
    }

    public enum Queries {
        SELECT_ALL("SELECT * FROM employee"),
        SELECT_BY_ID("SELECT * FROM employee WHERE ID = %s"),
        INSERT_EMPLOYEE("INSERT INTO employee (id, name, surname, skill, title, unit_id, rm_id) VALUES (%d, %s, %s, %s, %s, %d, %d);");

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
