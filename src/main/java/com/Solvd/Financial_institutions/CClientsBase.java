package com.Solvd.Financial_institutions;

public class CClientsBase {
    String clientName;
    int clientMoney;

    CClientsBase() {
    }

    CClientsBase(String name, int money){
    this.clientName = name;
    this.clientMoney = money;
    }

    public String rClientName() {
        return this.clientName;
    }

    public int rClientMoney() {
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
        CClientsBase guest = (CClientsBase) obj;
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
