package com.solvd.financialInstitutions.utils.exeptions;

public class ToShortNameExeption extends NameExeption {
    public ToShortNameExeption(String message) {
        super("\"" + message + "\" name is too short.");
    }
}
