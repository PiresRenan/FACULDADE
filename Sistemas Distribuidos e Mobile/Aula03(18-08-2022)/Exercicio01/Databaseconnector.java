import java.sql.*;

public class Databaseconnector {
    private String url = "jdbc:mysql://localhost:3306/teste";
    private String username = "root";
    private String password = "13579Rock";

    public Databaseconnector () throws SQLException{
        Connection conector = DriverManager.getConnection(url, username, password);
        String query = "SELECT * FROM pessoa";
        Statement statement = conector.createStatement();
        ResultSet result = statement.executeQuery(query);
        while (result.next()) {
            String nome = result.getString("nome");
            int idade = result.getInt("idade");
            System.out.println("Nome: " + nome + "\nIdade: "+ idade);
        }
        conector.close();
    }
}
