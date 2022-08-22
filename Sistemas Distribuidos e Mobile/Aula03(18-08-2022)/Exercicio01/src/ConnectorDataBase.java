package src;
import java.sql.*;
public class ConnectorDataBase {
    private String url = "jdbc:mysql://localhost:3306/";
    private String dataBase = "ex01-sd";
    private String username = "root";
    private String password = "13579Rock";

    public ConnectorDataBase getConnection() {
        Connection c = DriverManager.getConnection(url+dataBase, username, password);
        return c;
    } 
}
