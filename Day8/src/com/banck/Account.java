package com.banck;

public class Account {
    private int actid ;
    private String name ;
    private double balance ;
    public Account(int actid,String name){
        this.actid = actid;
        this.name = name;
        balance =5000;
    }
    @Override
    public String toString (){
        return "account no:"+actid +" name:"+name ;
    }
    public double getBalance(){
        return balance;
    }
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
}
