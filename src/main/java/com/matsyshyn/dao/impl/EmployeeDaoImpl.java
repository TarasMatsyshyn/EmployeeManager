package com.matsyshyn.dao.impl;

import com.matsyshyn.dao.EmployeeDao;
import com.matsyshyn.dbManipulator.DBController;
import com.matsyshyn.dbManipulator.Mapper;
import com.matsyshyn.model.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private static DBController dbController = new DBController();
    private static Mapper mapper = new Mapper();
    private final int FIRST_ELEMENT = 0;

    @Override
    public void add(Employee employee) throws SQLException {
        String query = Queries.INSERT_EMPLOYEE.getSQLInsertEmployee(
                String.valueOf(employee.getId()),
                employee.getName(), employee.getSurname(),
                employee.getSkill(), employee.getTitle(),
                String.valueOf(employee.getUnit().getId()),
                String.valueOf(employee.getRm().getId()));

        dbController.executeUpdate(query);
    }

    @Override
    public void update(Employee employee) throws SQLException {
        String query = Queries.UPDATE_BY_ID.getSQLUpdateEmployee(employee.getName(), employee.getSurname(),
                employee.getSkill(), employee.getTitle(),
                String.valueOf(employee.getUnit().getId()),
                String.valueOf(employee.getRm().getId()),
                String.valueOf(employee.getId()));

        dbController.executeUpdate(query);
    }

    @Override
    public void delete(int id) throws SQLException {
        dbController.executeUpdate(Queries.DELETE_BY_ID.getWithParam(String.valueOf(id)));
    }

    @Override
    public Employee getById(int id) throws SQLException {
        ResultSet employeeResultSet = dbController.executeQuery(Queries.SELECT_BY_ID.getWithParam(String.valueOf(id)));
        Employee employee = mapper.mapToEmployeeList(employeeResultSet).get(FIRST_ELEMENT);

        return employee;
    }

    @Override
    public List<Employee> getAll() throws SQLException {
        ResultSet employeesResultSet = dbController.executeQuery(Queries.SELECT_ALL.query);
        List<Employee> employees = mapper.mapToEmployeeList(employeesResultSet);

        return employees;
    }

    public enum Queries {
        SELECT_ALL("SELECT * FROM employee"),
        SELECT_BY_ID("SELECT * FROM employee WHERE ID = %s"),
        INSERT_EMPLOYEE("INSERT INTO employee (id, name, surname, skill, title, unit_id, rm_id) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s'    )"),
        DELETE_BY_ID("DELETE FROM employee WHERE ID = %s"),
        UPDATE_BY_ID("UPDATE employee SET name = '%s', surname = '%s', skill = '%s', title = '%s', unit_id = '%s', rm_id = '%s' WHERE (id = %s)");

        private String query;

        Queries(String query) {
            this.query = query;
        }

        public String getWithParam(String param) {
            return String.format(query, param);
        }

        public String getSQLInsertEmployee(String id, String name, String surname, String skill, String title, String unit_id, String rm_id) {
            return String.format(query, id, name, surname, skill, title, unit_id, rm_id);
        }

        public String getSQLUpdateEmployee(String name, String surname, String skill, String title, String unit_id, String rm_id, String employeeId) {
            return String.format(query, name, surname, skill, title, unit_id, rm_id, employeeId);
        }

    }
}
