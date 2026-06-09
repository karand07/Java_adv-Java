package com.collections.set;
import java.util.Scanner;

public class HashMapp {
    public static void main(String[] args) {
        ProductHashUtil productUtill = new ProductHashUtil();
        Scanner sc = new Scanner(System.in);
        int opt;
        do{
            System.out.println("select option");
            opt = sc.nextInt();
            switch (opt){
                case 1->{
                    System.out.println("enter the key");
                    int key = sc.nextInt();
                    System.out.println("enter the id , name ,price");

                    productUtill.setProduct(key,new Product(sc.nextInt(), sc.next(), sc.nextDouble()));
                }
            case 2->{
                    System.out.println("enter the key");
                    int key = sc.nextInt();
                    productUtill.deleteProduct(key);
            }
            case 3->productUtill.showProduct();
            }        }while (opt !=4);
    }
}