package com.solvd.financialInstitutions.finInst;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinInPensionFund extends FinInBase {
    private String talisman;
    private static final Logger LOGGER = LogManager.getLogger(FinInPensionFund.class);

    public FinInPensionFund() {
    }

    public FinInPensionFund(int instMoney, String insrName, String currency, boolean creditPossibility, String talisman) {
        super(instMoney, insrName, currency, creditPossibility);
        this.talisman = talisman;
    }

    public void givePensionFundMoney() {
        LOGGER.info("Broker say: I can give money");
    }

    @Override
    public boolean rCreditPossibility() {
        if (!getCreditPossibility()) {
            LOGGER.info("Can't issue a loan. You need to be of retirement age");
            return false;
        }
        return false;
    }

    public void setTalisman(String setTalisman) {
        this.talisman = setTalisman;
    }

    public String getTalisman() {
        return this.talisman;
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
        FinInPensionFund guest = (FinInPensionFund) obj;
        boolean b = super.equals(obj) && (guest.talisman == this.talisman);
        return b;
    }

    @Override
    public int hashCode() {
        int a = talisman.hashCode() * super.hashCode();
        return a;
    }
}
