package bd;
import java.sql.*;
public class Connector {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ex01-sd","root","");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
		
	}
}

