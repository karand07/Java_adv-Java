package com.pojo;

import jakarta.persistence.Entity;

@Entity
public class SalesPerson extends Employee {

    private double allowance;

    public SalesPerson() {
        // Required by Hibernate
    }

    public SalesPerson(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return super.toString() + ", allowance=" + allowance;
    }
}