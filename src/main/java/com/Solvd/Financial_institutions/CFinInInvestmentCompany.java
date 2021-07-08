package com.Solvd.Financial_institutions;

public class CFinInInvestmentCompany extends CFinInBase {//Финансовый институт -> Инвестиционная компания
    String director;

    CFinInInvestmentCompany() {
    }

    CFinInInvestmentCompany(int instMoney, String insrName, String currency, boolean creditPosibility, String director){
        super(instMoney, insrName, currency, creditPosibility);
        this.director = director;
    }

    public void rCompanyDirector() {
        System.out.println("Our companys director name: " + director);
    }

    public void rMandC() {
        System.out.println("We have:" + instMoney + " " + currency);
    }


    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", Director name = " + director);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        CFinInInvestmentCompany guest = (CFinInInvestmentCompany) obj;
        boolean b = super.equals(obj) && (guest.director == this.director);
        return b;
    }

    @Override
    public int hashCode() {
        int a = director.hashCode() * super.hashCode();
        return a;
    }

}
