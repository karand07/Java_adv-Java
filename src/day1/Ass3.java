package day1;

import java.util.Scanner;

public class Ass3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 :");
        int num2 = sc.nextInt();
        System.out.println("Select operation :");
        System.out.println("1 : +");
        System.out.println("2 : -");
        System.out.println("3 : *");
        System.out.println("4 : /");
        int op = sc.nextByte();

        switch (op){
            case 1 ->System.out.println("addition : " + (num1+ num2));
            case 2 ->System.out.println("substraction : " + (num1 - num2));
            case 3 ->System.out.println("mult : " + (num1 * num2));
            case 4 ->System.out.println("div : " + (num1 / num2));
        }

    }
}
