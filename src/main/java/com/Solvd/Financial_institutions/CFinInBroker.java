package com.Solvd.Financial_institutions;

public class CFinInBroker extends CFinInBase { //Финансовый институт -> Брокер
    String param;

    CFinInBroker() {
//        instMoney = 1003;
//        instName = "Brokik";
//        currency = "EUR";
//        creditPosibility = false;
    }

    CFinInBroker(int instMoney, String instName, String currency, boolean creditPosibility, String param){
        super(instMoney, instName, currency, creditPosibility);
        this.param = param;
    }

    public void rCompanyIcon() {
        System.out.println("Our companys param: " + param);
    }

    public void sReqv(CFinInStockExchange StockExchange_id){
        StockExchange_id.rMandC();
    }
    public void sReqv( CFinInInvestmentCompany InvestmentCompany){
        InvestmentCompany.rMandC();
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
        CFinInBroker guest = (CFinInBroker) obj;
        boolean b = super.equals(obj) && (guest.param == this.param);
        return b;
    }

    @Override
    public int hashCode() {
        int a = param.hashCode() * super.hashCode();
        return a;
    }
}
