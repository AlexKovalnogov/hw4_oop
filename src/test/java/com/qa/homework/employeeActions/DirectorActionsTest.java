package com.qa.homework.employeeActions;

import com.qa.homework.JsotToPOJO.ConvertJsonToPOJO;
import com.qa.homework.Service;
import com.qa.homework.models.Client;
import com.qa.homework.models.Equipment;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class DirectorActionsTest {
    private Equipment coffeMachine0;
    private Client client1;
    private DirectorActions directorActions;
    private  ClientActions clientActions;
    private Service service;

    @BeforeMethod
    public void setUp() {
        coffeMachine0 = new Equipment("1", 2000, "good", "23/06/2018");
        client1 = new Client("CL1Test", "CL1Test", "CL1Test");
        directorActions = new DirectorActions();
        service = new Service();
        clientActions=new ClientActions(client1);
    }

    @Test
    public void testThatDirectorCanChangeLocationOfServiceCenter() {
        Assert.assertEquals(directorActions.changeLocationOfServiceCenter("this is new Location of service centre"),"this is new Location of service centre");
    }

    @Test
    public void testThatDirectorCanHireNewEmployee() {
        List<String> listOfVar=new ArrayList();
        listOfVar.add("q");
        listOfVar.add("w");
        listOfVar.add("23");
        listOfVar.add("1000");
        Assert.assertEquals(directorActions.hireEmployee(StaffPositionInServiceCentre.ADMINISTRATOR,listOfVar).size(),new ConvertJsonToPOJO().convertJsonFileToListOfPojo().size());
    }

    @Test
    public void testThatDirectorCanFireEmployee() {
        Assert.assertEquals(directorActions.fireEmployee(3).size(),new ConvertJsonToPOJO().convertJsonFileToListOfPojo().size() );
    }

    @Test
    public void testPayTax() {

    }

    @Test
    public void testGetListOfEmployees() {

    }

    @Test
    public void testIncreaseSalaryForEmployees() {
    }

    @Test
    public void testGetRevenues() {
    }
}