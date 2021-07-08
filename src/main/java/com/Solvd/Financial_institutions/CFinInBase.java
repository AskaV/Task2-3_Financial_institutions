package com.Solvd.Financial_institutions;

public class CFinInBase {// Финансовый институт
    int instMoney;
    String instName;
    String currency;// USD, UAH, EUR
    boolean creditPosibility;

    CFinInBase() { // явное объявление конструктора по умолчанию
    }

    CFinInBase(int instMoney, String instName, String currency, boolean creditPosibility){
        this.instMoney = instMoney;
        this.instName = instName;
        this.currency = currency;
        this.creditPosibility = creditPosibility;
    }

    public int rBMoney() {
        return this.instMoney;
    }

    public String rBankName() {
        return this.instName;
    }

    public String rBCurrency() {
        return this.currency;
    }

    public boolean rCreditPosibility() {
        if (this.creditPosibility) {
            System.out.println("\n" + this.instName + " can issue a loan");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String str = ("bankName = " + instName + ", instMoney = " + instMoney + ", currency = " + this.currency +
                ", credit Posibility = " + creditPosibility);
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        CFinInBase guest = (CFinInBase) obj;
        boolean b = (instMoney == guest.instMoney
                && instName == guest.instName
                && currency == guest.currency);
        return b;
    }

    @Override
    public int hashCode() {
        int a = instMoney + instName.hashCode() + currency.hashCode();
        return a;
    }
}
