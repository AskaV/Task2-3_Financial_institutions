package com.solvd.financialInstitutions.staff;

import com.solvd.financialInstitutions.utils.exeptions.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class StaffBase {
    private String stuffName;
    private int stuffAge;
    private int salary;
    private static final Logger LOGGER = LogManager.getLogger(StaffBase.class);

    public StaffBase() {
    }

    public StaffBase(String stuffName, int stuffAge, int salary) {

        if (stuffName.length() == 0) {
            throw new ToShortNameExeption(stuffName);
        }
        if (stuffName.length() >= 20) {
            throw new ToLongNameExeption(stuffName);
        }
        this.stuffName = stuffName;
        if (stuffAge <= 0) {
            throw new NegativeAgeException(stuffAge);
        }
        if (stuffAge <= 18) {
            throw new TooYoungAgeException(stuffAge);
        }
        if (stuffAge >= 80) {
            throw new TooOldAgeException(stuffAge);
        }

// base ex extend Exception (not RuntimeException)
//        try {
//            if (stuffAge <= 0) {
//                throw new NegativeAgeException(stuffAge);
//            }
//            if (stuffAge <= 18) {
//                throw new TooYoungAgeException(stuffAge);
//            }
//            if (stuffAge >= 80) {
//                throw new TooOldAgeException(stuffAge);
//            }
//        } catch (TooOldAgeException | NegativeAgeException | TooYoungAgeException e) {
//            e.printStackTrace();
//        }
    }


    public void giveStuffSalary(int salary) {
        LOGGER.info("Your salary," + this.stuffName + ", has been credited to the card. Amount: " + salary);
    }

    public void setStuffName(String setStuffName) {
        if (StringUtils.isAlpha(setStuffName)){
            LOGGER.error("Wrong name. Name contains numbers");
        }
        else{
            this.stuffName = setStuffName;
        }

    }

    public void setStuffAge(int setStuffAge) {
        this.stuffAge = setStuffAge;
    }

    public void setSalary(int setSalary) {
        this.salary = setSalary;
    }

    public String getStuffName() {
        return this.stuffName;
    }

    public int getStuffAge() {
        return this.stuffAge;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return ("Stuff name = " + stuffName + ", Stuff аge = " + stuffAge + ", Sallary = " + this.salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
        }
        StaffBase guest = (StaffBase) obj;
        boolean b = (stuffName == guest.stuffName
                && stuffAge == guest.stuffAge
                && salary == guest.salary);
        return b;
    }

    @Override
    public int hashCode() {
        int a = stuffName.hashCode() + stuffAge + salary;
        return super.hashCode();
    }
}
