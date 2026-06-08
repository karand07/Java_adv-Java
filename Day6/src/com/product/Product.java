package com.product;

public class Product {
int  id;
String name;
int price;
Category category;
Date date;

public Product(int id,String name,int price,String category,Date date){
    this.id = id;
    this.name = name;
    this.price = price ;
    this.date = date;
    this.category = Category.valueOf(category);
}

@Override
    public String toString(){
    return "Product "+id+" "+name+" "+price+" "+category+" "+date.toString();
}
}
