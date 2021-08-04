package com.solvd.financialInstitutions.clients;

import com.solvd.financialInstitutions.finInst.FInInBank;
import com.solvd.financialInstitutions.staff.StaffCashier;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.ParseException;
import java.util.Date;

public class ClientsNaturalP extends ClientsBase {
    private String sexOfPerson;
    private int clientAge;
    private Date birthday;

    private static final Logger LOGGER = LogManager.getLogger(ClientsNaturalP.class);

    private enum clMale {

        MALE("Male gender"),
        FEMALE("Female gender"),
        THIRD_SEX("Third gender");

        private String itemName;

        private clMale(String itemName) {
            this.itemName = itemName;
        }
    }

    public ClientsNaturalP() {
    }

    public ClientsNaturalP(String name, int money, String ClientMale, int clientAge, String personBirthday) {
        super(name, money);
        this.sexOfPerson = ClientMale;
        this.clientAge = clientAge;
        try {
            birthday = DateUtils.parseDateStrictly(personBirthday, new String[]{"yyyy/MM/dd"});
        } catch (ParseException e) {
            e.printStackTrace();
        }
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

    public void setSexOfPerson(String setClientMale) {
        this.sexOfPerson = setClientMale;
    }

    public void setClientAge(int setClientAge) {
        this.clientAge = setClientAge;
    }

    public String getSexOfPerson() {
        return this.sexOfPerson;
    }

    public int getClientAge() {
        return this.clientAge;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", male = " + this.sexOfPerson + ", Age = " + clientAge);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ClientsNaturalP guest = (ClientsNaturalP) obj;
        boolean b = super.equals(obj) && (guest.sexOfPerson == this.sexOfPerson) && (guest.clientAge == this.clientAge);
        return b;
    }

    @Override
    public int hashCode() {
        int a = sexOfPerson.hashCode() * clientAge * super.hashCode() * birthday.hashCode();
        return a;
    }
}
