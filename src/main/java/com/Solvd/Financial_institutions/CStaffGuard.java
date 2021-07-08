package com.Solvd.Financial_institutions;

public class CStaffGuard extends CStaffBase {//Персонал -> Огранник
    int roomnumber;

    CStaffGuard() {
    }

    CStaffGuard(String stuffName, int stuffAge, int salary, int roomnumber) {
        super(stuffName, stuffAge, salary);
        this.roomnumber = roomnumber;
    }


    public void sendPersonOut() {
        System.out.println("The security guard takes the person out of the room");
    }

    public void askAboutCredit() {
        System.out.println("You need to go to the cashier. Go further into the room");
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", roomnumber = " + roomnumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        CStaffGuard guest = (CStaffGuard) obj;
        boolean b = super.equals(obj) && (guest.roomnumber == this.roomnumber);
        return b;
    }

    @Override
    public int hashCode() {
        int a = roomnumber * super.hashCode();
        return a;
    }
}
