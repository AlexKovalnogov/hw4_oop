import EmployeeActions.*;
import Equipment.Equipment;
import InstanceModels.Administrator;
import InstanceModels.Client;

import java.util.Scanner;

public class Menu {


    public void drawMainMenu() {
        System.out.println("Input  position: 1)Director 2)Administrator 3)Serviceman 4)Client  0)Exit");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 0: {
                System.exit(0);
                break;
            }
            case 1: {
                drawDirectorMenu();
                break;
            }
            case 2: {
                drawAdministratorMenu();
                break;
            }

            case 3: {
                drawServicemanMenu();
                break;
            }
            case 4: {
                drawClientMenu();
                break;
            }
        }
    }

    public void drawClientMenu() {
        ClientActions clientActions = new ClientActions();
        System.out.print("1)сдать товар на ремонт" + "\n" +
                "2) забрать товар по идентификационному коду" + "\n" +
                "0) Назад" + "\n");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 0: {
                drawMainMenu();
                break;
            }
            case 1: {
                Equipment coffeMachine = new Equipment("1", 200, "good", "23/06/2018");
                Client client1 = new Client("CL1", "CL1", "CL1");
                clientActions.giveEquipment(coffeMachine, client1);
                break;
            }
            case 2: {
                clientActions.getEquipment(null);

                break;
            }
        }
    }

    public void drawAdministratorMenu() {
        AdministratorActions administratorActions = new AdministratorActions();
        System.out.print("1) Посмотреть всех клиентов" + "\n" +
                "2) взять на ремонт технику(цена ремонта = 10% от суммы товара)" + "\n" +
                "3) показать отчет(количество отремонтированной техники за неделю)" + "\n" +
                "4)  отдать отремонтированный товар клиенту" + "\n" +
                "5)передать технику специалисту по ремонту" + "\n" +
                "0) Назад" + "\n");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 0: {
                drawMainMenu();
                break;
            }
            case 1: {
                administratorActions.getListOfClients();
                break;
            }
            case 2: {
                administratorActions.getEquipmentForFixing(null, null);
                break;
            }

            case 3: {
                administratorActions.getReportAboutFixedEquipment(Administrator.amountFixedEquipment);
                break;
            }
            case 4: {
                administratorActions.giveEquipmentToClient(null);
                break;
            }
            case 5: {
                administratorActions.giveEquipment(null, null);
                break;
            }
        }
    }

    public void drawDirectorMenu() {
        DirectorActions directorActions = new DirectorActions();
        System.out.print("1) сменить место расположения сервисного центра" + "\n" +
                "2) нанять сотрудника" + "\n" +
                "3) уволить сотрудника" + "\n" +
                "4) платить налог" + "\n" +
                "5) посмотреть всех сотрудников" + "\n" +
                "6) увеличить зарплату сотрудникам на 10%" + "\n" +
                "7) посмотреть доход за месяц " + "\n" +
                "8) заплатить з/п сотрудникам" + "\n" +
                "0) Назад" + "\n");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 0: {
                drawMainMenu();
                break;
            }
            case 1: {
                directorActions.changeLocationOfServiceCenter();
                break;
            }
            case 2: {
                System.out.println("Input  position: Director Administrator Serviceman" + "\n");
                Scanner pos = new Scanner(System.in);
                directorActions.hireEmployee(StaffPositionInServiceCentre.valueOf(pos.nextLine().toUpperCase()));
                pos.close();
                break;
            }
            case 3: {
                System.out.println("Input index Employee for fire" + "\n");
                Scanner index = new Scanner(System.in);
                directorActions.fireEmployee(index.nextInt());
                index.close();
                break;
            }
            case 4: {
                directorActions.payTax();
                break;
            }
            case 5: {
                directorActions.getListOfEmployees();
                break;
            }
            case 6: {
                directorActions.increaseSalaryForEmployees();
                break;
            }
            case 7: {

                break;
            }
            case 8: {
                directorActions.paySalary();
                break;
            }
        }
    }

    public void drawServicemanMenu() {
        ServicemanActions servicemanActions = new ServicemanActions();
        System.out.print("1)ремонтировать" + "\n" +
                "2) возвращать отремонтированную технику администратору" + "\n" +
                "0) Назад" + "\n");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 0: {
                drawMainMenu();
                break;
            }
            case 1: {
                servicemanActions.fixProblemWithEquipment(null, null);
                break;
            }
            case 2: {
                servicemanActions.giveEquipment(null, null);
                break;
            }
        }
    }
}
