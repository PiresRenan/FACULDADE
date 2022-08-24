package view;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Login {

	public JFrame frame;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	private JLabel lblNewLabel_2;

	// A constructor.
	public Login() {
		initialize();
	}

	/**
	 * It creates a new JFrame, sets its properties, adds a JLabel, a JTextField, a JPasswordField, a
	 * JButton, and another JLabel to the JFrame, and adds an ActionListener to the JButton
	 */
	private void initialize() {

		frame = new JFrame();

		JLabel lblNewLabel = new JLabel("LOGIN");
		JLabel lblNewLabel_1 = new JLabel("SENHA");

		JButton btnNewButton = new JButton("ENTRAR");

		txtLogin = new JTextField();
		txtSenha = new JPasswordField();

		frame.setVisible(true);
		frame.setResizable(false);
		frame.setBackground(SystemColor.desktop);
		frame.setBounds(100, 100, 400, 336);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

		lblNewLabel_2 = new JLabel("Login Banco");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(109, 28, 186, 53);
		
		lblNewLabel.setBounds(21, 115, 46, 29);

		lblNewLabel_1.setBounds(21, 171, 46, 29);
		
		txtLogin.setBounds(76, 112, 279, 32);
		txtLogin.setColumns(10);
		
		txtSenha.setBounds(76, 168, 279, 32);

		btnNewButton.setBounds(139, 233, 104, 43);

		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(lblNewLabel_2);
		frame.getContentPane().add(txtLogin);
		frame.getContentPane().add(txtSenha);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkLogin(txtLogin.getText(), new String(txtSenha.getPassword()))) {
					try {
						for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
							if ("Nimbus".equals(info.getName())) {
								javax.swing.UIManager.setLookAndFeel(info.getClassName());
								break;
							}
						}
					} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
						System.err.println(ex);
					}
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								InSystem window = new InSystem();
								window.frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					frame.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Dados inválidos!");
				}
			}
		});

	}
	
	/**
	 * It returns true if the login is "Renan" and the password is "123456"
	 * 
	 * @param login The username to be used for authentication.
	 * @param senha The password to be checked.
	 * @return A boolean value.
	 */
	public boolean checkLogin(String login, String senha) {
		return login.equals("Renan") && senha.equals("123456");
	}
}
