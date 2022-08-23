import dao.UserDAO;
// import model.User;

public class App {

	public static void main(String[] args) throws Exception {

        // User novo = new User("Vacilao", 10);
        UserDAO objeto = new UserDAO();

        objeto.listUser();
        
    }
}