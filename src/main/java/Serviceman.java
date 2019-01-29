import org.apache.log4j.Logger;

public class Serviceman extends Employee {

    private Logger logger = Logger.getLogger(Serviceman.class);

    public Serviceman() {
    }

    public Serviceman(String firstName, String secondName, String idNumber, double salary) {
        super(firstName, secondName, idNumber, salary);
    }

    public String fixProblemWithEquipment(Equipment equipment, Administrator a) {
        if (isFixed()) {

            giveEquipment(equipment);
        }
        logger.info("Problem with equipment was fixed");
        return equipment.equipmentId;//administrator.idNumber;
    }

    public String giveEquipment(Equipment equipment) {
        new AdministratorActions().giveEquipmentToClient(equipment);
        logger.info("Serviceman gives equipment to administrator");
        return equipment.equipmentId; //administrator.idNumber;
    }

    private boolean isFixed() {
        return true;
    }


}
