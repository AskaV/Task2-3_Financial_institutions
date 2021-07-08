package com.Solvd.Financial_institutions;

public class CFinInStockExchange extends CFinInBase {//Финансовый институт ->Фондовая биржа
    String URL; //= "www.URL.com";

    CFinInStockExchange() {
        //instMoney = 1008;
        //instName = "nStockExchange";
       // currency = "EUR";
       // creditPosibility = false;
    }
    CFinInStockExchange(int instMoney, String instName, String currency, boolean creditPosibility, String URL){
        super(instMoney, instName, currency, creditPosibility);
        this.URL = URL;
    }

    public void rCompanyIcon() {
        System.out.println("Our companys URL: " + URL);
    }

    public void rMandC() {
        System.out.println("We have:" + instMoney + " In curency:" + currency);
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", URL = " + URL);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        CFinInStockExchange guest = (CFinInStockExchange) obj;
        boolean b = super.equals(obj) && (guest.URL == this.URL);
        return b;
    }

    @Override
    public int hashCode() {
        int a = URL.hashCode() * super.hashCode();
        return a;
    }

}
