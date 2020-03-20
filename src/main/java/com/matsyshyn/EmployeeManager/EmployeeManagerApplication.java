package com.matsyshyn.EmployeeManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class EmployeeManagerApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(EmployeeManagerApplication.class, args);
    }

}
