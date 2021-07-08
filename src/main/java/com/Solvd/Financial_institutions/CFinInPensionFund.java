package com.Solvd.Financial_institutions;

public class CFinInPensionFund extends CFinInBase {//Финансовый институт -> Пенсионный фонд
    String talisman ;

    CFinInPensionFund() {
//        instMoney = 30000;
//        instName = "Пенсионеры и пенсионерочки";
//        currency = "UAH";
//        creditPosibility = false;
    }

    CFinInPensionFund(int instMoney, String insrName, String currency, boolean creditPosibility, String talisman){
        super(instMoney, insrName, currency, creditPosibility);
        this.talisman = talisman;
    }

    @Override
    public boolean rCreditPosibility() {
        if (!this.creditPosibility) {
            System.out.print("\nCan't issue a loan. You need to be of retirement age");
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", Talisman = " + talisman);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        CFinInPensionFund guest = (CFinInPensionFund) obj;
        boolean b = super.equals(obj) && (guest.talisman == this.talisman);
        return b;
    }

    @Override
    public int hashCode() {
        int a = talisman.hashCode() * super.hashCode();
        return a;
    }
}
