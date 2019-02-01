import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qa.models.Client;
import com.qa.models.Equipment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new GoToService().setData();
        Client client1 = new Client("CL1", "CL1", "CL1");
        Client client2 = new Client("CL2", "CL2", "CL2");
        Client client3 = new Client("CL3", "CL3", "CL3");
        Equipment coffeMachine0 = new Equipment("1", 2000, "good", "23/06/2018");
        Equipment coffeMachine1 = new Equipment("2", 1000, "good1", "23/06/2018");
        Equipment coffeMachine2 = new Equipment("2", 500, "good1", "24/06/2018");
       // new Menu().drawMainMenu();
        String jsonInString;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<Equipment> equipment1 = new ArrayList<Equipment>();
        equipment1.add(coffeMachine0);
        equipment1.add(coffeMachine1);

        try{
            FileWriter writer = new FileWriter( "D:\\GitHub\\hw4_oop\\src\\main\\resources\\equipment.json");
            gson.toJson(equipment1,writer);
            gson.toJson(equipment1,writer);
             //jsonInString = gson.toJson(coffeMachine0);
           // writer.flush();
            writer.close();
        }
        catch ( Exception e)
        {

        }

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
