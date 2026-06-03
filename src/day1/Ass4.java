package day1;

import java.util.Scanner;

public class Ass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2 :");
        int num2 = sc.nextInt();

        System.out.println("-----------Comparison-------------");

        if (num1>num2){
            System.out.println("num1 is greater than num2 ");
        } else if (num1<num2) {
            System.out.println("num1 is less than num2 ");
        }else {
            System.out.println("num1 is equal to num2 ");
        }
    }
}
