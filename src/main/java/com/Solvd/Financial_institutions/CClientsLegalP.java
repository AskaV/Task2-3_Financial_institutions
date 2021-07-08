package com.Solvd.Financial_institutions;

public class CClientsLegalP extends CClientsBase {//Клиент -> Юр. лицо
    String address;


    CClientsLegalP() {
        //clientName = "\"OOO Company\"";
        //clientMoney = 10000;
    }

    CClientsLegalP(String name, int money, String address){
        super(name, money);
        this. address =  address;
    }

    private void payNDS(int sumOfPurchase, CClientsGovernment Government) {
        int tax = Government.rPerCent();
        int govTax = sumOfPurchase * tax / 100;
        Government.takeMoney(govTax);
        this.clientMoney = this.clientMoney - (sumOfPurchase - govTax);
    }

    public void payForPurchases(int sumOfPurchase, CClientsGovernment Government) {
        boolean cheak = checkCompanyMoney(sumOfPurchase);
        if (cheak == true) {
            payNDS(sumOfPurchase, Government);
            this.clientMoney = this.clientMoney - sumOfPurchase;
            System.out.print("\nPayment is successful! " + "Company " + clientName + " balance after purchase: " + this.clientMoney);
        } else {
            System.out.print("\nThere is not enough money in the company to buy. \n" +
                    "To buy you need summ: " + sumOfPurchase + ", the company " + clientName + " only has: " + this.clientMoney);
        }
    }

    private boolean checkCompanyMoney(int summa) {
        if (summa <= this.clientMoney) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", address = " + address);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        CClientsLegalP guest = (CClientsLegalP) obj;
        boolean b = super.equals(obj) && (guest.address == this.address);
        return b;
    }

    @Override
    public int hashCode() {
        int a = address.hashCode() * super.hashCode();
        return a;
    }
}
