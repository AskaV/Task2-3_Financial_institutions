package com.solvd.financialInstitutions.utils.enums;

public enum ClMale {
    MALE("Male gender"),
    FEMALE("Female gender"),
    THIRD_SEX("Third gender");

    private String itemName;

    ClMale(String itemName) {
        this.itemName = itemName;
    }
    public String getMaleText(){
        return this.itemName;
    }
}
