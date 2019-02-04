package com.qa.homework.employeeActions;

import com.qa.homework.Service;
import com.qa.homework.models.Client;
import com.qa.homework.models.Equipment;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ClientActionsTest {
    Equipment coffeMachine0;
    Client client1;
    ClientActions clientActions;

    @BeforeMethod
    public void setUp() {

        coffeMachine0 = new Equipment("1", 2000, "good", "23/06/2018");
        client1 = new Client("CL1Test", "CL1Test", "CL1Test");
        clientActions = new ClientActions(client1);
    }

    @Test
    public void testThatClientCanGiveEquipmenttoServiceCentreAndGetEquipmentId() {
        try {
            assertEquals(clientActions.giveEquipment(coffeMachine0), coffeMachine0.equipmentId);
        } catch (Exception e) {
            System.out.print("Exception " + e);
        }
    }

    @Test
    public void testGetEquipmentFromServiceCentreBytEquipmentId() {
        try {
            assertEquals(clientActions.getEquipment(clientActions.giveEquipment(coffeMachine0)), coffeMachine0.equipmentId);
        } catch (Exception e) {
            System.out.print("Exception " + e);
        }
    }


}