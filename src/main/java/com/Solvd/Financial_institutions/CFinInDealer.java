package com.Solvd.Financial_institutions;

public class CFinInDealer extends CFinInBase implements CIntSpeak,  CIntGiveMoney{ //Финансовый институт -> Диллер
    String param;

    CFinInDealer() {
    }

    CFinInDealer(int instMoney, String instName, String currency, boolean creditPosibility, String param){
        super(instMoney, instName, currency, creditPosibility);
        this.param = param;
    }

    public void speaker() {
        System.out.println("Dealer say sm.");
    }
    public void give_money() {
        System.out.println("Dealer say : I can give money");
    }

    public void rCompanyIcon() {
        System.out.println("Our companys param: " + param);
    }

    public void sReqvPopshop(CFinInPopshop Popshop_id){
        Popshop_id.rMandC();
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
        CFinInDealer guest = (CFinInDealer) obj;
        boolean b = super.equals(obj) && (guest.param == this.param);
        return b;
    }

    @Override
    public int hashCode() {
        int a = param.hashCode() * super.hashCode();
        return a;
    }
}
