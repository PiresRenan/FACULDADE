package view;

import java.awt.*;
import javax.swing.*;

import methods.MetodosDatabase;
import model.User;

import java.awt.event.*;


public class Inserir {

	JFrame frame;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtSaldo;

	public Inserir() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// It's creating the components.
		frame = new JFrame();

		JLabel lblNewLabel = new JLabel("Novo Cliente");
		JLabel lblNewLabel_1 = new JLabel("Nome");
		JLabel lblNewLabel_1_1 = new JLabel("Idade");
		JLabel lblNewLabel_1_1_1 = new JLabel("Saldo");

		txtNome = new JTextField();
		txtIdade = new JTextField();
		txtSaldo = new JTextField();

		JButton btnNewButton = new JButton("Cadastrar");

		// It's setting the size of the frame, the layout, the font, the size and the position of the
		// components.
		frame.setBounds(100, 100, 250, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(46, 28, 150, 46);
		
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 103, 42, 25);
		
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 150, 42, 25);

		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(10, 197, 42, 25);

		txtNome.setBounds(69, 101, 155, 30);
		txtNome.setColumns(10);
		
		txtIdade.setColumns(10);
		txtIdade.setBounds(69, 148, 155, 30);
		
		txtSaldo.setColumns(10);
		txtSaldo.setBounds(69, 195, 155, 30);
		
		btnNewButton.setBounds(69, 237, 99, 38);

		// It's adding the components to the frame.
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(lblNewLabel_1_1);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		frame.getContentPane().add(txtNome);
		frame.getContentPane().add(txtIdade);
		frame.getContentPane().add(txtSaldo);
		frame.getContentPane().add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					User novo_cliente = new User(txtNome.getText(), Integer.parseInt(txtIdade.getText()));
				System.out.println(novo_cliente.getName() + novo_cliente.getAge());
				MetodosDatabase objeto_cadastro = new MetodosDatabase();
				try {
					objeto_cadastro.insertUser(novo_cliente);
				} catch (Exception ea) {
					JOptionPane.showMessageDialog(null, ea);
				}
				int confirma = JOptionPane.showConfirmDialog(null, "Cadastro realizado.\nDeseja realizar novo cadastro?");
				
				if (confirma == 1) {
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
				} 
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, "Opa, parece que algo está faltando!", "Erro", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}

}
