package com.solvd.financialInstitutions.finInst;


import com.solvd.financialInstitutions.utils.interfaces.IGiveMoney;
import com.solvd.financialInstitutions.utils.interfaces.ISpeak;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinInBroker extends FinInBase implements ISpeak, IGiveMoney {
    private String param;
    private static final Logger LOGGER = LogManager.getLogger(FinInBroker.class);

    public FinInBroker() {
    }

    public FinInBroker(int instMoneys, String instName, String currency, boolean creditPosibility, String param) {
        super(instMoneys, instName, currency, creditPosibility);
        this.param = param;
    }

    public void speaker() {
        LOGGER.info("Broker say sm.");
    }

    public void giveMoney() {
        LOGGER.info("Broker say: I can give money");
    }

    public void rCompanyParam() {
        LOGGER.info("Our company's param: " + param);
    }

    public void sReqv(FinInStockExchange StockExchangeId) {
        StockExchangeId.rMandC();
    }

    public void sReqv(FinInInvestmentCompany InvestmentCompany) {
        InvestmentCompany.pMandC();
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
        FinInBroker guest = (FinInBroker) obj;
        boolean b = super.equals(obj) && (guest.param == this.param);
        return b;
    }

    @Override
    public int hashCode() {
        int a = param.hashCode() * super.hashCode();
        return a;
    }


}
