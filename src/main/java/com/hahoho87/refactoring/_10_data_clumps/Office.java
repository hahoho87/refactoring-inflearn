package com.hahoho87.refactoring._10_data_clumps;

public class Office {

    private String location;

    private PhoneNumber officePhoneNumber;


    public Office(String location, PhoneNumber officePhoneNumber) {
        this.location = location;
        this.officePhoneNumber = officePhoneNumber;
    }

    public String officePhoneNumber() {
        return this.officePhoneNumber.toString();
    }

}
