package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.ConnectDb;

public class TransactionDao {

    public boolean deposit(String username, double amount) {

        try {
            ConnectDb db = new ConnectDb();
            Connection con = db.getDbConnected();

            String sql =
                    "UPDATE users SET balance = balance + ? " +
                    "WHERE username = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, amount);
            ps.setString(2, username);

            int rows = ps.executeUpdate();

            ps.close();
            con.close();

            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean withdraw(String username, double amount) {

        try {
            ConnectDb db = new ConnectDb();
            Connection con = db.getDbConnected();

            String checkSql =
                    "SELECT balance FROM users WHERE username = ?";

            PreparedStatement checkPs =
                    con.prepareStatement(checkSql);

            checkPs.setString(1, username);

            ResultSet rs = checkPs.executeQuery();

            if (rs.next()) {

                double balance = rs.getDouble("balance");

                if (balance >= amount) {

                    String updateSql =
                            "UPDATE users " +
                            "SET balance = balance - ? " +
                            "WHERE username = ?";

                    PreparedStatement updatePs =
                            con.prepareStatement(updateSql);

                    updatePs.setDouble(1, amount);
                    updatePs.setString(2, username);

                    int rows = updatePs.executeUpdate();

                    updatePs.close();
                    rs.close();
                    checkPs.close();
                    con.close();

                    return rows > 0;
                }
            }

            rs.close();
            checkPs.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}