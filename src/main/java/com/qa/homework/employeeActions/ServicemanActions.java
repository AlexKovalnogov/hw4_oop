package com.qa.homework.employeeActions;

import com.qa.homework.exceptions.ServicemanException;
import com.qa.homework.models.Equipment;
import com.qa.homework.models.Administrator;
import org.apache.log4j.Logger;

public class ServicemanActions {

    private Logger logger = Logger.getLogger(ServicemanActions.class);

    public String fixProblemWithEquipment(Equipment equipment, Administrator administrator) throws Exception {
        if (equipment == null || administrator == null) {
            throw new ServicemanException(" Equipment or administrator is null");
        } else {
            logger.info("Problem with equipment was fixed");
            giveEquipment(equipment, administrator);
            return equipment.equipmentId;
        }
    }

    public String giveEquipment(Equipment equipment, Administrator administrator) throws Exception {
        logger.info("Serviceman gives equipment to administrator");
        new AdministratorActions().giveEquipmentToClient(equipment);
        return administrator.getIdNumber();
    }
}
