package com.qa.homework.employeeActions;

import com.qa.homework.models.Client;
import com.qa.homework.models.Equipment;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ClientActionsTest {
    Equipment coffeMachine0 = new Equipment("1", 2000, "good", "23/06/2018");
    Client client1 = new Client("CL1Test", "CL1Test", "CL1Test");
    ClientActions clientActions = new ClientActions(client1);

    @Test
    public void testThatClientCanGiveEquipmenttoServiceCentreAndGetEquipmentId() {
        try {
            assertEquals(clientActions.giveEquipment(coffeMachine0), coffeMachine0.equipmentId);
        } catch (Exception e) {
        }
    }

    @Test
    public void testGetEquipmentFromServiceCentreBytEquipmentId() {
        try {
            assertEquals(clientActions.getEquipment(clientActions.giveEquipment(coffeMachine0)), coffeMachine0.equipmentId);
        } catch (Exception e) {
        }
    }


}