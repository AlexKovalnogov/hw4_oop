package com.qa.homework.employeeActions;

import com.qa.homework.Service;
import com.qa.homework.models.Administrator;
import com.qa.homework.models.Client;
import com.qa.homework.models.Equipment;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ServicemanActionsTest {

    private Equipment coffeMachine0;
    private ServicemanActions servicemanActions;
    private Service service;
    private Administrator administrator;

    @BeforeMethod
    public void setUp() throws Exception {
        coffeMachine0 = new Equipment("1", 2000, "good", "23/06/2018");
        servicemanActions = new ServicemanActions();
        service = new Service();
        administrator = new AdministratorActions().getAdministratorFromList();
    }

    @Test
    public void testThatServicemanCanFixProblemWithEquipment() {
        try {
            Assert.assertEquals(servicemanActions.fixProblemWithEquipment(coffeMachine0, administrator), coffeMachine0.equipmentId);
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }
    }

    @Test
    public void testGiveEquipment() {
        try {
            Assert.assertEquals(servicemanActions.giveEquipment(coffeMachine0, administrator), administrator.getIdNumber());
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }
    }
}