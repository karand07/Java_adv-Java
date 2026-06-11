package bank.dao;

import bank.connection.ConnectDb;
import bank.model.Account;

import java.sql.*;
import java.util.ArrayList;

public class AccountDAO {
    Connection con = ConnectDb.connectDb();
    public void signup(int account_no, String name, String email, String password, double balance) throws SQLException {
        if(!(email.contains("@") && email.endsWith(".com"))){
            System.out.println("Please enter a valid email address");
        }
        String sql = "insert into account values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, account_no);
        pst.setString(2, name);
        pst.setString(3, email);
        pst.setString(4, password);
        pst.setDouble(5, balance);

        pst.execute();

        System.out.println("Account created successfully");
    }
    public int login(String email, String password) throws SQLException {

        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";

        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, email);
        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            int accountNo = rs.getInt("account_no");

            System.out.println("Login Successful!");
            System.out.println("Welcome " + rs.getString("name"));
            return accountNo;
        }

        return 0;
    }
    public void updateAccount(int account_no, String name, String email, String password) throws SQLException {
        String sql = "UPDATE users WHERE account_no=? , name=? , email=? , password=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, account_no);
        pst.setString(2, name);
        pst.setString(3, email);
        pst.setString(4, password);
        pst.executeQuery();
        System.out.println("Account updated successfully");
    }
    public void withdraw(long accountNo, double amount) throws SQLException {

        String sql = "UPDATE users SET balance = balance - ? " +
                "WHERE account_no = ? AND balance >= ?";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setDouble(1, amount);
        pst.setLong(2, accountNo);
        pst.setDouble(3, amount);

        int rows = pst.executeUpdate();

        if (rows > 0) {
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public void deposit(long accountNo, double amount) throws SQLException {

        String sql = "UPDATE users SET balance = balance + ? WHERE account_no = ?";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setDouble(1, amount);
        pst.setLong(2, accountNo);

        int rows = pst.executeUpdate();

        if (rows > 0) {
            System.out.println("Deposit Successful");
        }
    }
    public void checkBalance(long accountNo) throws SQLException {
        String sql = "SELECT balance FROM users WHERE account_no = ?";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setLong(1, accountNo);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            System.out.println("Current Balance: ₹" + rs.getDouble("balance"));
        }
    }
    public ArrayList<Account> getAccounts() throws SQLException {
        String sql = "SELECT * FROM users";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Account> accounts = new ArrayList<>();
        while (rs.next()) {
            Account acc = new Account(rs.getInt("account_no"), rs.getString("name"), rs.getString("email"), rs.getString("password"), rs.getDouble("balance"));
            accounts.add(acc);
        }
        return accounts;
    }
    public void moneyTransfer(int account_no, double amount, int accTO) throws SQLException {

        String debitSql =
                "UPDATE users SET balance = balance - ? " +
                        "WHERE account_no = ? AND balance >= ?";

        String creditSql =
                "UPDATE users SET balance = balance + ? " +
                        "WHERE account_no = ?";

        try {
            con.setAutoCommit(false);
            PreparedStatement pst1 = con.prepareStatement(debitSql);
            pst1.setDouble(1, amount);
            pst1.setInt(2, account_no);
            pst1.setDouble(3, amount);

            int debitRows = pst1.executeUpdate();

            if (debitRows == 0) {
                con.rollback();
                System.out.println("Insufficient Balance");
                return;
            }

            PreparedStatement pst2 = con.prepareStatement(creditSql);
            pst2.setDouble(1, amount);
            pst2.setInt(2, accTO);

            int creditRows = pst2.executeUpdate();

            if (creditRows > 0) {
                con.commit();
                System.out.println("Money transfer Successful");
            } else {
                con.rollback();
                System.out.println("Receiver account not found");
            }

        } catch (SQLException e) {
            con.rollback();
            throw e;
        } finally {
            con.setAutoCommit(true);
        }
    }
}
