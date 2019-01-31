import com.qa.employeeActions.*;
import com.qa.models.Equipment;
import com.qa.models.Administrator;
import com.qa.models.Client;
import org.apache.log4j.Logger;
import java.util.Scanner;


public class Menu {
    Logger logger = Logger.getLogger(Menu.class);


    public void drawMainMenu() {
        System.out.println("Input  position: 1)Director 2)Administrator 3)Serviceman 4)Client  0)Exit");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 0: {
                System.exit(0);
                break;
            }
            case 1: {
                try {
                    drawDirectorMenu();
                } catch (Exception e) {
                    logger.info("Action is unavailable " + e);
                }
                break;
            }
            case 2: {
                try {
                    drawAdministratorMenu();
                } catch (Exception e) {
                    logger.info("Action is unavailable " + e);
                }
                break;
            }
            case 3: {
                try {
                    drawServicemanMenu();
                } catch (Exception e) {
                    logger.info("Action is unavailable " + e);
                }
                break;
            }
            case 4: {
                try {
                    drawClientMenu();
                } catch (Exception e) {
                    logger.info("Action is unavailable " + e);
                }
                break;
            }
        }
    }

    private void drawClientMenu()throws Exception  {
        Client client1 = new Client("CL1", "CL1", "CL1");
        ClientActions clientActions = new ClientActions(client1);
        System.out.print("1)сдать товар на ремонт" + "\n" +
                "2)забрать товар по идентификационному коду" + "\n" +
                "0)Назад" + "\n");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 0: {
                drawMainMenu();
                break;
            }
            case 1: {
                    Equipment coffeMachine = new Equipment("1", 200, "good", "23/06/2018");
                    clientActions.giveEquipment(coffeMachine);

                break;
            }
            case 2: {
                clientActions.getEquipment(null);

                break;
            }
        }
    }

    private void drawAdministratorMenu() {
        AdministratorActions administratorActions = new AdministratorActions();
        System.out.print("1) Посмотреть всех клиентов" + "\n" +
                "2)взять на ремонт технику(цена ремонта = 10% от суммы товара)" + "\n" +
                "3)показать отчет(количество отремонтированной техники за неделю)" + "\n" +
                "4)отдать отремонтированный товар клиенту" + "\n" +
                "5)передать технику специалисту по ремонту" + "\n" +
                "0)Назад" + "\n");
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
                try {
                    administratorActions.getEquipmentForFixing(null, null);
                }
                catch( Exception e){
                    System.out.print("sss");
                }
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

    private void drawDirectorMenu() throws  Exception{
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
             //   directorActions.getRevenues("23/06/1990",DAY) ;
                break;
            }
            case 8: {
                directorActions.paySalary();
                break;
            }
        }
    }

    private void drawServicemanMenu() {
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
