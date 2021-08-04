package com.solvd.financialInstitutions.utils.generics;

import com.solvd.financialInstitutions.staff.StaffBase;

import java.util.ArrayList;
import java.util.List;

public class StaffGeneric<T extends StaffBase> {

    private T t;
    private List<T> clients = new ArrayList<>();

    public List<T> getClientsBase() {
        return clients;
    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
