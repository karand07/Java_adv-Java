package com.bank;

public class Bank {
    private int acId;
    private String name, email;
    private double balance;
    public void createAcc(int acId, String name, String email ) {
        this.acId = acId;
        this.name = name;
        this.email = email;
        balance=1000;
    }
    public void getAccDetails() {
        System.out.println("-------------Account Details------------");
        System.out.println("Account Id"+acId);
        System.out.println("Name"+name);
        System.out.println("Email"+email);
    }
    public void deposite(double amount) {
        System.out.println("--------------Deposite Money------------");
        System.out.println("Deposite amount"+amount );
        balance +=amount;
        System.out.println("Total Balance after Deposite"+balance);
    }
    public void withdraw(double amount) {
        System.out.println("--------------Withdraw Money------------");
        System.out.println("Withdraw amount:"+amount );
        balance -=amount;
        System.out.println("Total Balance after withdraw"+balance);
    }
    public void getBalance(){
        System.out.println("--------------Balance------------");
        System.out.println("Balance"+balance);
    }
}
