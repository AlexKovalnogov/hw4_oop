import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Director extends Employee {
    private Logger logger = Logger.getLogger(Director.class);

    public List<Employee> listOfEmployees = new ArrayList();

    public void changeLocationOfServiceCenter() {
        logger.info("changeLocationOfServiceCenter");
    }

    public void hireEmployee() {
        String arrayOfLabels[] = {"Input first name: ", "Input surname name: ", "Input id: ", "Input salary: "};
        List<String> variablesForEmployee = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayOfLabels.length; i++) {
            System.out.println(arrayOfLabels[i]);
            String buf = scanner.nextLine();
            variablesForEmployee.add(buf);
        }
        scanner.close();
        listOfEmployees.add(new Employee(variablesForEmployee.get(0), variablesForEmployee.get(1), variablesForEmployee.get(2), Double.parseDouble(variablesForEmployee.get(3))));
        System.out.println("Employee is hired");
    }

    public void fireEmployee(int indexOfEmploeeiNList) {
        listOfEmployees.remove(indexOfEmploeeiNList);
        System.out.println("Employee is fired");
    }

    public void payTax() {
        System.out.print("payTax");
    }

    public void paySalary() {
        System.out.print("paySalary");
    }


    public void getListOfEmployees() {
        System.out.println(listOfEmployees);
    }

    public void increaseSalaryForEmployees() {
        System.out.println("increaseSalaryForEmployees");
    }

    public void getRevenues() {
        System.out.println("getRevenues");
    }


}
