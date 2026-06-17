package modules;

public class Product {
	private int id ,qty;
	private String name ;
	private double price ;

	public Product(int id , String name ,int qty ,double price) {
		this.id = id;
		this.name = name ;
		this.qty = qty ;
		this.price = price;
	}
	@Override
	public String toString() {
		return "{"+"id ="+id+" name="+name+" qty="+qty +" price="+price+" }";
	}
}