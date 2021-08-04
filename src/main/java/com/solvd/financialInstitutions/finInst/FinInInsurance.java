package com.solvd.financialInstitutions.finInst;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinInInsurance extends FinInBase {
//    private final static String TARIFNY_PAKET_01 = "Base+";
//    private final static String TARIFNY_PAKET_02 = "Base+1";
//    private final static String TARIFNY_PAKET_03 = "Base+2";
//    private final static String TARIFNY_PAKET_04 = "Family+";

    private static final Logger LOGGER = LogManager.getLogger(FinInInsurance.class);

    private enum tarifyPakets {

        BASE1("Base +"),
        BASE2("Base+1"),
        BASE3("Base+2"),
        BASE4("Family+");

        private String itemName;

        private tarifyPakets(String itemName) {
            this.itemName = itemName;
        }
    }

    public FinInInsurance() {
    }

    public FinInInsurance(int instMoney, String insrName, String currency, boolean creditPosibility) {
        super(instMoney, insrName, currency, creditPosibility);
    }

    public void pTarifyPaket() {
        LOGGER.info("Our company has 4 tariff packages. Their names: " + tarifyPakets.BASE1 + ", " + tarifyPakets.BASE2 +
                ", " + tarifyPakets.BASE3 + ", " + tarifyPakets.BASE4);
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", Bank loan Percentage = " + tarifyPakets.BASE1 + "%");
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
