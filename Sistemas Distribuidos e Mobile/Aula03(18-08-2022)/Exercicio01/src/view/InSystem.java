package view;

import java.awt.*;
import javax.swing.*;
import methods.*;
// import model.*;
import java.awt.event.*;

public class InSystem {

	JFrame frame;

	// A constructor.
	public InSystem() {
		initialize();
	}

	/**
	 * It creates a JFrame, sets its size, location, and layout, and then adds a JLabel, and four JButtons
	 * to it
	 */
	private void initialize() {

		frame = new JFrame();
		MetodosBase executor = new MetodosBase();

		JLabel lblNewLabel = new JLabel("Bem vindo ao sistema");

		JButton btnInsert = new JButton("INSERT");
		JButton btnRemover = new JButton("REMOVE");
		JButton btnAlterar = new JButton("CHANGE");
		JButton btnConsultar = new JButton("CONSULT");

		frame.setBounds(100, 100, 500, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		lblNewLabel.setBounds(151, 50, 201, 25);

		btnInsert.setBounds(10, 117, 100, 50);
		btnRemover.setBounds(132, 117, 100, 50);
		btnAlterar.setBounds(252, 117, 100, 50);
		btnConsultar.setBounds(374, 117, 100, 50);

		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(btnInsert);
		frame.getContentPane().add(btnRemover);
		frame.getContentPane().add(btnAlterar);
		frame.getContentPane().add(btnConsultar);
		

		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MetodosBase.tema();
				Inserir window = new Inserir();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});

		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				executor.remover();
			}
		});

		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				executor.alterar();
			}
		});

		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				executor.mostrar();
			}
		});

	}

}
