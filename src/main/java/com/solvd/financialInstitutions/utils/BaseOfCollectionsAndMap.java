package com.solvd.financialInstitutions.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class BaseOfCollectionsAndMap {
    private static final Logger LOGGER = LogManager.getLogger(BusinessLogic.class);

    private ArrayList<Integer> ages = new ArrayList<>(110); // toDoadd to 3 base class constructors to create classes with preset variables
    private ArrayList<String> names = new ArrayList<>();
    private HashMap<Integer, String> FinInstClients = new HashMap<>();
    private ArrayList<Integer> sallarys = new ArrayList<>();
    private ArrayList<String> curensy = new ArrayList<>();


    public BaseOfCollectionsAndMap() {
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
    public String getRandomCurensy() {
        return curensy.get(randomisePos(curensy));
    }
    public Integer getRandomSallarys() {
        return sallarys.get(randomisePos(sallarys));
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
        IntStream.rangeClosed(18, 80).forEach(i -> ages.add(i));
        // (int i = 18; i <= 80; i++) {ages.add(i);//add age of people to the list        }
    }

    private void nameCreator() {
        for (String s : Arrays.asList("Angela", "Kristi", "Markus", "Martin")) {
            names.add(s);
        }
    }

    public void setNewName(String newName) {
        this.names.add(newName);
    }

    private <E> Integer randomisePos(ArrayList<E> listNames) {
        int randNumber = 0 + (int) (Math.random() * listNames.size());
        return randNumber;
    }

    private void sallarysCreator() {//toDo you can add values ​​from 1000 to 10000 with an ending of two 00
        IntStream.iterate(1000, i -> i <= 1150, i -> i + 50).forEach(i -> this.sallarys.add(i));
//        for (int i = 1000; i <= 1150; i += 50) {
//            this.sallarys.add(i);
//        }
    }

    public void setSallarys(ArrayList<Integer> sallarys) {
        this.sallarys = sallarys;
    }

    public void setCurensy(ArrayList<String> curensy) {
        this.curensy = curensy;
    }

    private void curensyCreator() {
        Arrays.asList("USD", "Hrn", "EUR").forEach(s -> this.curensy.add(s));
//        for (String s : Arrays.asList("USD", "Hrn", "EUR")) {
//            this.curensy.add(s);
//        }
    }


}
