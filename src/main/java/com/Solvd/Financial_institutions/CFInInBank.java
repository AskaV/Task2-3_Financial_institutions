package com.Solvd.Financial_institutions;

public class CFInInBank extends CFinInBase{//Финансовый институт -> Банк
    int loanPercentage;//процент от денег что есть у клиента на который может быть одобрен кредит

    CFInInBank(){ // явное объявление конструктора по умолчанию
//        instMoney = 14000;
//        currency = "UAH";
//        instName = "Kotobank";
//        creditPosibility = true;
    }

    CFInInBank(int instMoney, String instName, String currency, boolean creditPosibility, int loanPercentage){
        super(instMoney, instName, currency, creditPosibility);
        this.loanPercentage = loanPercentage;
    }

    public int CheckCreditworthiness(CClientsNaturalP NaturalP_id){
        return NaturalP_id.clientMoney*loanPercentage/100;
    }


    @Override
    public String toString() {
        String str = super.toString();
        return (str+", Bank loan Percentage = " + loanPercentage+"%");
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        CFInInBank guest = (CFInInBank) obj;
        boolean b = super.equals(obj) && (guest.loanPercentage == this.loanPercentage);
        return b;
    }

    @Override
    public int hashCode() {
        int a = loanPercentage * super.hashCode();
        return a;
    }
}
