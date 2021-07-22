package com.solvd.financialInstitutions.finInst;

import com.solvd.financialInstitutions.clients.ClientsNaturalP;

import com.solvd.financialInstitutions.utils.interfaces.IRaiseRate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FInInBank extends FinInBase implements IRaiseRate {
    private int loanPercentage;
    private static final Logger LOGGER = LogManager.getLogger(FInInBank.class);

    public FInInBank() {
    }

    public FInInBank(int instMoney, String instName, String currency, boolean creditPosibility, int loanPercentage) {
        super(instMoney, instName, currency, creditPosibility);
        this.loanPercentage = loanPercentage;
    }

    public int checkCreditworthiness(ClientsNaturalP NaturalPId) {
        return NaturalPId.getClientBaseMoney() * loanPercentage / 100;
    }

    public void giveMoney() {
        LOGGER.info("Bank say: I can give money");
    }

    public void raiseRate() {
        LOGGER.info("Rails rate for smt. %");
    }

    public void setLoanPercentage(int setLoanPercentage) {
        this.loanPercentage = setLoanPercentage;
    }

    public int getLoanPercentage() {
        return this.loanPercentage;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", Bank loan Percentage = " + loanPercentage + "%");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        FInInBank guest = (FInInBank) obj;
        boolean b = super.equals(obj) && (guest.loanPercentage == this.loanPercentage);
        return b;
    }

    @Override
    public int hashCode() {
        int a = loanPercentage * super.hashCode();
        return a;
    }
}
