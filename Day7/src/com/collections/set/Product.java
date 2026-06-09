package com.collections.set;

public class Product implements Comparable<Product> {
    private int id ;
    private String name;
    private double price;
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString(){
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
    @Override
    public int compareTo(Product p){
        return this.id - p.id;
    }

}
