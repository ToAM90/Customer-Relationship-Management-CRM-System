package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {

    private String name;
    private String species;
    private List<String> vaccinations = new ArrayList<>();

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String listVaccinations(){
        String vaccines = "";
        if(this.vaccinations.size() == 0){
            return "";
        }
        for(String vaccine : vaccinations){
            vaccines += vaccine + ", ";
        } vaccines.trim();
        vaccines = vaccines.substring(0, vaccines.length()-2);
        return vaccines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List vaccinations) {
        this.vaccinations = vaccinations;
    }
}
