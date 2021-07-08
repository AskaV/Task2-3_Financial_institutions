package com.Solvd.Financial_institutions;

public class CFinInBroker extends CFinInBase implements CIntSpeak, CIntGiveMoney{ //Финансовый институт -> Брокер
    String param;

    CFinInBroker() {
    }

    CFinInBroker(int instMoney, String instName, String currency, boolean creditPosibility, String param){
        super(instMoney, instName, currency, creditPosibility);
        this.param = param;
    }


    public void speaker() {
        System.out.println("Broker say sm.");
    }
    public void give_money() {
        System.out.println("Broker say: I can give money");
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
