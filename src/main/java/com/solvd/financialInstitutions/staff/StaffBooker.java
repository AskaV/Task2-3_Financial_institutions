package com.solvd.financialInstitutions.staff;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StaffBooker extends StaffBase {
    private String pet;
    private static final Logger LOGGER = LogManager.getLogger(StaffBooker.class);


    public StaffBooker() {
    }

    public StaffBooker(String stuffName, int stuffAge, int salary, String pet) {
        super(stuffName, stuffAge, salary);
        this.pet = pet;
    }

    public void giveSalarytoStuff(int monthDay, StaffBase worker) {
        if (monthDay == 1) {
            worker.giveStuffSalary(worker.getSalary());
        } else {
            LOGGER.info(" " + getStuffName() + "say: Today is not a salary day. Wait for the 1st date of the month");
        }
    }

    public void setPet(String setPet) {
        this.pet = setPet;
    }

    public String getPet() {
        return this.pet;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", her pet = " + this.pet);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        StaffBooker guest = (StaffBooker) obj;
        boolean b = super.equals(obj) && (guest.pet == this.pet);
        return b;
    }

    @Override
    public int hashCode() {
        int a = pet.hashCode() * super.hashCode();
        return a;
    }
}
