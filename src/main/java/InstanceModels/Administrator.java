package InstanceModels;

import InstanceModels.Client;
import InstanceModels.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


public class Administrator extends Employee {


    public static List<Double> earnedMoney;
    public static HashMap<String, String> clientIdEquipmentId;
    public static HashMap<String, Client> clientIdClientInstance;
    public static int amountFixedEquipment;
    public static HashSet<String> listOfClients;

    public Administrator() {
    }

    public Administrator(String firstName, String secondName, String idNumber, double salary) {
        super(firstName, secondName, idNumber, salary);
      earnedMoney = new ArrayList<Double>();
        clientIdEquipmentId = new HashMap<String, String>();
        clientIdClientInstance = new HashMap<String, Client>();
        listOfClients = new HashSet<String>();
    }


}
