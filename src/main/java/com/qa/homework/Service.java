package com.qa.homework;

import com.qa.homework.convertToJson.ConvertModelToJson;
import com.qa.homework.models.*;

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



    public void setData() {
        Administrator administrator1 = new Administrator("A1", "A1", "1", 500, "administrator");
        Serviceman firstServiceman = new Serviceman("s1", "s1", "3", 1000, "Serviceman");
        Director director = new Director("D1", "D1", "5", 2000, "director");

        Service.listOfEmployees.add(administrator1);
        Service.listOfEmployees.add(firstServiceman);
        Service.listOfEmployees.add(director);
        new ConvertModelToJson().createJsonListOfEmployee(Service.listOfEmployees);
    }
}
