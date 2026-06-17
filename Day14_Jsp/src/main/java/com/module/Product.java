package com.module;

public class Product {
	private int id ,qty;
	private String name ;
	private double price ;
	
	 public Product() {
	    }


	public Product(int id , String name ,int qty ,double price) {
		this.id = id;
		this.name = name ;
		this.qty = qty ;
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
	    return id;
	}

	public void setId(int id) {
	    this.id = id;
	}
	@Override
	public String toString() {
		return "{"+"id ="+id+" name="+name+" qty="+qty +" price="+price+" }";
	}
}