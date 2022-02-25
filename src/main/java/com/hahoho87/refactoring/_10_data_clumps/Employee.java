package com.hahoho87.refactoring._10_data_clumps;

public class Employee {

    private String name;

    private PhoneNumber personalPhoneNumber;

    public Employee(String name, PhoneNumber personalPhoneNumber) {
        this.name = name;
        this.personalPhoneNumber = personalPhoneNumber;
    }

    public String personalPhoneNumber() {
        return this.personalPhoneNumber.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
