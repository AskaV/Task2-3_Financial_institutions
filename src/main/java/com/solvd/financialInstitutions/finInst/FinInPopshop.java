package com.solvd.financialInstitutions.finInst;


import com.solvd.financialInstitutions.utils.interfaces.IGetItem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinInPopshop extends FinInBase implements IGetItem {
    private String icon;
    private static final Logger LOGGER = LogManager.getLogger(FinInPopshop.class);


    public FinInPopshop() {
    }

    public FinInPopshop(int instMoney, String instName, String currency, boolean creditPosibility, String icon) {
        super(instMoney, instName, currency, creditPosibility);
        this.icon = icon;
    }

    public void getItem() {
        LOGGER.info("Pop shop get smt item");
    }

    public void rCompanyIcon() {
        LOGGER.info("Our company's icon: " + icon);
    }

    public void rMandC() {
        LOGGER.info("We have:" + getInstMoney() + " " + getInstCurrency());
    }

    public void setIcon(String setIcon) {
        this.icon = setIcon;
    }

    public String getIcon() {
        return this.icon;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", name of the sign = " + icon);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        FinInPopshop guest = (FinInPopshop) obj;
        boolean b = super.equals(obj) && (guest.icon == this.icon);
        return b;
    }

    @Override
    public int hashCode() {
        int a = icon.hashCode() * super.hashCode();
        return a;
    }

}
