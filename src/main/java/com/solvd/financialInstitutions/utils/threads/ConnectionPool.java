package com.solvd.financialInstitutions.utils.threads;

public class ConnectionPool {
    private static Connection instance;

    private ConnectionPool(){ //singletonepattern
    }
    public static synchronized Connection getInstance() {

        if(instance == null){		//if object notCreated
            instance = new Connection();	//
        }
        return instance;		// return object
 }

}
