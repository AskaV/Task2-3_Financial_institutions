package com.solvd.financialInstitutions.utils.threads;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static ConnectionPool instance;
    private static final int MAX_AMOUNT_OF_CON = 5;
    private int createdConAmount;
    private List<Connection> connectionPool = new ArrayList<>(MAX_AMOUNT_OF_CON);

    private ConnectionPool() {
    }

    public static synchronized ConnectionPool getInstance() {

        if (instance == null) {        //if object notCreated
            instance = new ConnectionPool();
        }
        return instance;        // return object
    }

    public synchronized Connection getConn() {
        if (createdConAmount < MAX_AMOUNT_OF_CON) {
            createdConAmount++;
            return new Connection();
        } else if (!connectionPool.isEmpty()) {
            return connectionPool.remove(0);
        } else {
            try {
                Thread.sleep(500);
                return null;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("TimeOut");
            return null;
        }
    }

    public synchronized void releaseCon(Connection connection) {
        connectionPool.add(connection);
    }
}
