package com.qa.homework;

import com.qa.homework.employeeActions.*;
import com.qa.homework.models.Equipment;
import com.qa.homework.models.Client;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
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

    private void drawClientMenu() throws Exception {
        Client client = new Client("CL", "CL", "CL");
        ClientActions clientActions = new ClientActions(client);
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
                Equipment coffeMachine = new Equipment("12", 2020, "good", "23/06/2018");
                clientActions.giveEquipment(coffeMachine);
                break;
            }
            case 2: {
                clientActions.getEquipment(null);
                break;
            }
            default: {
                System.out.print("Wrong input" + "\n");
                drawClientMenu();
            }
        }
    }

    private void drawAdministratorMenu() throws Exception {
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

            }
            case 1: {
                administratorActions.getListOfClients();
                drawAdministratorMenu();
            }
            case 2: {
                try {
                    administratorActions.getEquipmentForFixing(null, null);
                } catch (Exception e) {
                    System.out.print("sss");
                }
                break;
            }

            case 3: {
                administratorActions.getReportAboutFixedEquipment(Service.amountFixedEquipment);
                break;
            }
            case 4: {
                administratorActions.giveEquipmentToClient(null);
                break;
            }
            case 5: {
                administratorActions.giveEquipmentToServiceman(null, null);
                break;
            }
            default: {
                System.out.print("Wrong input" + "\n");
                drawAdministratorMenu();
            }
        }
    }

    private void drawDirectorMenu() throws Exception {
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
                Scanner scan = new Scanner(System.in);
                String inputData = scan.nextLine();
                directorActions.changeLocationOfServiceCenter(inputData);
                //  drawDirectorMenu();
                break;
            }
            case 2: {
                System.out.println("Input  position: Director Administrator Serviceman" + "\n");
                Scanner pos = new Scanner(System.in);
                String position = pos.nextLine();
                String arrayOfLabels[] = {"Input first name: ", "Input surname name: ", "Input id: ", "Input salary:"};
                List<String> variablesForEmployee = new ArrayList<String>();
                Scanner var = new Scanner(System.in);
                for (int i = 0; i < arrayOfLabels.length; i++) {
                    System.out.println(arrayOfLabels[i]);
                    String buf = var.nextLine();
                    variablesForEmployee.add(buf);
                }
                scanner.close();
                directorActions.hireEmployee(StaffPositionInServiceCentre.valueOf(position.toUpperCase()), variablesForEmployee);
                pos.close();
                var.close();
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
                directorActions.getRevenues("23/06/1990", TypeOfRevenue.DAY);
                break;
            }
            case 8: {
                directorActions.paySalary();
                break;
            }
            default: {
                System.out.print("Wrong input" + "\n");
                drawDirectorMenu();
            }
        }
    }

    private void drawServicemanMenu() throws Exception {
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
            default: {
                System.out.print("Wrong input" + "\n");
                drawServicemanMenu();
            }
        }
    }
}
