package com.solvd.financialInstitutions.clients;

import com.solvd.financialInstitutions.utils.interfaces.IChangeRegAddress;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientsLegalP extends ClientsBase implements IChangeRegAddress {
    private String address;
    private static final Logger LOGGER = LogManager.getLogger(ClientsLegalP.class);

    public ClientsLegalP() {
    }

    public ClientsLegalP(String name, int money, String address) {
        super(name, money);
        this.address = address;
    }

    public void changeAddress() {
        LOGGER.info("Previous address = " + this.address);
        this.address = "new address of street";
        LOGGER.info(". New address = " + this.address);
    }

    private void payNDS(int sumOfPurchase, ClientsGovernment Government) {
        int tax = Government.getGovernmentPerCent();
        int govTax = sumOfPurchase * tax / 100;
        Government.takeMoney(govTax);
        this.setClientsBaseMoney(getClientBaseMoney() - sumOfPurchase - govTax);
    }

    public void payForPurchases(int sumOfPurchase, ClientsGovernment Government) {
        boolean cheak = checkCompanyMoney(sumOfPurchase);
        if (cheak == true) {
            payNDS(sumOfPurchase, Government);
            setClientsBaseMoney(this.getClientBaseMoney() - sumOfPurchase);
            LOGGER.info("Payment is successful! " + "Company " + getClientBaseName() + " balance after purchase: " + getClientBaseMoney());
        } else {
            LOGGER.info("There is not enough money in the company to buy. \n" +
                    "To buy you need summ: " + sumOfPurchase + ", the company " + getClientBaseName() + " only has: " + getClientBaseMoney());
        }
    }

    private boolean checkCompanyMoney(int summa) {
        if (summa <= getClientBaseMoney()) {
            return true;
        }
        return false;
    }


    public void setClientsLegalPAddress(String setAddress) {
        this.address = setAddress;
    }

    public String getClientsLegalPAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", address = " + address);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ClientsLegalP guest = (ClientsLegalP) obj;
        boolean b = super.equals(obj) && (guest.address == this.address);
        return b;
    }

    @Override
    public int hashCode() {
        int a = address.hashCode() * super.hashCode();
        return a;
    }
}
