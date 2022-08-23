package dao;

import java.sql.*;
import java.util.*;
import bd.Connector;
import model.User;

public class UserDAO {

	Connection connection;
	
	public UserDAO(){
		connection = Connector.getConnection();
	}
	
	public boolean insertUser(User user) throws SQLException {
		
		String sql = "INSERT INTO user (name,email,senha) VALUES(?,?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, user.getName());
		statement.setString(2, user.getEmail());
		statement.setString(3, user.getSenha());
		int rowsInserted = statement.executeUpdate();
		
		return (rowsInserted > 0);
	}
	
	public boolean updateUser(User user) throws SQLException {
		
		String sql = "UPDATE user set EMAIL=?, SENHA=? WHERE id=?;";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, user.getEmail());
		statement.setString(2, user.getSenha());
		statement.setInt(3, user.getId());
		int rowsUpdated = statement.executeUpdate();
		
		return (rowsUpdated > 0);
	}
	
	public boolean deleteUser(int id) throws SQLException {
		
		String sql = "DELETE FROM user WHERE id=?;";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, id);
		int rowsDeleted = statement.executeUpdate();
		
		return (rowsDeleted > 0);
	}
	
	public User findUser(int id) throws SQLException {
		
		String sql = "SELECT * FROM user WHERE id=?";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, id);
		ResultSet result = statement.executeQuery();

		if(result.next()) {
			User user = new User(
					result.getInt(1),
					result.getString(2),
					result.getString(3),
					result.getString(4)
					);
			return user;
		}else {
			return null;
		}
		/*return (rowsDeleted > 0);*/
	}
	
	public List<User> listUser() throws SQLException {
		
		String sql = "SELECT * FROM user";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet result = statement.executeQuery();
		
		List<User> users = new ArrayList<>();
		
		while(result.next()) {
			User user = new User(
					result.getInt(1),
					result.getString(2),
					result.getString(3),
					result.getString(4)
					);
			users.add(user);
		}
		return users;
		
		/*return (rowsDeleted > 0);*/
	}
	
	public void close() throws SQLException {
		connection.close();
	}
}