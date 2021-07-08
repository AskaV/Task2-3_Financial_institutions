package com.Solvd.Financial_institutions;

public class CClientsGovernment extends CClientsBase implements CIntRaiseRate{//Клиент -> Государство
    int perCent; //20
    int foundationDate; //1900

    CClientsGovernment() {
    }

    CClientsGovernment(String name, int money, int perCent, int foundationDate){
        super(name, money);
        this.perCent = perCent;
        this.foundationDate = foundationDate;
    }
    public int rPerCent() {
        return this.perCent;
    }

    public void takeMoney(int money) {
        this.clientMoney = this.clientMoney + money;
    }

    public void raisRate() {
        System.out.println("Rais rate for smt. %");
    }


    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", Credit percent = " + perCent + ", Foundation date " + foundationDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        CClientsGovernment guest = (CClientsGovernment) obj;
        boolean b = super.equals(obj) && (guest.perCent == this.perCent) && (guest.foundationDate == this.foundationDate);
        return b;
    }

    @Override
    public int hashCode() {
        int a = this.perCent * this.foundationDate * super.hashCode();
        return a;
    }
}
