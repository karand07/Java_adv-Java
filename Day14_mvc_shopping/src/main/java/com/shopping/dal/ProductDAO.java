package com.shopping.dal;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.shopping.model.Product;
import com.shopping.util.connectionUtil;

public class ProductDAO {
	private Connection con ;
	public ProductDAO() {
		con = connectionUtil.getDbCon();
		System.out.println("-------------ProductDOA----------");
	}
	
	public ArrayList<Product> getAllPrds(){
		System.out.println("---------All Products----------------");
		ArrayList<Product> prdList = new ArrayList<Product>();
		try {
		String sql = "SELECT * FROM product";
		
			Statement stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery(sql);
			

			while(rset.next()) {
				prdList.add(new Product(
						rset.getInt("id"),
						rset.getString("name"),
						rset.getDouble("price"),
						rset.getInt("qty")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prdList;
		
	}
	
	public void addProduct(Product p) {
	    System.out.println("---------Add Product--------");

	    try {
	        String sql = "INSERT INTO product (name, price, qty) VALUES (?, ?, ?)";

	        PreparedStatement pstm = con.prepareStatement(sql);

	        pstm.setString(1, p.getName());
	        pstm.setDouble(2, p.getPrice());
	        pstm.setInt(3, p.getQty());

	        int rows = pstm.executeUpdate();

	        if (rows > 0) {
	            System.out.println("Product added successfully.");
	        }

	        pstm.close();

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public ArrayList<Product> searchBy(String name){
		ArrayList<Product> prdList = new ArrayList<Product>();
		try {
			String sql  = "select * from product where name = ?";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1,name);
			ResultSet rset  = pstm.executeQuery();
			
			while(rset.next()) {
				prdList.add(new Product(
						rset.getInt("id"),
						rset.getString("name"),
						rset.getDouble("price"),
						rset.getInt("qty")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prdList ;
	}
}
