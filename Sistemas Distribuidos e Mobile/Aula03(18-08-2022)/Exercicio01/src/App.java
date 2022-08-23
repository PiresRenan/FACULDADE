import java.sql.*;

import bd.Connector;
import dao.UserDAO;

public class App {

	public static void main(String[] args) throws Exception {
		UserDAO objeto = new UserDAO();

        objeto.insertUser("Renan");

    }
}