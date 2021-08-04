package com.solvd.financialInstitutions.utils.generics;

import com.solvd.financialInstitutions.finInst.FinInBase;

import java.util.ArrayList;
import java.util.List;

public class FnInstGeneric<T extends FinInBase> {

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
