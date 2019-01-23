import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


public class Administrator extends Employee {

    private Logger logger = Logger.getLogger(Administrator.class);

    public List<Double> moneyForFixing = new ArrayList();
    public HashMap<String, String> clientIdEquipmentId = new HashMap();
    public HashMap<String, Client> clientIdClientInstance = new HashMap();
    public int amountFixedEquipment;
    private HashSet<String> listOfClients = new HashSet<String>();

    public Administrator() {
    }

    public Administrator(String firstName, String secondName, String idNumber, double salary) {
        super(firstName, secondName, idNumber, salary);
    }

    Serviceman firstServiceman = new Serviceman("s1", "s1", "1", 1000);
    Serviceman secondServiceman = new Serviceman("s2", "s2", "2", 1200);


    public void giveEquipment(Equipment equipment) {
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
        addNewClient(client.secondName);
        clientIdEquipmentId.put(equipment.equipmentId, client.idNumber);
        clientIdClientInstance.put(client.idNumber, client);
        infoAboutFixedEquipmentForReport(equipment);
        giveEquipment(equipment,  administrator);
        logger.info("Administrator get equipment,calculate amount of money and move to service department");

    }

    private void addNewClient(String clientSecondName) {
        listOfClients.add(clientSecondName);
    }

    private void infoAboutFixedEquipmentForReport(Equipment equipment) {
        amountFixedEquipment++;
        moneyForFixing.add(equipment.getEquipmentPrice() * 0.1);

    }

    public void getListOfClients() {
        System.out.println(listOfClients);

    }

    public void getReport() {
        logger.info("amount of Fixed Equipment " + amountFixedEquipment);
    }

}
