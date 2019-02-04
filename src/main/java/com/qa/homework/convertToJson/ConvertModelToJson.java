package com.qa.homework.convertToJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qa.homework.models.Employee;

import java.io.FileWriter;
import java.util.List;

public class ConvertModelToJson {

    public void createJsonListOfEmployee(List<Employee> listOfAllEmployee) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String basePath = System.getProperty("user.dir");
        try {
            FileWriter writer = new FileWriter(basePath+"\\src\\main\\resources\\Employee.json");
            //throw new ConverttoJson();
            gson.toJson(listOfAllEmployee, writer);
            writer.flush();
            writer.close();
        } catch (Exception e) {

        }
    }



    }
