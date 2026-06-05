package com.company;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager(18,"atharv","manager",100000);
        m1.getEmpoyee();
        SalesPerson sp1 = new SalesPerson(18,"sai","salesPerson",10000);
        sp1.getEmpoyee();
        sp1.getSP();
        sp1.clientEnquiry();
    }
}