package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
public class PetTest{

    private Pet newPet;

    @Before
        public void setNewPet(){
        newPet = new Pet("Test Name", "Test Species");

    }

    @Test
    public void vaccinations_list_display_2_vaccinations(){
        String expected = "Vac1, Vac2";
        List<String> testList = new ArrayList<>();
        testList.add("Vac1");
        testList.add("Vac2");

        newPet.setVaccinations(testList);

        Assert.assertEquals(expected, newPet.listVaccinations());
    }

    @Test
    public void vaccinations_list_display_0_vaccinations(){
        String expected = "";
        List<String> testLst = new ArrayList<>();
        newPet.setVaccinations(testLst);

        Assert.assertEquals(expected, newPet.listVaccinations());
    }

}
