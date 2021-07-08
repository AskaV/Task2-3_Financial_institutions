package com.Solvd.Financial_institutions;

public class CStaffDirector extends CStaffBase {//Персонал -> Директор
    String priority;// = "Government";
    CStaffGuard guard;// = new CStuffGuard();

    CStaffDirector() {
        //stuffName = "Durik";
        //stuffAge = 18;
        //salary = 1000000;
    }

    CStaffDirector(String stuffName, int stuffAge, int salary, String priority, CStaffGuard guard) {
        super(stuffName, stuffAge, salary);
        this.priority = priority;
        this.guard = guard;
    }

    public void trySoSpeak(CClientsBase client) {
        if (client.rClientName() != priority) {
            System.out.println("Security!");
            guard.sendPersonOut();   // Guard_01.sendPersonOut();
        } else {
            System.out.println("The director and the representative of the government retired to the dark and secret room.");
        }
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", can only speak with = " + priority + "Bank guard " + guard.stuffName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        CStaffDirector guest = (CStaffDirector) obj;
        boolean b = super.equals(obj) && (guest.priority == this.priority);
        return b;
    }

    @Override
    public int hashCode() {
        int a = priority.hashCode() * super.hashCode();
        return a;
    }
}
