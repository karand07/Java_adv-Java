package com.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int opt ;
        do{
            System.out.println("1.Create Account");
            System.out.println("2.Display Accounts Details");
            System.out.println("3.Deposite Money");
            System.out.println("4.Withdrow Money");
            System.out.println("5.Check Balance");
            System.out.println("6.Exit");
            opt = sc.nextInt();
            switch(opt){
                case 1->{
                    System.out.println("-----------Create Account---------");
                    System.out.println("Enter Account Number:");
                    int id = sc.nextInt();
                    System.out.println("Enter Name:");
                    String name = sc.next();
                    System.out.println("Enter Email:");
                    String email=sc.next();
                    bank.createAcc(id, name, email);
                }
                case 2-> bank.getAccDetails();
                case 3->{
                    System.out.println("Enter Amount to Deposite");
                    double amount = sc.nextDouble();
                    bank.deposite(amount);
                }
                case 4->{
                    System.out.println("Enter Amount to Withdraw");
                    double amount = sc.nextDouble();
                    bank.withdraw(amount);
                }
                case 5->bank.getBalance();
            }
        }while(opt!=6);
    }
}
