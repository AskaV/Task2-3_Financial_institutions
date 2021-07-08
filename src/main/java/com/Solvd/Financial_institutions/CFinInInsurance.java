package com.Solvd.Financial_institutions;

public class CFinInInsurance extends CFinInBase {//Финансовый институт ->Страховая компания
    String tarifnyPaket_01 = "Base+";
    String tarifnyPaket_02 = "Base+1";
    String tarifnyPaket_03 = "Base+2";
    String tarifnyPaket_04 = "Family+";

    CFinInInsurance() {
//        instMoney = 999;
//        instName = "Insurance";
//        currency = "EUR";
//        creditPosibility = false;
    }

    CFinInInsurance(int instMoney, String insrName, String currency, boolean creditPosibility){
        super(instMoney, insrName, currency, creditPosibility);
    }

    public void rTarifnyPaket() {
        System.out.println("\nOur company has 4 tariff packages. Their names: " + tarifnyPaket_01 + ", " + tarifnyPaket_02 +
                ", " + tarifnyPaket_03 + ", " + tarifnyPaket_04);
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", Bank loan Percentage = " + tarifnyPaket_01 + "%");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
