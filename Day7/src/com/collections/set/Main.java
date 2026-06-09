package com.collections.set;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opt;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter option");
            opt = sc.nextInt();
            ProductUtill productUtill = new ProductUtill();
            switch (opt){
                case 1-> {
                    System.out.println("Enter id , name ,price");
                    int id = sc.nextInt();
                    String name = sc.next();
                    int price = sc.nextInt();
                    productUtill.setProduct(new Product(id, name, price));
                }
                case 2-> {
                    System.out.println("delete product");
                    System.out.println("Enter id , name ,price");
                    int id = sc.nextInt();
                    String name = sc.next();
                    int price = sc.nextInt();
                    productUtill.deleteProduct(new Product(id, name, price));
                }
                case 3->{

                    productUtill.showProduct();
                }  case 4->{
                productUtill.sortProduct();
                }
            }

        }while(opt!=5);
    }
}
