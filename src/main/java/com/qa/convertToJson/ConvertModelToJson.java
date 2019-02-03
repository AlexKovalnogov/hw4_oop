package com.qa.convertToJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qa.models.Employee;

import java.io.FileWriter;
import java.util.List;

public class ConvertModelToJson {

    public void createJsonListOfEmployee(List<Employee> listOfAllEmployee) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try {
            FileWriter writer = new FileWriter("D:\\hw4_oop\\src\\main\\resources\\Employee.json");
            //throw new ConverttoJson();
            gson.toJson(listOfAllEmployee, writer);
            writer.flush();
            writer.close();
        } catch (Exception e) {

        }
    }



    }
