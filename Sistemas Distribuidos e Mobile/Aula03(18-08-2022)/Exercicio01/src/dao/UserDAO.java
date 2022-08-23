package dao;

import java.sql.*;
import bd.Connector;
import model.User;

public class UserDAO {

	Connection connection;
	
	public UserDAO(){
		connection = Connector.getConnection();
	}
	
	public boolean insertUser(User user) throws SQLException {
		
		String sql = "INSERT INTO pessoa (nome,idade) VALUES(?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, user.getName());
		statement.setInt(2, user.getAge());
		int rowsInserted = statement.executeUpdate();
		
		return (rowsInserted > 0);
	}
	
	public boolean updateUser() throws SQLException {
		
		Statement statement = connection.createStatement();
        String sql = "UPDATE pessoa SET idade=26 WHERE idUser=1;";
		int rowsUpdated = statement.executeUpdate(sql);
		
		return (rowsUpdated > 0);
	}
	
	public boolean deleteUser(int id) throws SQLException {
		
		String sql = "DELETE FROM pessoa WHERE idUser=?;";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1,id);
		int rowsDeleted = statement.executeUpdate();
		
		return (rowsDeleted > 0);
	}
	
	public User findUser(int id) throws SQLException {
		
		String sql = "SELECT * FROM pessoa WHERE idUser=?";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, id);
		ResultSet result = statement.executeQuery();

		if(result.next()) {
			User user = new User(
					result.getString(2),
					result.getInt(3)
					);
            System.out.println(user);
			return user;
		}else {
			return null;
		}
		/*return (rowsDeleted > 0);*/
	}
	
	public void listUser() throws SQLException {
		
		String sql = "SELECT * FROM pessoa";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet result = statement.executeQuery();
		
		while(result.next()) {
			System.out.println("Nome= " +result.getString("nome") +
                               "\nIdade= " + result.getInt("idade") 
            );
		}
	}

}