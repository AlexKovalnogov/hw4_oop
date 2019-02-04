package com.qa.homework.JsotToPOJO;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.qa.homework.models.Employee;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ConvertJsonToPOJO {

    public List<Employee> convertJsonFileToListOfPojo() {
        Gson gson = new Gson();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("D:\\hw4_oop\\src\\main\\resources\\Employee.json");
        } catch (Exception e) {

        }
        Type foundListType = new TypeToken<ArrayList<Employee>>() {
        }.getType();
        List<Employee> json = gson.fromJson(fileReader, foundListType);
        return json;
    }

}

