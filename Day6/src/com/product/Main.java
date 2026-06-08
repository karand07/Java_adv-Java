package com.product;

public class Main {
    public static void main(String[] args) {
        Date d = new Date(11,12,2025);
        Product product = new Product(1,"laptop",10000,"OTHERS",d);
        String s = product.toString();
        System.out.println(s);
    }
}
