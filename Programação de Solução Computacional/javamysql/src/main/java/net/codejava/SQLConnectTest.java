package net.codejava;

import java.sql.*;

public class SQLConnectTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/teste2?useTimezone=true&serverTimezone=UTC";
		String username = "root";
		String password = "13579Rock";
		
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			//execução de consulta de table
			String sql = "SELECT * FROM customer";
            Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			//roda todas as infos na coluna
			int count = 0;
			while(result.next()) {
				String firstname = result.getString("firstname");
				String lastname = result.getString("lastname");
				count++;
				System.out.println("Customer " + count + ": " + firstname + " " + lastname);
			}
			connection.close();
			
		} catch (SQLException e) {
			System.out.print("ERROR");
			e.printStackTrace();
		}
	
	}
}
