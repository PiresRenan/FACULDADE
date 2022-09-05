import methods.MetodosBase;
import view.Login;

public class App {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

        MetodosBase.tema();
        Login window = new Login();
		window.frame.setVisible(true);

    }
}