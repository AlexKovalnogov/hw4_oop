package com.qa.homework.JsotToPOJO;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.qa.homework.models.Administrator;
import com.qa.homework.models.Director;
import com.qa.homework.models.Employee;
import com.qa.homework.models.Serviceman;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ConvertJsonToPOJO {

    public List<Employee> convertJsonFileToListOfPojo() {
        Gson gson = new Gson();
        FileReader fileReader = null;
        String basePath = System.getProperty("user.dir");
        try {
            fileReader = new FileReader(basePath+"\\src\\main\\resources\\Employee.json");
        } catch (Exception e) {
            System.out.println("Exception "+e);
        }

        Type foundListType = new TypeToken<ArrayList<Employee>>(){}.getType();
        List<Employee> employees = gson.fromJson(fileReader, foundListType);
        return getListOfEmployeesWithDefinedObjects(employees);
    }

    private List<Employee> getListOfEmployeesWithDefinedObjects(List<Employee> list) {
        List<Employee> newList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            switch (list.get(i).getPosition()) {
                case DIRECTOR:
                    newList.add( new Director( list.get(i).getFirstName(),list.get(i).getSecondName(),list.get(i).getIdNumber(),list.get(i).getSalary(),"DIRECTOR"));
                    break;
                case ADMINISTRATOR:
                    newList.add( new Administrator( list.get(i).getFirstName(),list.get(i).getSecondName(),list.get(i).getIdNumber(),list.get(i).getSalary(),"ADMINISTRATOR"));
                    break;
                case SERVICEMAN:
                    newList.add( new Serviceman( list.get(i).getFirstName(),list.get(i).getSecondName(),list.get(i).getIdNumber(),list.get(i).getSalary(),"SERVICEMAN"));
                    break;
            }
        }
        return newList;
    }

}