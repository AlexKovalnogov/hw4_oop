package InstanceModels;

import org.apache.log4j.Logger;

public class Director extends Employee  {

    public static final double PERSENT_INCREASING_SALARY = 0.2;
    public static final double PERSENT_TAX = 0.1;

    public Director() {
    }

    public Director(String firstName, String secondName, String idNumber, double salary) {
        super(firstName, secondName, idNumber, salary);
    }
}