package com.solvd.financialInstitutions.utils.enums;

public enum TarifyPakets {

    BASE1("Base +"),
    BASE2("Base+1"),
    BASE3("Base+2"),
    BASE4("Family+");

    private String itemName;
    TarifyPakets(String itemName) {
        this.itemName = itemName;
    }

    public String getTarifyPakets(){
        return this.itemName;
    }

}
