package com.solvd.financialInstitutions.utils.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConnectionPool {
    private ArrayList<String>connection =  new ArrayList<>();// ned to contains 5 conections
    private static Connection instance;

    private ConnectionPool(){ //singletonepattern
        Stream.of("conn1", "conn2", "thr3", "thr4", "thr5").forEach(s -> connection.add(s));

    }

    public static Connection getInstance() {
        //getConnection();
        //video 45/00
        //getFromList
        if(instance == null){		//if object notCreated
            instance = new Connection();	//
        }
        //synchronisedReleaseConnection(instance);
        return instance;		// return object

 }
    public static void synchronisedReleaseConnection(List paran){
        //set to list
     }
}
