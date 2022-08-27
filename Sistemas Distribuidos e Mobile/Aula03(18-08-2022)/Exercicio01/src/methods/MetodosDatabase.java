package methods;

import java.sql.*;

import javax.swing.JOptionPane;

// import javax.swing.*;
import databaseConnection.Connector;
import model.Cliente;

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

	public boolean deleteUser(String nome) throws SQLException {
		
		String sql = "DELETE FROM cliente WHERE nome=?;";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1,nome);
		int rowsDeleted = statement.executeUpdate();
		
		return (rowsDeleted > 0);
	}

	public Cliente findUser(String nome) throws SQLException {
		
		String sql = "SELECT * FROM cliente WHERE nome=?";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, nome);
		ResultSet result = statement.executeQuery();

		if(result.next()) {
			Cliente cliente = new Cliente(
					result.getString(2),
					result.getInt(3),
					result.getFloat(4),
					result.getInt(1)
					);
			return cliente;
		}else {
			return null;
		}
	}
	
	public boolean updateUser(Cliente cliente) throws SQLException {
		
        String sql = "UPDATE `bancodb`.`cliente` SET `nome` = '"+ cliente.getNome() +"', `idade` = '"+ cliente.getIdade() +"', `saldo` = '"+ cliente.getSaldo() +"' WHERE (`idUser` = '"+cliente.getId()+"');";
		PreparedStatement statement = connection.prepareStatement(sql);
		int rowsUpdated = statement.executeUpdate(sql);
		
		return (rowsUpdated > 0);
	}
	
	public void listUser() throws SQLException {
		
		String sql = "SELECT * FROM cliente";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet result = statement.executeQuery();
		
		while(result.next()) {
			JOptionPane.showMessageDialog(null,"Cliente nº " + result.getString(1) + "\nNome= " +result.getString("nome") +
                               "\nIdade= " + result.getInt("idade")+ "\nSaldo= US$ " + result.getFloat("saldo") 
            );
		}
	}

}