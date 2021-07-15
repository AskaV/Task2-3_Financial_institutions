package com.solvd.financialInstitutions.utils.exeptions;

public class TooOldAgeException extends AgeException {
    public TooOldAgeException(int message) {
        super("Age must be natural and lover then 80. This age = " + String.valueOf(message));
    }
}
