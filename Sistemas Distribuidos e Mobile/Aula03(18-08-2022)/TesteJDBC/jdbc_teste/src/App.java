import java.sql.*;
public class App {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/ex01-sd";
        String username = "root";
        String password = "13579Rock";
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url, username, password);
            Statement st = c.createStatement();
            ResultSet result = st.executeQuery("SELECT nome FROM pessoa;");
            while (result.next()) {
                System.out.println(result.getString("nome"));
            }
            c.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
