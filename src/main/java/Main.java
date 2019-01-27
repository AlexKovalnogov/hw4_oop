import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new GoToService().setData();
        Client client1 = new Client("CL1", "CL1", "CL1");
        Client client2 = new Client("CL2", "CL2", "CL2");


        Equipment coffeMachine = new Equipment("1", 25.5, "good", "23/06/2018");


        new ClientActions().giveEquipment(coffeMachine,)
   /*


        client1.giveEquipment(coffeMachine, administrator1, client1);

        client2.giveEquipment(coffeMachine, administrator1, client2);
        administrator1.getReport();



director.getListOfEmployees();
administrator1.getListOfClients();


*/


/*
        System.out.println("Input  position: 1)Director 2)Administrator 3)Serviceman 4) Client  0)Exit");

        int position;
        Scanner scanner = new Scanner(System.in);
        position = scanner.nextInt();
        boolean exit = true;
        //1  while (exit)
        switch (position) {
            case 0: {
                exit = false;
                break;
            }

            case 1: {


            }
            break;

            case 2: {
                break;
            }

            case 3: {
                break;
            }

            case 4: {


                break;
            }
        }*/

    }
}
