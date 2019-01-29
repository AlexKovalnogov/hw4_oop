import org.apache.log4j.Logger;

public class ClientActions {

    Logger logger= Logger.getLogger(ClientActions.class);


    public String giveEquipment(Equipment equipment , Client client) {
        logger.info("Client gives equipment to administrator");
        return  new AdministratorActions().getEquipmentForFixing(equipment,client);
    }

    public String getEquipment(String equipmentId) {
        logger.info("Client gets fixed equipment111");
        return equipmentId;
    }
}
