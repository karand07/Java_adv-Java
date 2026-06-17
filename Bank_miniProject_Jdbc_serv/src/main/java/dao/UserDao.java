package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.ConnectDb;

public class UserDao {


	public ResultSet getUserDetails(String username) {
		 try {
	            ConnectDb db = new ConnectDb();
	            Connection con = db.getDbConnected();

	            String sql = "SELECT * FROM users WHERE username=?";

	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setString(1, username);

	            return ps.executeQuery();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

		return null;
	}
}