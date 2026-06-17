package com.shopping.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionUtil {
	private static Connection con ;
	public static Connection getDbCon() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","475307");
			System.out.println("Db Connected Successesfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
