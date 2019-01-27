import java.util.ArrayList;
import java.util.List;

public class Employee// implements iActionsWithEquipment
{

    public String firstName;
    public String secondName;
    public String idNumber;
    public  double salary;
    public static List<Employee> listOfEmployees = new ArrayList();


    public Employee() {

    }

    public Employee(String firstName, String secondName, String idNumber, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.idNumber = idNumber;
        this.salary = salary;
    }
  public String getEquipmentForFixing(Equipment equipment, Employee employee,Client client){
        return "1";
    }

}

