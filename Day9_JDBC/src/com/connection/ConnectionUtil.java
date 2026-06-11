package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    public static Connection getDbConnection() throws SQLException {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "475307");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;

    }
}