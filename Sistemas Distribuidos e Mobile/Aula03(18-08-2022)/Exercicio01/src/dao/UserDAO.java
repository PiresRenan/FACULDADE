package dao;

import java.sql.*;

import javax.swing.JOptionPane;

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
	
	public boolean updateUser(String novo_nome, int nova_idade, String nome) throws SQLException {
		
        String sql = "UPDATE pessoa SET nome=?, idade=? WHERE nome="+ nome + ";";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(2, novo_nome);
		statement.setInt(3, nova_idade);
		int rowsUpdated = statement.executeUpdate(sql);
		
		return (rowsUpdated > 0);
	}
	
	public boolean deleteUser(String nome) throws SQLException {
		
		String sql = "DELETE FROM pessoa WHERE nome=?;";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(2,nome);
		int rowsDeleted = statement.executeUpdate();
		
		return (rowsDeleted > 0);
	}
	
	public User findUser(String nome) throws SQLException {
		
		String sql = "SELECT * FROM pessoa WHERE nome=?";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(2, nome);
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
			JOptionPane.showMessageDialog(null,"Nome= " +result.getString("nome") +
                               "\nIdade= " + result.getInt("idade") 
            );
		}
	}

}