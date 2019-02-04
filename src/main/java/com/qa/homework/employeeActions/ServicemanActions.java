package com.qa.homework.employeeActions;

import com.qa.homework.models.Equipment;
import com.qa.homework.models.Administrator;
import org.apache.log4j.Logger;

public class ServicemanActions {

    private Logger logger = Logger.getLogger(ServicemanActions.class);

    public String fixProblemWithEquipment(Equipment equipment, Administrator administrator) throws Exception {
        logger.info("Problem with equipment was fixed");
        giveEquipment(equipment, administrator.getIdNumber());
        return equipment.equipmentId;//administrator.idNumber;
    }

    public String giveEquipment(Equipment equipment, String administratorId)  {
        logger.info("Serviceman gives equipment to administrator");
        new AdministratorActions().giveEquipmentToClient(equipment);
        // return equipment.equipmentId; //administrator.idNumber;
        return administratorId;
    }
}
