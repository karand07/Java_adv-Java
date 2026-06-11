package bank.client;

import bank.dao.AccountDAO;
import bank.model.Account;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        AccountDAO ad = new AccountDAO();

        int opt;
        int acc_no = 0;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Register Account");
            System.out.println("2. Login");
            System.out.println("3. Update Account");
            System.out.println("4. Check Balance");
            System.out.println("5. Deposit");
            System.out.println("6. Withdraw");
            System.out.println("7. Money Transfer");
            System.out.println("8. All accounts");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            opt = sc.nextInt();

            switch (opt) {
                case 1->{
                    System.out.println("Enter account no:");
                    acc_no = sc.nextInt();
                    System.out.println("Enter account name:");
                    String name = sc.next();
                    System.out.print("Enter Email: ");
                    String email = sc.next();

                    System.out.print("Enter Password: ");
                    String pass = sc.next();
                    System.out.println("Enter balance");
                    double balance = sc.nextDouble();

                    ad.signup(acc_no,name,email,pass,balance);
                    System.out.println("Registration Successful!");
                    acc_no = 0;
                }
                case 2 -> {
                    System.out.print("Enter Email: ");
                    String email = sc.next();

                    System.out.print("Enter Password: ");
                    String pass = sc.next();

                    acc_no = ad.login(email, pass);

                    if (acc_no > 0) {
                        System.out.println("Login Successful");
                    } else {
                        System.out.println("Invalid Email or Password");
                    }
                }
                case 3 ->{
                    if(acc_no<=0) System.out.println("please login first");
                    System.out.println("Enter name:");
                    String name = sc.next();
                    System.out.print("Enter Email: ");
                    String email = sc.next();
                    System.out.print("Enter Password: ");
                    String pass = sc.next();
                    ad.updateAccount(acc_no,name,email,pass);
                    System.out.println("Account Updated Successfully!");
                }
                case 4 -> {
                    if (acc_no > 0) {
                        ad.checkBalance(acc_no);
                    } else {
                        System.out.println("Please login first.");
                    }
                }
                case 5 -> {
                    if (acc_no > 0) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = sc.nextDouble();

                        ad.deposit(acc_no, amount);
                    } else {
                        System.out.println("Please login first.");
                    }
                }
                case 6 -> {
                    if (acc_no > 0) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = sc.nextDouble();

                        ad.withdraw(acc_no, amount);
                    } else {
                        System.out.println("Please login first.");
                    }
                }
                case 7 ->{
                    if (acc_no > 0) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = sc.nextDouble();
                        System.out.println("Enter the account number to transfer to: ");
                        int accTO = sc.nextInt();
                        ad.moneyTransfer(acc_no, amount,accTO);

                    } else {
                        System.out.println("Please login first.");
                    }
                }
                case 8 -> {
                    ArrayList<Account> accounts = ad.getAccounts();
                    for (Account acc : accounts) {
                        System.out.println(acc.toString());
                    }
                }

                case 9 -> {
                    System.out.println("Thank You!");
                    acc_no =0;
                }

                default -> {
                        System.out.println("Invalid Choice");
                }
            }

        } while (opt != 9);

        sc.close();
    }
}