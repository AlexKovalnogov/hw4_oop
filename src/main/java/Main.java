import com.qa.models.Equipment;
import com.qa.models.*;

public class Main {
    public static void main(String[] args) {
        new GoToService().setData();
        Client client1 = new Client("CL1", "CL1", "CL1");
        Client client2 = new Client("CL2", "CL2", "CL2");
        Client client3 = new Client("CL3", "CL3", "CL3");
        Equipment coffeMachine0 = new Equipment("1", 2000, "good", "23/06/2018");
        Equipment coffeMachine1 = new Equipment("2", 1000, "good1", "23/06/2018");
        Equipment coffeMachine2 = new Equipment("2", 500, "good1", "24/06/2018");
        new Menu().drawMainMenu();


/*
       try{
  new ClientActions().giveEquipment(coffeMachine0,client1);
   new ClientActions().giveEquipment(coffeMachine1,client2);
        new ClientActions().giveEquipment(coffeMachine2,client3);
            new DirectorActions().getRevenues("23/06/2018",DAY);
        }
catch ( Exception e)
{
    System.out.println("Date lies between from and to date");
}

*/


    }
}
