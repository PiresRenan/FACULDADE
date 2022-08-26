package methods;

import java.sql.*;

import javax.swing.JOptionPane;

import databaseConnection.Connector;
import model.Cliente;
import model.User;

public class MetodosDatabase {

	Connection connection;
	
	public MetodosDatabase(){
		connection = Connector.getConnection();
	}
	
	public boolean insertUser(Cliente cliente) throws SQLException {
		
		String sql = "INSERT INTO cliente (nome,idade,saldo) VALUES(?,?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, cliente.getNome());
		statement.setInt(2, cliente.getIdade());
		statement.setFloat(3, cliente.getSaldo());
		int rowsInserted = statement.executeUpdate();
		
		return (rowsInserted > 0);
	}
	
	public boolean updateUser(String novo_nome, int nova_idade, int id) throws SQLException {
		
        String sql = "UPDATE pessoa SET nome=?, idade=? WHERE idUser=?;";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, novo_nome);
		statement.setInt(2, nova_idade);
		statement.setInt(3, id);
		int rowsUpdated = statement.executeUpdate(sql);
		
		return (rowsUpdated > 0);
	}
	
	public boolean deleteUser(String nome) throws SQLException {
		
		String sql = "DELETE FROM pessoa WHERE nome=?;";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1,nome);
		int rowsDeleted = statement.executeUpdate();
		
		return (rowsDeleted > 0);
	}
	
	public User findUser(String nome) throws SQLException {
		
		String sql = "SELECT * FROM pessoa WHERE nome=?";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, nome);
		ResultSet result = statement.executeQuery();

		if(result.next()) {
			User user = new User(
					result.getInt(1),
					result.getInt(2),
					result.getString(3)
					);
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