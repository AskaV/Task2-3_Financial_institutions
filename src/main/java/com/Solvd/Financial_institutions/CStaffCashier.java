package com.Solvd.Financial_institutions;

public class CStaffCashier extends CStaffBase {//Персонал -> Кассир
    String car;

    CStaffCashier() {// явное объявление конструктора по умолчанию
        //stuffName = "Karina";
        //stuffAge = 25;
        //salary = 1000;
    }

    CStaffCashier(String stuffName, int stuffAge, int salary, String car) {
        super(stuffName, stuffAge, salary);
        this.car = car;
    }

    public int chekMoney(CFInInBank bankName) {
        int money = bankName.rBMoney();
        return money;
    }

    public String chekCurensy(CFInInBank bankName) {
        String curensy = bankName.rBCurrency();
        return curensy;
    }

    public void creditWorthiness(CFInInBank Bank_id, CClientsNaturalP NaturalP_id) {
        int loanSum = Bank_id.CheckCreditworthiness(NaturalP_id);
        System.out.println("\n" + this.stuffName + " say: The bank can issue a loan in the amount " + loanSum
                + " " + chekCurensy(Bank_id) + " for you");
    }
    public void askFinInstitutesForLonn(CFinInBase instName) {
        //Ask
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", her car = " + this.car);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        CStaffCashier guest = (CStaffCashier) obj;
        boolean b = super.equals(obj) && (guest.car == this.car);
        return b;
    }

    @Override
    public int hashCode() {
        int a = car.hashCode() * super.hashCode();
        return a;
    }
}
