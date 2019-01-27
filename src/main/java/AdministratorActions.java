import org.apache.log4j.Logger;

import java.util.List;

public class AdministratorActions implements iActionsWithEquipment {

    Logger logger = Logger.getLogger(AdministratorActions.class);


    private Serviceman getServicemanfromList() {
        Serviceman s = new Serviceman();
        for (int i = 0; i < Employee.listOfEmployees.size() - 1; i++) {
            if (Employee.listOfEmployees.get(i) instanceof Serviceman) {
                s = (Serviceman) Employee.listOfEmployees.get(i);
                break;
            }
        }
        return s;
    }

    public void giveEquipment(Equipment equipment, Employee administrator) {
        getServicemanfromList().fixProblemWithEquipment(equipment, administrator);
    }



    }

    public String getEquipmentForFixing(Equipment equipment, Employee administrator, Client client) {
        logger.info("Administrator get equipment,calculate amount of money and move to service department");
        return equipment.equipmentId;
    }
    public void giveEquipment(Equipment equipment) {
        Client currentClient = getClient(equipment);
        currentClient.getEquipment(equipment.equipmentId);
        logger.info("Administrator give equipment for client");
    }





/*
    Serviceman firstServiceman = new Serviceman("s1", "s1", "1", 1000);
    Serviceman secondServiceman = new Serviceman("s2", "s2", "2", 1200);*/

   /* public void giveEquipment(Equipment equipment) {
        Client currentClient = getClient(equipment);
        currentClient.getEquipment(equipment.equipmentId);
        logger.info("Administrator give equipment for client");
    }

    private Client getClient(Equipment equipment) {
        Client cl = clientIdClientInstance.get(clientIdEquipmentId.get(equipment.equipmentId));
        return cl;
    }

    public void giveEquipment(Equipment equipment, Employee administrator) {
        firstServiceman.fixProblemWithEquipment(equipment, administrator);
    }

    public void getEquipmentForFixing(Equipment equipment, Employee administrator, Client client) {
        addNewClientAndWriteDownInfoAboutEquipmentAndClient(equipment,client);
        addInfoAboutFixedEquipmentForReport(equipment);
        giveEquipment(equipment,  administrator);
        logger.info("Administrator get equipment,calculate amount of money and move to service department");

    }

    private void addNewClientAndWriteDownInfoAboutEquipmentAndClient(Equipment equipment,Client client) {
        listOfClients.add(client.secondName);
        clientIdEquipmentId.put(equipment.equipmentId, client.idNumber);
        clientIdClientInstance.put(client.idNumber, client);
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

    public void getListOfClients() {
        System.out.println(listOfClients);

    }

    public void getReport() {
        logger.info("amount of Fixed Equipment " + amountFixedEquipment);
    }
*/

}
