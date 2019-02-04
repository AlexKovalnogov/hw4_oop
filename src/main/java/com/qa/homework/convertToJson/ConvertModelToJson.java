package com.qa.homework.convertToJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qa.homework.models.Client;
import com.qa.homework.models.Employee;

import java.io.FileWriter;
import java.util.List;
import java.util.Set;

public class ConvertModelToJson {

    public void createJsonFile(List<Employee> listOfAllEmployee) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String basePath = System.getProperty("user.dir");
        try {
            FileWriter writer = new FileWriter(basePath + "\\src\\main\\resources\\Employee.json");
            gson.toJson(listOfAllEmployee, writer);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println("Exception happened during json file " + e);
        }
    }

    public void createJsonFile(Set<Client> listOfClients) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String basePath = System.getProperty("user.dir");
        try {
            FileWriter writer = new FileWriter(basePath + "\\src\\main\\resources\\clients.json");
            gson.toJson(listOfClients, writer);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println("Exception happened during json file " + e);
        }
    }



}
