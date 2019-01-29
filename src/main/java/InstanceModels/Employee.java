package InstanceModels;

import java.util.ArrayList;
import java.util.List;

public class Employee//  implements Interfaces.iActionsWithEquipment
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
/*  public String getEquipmentForFixing(Equipment.Equipment equipment, Employee employee, Client client){
        return "1";
    }*/

}

