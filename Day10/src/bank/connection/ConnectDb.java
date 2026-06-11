package bank.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {
    public static Connection connectDb()  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","475307");
            return con;
        }catch (SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
