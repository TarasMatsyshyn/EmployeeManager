package com.matsyshyn.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.matsyshyn.model.Employee;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSONParser {

    public static List<Employee> getAllEmployees(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        List<Employee> employeeList = new ArrayList<>();
        try{
            employeeList = Arrays.asList(mapper.readValue(new File("../employees.json"), Employee[].class));
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    public static Employee getEmployee(Integer id){
        return getAllEmployees().get(id);
    }


}
