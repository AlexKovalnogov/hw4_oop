package com.qa.models;

import java.util.*;


public class Administrator extends Employee {

    public Administrator() {
    }

    public Administrator(String firstName, String secondName, String idNumber, double salary, String position) {
        super(firstName, secondName, idNumber, salary, position);
    }

/*public Administrator(String firstName, String secondName, String idNumber, double salary) {
        super(firstName, secondName, idNumber, salary);
      earnedMoney = new ArrayList<Double>();
        clientIdEquipmentId = new HashMap<String, String>();
        clientIdClientInstance = new HashMap<String, Client>();
        listOfClients = new HashSet<String>();
        datesOfGettingRevenues = new ArrayList<Date>();
    }*/
}
