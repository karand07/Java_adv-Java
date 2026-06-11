package com.test;

import com.connection.ConnectionUtil;

import java.sql.*;
import java.util.Scanner;

public class TestConnection {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Connection con = ConnectionUtil.getDbConnection();
        String sql = "INSERT INTO student(roll,name,marks) VALUES (?,?,?)";
        String sql1 = "SELECT * FROM student";
        String sql2= "UPDATE student SET roll=?,name=?,marks=? WHERE roll=?";
        PreparedStatement pst = con.prepareCall(sql);
        Statement st = con.createStatement();
        ResultSet rs1 = st.executeQuery(sql2);
        ResultSet rs = st.executeQuery(sql1);
       int opt = 0;
        do{
            System.out.println("Select Option:");
            opt = sc.nextInt();
            switch (opt){
                case 1 ->{
                    System.out.println("Enter Roll no.");
                    int roll = sc.nextInt();
                    System.out.println("Enter name.");
                    String name = sc.next();
                    System.out.println("Enter marks.");
                    int marks = sc.nextInt();
                    pst.setInt(1, roll);
                    pst.setString(2, name);
                    pst.setInt(3, marks);
                    pst.execute();
                }
                case 2 ->{
                    while (rs.next()) {
                        System.out.println(rs.getInt("roll"));
                        System.out.println(rs.getString("name"));
                        System.out.println(rs.getString("marks"));
                        System.out.println("------------------------");
                    }
                }
                case 3 ->{
                    System.out.println("Enter Roll no.");
                    int roll = sc.nextInt();
                    System.out.println("Enter name.");
                    String name = sc.next();
                    System.out.println("Enter marks.");
                    int marks = sc.nextInt();

                }
            }
        }while (opt !=4);

    }
}
