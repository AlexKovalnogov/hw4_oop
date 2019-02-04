package com.qa.homework.models;

public class Director extends Employee  {

    public static final double PERSENT_INCREASING_SALARY = 1.1;
    public static final double PERSENT_TAX = 0.1;

    public Director() {
    }
    public Director(String firstName, String secondName, String idNumber, double salary, String position) {
        super(firstName, secondName, idNumber, salary, position);
    }
}