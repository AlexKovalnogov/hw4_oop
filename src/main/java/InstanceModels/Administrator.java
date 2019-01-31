package InstanceModels;

import java.util.*;


public class Administrator extends Employee {


    public static List<Double> earnedMoney;
    public static Map<String, String> clientIdEquipmentId;
    public static Map<String, Client> clientIdClientInstance;
    public static int amountFixedEquipment;
    public static Set<String> listOfClients;
    public static List<Date> datesOfGettingRevenues;

    public Administrator() {
    }

    public Administrator(String firstName, String secondName, String idNumber, double salary) {
        super(firstName, secondName, idNumber, salary);
        earnedMoney = new ArrayList<Double>();
        clientIdEquipmentId = new HashMap<String, String>();
        clientIdClientInstance = new HashMap<String, Client>();
        listOfClients = new HashSet<String>();
        datesOfGettingRevenues = new ArrayList<Date>();
    }
}
