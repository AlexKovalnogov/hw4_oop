package com.qa.homework.employeeActions;

import com.qa.homework.Service;
import com.qa.homework.exceptions.ExceptionGetSuitableEmployee;
import com.qa.homework.interfaces.IActionsWithEquipment;
import com.qa.homework.models.*;
import com.qa.homework.models.*;
import com.qa.homework.models.Equipment;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import static com.qa.homework.Service.amountFixedEquipment;
import static com.qa.homework.Service.earnedMoney;
import static com.qa.homework.Service.listOfClients;

public class AdministratorActions implements IActionsWithEquipment {

 /*   private final Administrator administrator;

    public AdministratorActions(Administrator administrator) {
        this.administrator = administrator;
    }*/

    Logger logger = Logger.getLogger(AdministratorActions.class);

    private Serviceman getServicemanFromList() throws Exception {
        //change to foreach

        for (Employee employee : Service.listOfEmployees) {
            if (employee instanceof Serviceman) {
                return (Serviceman) employee;
            }
        }
        throw new ExceptionGetSuitableEmployee("Problem  caused by getting  particular Employee");
     /*
        for (int i = 0; i < Service.listOfEmployees.size() - 1; i++) {
            if (Service.listOfEmployees.get(i) instanceof Serviceman) {
                 return  (Serviceman) Service.listOfEmployees.get(i);
                // break;
            }
        }
        throw new  Exception();*/
    }

    private Administrator getAdministratorFromList() throws Exception {
        //change to foreach
        for (Employee employee : Service.listOfEmployees) {
            if (employee instanceof Administrator) {
                return (Administrator) employee;
            }
        }
        throw new ExceptionGetSuitableEmployee("Problem  caused by getting  particular Employee");
    }
 /*   private Administrator getAdministratorFromList() {
        Administrator administrator = new Administrator();
        for (int i = 0; i < Service.listOfEmployees.size() - 1; i++) {
            if (Service.listOfEmployees.get(i) instanceof Administrator) {
                administrator = (Administrator) Service.listOfEmployees.get(i);
                break;
            }
        }
        return administrator;
    }*/


    public String getEquipmentForFixing(Equipment equipment, Client client) throws Exception {
        registerNewClient(equipment, client);
        addInfoAboutFixedEquipmentForReport(equipment);
        Administrator administrator = getAdministratorFromList();
        logger.info("Administrator gets equipment,calculate amount of money and move to service department");
        giveEquipmentToServiceman(equipment, administrator);
        return equipment.equipmentId;

    }

    public String giveEquipmentToServiceman(Equipment equipment, Administrator administrator) throws Exception {
        logger.info("Administrator gives equipment to serviceman");
        new ServicemanActions().fixProblemWithEquipment(equipment, administrator);
        return getServicemanFromList().getIdNumber();
    }

    public String giveEquipmentToClient(Equipment equipment) {
        Client client = getClient(equipment);
        logger.info("Administrator gives equipment for client   " + equipment.equipmentId + " " + client.firstName);
        new ClientActions(client).getEquipment(equipment.equipmentId);
        return equipment.equipmentId + client.firstName;
    }

    private Client getClient(Equipment equipment) {
        return Service.clientIdClientInstance.get(Service.clientIdEquipmentId.get(equipment.equipmentId));
    }

    private void registerNewClient(Equipment equipment, Client client) {
        listOfClients.add(client.secondName);
        Service.clientIdEquipmentId.put(equipment.equipmentId, client.idNumber);
        Service.clientIdClientInstance.put(client.idNumber, client);

    }

    private int addInfoAboutFixedEquipmentForReport(Equipment equipment) throws Exception {
        amountFixedEquipment++;
        earnedMoney.add(equipment.getEquipmentPrice() * 0.1);
        Date date = convertStringDateIntoDate(equipment.getEquipmentDateOfBuying());
        Service.datesOfGettingRevenues.add(date);
        return amountFixedEquipment;
    }

    public double getSummOfEarnedMoney() {
        double sum = 0;
        for (Double d : earnedMoney)
            sum += d;
        return sum;
    }

    public int getReportAboutFixedEquipment(int amountFixedEquipment) throws NullPointerException {
        logger.info("amount of Fixed Equipment = " + amountFixedEquipment);
        return amountFixedEquipment;
    }

    public Set<String> getListOfClients() {
        logger.info("List of clients is present");
        return Service.listOfClients;

    }

    private Date convertStringDateIntoDate(String date) throws Exception {
        return new SimpleDateFormat("dd/MM/yyyy").parse(date);
    }

}
