package com.solvd.financialInstitutions.finInst;

import com.solvd.financialInstitutions.utils.interfaces.IGetItem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinInStockExchange extends FinInBase implements IGetItem {
    private String URL; //= "www.URL.com";
    private static final Logger LOGGER = LogManager.getLogger(FinInStockExchange.class);


    public FinInStockExchange() {
    }

    public FinInStockExchange(int instMoney, String instName, String currency, boolean creditPosibility, String URL) {
        super(instMoney, instName, currency, creditPosibility);
        this.URL = URL;
    }

    public void getItem() {
        LOGGER.info("StockExchange get smt item");
    }

    public void rCompanyIcon() {
        LOGGER.info("Our company's URL: " + URL);
    }

    public void rMandC() {
        LOGGER.info("We have:" + getInstMoney() + " In currency:" + getInstCurrency());
    }

    public void setURL(String setURL) {
        this.URL = setURL;
    }

    public String getURL() {
        return this.URL;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", URL = " + URL);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        FinInStockExchange guest = (FinInStockExchange) obj;
        boolean b = super.equals(obj) && (guest.URL == this.URL);
        return b;
    }

    @Override
    public int hashCode() {
        int a = URL.hashCode() * super.hashCode();
        return a;
    }

}
