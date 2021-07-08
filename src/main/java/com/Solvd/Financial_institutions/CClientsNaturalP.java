package com.Solvd.Financial_institutions;

public class CClientsNaturalP extends CClientsBase {//Клиент -> Физ. лицо
    String ClientMale;// = "Male";
    int clientAge;// = 35;

    CClientsNaturalP() {
        //clientName = "Marik";
        //clientMoney = 20;
    }
    CClientsNaturalP(String name, int money, String ClientMale, int clientAge){
        super(name, money);
        this.ClientMale = ClientMale;
        this.clientAge = clientAge;
    }


    private void askBankPossibilities(CStaffCashier Cashier_id, CFInInBank Bank_id) {
        System.out.println("\nMoney in the bank:" + Cashier_id.chekMoney(Bank_id) +
                ", currency: " + Cashier_id.chekCurensy(Bank_id));
    }

    public void takeLoanFromCashier(CStaffCashier Cashier_id, CFInInBank Bank_id, CClientsNaturalP NaturalP_id) {
        askBankPossibilities(Cashier_id, Bank_id);
        Cashier_id.creditWorthiness(Bank_id, NaturalP_id);

    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", male = " + this.ClientMale + ", Age = " + clientAge);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        CClientsNaturalP guest = (CClientsNaturalP) obj;
        boolean b = super.equals(obj) && (guest.ClientMale == this.ClientMale) && (guest.clientAge == this.clientAge);
        return b;
    }

    @Override
    public int hashCode() {
        int a = ClientMale.hashCode() * clientAge * super.hashCode();
        return a;
    }
}
