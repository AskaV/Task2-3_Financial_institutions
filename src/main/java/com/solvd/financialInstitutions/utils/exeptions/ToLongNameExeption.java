package com.solvd.financialInstitutions.utils.exeptions;

public class ToLongNameExeption extends NameExeption {
    public ToLongNameExeption(String message) {
        super("\"" + message + "\" name is too long.");
    }
}
