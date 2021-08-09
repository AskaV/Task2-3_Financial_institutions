package com.solvd.financialInstitutions.staff;

import com.solvd.financialInstitutions.clients.ClientsNaturalP;
import com.solvd.financialInstitutions.finInst.FInInBank;
import com.solvd.financialInstitutions.finInst.FinInBase;
import com.solvd.financialInstitutions.utils.enums.Currencyes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StaffCashier extends StaffBase {
    private String car;
    private static final Logger LOGGER = LogManager.getLogger(StaffCashier.class);


    public StaffCashier() {
    }

    public StaffCashier(String stuffName, int stuffAge, int salary, String car) {
        super(stuffName, stuffAge, salary);
        this.car = car;
    }

    public int chekMoney(FInInBank bankName) {
        int money = bankName.getInstMoney();
        return money;
    }

    public Currencyes chekCurensy(FInInBank bankName) {
        Currencyes curensy = bankName.getInstCurrency();
        return curensy;
    }

    public void creditWorthiness(FInInBank BanksId, ClientsNaturalP NaturalPId) {
        int loanSum = BanksId.checkCreditworthiness(NaturalPId);
        LOGGER.info(this.getStuffName() + " say: The bank can issue a loan in the amount " + loanSum
                + " " + chekCurensy(BanksId) + " for you");
    }

    public void askFinInstitutesForLonn(FinInBase instName) {
        //Ask
    }

    public void setCar(String setCar) {
        this.car = setCar;
    }

    public String getCar() {
        return this.car;
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
        StaffCashier guest = (StaffCashier) obj;
        boolean b = super.equals(obj) && (guest.car == this.car);
        return b;
    }

    @Override
    public int hashCode() {
        int a = car.hashCode() * super.hashCode();
        return a;
    }
}
