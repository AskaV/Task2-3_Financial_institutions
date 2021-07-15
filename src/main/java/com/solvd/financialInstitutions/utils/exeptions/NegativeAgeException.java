package com.solvd.financialInstitutions.utils.exeptions;

public class NegativeAgeException extends AgeException {
    public NegativeAgeException(int age) {
        super("Age must be natural and more then 0. This age = " + String.valueOf(age));
    }
}
