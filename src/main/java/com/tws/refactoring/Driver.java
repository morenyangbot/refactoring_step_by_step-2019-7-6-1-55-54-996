package com.tws.refactoring;

public class Driver {
    private static final int LEGAL_DRIVING_AGE = 18;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public boolean isLegalDriver() {
        return this.age >= LEGAL_DRIVING_AGE;
    }
}
