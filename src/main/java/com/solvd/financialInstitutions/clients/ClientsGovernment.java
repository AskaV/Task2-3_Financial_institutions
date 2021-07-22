package com.solvd.financialInstitutions.clients;

import com.solvd.financialInstitutions.utils.interfaces.IRaiseRate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientsGovernment extends ClientsBase implements IRaiseRate {
    private int perCent;
    private int foundationDate;
    private static final Logger LOGGER = LogManager.getLogger(ClientsGovernment.class);

    public ClientsGovernment() {
    }

    public ClientsGovernment(String name, int money, int perCent, int foundationDate) {
        super(name, money);
        this.perCent = perCent;
        this.foundationDate = foundationDate;
    }

    public void takeMoney(int money) {
        this.setClientsBaseMoney(getClientBaseMoney() + money);
    }

    public void raiseRate() {

        LOGGER.info("Rails rate for smt. %");
    }

    public void setGovernmentPerCent(int setPerCent) {
        this.perCent = setPerCent;
    }

    public void setGovernmentFoundationDate(int setFDate) {
        this.foundationDate = setFDate;
    }

    public int getGovernmentPerCent() {
        return this.perCent;
    }

    public int getGovernmentFoundationDate() {
        return this.foundationDate;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", Credit percent = " + perCent + ", Foundation date " + foundationDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ClientsGovernment guest = (ClientsGovernment) obj;
        boolean b = super.equals(obj) && (guest.perCent == this.perCent) && (guest.foundationDate == this.foundationDate);
        return b;
    }

    @Override
    public int hashCode() {
        int a = this.perCent * this.foundationDate * super.hashCode();
        return a;
    }
}
