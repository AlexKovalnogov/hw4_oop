package EmployeeActions;

import Equipment.Equipment;
import InstanceModels.*;
import Interfaces.iActionsWithEquipment;
import org.apache.log4j.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import static InstanceModels.Administrator.amountFixedEquipment;
import static InstanceModels.Administrator.earnedMoney;


public class AdministratorActions implements iActionsWithEquipment {

    Logger logger = Logger.getLogger(AdministratorActions.class);
    private Serviceman getServicemanFromList() throws NullPointerException {
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

    public String getEquipmentForFixing(Equipment equipment, Client client) throws Exception {
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

    public String giveEquipmentToClient(Equipment equipment)throws NullPointerException {
        Client client = getClient(equipment);
        logger.info("InstanceModels.Administrator gives equipment for client   " + equipment.equipmentId + " " + client.firstName);
        new ClientActions().getEquipment(equipment.equipmentId);
        return equipment.equipmentId + client.firstName;
    }

    private Client getClient(Equipment equipment) {
        return Administrator.clientIdClientInstance.get(Administrator.clientIdEquipmentId.get(equipment.equipmentId));
    }


    private void addNewClientAndWriteDownInfoAboutEquipmentAndClient(Equipment equipment, Client client)  {
        Administrator.listOfClients.add(client.secondName);
        Administrator.clientIdEquipmentId.put(equipment.equipmentId, client.idNumber);
        Administrator.clientIdClientInstance.put(client.idNumber, client);
    }

    private int addInfoAboutFixedEquipmentForReport(Equipment equipment) throws Exception {
        amountFixedEquipment++;
        earnedMoney.add(equipment.getEquipmentPrice() * 0.1);
        Date date=convertStringDateIntoDate(equipment.getEquipmentDateOfBuying());
        Administrator.earnedMoneyEachDay.put(date,equipment.getEquipmentPrice() * 0.1);
        return amountFixedEquipment;
    }

    public double getSummOfEarnedMoney() {
        double sum = 0;
        for (Double d : earnedMoney)
            sum += d;
        return sum;
    }

    public int getReportAboutFixedEquipment(int amountFixedEquipment) throws NullPointerException {
        logger.info("amount of Fixed Equipment.Equipment = " + amountFixedEquipment);
        return amountFixedEquipment;
    }

    public Set<String> getListOfClients() {
        logger.info("List of clients is present");
        return Administrator.listOfClients;

    }
private Date convertStringDateIntoDate(String date)throws  Exception{
  return new SimpleDateFormat("dd/MM/yyyy").parse(date);
}

}
