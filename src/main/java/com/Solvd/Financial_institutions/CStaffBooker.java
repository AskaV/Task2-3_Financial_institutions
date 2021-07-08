package com.Solvd.Financial_institutions;

public class CStaffBooker extends CStaffBase {//Персонал -> Бухгалтер
    String pet;

    CStaffBooker() {
    }
    CStaffBooker(String stuffName, int stuffAge, int salary, String pet) {
        super(stuffName, stuffAge, salary);
        this.pet = pet;
    }

    public void giveSalarytoStuff(int monthDay, CStaffBase worker) {
        if (monthDay == 1) {
            worker.giveStuffSalary(worker.salary);
        } else {
            System.out.print("\n" + stuffName + "say: Today is not a salary day. Wait for the 1st date of the month");
        }
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
        CStaffBooker guest = (CStaffBooker) obj;
        boolean b = super.equals(obj) && (guest.pet == this.pet);
        return b;
    }

    @Override
    public int hashCode() {
        int a = pet.hashCode() * super.hashCode();
        return a;
    }
}
