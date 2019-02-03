package com.qa;

import com.qa.models.Client;
import com.qa.models.Employee;

import java.util.*;

public class Service {
    public static List<Employee> listOfEmployees = new ArrayList<Employee>();
    public static String serviceAddress;
    public static List<Double> earnedMoney;
    public static Map<String, String> clientIdEquipmentId;
    public static Map<String, Client> clientIdClientInstance;
    public static int amountFixedEquipment;
    public static Set<String> listOfClients;
    public static List<Date> datesOfGettingRevenues;
 //   public static Set<Client> listOfClients1;


    public Service() {
        earnedMoney = new ArrayList<Double>();
        clientIdEquipmentId = new HashMap<String, String>();
        clientIdClientInstance = new HashMap<String, Client>();
        listOfClients = new HashSet<String>();
        datesOfGettingRevenues = new ArrayList<Date>();
    }
}
