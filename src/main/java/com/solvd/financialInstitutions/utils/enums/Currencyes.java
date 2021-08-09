package com.solvd.financialInstitutions.utils.enums;

public enum Currencyes {
    USD("U.S. dollar"),
    UAH("Ukrainian hryvnia"),
    EUR("Euro"),
    RUB("Russian ruble");

    private String itemName;
    Currencyes(String itemName) {
        this.itemName = itemName;
    }

    public String getCurrencyes(){
        return this.itemName;
    }

}
