package com.collections.set;

import java.util.HashSet;
import java.util.TreeSet;

public class ProductUtill{
    HashSet<Product> set = new HashSet<Product>();
    public void setProduct(Product p){
        System.out.println("Product added successfully");
        set.add(p);
    }
    public void deleteProduct(Product p){
        System.out.println("Product deleted successfully");
        set.remove(p);
    }
    public void sortProduct(){
        System.out.println("Product sorted successfully");
        TreeSet<Product> sortedSet= new TreeSet<Product>(set);
        for (Product p1 :sortedSet){
            System.out.println(p1);
        }
    }
    public void showProduct(){
        System.out.println("Product details ");
        for (Product p1 :set){
            System.out.println(p1.toString());
        }
    }

}
