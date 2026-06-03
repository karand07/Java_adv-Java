package day1;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.create Account");
        System.out.println("2.Show details");
        System.out.println("3.Edit Details");
        System.out.println("4.withdraw");
        System.out.println("5.Deposite");
        System.out.println("6.Check Balance");
        System.out.println("7.Exit");
        int opt ;
        int day =0 , month = 0 , year = 0;
        String  name ="",city="" , email="";
        double balance =0;
        long contanctNo = 0;
        double amount=0;
        do{
            System.out.println("Select Option:");
            opt = sc.nextByte();
            switch (opt){
                case 1 ->{
                    System.out.println("-------create Account---------");
                    System.out.println("Enter Name:");
                    name = sc.next();
                    System.out.println("Enter Dob (dd-mm-yyyy)");
                    day = sc.nextByte();
                    month = sc.nextByte();
                    year= sc.nextInt();
                    System.out.println("Enter city");
                    city = sc.next();
                    System.out.println("Enter Email and contact:");
                    email = sc.next();
                    contanctNo= sc.nextLong();
                    balance +=500;
                }
                case 2->{
                    System.out.println("name ="+name);
                    System.out.println("email ="+email);
                    System.out.println("contact ="+contanctNo);
                    System.out.println("DOB :"+day +"-"+month+"-"+year);
                }
                case 3 ->{
                    System.out.println("-");
                }
                case 4 ->{
                    System.out.println("Enter The amount to withdraw");
                    amount = sc.nextDouble();
                    balance -= amount;
                    System.out.println("Remaining Balance :" +balance);
                }
                case 5 ->{
                    System.out.println("Enter The amount to diposite");
                    amount = sc.nextDouble();
                    balance +=amount;
                }
                case 6 ->{
                    System.out.println("Show Balance :"+balance);
                }
                case 7->{
                    System.out.println("Exit");
                }
            }
        }while (opt!=7);
    }
}
