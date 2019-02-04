import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qa.homework.Service;
import com.qa.homework.models.Client;
import com.qa.homework.models.Equipment;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new GoToService().setData();
        Service service = new Service();
        Client client1 = new Client("CL1", "CL1", "CL1");
        Client client2 = new Client("CL2", "CL2", "CL2");
        Client client3 = new Client("CL3", "CL3", "CL3");
        Equipment coffeMachine0 = new Equipment("1", 2000, "good", "23/06/2018");
        Equipment coffeMachine1 = new Equipment("2", 1000, "good1", "21/06/2018");
        Equipment coffeMachine2 = new Equipment("2", 500, "good1", "24/06/2018");

/*List<Employee> list =new ConvertJsonToPOJO().convertJsonFileToListOfPojo();
        for(Employee w:list )
        {
            if (w instanceof Administrator) {
                System.out.println(w.toString());
            }
        }*/

        //new Menu().drawMainMenu();

        String jsonInString;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<Equipment> equipment1 = new ArrayList<Equipment>();
        equipment1.add(coffeMachine0);
        equipment1.add(coffeMachine1);
        String basePath = System.getProperty("user.dir");

        try {
            FileWriter writer = new FileWriter(basePath + "\\src\\main\\resources\\equipment.json");

            gson.toJson(equipment1, writer);
            //  gson.toJson(equipment1,writer);
            //jsonInString = gson.toJson(coffeMachine0);
            writer.flush();
            writer.close();
        } catch (Exception e) {

        }


    /*   try{
  new ClientActions(client1).giveEquipment(coffeMachine0);
  new ClientActions(client2).giveEquipment(coffeMachine1);
     new ClientActions(client3).giveEquipment(coffeMachine2);
         new DirectorActions().getRevenues("23/06/2018", TypeOfRevenue.MONTH);
        }
catch ( Exception e)
{
    System.out.println("Date lies between from and to date  "+e);
}*/


    }
}
