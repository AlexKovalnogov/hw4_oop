package InstanceModels;

import InstanceModels.Client;
import InstanceModels.Employee;

import java.util.*;


public class Administrator extends Employee {


    public static List<Double> earnedMoney;
    public static Map<String, String> clientIdEquipmentId;
    public static Map<String, Client> clientIdClientInstance;
    public static int amountFixedEquipment;
    public static Set<String> listOfClients;
    public static Map<Date, Double> earnedMoneyEachDay;

    public Administrator() {
    }

    public Administrator(String firstName, String secondName, String idNumber, double salary) {
        super(firstName, secondName, idNumber, salary);
      earnedMoney = new ArrayList<Double>();
        clientIdEquipmentId = new HashMap<String, String>();
        clientIdClientInstance = new HashMap<String, Client>();
        listOfClients = new HashSet<String>();
        earnedMoneyEachDay=new HashMap<Date,Double>();
    }


}
