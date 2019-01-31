package EmployeeActions;

import Equipment.Equipment;
import InstanceModels.Client;
import org.apache.log4j.Logger;

import java.util.Scanner;


public class ClientActions {

    Logger logger = Logger.getLogger(ClientActions.class);


    public String giveEquipment(Equipment equipment, Client client) throws Exception {
        logger.info("InstanceModels.Client gives equipment to administrator");
        return new AdministratorActions().getEquipmentForFixing(equipment, client);
    }

    public String getEquipment(String equipmentId) {
        logger.info("InstanceModels.Client gets fixed equipment");
        return equipmentId;
    }
}
