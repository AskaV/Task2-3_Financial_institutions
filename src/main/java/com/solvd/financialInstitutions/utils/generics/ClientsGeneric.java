package com.solvd.financialInstitutions.utils.generics;

import com.solvd.financialInstitutions.clients.ClientsBase;

import java.util.ArrayList;
import java.util.List;

public class ClientsGeneric<T extends ClientsBase> {

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
