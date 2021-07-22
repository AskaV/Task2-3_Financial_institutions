package com.solvd.financialInstitutions.finInst;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinInInsurance extends FinInBase {
    private final static String TARIFNY_PAKET_01 = "Base+";
    private final static String TARIFNY_PAKET_02 = "Base+1";
    private final static String TARIFNY_PAKET_03 = "Base+2";
    private final static String TARIFNY_PAKET_04 = "Family+";
    private static final Logger LOGGER = LogManager.getLogger(FinInInsurance.class);

    public FinInInsurance() {
    }

    public FinInInsurance(int instMoney, String insrName, String currency, boolean creditPosibility) {
        super(instMoney, insrName, currency, creditPosibility);
    }

    public void pTarifyPaket() {
        LOGGER.info("Our company has 4 tariff packages. Their names: " + TARIFNY_PAKET_01 + ", " + TARIFNY_PAKET_02 +
                ", " + TARIFNY_PAKET_03 + ", " + TARIFNY_PAKET_04);
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", Bank loan Percentage = " + TARIFNY_PAKET_01 + "%");
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
