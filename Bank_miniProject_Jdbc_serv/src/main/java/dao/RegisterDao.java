package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.ConnectDb;

public class RegisterDao {

    public boolean registerUser(String fullname,
                                String username,
                                String email,
                                String phone,
                                String accountType,
                                double balance,
                                String password) {

        boolean status = false;

        try {
            ConnectDb db = new ConnectDb();
            Connection con = db.getDbConnected();

            String sql = "INSERT INTO users "
                    + "(fullname, username, email, phone, account_type, balance, password) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, fullname);
            ps.setString(2, username);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setString(5, accountType);
            ps.setDouble(6, balance);
            ps.setString(7, password);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                status = true;
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}