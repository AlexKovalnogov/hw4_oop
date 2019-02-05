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
    public void setUp()throws  Exception {
        coffeMachine0 = new Equipment("1", 2000, "good", "23/06/2018");
        servicemanActions = new ServicemanActions();
        service = new Service();
      administrator= new AdministratorActions().getAdministratorFromList();
    }
    @Test
    public void testThatServicemanCanFixProblemWithEquipment()throws  Exception   {
        Assert.assertEquals(servicemanActions.fixProblemWithEquipment(coffeMachine0,administrator),coffeMachine0.equipmentId);
    }

    @Test
    public void testGiveEquipment( ) throws  Exception{
        Assert.assertEquals(servicemanActions.giveEquipment(coffeMachine0,administrator),administrator.getIdNumber());
    }
}