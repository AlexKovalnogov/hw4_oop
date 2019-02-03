package com.qa.models;

import com.qa.employeeActions.StaffPositionInServiceCentre;

import java.util.ArrayList;
import java.util.List;

public class Employee
{
    private String firstName;
    private String secondName;
    private String idNumber;
    private   double salary;
    private StaffPositionInServiceCentre position;


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public double getSalary() {
        return salary;
    }

    public StaffPositionInServiceCentre getPosition() {
        return position;
    }

    public Employee() {

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(StaffPositionInServiceCentre position) {
        this.position = position;
    }

    public Employee(String firstName, String secondName, String idNumber, double salary, String position) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.idNumber = idNumber;
        this.salary = salary;
        this.position=StaffPositionInServiceCentre.valueOf(position.toUpperCase());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }

}

