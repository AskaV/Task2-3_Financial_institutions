package com.solvd.financialInstitutions.staff;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StaffGuard extends StaffBase {
    private int roomNumber;
    private static final Logger LOGGER = LogManager.getLogger(StaffGuard.class);


    public StaffGuard() {
    }

    public StaffGuard(String stuffName, int stuffAge, int salary, int roomNumber) {
        super(stuffName, stuffAge, salary);
        this.roomNumber = roomNumber;
    }

    public void sendPersonOut() {
        LOGGER.info("The security guard takes the person out of the room");
    }

    public void askAboutCredit() {
        LOGGER.info("You need to go to the cashier. Go further into the room");
    }


    public void setRoomNumber(int setRoomNumber) {
        this.roomNumber = setRoomNumber;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", room number = " + roomNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        StaffGuard guest = (StaffGuard) obj;
        boolean b = super.equals(obj) && (guest.roomNumber == this.roomNumber);
        return b;
    }

    @Override
    public int hashCode() {
        int a = roomNumber * super.hashCode();
        return a;
    }
}
