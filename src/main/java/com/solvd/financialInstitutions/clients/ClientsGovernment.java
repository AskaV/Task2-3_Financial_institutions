package com.solvd.financialInstitutions.clients;

import com.solvd.financialInstitutions.utils.interfaces.IRaiseRate;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.ParseException;
import java.util.Date;

public class ClientsGovernment extends ClientsBase implements IRaiseRate {
    private int perCent;
    //private int foundationDate;
    private static final Logger LOGGER = LogManager.getLogger(ClientsGovernment.class);
    private Date foundDater;


    public ClientsGovernment() {
    }

    public ClientsGovernment(String name, int money, int perCent, String fData) {
        super(name, money);
        this.perCent = perCent;
        try {
            foundDater = DateUtils.parseDateStrictly(fData, new String[]{"yyyy/MM/dd"});
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //foundDate = DateUtils.setYears(foundDate, fYear);
        // foundDate = DateUtils.setMonths(foundDate, fMonth);
        // foundDate = DateUtils.setDays(foundDate, fDay);
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

    public void setGovernmentFoundationDate(Date setFDate) {
        this.foundDater = setFDate;
    }

    public int getGovernmentPerCent() {
        return this.perCent;
    }

    public Date getGovernmentFoundationDate() {
        return this.foundDater;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", Credit percent = " + perCent + ", Foundation date " + foundDater);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ClientsGovernment guest = (ClientsGovernment) obj;
        boolean b = super.equals(obj) && (guest.perCent == this.perCent) && (guest.foundDater == this.foundDater);
        return b;
    }

    @Override
    public int hashCode() {
        int a = this.perCent * foundDater.hashCode() * super.hashCode();
        return a;
    }
}
