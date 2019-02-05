package com.qa.homework.employeeActions;

import com.qa.homework.JsotToPOJO.ConvertJsonToPOJO;
import com.qa.homework.Service;
import com.qa.homework.models.Administrator;
import com.qa.homework.models.Client;
import com.qa.homework.models.Equipment;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AdministratorActionsTest {
    private Equipment coffeMachine0;
    private Client client1;
    private AdministratorActions administratorActions;
    private  ClientActions clientActions;
    private Service service;

    @BeforeMethod
    public void setUp() {
        coffeMachine0 = new Equipment("1", 2000, "good", "23/06/2018");
        client1 = new Client("CL1Test", "CL1Test", "CL1Test");
        administratorActions = new AdministratorActions();
        service = new Service();
        clientActions=new ClientActions(client1);
    }

    @Test
    public void testThatAdministratorGetEquipmentForFixingAndReturnEquipmentIdToClient() throws Exception {
        Assert.assertEquals(administratorActions.getEquipmentForFixing(coffeMachine0, client1), coffeMachine0.equipmentId);

    }

    @Test
    public void testThatAdministratirGivesEquipmentToServiceman() throws Exception {
        Administrator administrator = administratorActions.getAdministratorFromList();
        Assert.assertEquals(administratorActions.giveEquipmentToServiceman(coffeMachine0, administrator), administratorActions.getServicemanFromList().getIdNumber());
    }

    @Test
    public void testThatFunctionGetSumOfEarnedMoneyReturnRightAmountOfMoney() throws Exception {
        clientActions.giveEquipment(coffeMachine0);
        clientActions.giveEquipment(coffeMachine0);
        Assert.assertEquals(administratorActions.getSumOfEarnedMoney(),400.0);
    }

    @Test
    public void testThatFunctionGetReportAboutFixedEquipmentReturnRightAmountOfFixedEquipment()throws Exception {
        clientActions.giveEquipment(coffeMachine0);
        clientActions.giveEquipment(coffeMachine0);
        Assert.assertEquals(administratorActions.getReportAboutFixedEquipment(Service.amountFixedEquipment),Service.amountFixedEquipment);
    }

    @Test
    public void testGetListOfClients() {
        Assert.assertEquals(administratorActions.getListOfClients().size(),new ConvertJsonToPOJO().convertJsonFileToPojoSetOfClient().size());
    }
}