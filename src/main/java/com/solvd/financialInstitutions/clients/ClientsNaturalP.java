package com.solvd.financialInstitutions.clients;

import com.solvd.financialInstitutions.finInst.FInInBank;
import com.solvd.financialInstitutions.staff.StaffCashier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientsNaturalP extends ClientsBase {
    private String clientMale;
    private int clientAge;
    private static final Logger LOGGER = LogManager.getLogger(ClientsNaturalP.class);


    public ClientsNaturalP() {
    }

    public ClientsNaturalP(String name, int money, String ClientMale, int clientAge) {
        super(name, money);
        this.clientMale = ClientMale;
        this.clientAge = clientAge;
    }

    private void askBankPossibilities(StaffCashier CashierId, FInInBank BankId) {
        LOGGER.info("Money in the bank:" + CashierId.chekMoney(BankId) +
                ", currency: " + CashierId.chekCurensy(BankId));
    }

    public void takeLoanFromCashier(StaffCashier CashiersId, FInInBank BanksId, ClientsNaturalP NaturalPId) {
        LOGGER.info("Cashier ask \"" + BanksId.getInstName() + "\" financial institute about bank possibility: ");
        askBankPossibilities(CashiersId, BanksId);
        CashiersId.creditWorthiness(BanksId, NaturalPId);
    }

    public void setClientMale(String setClientMale) {
        this.clientMale = setClientMale;
    }

    public void setClientAge(int setClientAge) {
        this.clientAge = setClientAge;
    }

    public String getClientMale() {
        return this.clientMale;
    }

    public int getClientAge() {
        return this.clientAge;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", male = " + this.clientMale + ", Age = " + clientAge);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ClientsNaturalP guest = (ClientsNaturalP) obj;
        boolean b = super.equals(obj) && (guest.clientMale == this.clientMale) && (guest.clientAge == this.clientAge);
        return b;
    }

    @Override
    public int hashCode() {
        int a = clientMale.hashCode() * clientAge * super.hashCode();
        return a;
    }
}
