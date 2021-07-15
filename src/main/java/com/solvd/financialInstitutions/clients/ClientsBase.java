package com.solvd.financialInstitutions.clients;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class ClientsBase {
    private String clientName;
    private int clientMoney;
    private static final Logger LOGGER = LogManager.getLogger(ClientsBase.class);

    public ClientsBase() {
    }

    public ClientsBase(String name, int money) {
        this.clientName = name;
        this.clientMoney = money;
    }

    public void setClientsBaseName(String setName) {
        this.clientName = setName;
    }

    public void setClientsBaseMoney(int setMoney) {
        this.clientMoney = setMoney;
    }

    public String getClientBaseName() {
        return this.clientName;
    }

    public int getClientBaseMoney() {
        return this.clientMoney;
    }

    @Override
    public String toString() {
        return ("Client name = " + clientName + ", Client money = " + clientMoney);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ClientsBase guest = (ClientsBase) obj;
        boolean b = (clientName == guest.clientName
                && clientMoney == guest.clientMoney);
        return b;
    }

    @Override
    public int hashCode() {
        int a = clientName.hashCode() + clientMoney;
        return a;
    }
}
