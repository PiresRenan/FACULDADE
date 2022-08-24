package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InSystem {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the application.
	 */
	public InSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Bem vindo ao sistema");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		lblNewLabel.setBounds(151, 50, 201, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 117, 100, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRemover = new JButton("REMOVE");
		btnRemover.setBounds(132, 117, 100, 50);
		frame.getContentPane().add(btnRemover);
		
		JButton btnAlterar = new JButton("CHANGE");
		btnAlterar.setBounds(252, 117, 100, 50);
		frame.getContentPane().add(btnAlterar);
		
		JButton btnConsultar = new JButton("CONSULT");
		btnConsultar.setBounds(374, 117, 100, 50);
		frame.getContentPane().add(btnConsultar);
	}

}
