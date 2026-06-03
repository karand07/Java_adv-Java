package com.library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        int opt;
        do {
            System.out.println("Select opt");
            opt = sc.nextInt();
            switch (opt) {
                case 1 -> {
                    System.out.println("Enter books name , author ,id,price");
                    int id = sc.nextInt();
                    String name = sc.next();
                    String author = sc.next();
                    double price = sc.nextInt();
                    b.newBook( name, author,id, price);
                    System.out.println("new book registered successfully");
                }
                case 2 -> {
                    System.out.println("------------Display Books------------");
                    b.getBookDetails();
                }
            }
        } while (opt != 3);
    }
}
