package com.qa.employeeActions;

import com.qa.models.Equipment;
import com.qa.models.Client;
import org.apache.log4j.Logger;


public class ClientActions {

    Logger logger = Logger.getLogger(ClientActions.class);

    private final Client client;

    public ClientActions(Client client) {
        this.client = client;
    }

    public String giveEquipment(Equipment equipment) throws Exception {
        logger.info("Client gives equipment to administrator");
        return new AdministratorActions().getEquipmentForFixing(equipment, client);
    }

    public String getEquipment(String equipmentId) {
        logger.info("Client gets fixed equipment");
        return equipmentId;
    }
}
