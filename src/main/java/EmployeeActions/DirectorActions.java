package EmployeeActions;

import InstanceModels.*;
import Interfaces.iPayment;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static EmployeeActions.StaffPositionInServiceCentre.*;
import static InstanceModels.Director.PERSENT_INCREASING_SALARY;
import static InstanceModels.Director.PERSENT_TAX;
import static InstanceModels.Employee.listOfEmployees;



public class DirectorActions implements iPayment {

    private Logger logger = Logger.getLogger(DirectorActions.class);


    public void changeLocationOfServiceCenter() {
        logger.info("changeLocationOfServiceCenter");
    }

    public void hireEmployee(StaffPositionInServiceCentre position) {
        String arrayOfLabels[] = {"Input first name: ", "Input surname name: ", "Input id: ", "Input salary: "};
        List <String> variablesForEmployee = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayOfLabels.length; i++) {
            System.out.println(arrayOfLabels[i]);
            String buf = scanner.nextLine();
            variablesForEmployee.add(buf);
        }
        scanner.close();
        switch (position) {
            case DIRECTOR:
                listOfEmployees.add(new Director(variablesForEmployee.get(0), variablesForEmployee.get(1), variablesForEmployee.get(2), Double.parseDouble(variablesForEmployee.get(3))));
                break;
            case ADMINISTRATOR:
                listOfEmployees.add(new Administrator(variablesForEmployee.get(0), variablesForEmployee.get(1), variablesForEmployee.get(2), Double.parseDouble(variablesForEmployee.get(3))));
                break;
            case SERVICEMAN:
                listOfEmployees.add(new Serviceman(variablesForEmployee.get(0), variablesForEmployee.get(1), variablesForEmployee.get(2), Double.parseDouble(variablesForEmployee.get(3))));
                break;
        }
        logger.info("InstanceModels.Employee is hired");
    }

    public void fireEmployee(int indexOfEmployeeInList) {
        listOfEmployees.remove(indexOfEmployeeInList);
        logger.info("InstanceModels.Employee" + indexOfEmployeeInList + " is fired");
    }

    public double payTax() {
        double sumOfEarnedMoney=  new AdministratorActions().getSummOfEarnedMoney();
        System.out.print("payTax "+sumOfEarnedMoney*PERSENT_TAX);
        return sumOfEarnedMoney*PERSENT_TAX;
    }

    public void paySalary() {
        System.out.print("paySalary");
    }

    public List<Employee> getListOfEmployees() {
        System.out.println(listOfEmployees);
        return listOfEmployees;
    }

    public void increaseSalaryForEmployees() {

        List<Employee> listOfEmployee = getListOfEmployees();
        for (Employee empl : listOfEmployee) {
            empl.salary = empl.salary * PERSENT_INCREASING_SALARY;
        }

        System.out.println("increaseSalaryForEmployees");

    }

    public void getRevenues() {
        System.out.println("getRevenues");
    }


}


