package com.Solvd.Financial_institutions;

public class CStaffBase {//Персонал
    String stuffName;
    int stuffAge;
    int salary;

    CStaffBase() { // явное объявление конструктора по умолчанию
    }

    CStaffBase(String stuffName, int stuffAge, int salary) {
        this.stuffName = stuffName;
        if (stuffAge <= 0) {
            throw new IllegalArgumentException("Age must be natural");
        } else {
            this.stuffAge = stuffAge;
        }
        this.salary = salary;
    }

    public void giveStuffSalary(int salary) {
        System.out.println("Your salary," + this.stuffName + ", has been credited to the card. Amount: " + salary);
        //При желании можно развивать, спрашивая заведения его балланс, и выдавать заведением зарплатту
    }

    @Override
    public String toString() {
        return ("Stuff name = " + stuffName + ", Stuff аge = " + stuffAge + ", Sallary = " + this.salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
        }
        CStaffBase guest = (CStaffBase) obj;
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
