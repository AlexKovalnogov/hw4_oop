package EmployeeActions;

import Equipment.Equipment;
import InstanceModels.Client;
import org.apache.log4j.Logger;
import java.util.Scanner;


public class ClientActions {

    Logger logger= Logger.getLogger(ClientActions.class);


    public String giveEquipment(Equipment equipment , Client client) throws Exception {
        logger.info("InstanceModels.Client gives equipment to administrator");
        return  new AdministratorActions().getEquipmentForFixing(equipment,client);
    }

    public String getEquipment(String equipmentId) {
        logger.info("InstanceModels.Client gets fixed equipment");
        return equipmentId;
    }

  /*  public static void clientSubMenu(){
        Scanner scannerCl = new Scanner(System.in);
      System.out.println("adda");
        System.out.println("adda");
        //System.out.println("adda");
        int item =scannerCl.nextInt();

        switch (item){
            case 1:{
                System.out.println("1");

              //  new EmployeeActions.ClientActions().giveEquipment(); break;
            }

            case 2: System.out.println("2"); break;

            case 3:System.out.println("back"); break;

        }

    }*/
}
