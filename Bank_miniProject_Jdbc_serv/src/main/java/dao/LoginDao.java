package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.ConnectDb ;
public class LoginDao {

    public boolean validateUser(String username, String password) {

        boolean status = false;

        try {
        	ConnectDb db = new ConnectDb();
            Connection con = db.getDbConnected();

            String sql = "SELECT * FROM users WHERE username=? AND password=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                status = true;
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}