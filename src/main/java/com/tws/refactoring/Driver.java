package com.tws.refactoring;

public class Driver {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public boolean isLegalDriver() {
        return this.age >= 18;
    }
}
