package com.solvd.financialInstitutions.finInst;


import com.solvd.financialInstitutions.utils.enums.TarifyPakets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinInInsurance extends FinInBase {
    //    private final static String TARIFNY_PAKET_01 = "Base+";
    private static final Logger LOGGER = LogManager.getLogger(FinInInsurance.class);

    public FinInInsurance() {
    }

    public FinInInsurance(int instMoney, String insrName, String currency, boolean creditPosibility) {
        super(instMoney, insrName, currency, creditPosibility);
    }

    public void pTarifyPaket() {
        LOGGER.info("Our company has 4 tariff packages. Their names: " + TarifyPakets.BASE1 + ", " + TarifyPakets.BASE2 +
                ", " + TarifyPakets.BASE3 + ", " + TarifyPakets.BASE4);
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", Bank loan Percentage = " + TarifyPakets.BASE1 + "%");
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
