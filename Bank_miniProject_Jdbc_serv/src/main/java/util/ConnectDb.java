package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {
	public Connection getDbConnected() throws SQLException {
		Connection con ;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","475307");
			return con ;
	}
}
