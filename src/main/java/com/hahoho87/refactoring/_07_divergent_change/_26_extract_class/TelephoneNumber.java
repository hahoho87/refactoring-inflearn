package com.hahoho87.refactoring._07_divergent_change._26_extract_class;

public class TelephoneNumber {
    private String areaCode;
    private String number;

    public TelephoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String officeAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String officeNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.areaCode + " " + this.number;
    }
}