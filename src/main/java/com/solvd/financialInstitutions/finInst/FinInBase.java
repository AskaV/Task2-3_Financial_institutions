package com.solvd.financialInstitutions.finInst;

import com.solvd.financialInstitutions.utils.enums.Currencyes;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class FinInBase {
    private int instMoney;
    private String instName;
    private Currencyes currency;// USD, UAH, EUR
    private boolean creditPossibility;
    private static final Logger LOGGER = LogManager.getLogger(FinInBase.class);



    public FinInBase() {
    }

    public FinInBase(int instMoney, String instName, String currency, boolean creditPossibility) {
        this.instMoney = instMoney;
        this.instName = StringUtils.capitalize(instName);
        this.currency = Currencyes.valueOf(currency);
        this.creditPossibility = creditPossibility;
    }

    public boolean rCreditPossibility() {
        if (this.creditPossibility) {
            LOGGER.info(" " + this.instName + " can issue a loan");
            return true;
        }
        return false;
    }

    public void setInstMoney(int setInstMoney) {
        this.instMoney = setInstMoney;
    }

    public void setInstName(String setInstName) {
        this.instName = setInstName;
    }

    public void setInstCurrency(String setInstCurrency) {
        this.currency = Currencyes.valueOf(setInstCurrency);
    }

    public void setCreditPossibility(boolean setCreditPossibility) {
        this.creditPossibility = setCreditPossibility;
    }

    public int getInstMoney() {
        return this.instMoney;
    }

    public String getInstName() {
        return this.instName;
    }

    public Currencyes getInstCurrency() {
        return this.currency;
    }

    public boolean getCreditPossibility() {
        return this.creditPossibility;
    }

    @Override
    public String toString() {
        String str = ("bankName = " + instName + ", instMoney = " + instMoney + ", currency = " + this.currency +
                ", credit Posibility = " + creditPossibility);
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        FinInBase guest = (FinInBase) obj;
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
