package com.solvd.financialInstitutions.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;

public class baseOfCollectionsAndMap {
    private static final Logger LOGGER = LogManager.getLogger(BusinessLogic.class);

    private ArrayList<Integer> ages = new ArrayList<>(110); // toDoadd to 3 base class constructors to create classes with preset variables
    private ArrayList<String> names = new ArrayList<>();
    private HashMap<Integer, String> FinInstClients = new HashMap<>();
    private ArrayList<Integer> sallarys = new ArrayList<>();
    private ArrayList<String> curensy = new ArrayList<>();


    public baseOfCollectionsAndMap() {
        ageCreator();
        nameCreator();
        hashMapCreator();
        sallarysCreator();
        curensyCreator();
    }

    public Integer getRandomAge() {
        return ages.get(randomisePos(ages));
    }

    public String getRandomName() {
        return names.get(randomisePos(names));
    }

    public void printHashMap() {
        //FinInstClients.values().forEach(System.out::println);
        //FinInstClients.keySet().forEach(System.out::println);
    }

    private void hashMapCreator() {
        FinInstClients.put(identificationNumber(), getRandomName());
    }

    private Integer identificationNumber() { //come up with something to generate a unique id (Collections.shuffle())
        int randNumber = 10000 + (int) (Math.random() * 100000);
        return randNumber;
    }

    private void ageCreator() {
        for (int i = 18; i <= 80; i++) {
            ages.add(i);//add age of people to the list
        }
    }

    private void nameCreator() {
        names.add("Angela");
        names.add("Kristi");
        names.add("Markus");
        names.add("Martin");
    }

    public void setNewName(String newName) {
        this.names.add(newName);
    }

    private <E> Integer randomisePos(ArrayList<E> listNames) {
        int randNumber = 0 + (int) (Math.random() * listNames.size());
        return randNumber;
    }

    private void sallarysCreator() {//toDo you can add values ​​from 1000 to 10000 with an ending of two 00
        this.sallarys.add(1000);
        this.sallarys.add(1100);
        this.sallarys.add(1200);
        this.sallarys.add(1300);
    }

    public void setSallarys(ArrayList<Integer> sallarys) {
        this.sallarys = sallarys;
    }
    public void setCurensy(ArrayList<String> curensy){
        this.curensy = curensy;

    }

    private void curensyCreator() {
        this.curensy.add("USD");
        this.curensy.add("Hrn");
        this.curensy.add("EUR");
    }


}
