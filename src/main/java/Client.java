import org.apache.log4j.Logger;

public class Client{

    public String firstName;
    public String secondName;
    public String idNumber;

Logger logger= Logger.getLogger(Client.class);


    public Client(String firstName, String secondName, String idNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.idNumber = idNumber;
    }

    public void giveEquipmetn(Equipment equipment , Employee administrator,Client client) {
     administrator.getEquipmentForFixing(equipment,administrator,client);
        logger.info("Client give equipment to administrator");
    }

    public void getEquipment(String equipmentId) {
        logger.info("Client get fixed equipment");
    }

}
