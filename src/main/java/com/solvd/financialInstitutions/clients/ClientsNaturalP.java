package com.solvd.financialInstitutions.clients;

import com.solvd.financialInstitutions.finInst.FInInBank;
import com.solvd.financialInstitutions.staff.StaffCashier;
import com.solvd.financialInstitutions.utils.enums.ClMale;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.ParseException;
import java.util.Date;

public class ClientsNaturalP extends ClientsBase {
    private ClMale sexOfPerson;
    private int clientAge;
    private Date birthday;

    private static final Logger LOGGER = LogManager.getLogger(ClientsNaturalP.class);


    public ClientsNaturalP() {
    }

    public ClientsNaturalP(String name, int money, String ClientMale, int clientAge, String personBirthday) {
        super(name, money);
        this.sexOfPerson = ClMale.valueOf(ClientMale);
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


    public void setSexOfPerson(ClMale setClientMale) {
        this.sexOfPerson = setClientMale;
    }

    public void setClientAge(int setClientAge) {
        this.clientAge = setClientAge;
    }

    public ClMale getSexOfPerson() {
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
