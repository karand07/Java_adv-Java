package com.collections.set;

import java.util.HashMap;
import java.util.TreeSet;

public class ProductHashUtil {
    HashMap<Integer,Product> hash = new HashMap<Integer,Product>();

    public void setProduct(int i,Product p){
        System.out.println("Product added successfully");
        hash.put(i,p);
    }
    public void deleteProduct(int i){
        System.out.println("Product deleted successfully");
        hash.remove(i);
    }
    public void showProduct(){
        System.out.println("Product details ");
        for (Product p1 :hash.values()){
            System.out.println(p1.toString());
        }
    }
}
