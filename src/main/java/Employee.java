import java.util.List;

public class Employee implements ActionsWithEquipment {

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

    public void getEquipmentForFixing(Equipment equipment, Employee employee, Client client) {

    }

  /*  public void giveEquipmetn() {
        System.out.print("giveEquipmetn");
    }

    public void getEquipmetn() {
        System.out.print("giveEquipmetn");
    }*/


}

