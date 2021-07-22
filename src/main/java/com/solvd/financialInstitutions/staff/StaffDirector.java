package com.solvd.financialInstitutions.staff;

import com.solvd.financialInstitutions.clients.ClientsBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StaffDirector extends StaffBase {
    String priority;
    StaffGuard guard;
    private static final Logger LOGGER = LogManager.getLogger(StaffDirector.class);


    public StaffDirector() {
    }

    public StaffDirector(String stuffName, int stuffAge, int salary, String priority, StaffGuard guard) {
        super(stuffName, stuffAge, salary);
        this.priority = priority;
        this.guard = guard;
    }

    public void trySoSpeak(ClientsBase client) {
        if (client.getClientBaseName() != priority) {
            LOGGER.info("Security!");
            guard.sendPersonOut();
        } else {
            LOGGER.info("The director and the representative of the government retired to the dark and secret room.");
        }
    }

    public void setPriority(String setPriority) {
        this.priority = setPriority;
    }

    public void setGuard(StaffGuard setGuard) {
        this.guard = setGuard;
    }

    public String getPriority() {
        return this.priority;
    }

    public StaffGuard getGuard() {
        return this.guard;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + ", can only speak with = " + priority + "Bank guard " + guard.getStuffName());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        StaffDirector guest = (StaffDirector) obj;
        boolean b = super.equals(obj) && (guest.priority == this.priority);
        return b;
    }

    @Override
    public int hashCode() {
        int a = priority.hashCode() * super.hashCode();
        return a;
    }
}
