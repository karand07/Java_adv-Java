package day1;

import java.util.Scanner;

public class Ass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollNo;
        String name;
        String branch;
        char div;
        double cgpa;
        boolean verify ;

        System.out.println("Enter Roll no:");
        rollNo = sc.nextInt();
        System.out.println("Enter name:");
        name = sc.next();
        System.out.println("Enter branch:");
        branch = sc.next();
        System.out.println("Enter div:");
        div = sc.next().charAt(0);
        System.out.println("Enter cgpa:");
        cgpa = sc.nextDouble();
        System.out.println("is Student veridied:");
        verify = sc.nextBoolean();

        System.out.println("----------------------Details---------------------");
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(branch);
        System.out.println(div);
        System.out.println(cgpa);
        System.out.println(verify);

    }
}
