package Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();   // Create one account object

        int opt;

        do {
            System.out.println("\n1.Create Account");
            System.out.println("2.Display Account Details");
            System.out.println("3.Deposit Money");
            System.out.println("4.Withdraw Money");
            System.out.println("5.Check Balance");
            System.out.println("6.Exit");

            System.out.print("Enter Choice: ");
            opt = sc.nextInt();

            switch (opt) {

                case 1 -> {
                    System.out.println("-----------Create Account---------");

                    System.out.print("Enter Account Number: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    bank = new Bank(id, name);
                }

                case 2 -> bank.getAccDetails();

                case 3 -> {
                    System.out.print("Enter Amount to Deposit: ");
                    double amount = sc.nextDouble();
                    bank.deposite(amount);
                }

                case 4 -> {
                    System.out.print("Enter Amount to Withdraw: ");
                    double amount = sc.nextDouble();
                    bank.withdraw(amount);
                }

                case 5 -> bank.getBalance();

                case 6 -> System.out.println("Thank You!");

                default -> System.out.println("Invalid Choice");
            }

        } while (opt != 6);

        sc.close();
    }
}