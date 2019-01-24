import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Administrator administrator1 = new Administrator("A1", "A1", "1", 500);
        Employee administrator2 = new Administrator("A2", "A2", "2", 600);
        Serviceman firstServiceman = new Serviceman("s1", "s1", "3", 1000);
        Serviceman secondServiceman = new Serviceman("s2", "s2", "4", 1200);
        Director director  = new Director("D1", "D1", "5", 2000);
        Employee employee = new Employee();
        employee.listOfEmployees.add(administrator1);
        employee.listOfEmployees.add(administrator2);
        employee.listOfEmployees.add(firstServiceman);
        employee.listOfEmployees.add(secondServiceman);
        employee.listOfEmployees.add(director);

        Client client1 = new Client("CL1", "CL1", "CL1");
        Client client2 = new Client("CL2", "CL2", "CL2");


        Equipment coffeMachine = new Equipment("1", 25.5, "good", "23/06/2018");


        client1.giveEquipment(coffeMachine, administrator1, client1);
        client1.giveEquipment(coffeMachine, administrator1, client1);
        client2.giveEquipment(coffeMachine, administrator1, client2);
        administrator1.getReport();











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
        }

    }
}
