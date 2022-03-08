package com.hahoho87.refactoring._20_large_class._41_extract_superclass;

public abstract class Party {
    protected String name;

    public Party(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double annualConst() {
        return this.monthlyCost() * 12;
    }

    abstract double monthlyCost();
}
