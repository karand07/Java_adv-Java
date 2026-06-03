package com.employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        int opt;
        do {
            System.out.println("Select opt");
            opt = sc.nextInt();
            switch (opt) {
                case 1 -> {
                    System.out.println("Enter your id ,name , email,salary");
                    int id = sc.nextInt();
                    String name = sc.next();
                    String email = sc.next();
                    double salary = sc.nextInt();
                    e.createEmp(id, name, email, salary);
                    System.out.println("Employee created successfully");
                }
                case 2 -> {
                    System.out.println("Enter your id ,name , email,salary");
                    e.getEmp();
                }
            }
        } while (opt != 3);
    }
}
