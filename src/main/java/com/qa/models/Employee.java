package com.qa.models;

import java.util.ArrayList;
import java.util.List;

public class Employee
{
    public String firstName;
    public String secondName;
    public String idNumber;
    public  double salary;
    public static List<Employee> listOfEmployees = new ArrayList<Employee>();


    public Employee() {

    }

    public Employee(String firstName, String secondName, String idNumber, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.idNumber = idNumber;
        this.salary = salary;
    }
}

