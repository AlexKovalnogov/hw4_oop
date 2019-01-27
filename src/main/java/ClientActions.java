import org.apache.log4j.Logger;

public class ClientActions {

    Logger logger= Logger.getLogger(ClientActions.class);


    public String giveEquipment(Equipment equipment , Employee administrator, Client client) {
        logger.info("Client give equipment to administrator");
        return  administrator.getEquipmentForFixing(equipment,administrator,client);
    }

    public void getEquipment(String equipmentId) {
        logger.info("Client get fixed equipment");
    }
}
