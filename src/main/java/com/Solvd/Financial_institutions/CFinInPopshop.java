package com.Solvd.Financial_institutions;

public class CFinInPopshop extends CFinInBase { //Финансовый институт -> Ломбард
    String icon;

    CFinInPopshop() {
//        instMoney = 1002;
//        instName = "Finik";
//        currency = "EUR";
//        creditPosibility = false;
    }

    CFinInPopshop(int instMoney, String instName, String currency, boolean creditPosibility, String icon){
        super(instMoney, instName, currency, creditPosibility);
        this.icon = icon;
    }

    public void rCompanyIcon() {
        System.out.println("Our companys icon: " + icon);
    }

    public void rMandC() {
        System.out.println("We have:" + instMoney + " " + currency);
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", name of the sign = " + icon);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        CFinInPopshop guest = (CFinInPopshop) obj;
        boolean b = super.equals(obj) && (guest.icon == this.icon);
        return b;
    }

    @Override
    public int hashCode() {
        int a = icon.hashCode() * super.hashCode();
        return a;
    }

}
