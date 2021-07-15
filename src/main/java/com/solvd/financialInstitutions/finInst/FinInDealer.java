package com.solvd.financialInstitutions.finInst;


import com.solvd.financialInstitutions.utils.interfaces.IGiveMoney;
import com.solvd.financialInstitutions.utils.interfaces.ISpeak;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinInDealer extends FinInBase implements ISpeak, IGiveMoney {
    String param;
    private static final Logger LOGGER = LogManager.getLogger(FinInDealer.class);

    public FinInDealer() {
    }

    public FinInDealer(int instMoney, String instName, String currency, boolean creditPosibility, String param) {
        super(instMoney, instName, currency, creditPosibility);
        this.param = param;
    }

    public void speaker() {
        LOGGER.info("Dealer say sm.");
    }

    public void giveMoney() {
        LOGGER.info("Dealer say : I can give money");
    }

    public void rCompanyParam() {
        LOGGER.info("Our companys param: " + param);
    }

    public void sReqvPopshop(FinInPopshop PopshopId) {
        PopshopId.rMandC();
    }


    public void setParam(String setParam) {
        this.param = setParam;
    }

    public String getParam() {
        return this.param;
    }


    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", Param = " + param);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        FinInDealer guest = (FinInDealer) obj;
        boolean b = super.equals(obj) && (guest.param == this.param);
        return b;
    }

    @Override
    public int hashCode() {
        int a = param.hashCode() * super.hashCode();
        return a;
    }
}
