package com.qa.homework;

import com.qa.homework.models.*;
import java.util.*;

public class Service {
    public static String serviceAddress;
    public static List<Double> earnedMoney;
    public static Map<String, String> clientIdEquipmentId;
    public static Map<String, Client> clientIdClientInstance;
    public static int amountFixedEquipment;
    //public static Set<String> listOfClients;
    public static List<Date> datesOfGettingRevenues;
  public static Set<Client> listOfClients;


    public Service() {
        earnedMoney = new ArrayList<Double>();
        clientIdEquipmentId = new HashMap<String, String>();
        clientIdClientInstance = new HashMap<String, Client>();
        datesOfGettingRevenues = new ArrayList<Date>();
        listOfClients=new HashSet<Client>();
    }




}
