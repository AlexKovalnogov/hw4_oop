package EmployeeActions;

import Equipment.Equipment;
import InstanceModels.*;
import Interfaces.iActionsWithEquipment;
import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.List;

import static InstanceModels.Administrator.amountFixedEquipment;
import static InstanceModels.Administrator.earnedMoney;


public class AdministratorActions implements iActionsWithEquipment {

    Logger logger = Logger.getLogger(AdministratorActions.class);


    private Serviceman getServicemanFromList() {
        Serviceman s = new Serviceman();
        for (int i = 0; i < Employee.listOfEmployees.size() - 1; i++) {
            if (Employee.listOfEmployees.get(i) instanceof Serviceman) {
                s = (Serviceman) Employee.listOfEmployees.get(i);
                break;
            }
        }
        return s;
    }

    private Administrator getAdministratorFromList() {
        Administrator administrator = new Administrator();
        for (int i = 0; i < Employee.listOfEmployees.size() - 1; i++) {
            if (Employee.listOfEmployees.get(i) instanceof Administrator) {
                administrator = (Administrator) Employee.listOfEmployees.get(i);
                break;
            }
        }
        return administrator;
    }

    public String getEquipmentForFixing(Equipment equipment, Client client) {
        addNewClientAndWriteDownInfoAboutEquipmentAndClient(equipment, client);
        addInfoAboutFixedEquipmentForReport(equipment);
        Administrator administrator = getAdministratorFromList();
        logger.info("InstanceModels.Administrator gets equipment,calculate amount of money and move to service department");
        giveEquipment(equipment, administrator);
        return equipment.equipmentId;
    }

    public String giveEquipment(Equipment equipment, Administrator administrator) {
        logger.info("InstanceModels.Administrator gives equipment to serviceman");
        new ServicemanActions().fixProblemWithEquipment(equipment, administrator);
        return getServicemanFromList().idNumber;
    }

    public String giveEquipmentToClient(Equipment equipment) {
        Client client = getClient(equipment);
        logger.info("InstanceModels.Administrator gives equipment for client   " + equipment.equipmentId + " " + client.firstName);
        new ClientActions().getEquipment(equipment.equipmentId);
        return equipment.equipmentId + client.firstName;
    }

    private Client getClient(Equipment equipment) {
        return Administrator.clientIdClientInstance.get(Administrator.clientIdEquipmentId.get(equipment.equipmentId));
    }


    private void addNewClientAndWriteDownInfoAboutEquipmentAndClient(Equipment equipment, Client client) {
        Administrator.listOfClients.add(client.secondName);
        Administrator.clientIdEquipmentId.put(equipment.equipmentId, client.idNumber);
        Administrator.clientIdClientInstance.put(client.idNumber, client);
    }

    private int addInfoAboutFixedEquipmentForReport(Equipment equipment) {
        amountFixedEquipment++;
        earnedMoney.add(equipment.getEquipmentPrice() * 0.1);
        return amountFixedEquipment;
    }

    public double getSummOfEarnedMoney() {
        double sum = 0;
        for (Double d : earnedMoney)
            sum += d;
        return sum;
    }

    public int getReportAboutFixedEquipment(int amountFixedEquipment) {
        logger.info("amount of Fixed Equipment.Equipment = " + amountFixedEquipment);
        return amountFixedEquipment;
    }

    public HashSet<String> getListOfClients() {
        logger.info("List of clients is present");
        return Administrator.listOfClients;

    }
/*
    InstanceModels.Serviceman firstServiceman = new InstanceModels.Serviceman("s1", "s1", "1", 1000);
    InstanceModels.Serviceman secondServiceman = new InstanceModels.Serviceman("s2", "s2", "2", 1200);*/

   /* public void giveEquipment(Equipment.Equipment equipment) {
        InstanceModels.Client currentClient = getClient(equipment);
        currentClient.getEquipment(equipment.equipmentId);
        logger.info("InstanceModels.Administrator give equipment for client");
    }

    private InstanceModels.Client getClient(Equipment.Equipment equipment) {
        InstanceModels.Client cl = clientIdClientInstance.get(clientIdEquipmentId.get(equipment.equipmentId));
        return cl;
    }

    public void giveEquipment(Equipment.Equipment equipment, InstanceModels.Employee administrator) {
        firstServiceman.fixProblemWithEquipment(equipment, administrator);
    }

    public void getEquipmentForFixing(Equipment.Equipment equipment, InstanceModels.Employee administrator, InstanceModels.Client client) {
        addNewClientAndWriteDownInfoAboutEquipmentAndClient(equipment,client);
        addInfoAboutFixedEquipmentForReport(equipment);
        giveEquipment(equipment,  administrator);
        logger.info("InstanceModels.Administrator get equipment,calculate amount of money and move to service department");

    }

    private void addNewClientAndWriteDownInfoAboutEquipmentAndClient(Equipment.Equipment equipment,InstanceModels.Client client) {
        listOfClients.add(client.secondName);
        clientIdEquipmentId.put(equipment.equipmentId, client.idNumber);
        clientIdClientInstance.put(client.idNumber, client);
    }

    private int addInfoAboutFixedEquipmentForReport(Equipment.Equipment equipment) {
        amountFixedEquipment++;
        earnedMoney.add(equipment.getEquipmentPrice() * 0.1);
        return amountFixedEquipment;
    }

    public double getSummOfEarnedMoney() {
        double sum = 0;
        for (Double d : earnedMoney)
            sum += d;
        return sum;

    }

    public void getListOfClients() {
        System.out.println(listOfClients);

    }

    public void getReport() {
        logger.info("amount of Fixed Equipment.Equipment " + amountFixedEquipment);
    }
*/

}
