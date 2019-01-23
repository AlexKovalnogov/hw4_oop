import java.util.List;

public class Employee implements ActionsWithEquipment{

    public String firstName;
    public String secondName;
    public String idNumber;
    public double salary;

    public Employee() {

    }

    public Employee(String firstName, String secondName, String idNumber, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.idNumber = idNumber;
        this.salary = salary;
    }

    public void getEquipmentForFixing(Equipment equipment, Employee employee,Client client){

    }

    public void giveEquipment(Equipment equipment) {
        System.out.print("giveEquipment");
    }

    public void getEquipmetn(Equipment equipment) {
        System.out.print("giveEquipment");
    }
}

