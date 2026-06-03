package com.mathOp;

import java.util.Scanner;

public class TestMathOps {
    public static void main(String[] args) {
        MathOps obj = new MathOps();
        Scanner sc = new Scanner(System.in);
        int opt;
        do {
            System.out.println("Enter a");
            int a = sc.nextInt();
            System.out.println("Enter b");
            int b = sc.nextInt();
            System.out.println("Enter option");
            opt = sc.nextInt();
            switch (opt) {
                case 1 -> obj.add(a,b);
                case 2 -> {
                    int sub =obj.sub(a,b);
                    System.out.println(sub);
                }
                case 3 -> {
                   String multi = obj.mul(a,b);
                   System.out.println(multi);
                }
                case 4 -> {
                    int div = obj.div(a,b);
                    System.out.println(div);
                }
            }
        } while (opt != 5);
    }
}
