package EmployeeActions;

import Equipment.Equipment;
import InstanceModels.Administrator;
import org.apache.log4j.Logger;

public class ServicemanActions {

    private Logger logger = Logger.getLogger(ServicemanActions.class);

    public String fixProblemWithEquipment(Equipment equipment, Administrator administrator) throws NullPointerException {
        logger.info("Problem with equipment was fixed");
        giveEquipment(equipment, administrator.idNumber);


        return equipment.equipmentId;//administrator.idNumber;
    }

    public String giveEquipment(Equipment equipment, String administratorId)throws NullPointerException {
        logger.info("InstanceModels.Serviceman gives equipment to administrator");
        new AdministratorActions().giveEquipmentToClient(equipment);
        // return equipment.equipmentId; //administrator.idNumber;
        return administratorId;
    }
}
