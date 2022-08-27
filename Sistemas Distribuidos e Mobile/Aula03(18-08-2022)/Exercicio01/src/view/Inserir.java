package view;

import javax.swing.*;
import methods.*;
import model.*;
import java.awt.*;
import java.awt.event.*;

public class Inserir {

	JFrame frame;
	Cliente cliente;
	MetodosBase m = new MetodosBase();
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

				cliente = new Cliente(txtNome.getText(), Integer.parseInt(txtIdade.getText()), Float.parseFloat(txtSaldo.getText()));

				if (m.inserir(cliente)) {
					int confirma = JOptionPane.showConfirmDialog(null, "Cadastro realizado.\nDeseja realizar novo cadastro?");
					switch(confirma){
						case 0:
							txtNome.setText("");
							txtNome.requestFocus();
							txtIdade.setText("");
							txtSaldo.setText("");
							break;
						case 1:
							MetodosBase.tema();
							InSystem window = new InSystem();
			 				window.frame.setVisible(true);
							frame.dispose();
							break;
						case 2:
							frame.dispose();
							break;
					}
				}
				else {
						JOptionPane.showMessageDialog(null, "Algo deu errado!\nVerifique se todos os campos foram devidamente preenchidos.", "Erro: dados inválidos", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}

}
