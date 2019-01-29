import EmployeeActions.*;
import Equipment.Equipment;
import InstanceModels.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new GoToService().setData();
       Client client1 = new Client("CL1", "CL1", "CL1");
     Client client2 = new Client("CL2", "CL2", "CL2");


        Equipment coffeMachine = new Equipment("1", 200, "good", "23/06/2018");
        Equipment coffeMachine1 = new Equipment("2", 1000, "good1", "23/07/2018");
new  Menu().drawMainMenu();
  //    new ClientActions().giveEquipment(coffeMachine,client1);
   //     new ClientActions().giveEquipment(coffeMachine1,client2);
//new DirectorActions().payTax();

   /*
String pattern = "yyyy-MM-dd";
SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

String date = simpleDateFormat.format(new Date());
System.out.println(date);

        client1.giveEquipment(coffeMachine, administrator1, client1);

        client2.giveEquipment(coffeMachine, administrator1, client2);
        administrator1.getReport();



director.getListOfEmployees();
administrator1.getListOfClients();


*/



    }
}
