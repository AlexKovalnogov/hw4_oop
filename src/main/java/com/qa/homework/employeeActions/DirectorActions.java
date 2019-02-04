package com.qa.homework.employeeActions;

import com.qa.homework.JsotToPOJO.ConvertJsonToPOJO;
import com.qa.homework.Service;
import com.qa.homework.convertToJson.ConvertModelToJson;
import com.qa.homework.interfaces.IPayment;
import com.qa.homework.models.*;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.*;

//import static com.qa.homework.Service.listOfEmployees;
import static com.qa.homework.models.Director.PERSENT_INCREASING_SALARY;
import static com.qa.homework.models.Director.PERSENT_TAX;


public class DirectorActions implements IPayment {

    private Logger logger = Logger.getLogger(DirectorActions.class);

    public String changeLocationOfServiceCenter(String newAddress) {
        Service.serviceAddress = newAddress;
        return Service.serviceAddress;
    }

    public List<Employee> hireEmployee(StaffPositionInServiceCentre position, List<String> variablesForEmployee) {
        List<Employee> listOfEmployees = new ConvertJsonToPOJO().convertJsonFileToListOfPojo();
        switch (position) {
            case ADMINISTRATOR:
                listOfEmployees.add(new Administrator(variablesForEmployee.get(0), variablesForEmployee.get(1), variablesForEmployee.get(2), Double.parseDouble(variablesForEmployee.get(3)), "ADMINISTRATOR"));
                break;
            case SERVICEMAN:
                listOfEmployees.add(new Serviceman(variablesForEmployee.get(0), variablesForEmployee.get(1), variablesForEmployee.get(2), Double.parseDouble(variablesForEmployee.get(3)), "SERVICEMAN"));
                break;
        }
        new ConvertModelToJson().createJsonListOfEmployee(listOfEmployees);
        logger.info("Employee is hired");
        return new ConvertJsonToPOJO().convertJsonFileToListOfPojo();

    }

    public List<Employee> fireEmployee(int indexOfEmployeeInList) {
        List<Employee> listOfEmployees = new ConvertJsonToPOJO().convertJsonFileToListOfPojo();
        listOfEmployees.remove(indexOfEmployeeInList);
        logger.info("Employee" + indexOfEmployeeInList + " is fired");
        new ConvertModelToJson().createJsonListOfEmployee(listOfEmployees);
        return new ConvertJsonToPOJO().convertJsonFileToListOfPojo();
    }

    public double payTax() {
        double sumOfEarnedMoney = new AdministratorActions().getSummOfEarnedMoney();
        logger.info("payTax " + sumOfEarnedMoney * PERSENT_TAX);
        return sumOfEarnedMoney * PERSENT_TAX;
    }

    public double paySalary() {

        logger.info("paySalary");
        return 1.0;
    }

    public List<Employee> getListOfEmployees() {
        List<Employee> listOfEmployees = new ConvertJsonToPOJO().convertJsonFileToListOfPojo();
        logger.info("List of Employee is present");
        for (Employee employee : listOfEmployees) {
            logger.info(employee.toString());
        }
        return listOfEmployees;
    }

    public List<Employee> increaseSalaryForEmployees() {
        List<Employee> listOfEmployee = getListOfEmployees();
        for (Employee empl : listOfEmployee) {
            empl.setSalary(empl.getSalary() * PERSENT_INCREASING_SALARY);
        }
        logger.info("increaseSalaryForEmployees");
        getListOfEmployees();
        return listOfEmployee;
    }

    public Double getRevenues(String date, TypeOfRevenue t) throws Exception {
        Date d = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        double sum = 0;
        switch (t) {
            case DAY:
                for (int i = 0; i < Service.datesOfGettingRevenues.size() - 1; i++) {
                    if (d.compareTo(Service.datesOfGettingRevenues.get(i)) == 0) {
                        sum = sum + Service.earnedMoney.get(i);
                    }
                }
                logger.info("getRevenues for day " + sum);
                break;
            case WEEK:
                break;
            case MONTH:
                Calendar cal = Calendar.getInstance();
                cal.setTime(d);
                int month = cal.get(Calendar.MONTH) + 1;
                int currentmonth = getMonthForDate(date);
                for (int i = 0; i < Service.datesOfGettingRevenues.size(); i++) {
                    if (month == currentmonth) {
                        sum = sum + Service.earnedMoney.get(i);
                    }
                }
                logger.info("getRevenues for month " + sum);
                break;
        }

        logger.info("getRevenues ");
        return sum;
    }

    private int getMonthForDate(String inputDate) {
        String[] date = new String[3];
        for (int i = 0; i < 2; i++) {
            date = inputDate.split("/");
        }
        return Integer.parseInt(date[1]);
    }

}


