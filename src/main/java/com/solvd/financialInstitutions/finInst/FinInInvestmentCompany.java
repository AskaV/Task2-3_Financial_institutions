package com.solvd.financialInstitutions.finInst;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinInInvestmentCompany extends FinInBase {
    private String director;
    private static final Logger LOGGER = LogManager.getLogger(FinInInvestmentCompany.class);

    public FinInInvestmentCompany() {
    }

    public FinInInvestmentCompany(int instMoney, String insrName, String currency, boolean creditPossibility, String director) {
        super(instMoney, insrName, currency, creditPossibility);
        this.director = director;
    }

    public void pCompanyDirector() {
        LOGGER.info("Our companys director name: " + director);
    }

    public void pMandC() {
        LOGGER.info("We have:" + getInstMoney() + " " + getInstCurrency());
    }

    public void setDirector(String setDirector) {
        this.director = setDirector;
    }

    public String getDirector() {
        return this.director;
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
        FinInInvestmentCompany guest = (FinInInvestmentCompany) obj;
        boolean b = super.equals(obj) && (guest.director == this.director);
        return b;
    }

    @Override
    public int hashCode() {
        int a = director.hashCode() * super.hashCode();
        return a;
    }

}
