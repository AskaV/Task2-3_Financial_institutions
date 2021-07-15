package com.solvd.financialInstitutions.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class baseOfCollectionsAndMap {
    private ArrayList<Integer> ages = new ArrayList<>(110);
    private ArrayList<String> names = new ArrayList<>();
    private HashMap<Integer, String> FinInstClients = new HashMap<>();
    //sallarys
    //curensy

    public baseOfCollectionsAndMap() {
        ageCreator();
        nameCreator();
        hashMapCreator();


    }

    public Integer getRandomAge() {
        return ages.get(randomisePos(ages));
    }

    public String getRandomName() {
        return names.get(randomisePos(names));
    }

    public void printHashMap() {
        FinInstClients.values().forEach(System.out::println);
        FinInstClients.keySet().forEach(System.out::println);

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


}
