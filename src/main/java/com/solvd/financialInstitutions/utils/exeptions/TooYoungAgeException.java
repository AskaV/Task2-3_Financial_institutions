package com.solvd.financialInstitutions.utils.exeptions;

public class TooYoungAgeException extends AgeException {
    public TooYoungAgeException(int message) {
        super("Age must be natural and more then 18. This age = " + String.valueOf(message));
    }

}
