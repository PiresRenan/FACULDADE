package databaseConnection;
import java.sql.*;
public class Connector {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancodb","root","");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
		
	}
}

