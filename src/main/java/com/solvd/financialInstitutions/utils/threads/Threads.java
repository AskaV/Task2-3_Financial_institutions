package com.solvd.financialInstitutions.utils.threads;

import java.lang.reflect.Method;

import static com.solvd.financialInstitutions.utils.threads.ConnectionPool.getInstance;

public class Threads extends Thread { //for gen threads
    //completable future
    public Threads(String name, String conName){
        super(name);
    }

    public void run(){
        getInstance();
        Connection conName = new Connection();
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
            Method m = Connection.class.getDeclaredMethod(String.valueOf(conName), void.class);
        }
        catch(InterruptedException | NoSuchMethodException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s fiished... \n", Thread.currentThread().getName());

    }
}



