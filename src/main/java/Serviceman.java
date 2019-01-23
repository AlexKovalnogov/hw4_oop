import org.apache.log4j.Logger;

public class Serviceman extends Employee {

    private Logger logger = Logger.getLogger(Serviceman.class);

    public Serviceman() {
    }

    public Serviceman(String firstName, String secondName, String idNumber, double salary) {
        super(firstName, secondName, idNumber, salary);
    }

    public void fixProblemWithEquipment(Equipment equipment, Administrator administrator) {
        if (isFixed()) {
            giveEquipmetn(equipment, administrator);
        }
        logger.info("Problem with equipment was fixed");

    }

    public void giveEquipmetn(Equipment equipment, Administrator administrator) {
     administrator.giveEquipment( equipment);
        logger.info("Serviceman gives equipment to administrator");
    }

    private boolean isFixed() {
        return true;
    }


}
