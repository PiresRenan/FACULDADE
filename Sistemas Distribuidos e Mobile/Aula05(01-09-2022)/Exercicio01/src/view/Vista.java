package view;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Vista {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @return 
	 */
	public Vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();

		JTextField txtArea;

		JButton btnOne = new JButton("1");
		JButton btnTwo = new JButton("2");
		JButton btnThree = new JButton("3");
		JButton btnFour = new JButton("4");
		JButton btnFive = new JButton("5");
		JButton btnSix = new JButton("6");
		JButton btnSeven = new JButton("7");
		JButton btnEight = new JButton("8");
		JButton btnNine = new JButton("9");
		JButton btnZero = new JButton("0");
		JButton btnDot = new JButton(".");
		JButton btnPlus = new JButton("+");
		JButton btnLess = new JButton("-");
		JButton btnMultiply = new JButton("X");
		JButton btnDivide = new JButton("/");
		JButton btnEquals = new JButton("=");
		JButton btnReset = new JButton("RESET");
		JButton btnBackspace = new JButton("BACKSPACE");
		JButton btnSave = new JButton("SAVE");
		JButton btnClose = new JButton("CLOSE");


		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 385, 599);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);


		txtArea = new JTextField();
		txtArea.setEditable(false);
		txtArea.setBackground(Color.LIGHT_GRAY);
		txtArea.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 40));
		txtArea.setBounds(9, 6, 350, 116);
		txtArea.setColumns(10);
		
		
		btnOne.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 30));
		btnOne.setBounds(9, 221, 80, 75);
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.setText(txtArea.getText().concat(String.valueOf(0)));
			}
		});
		
		
		btnTwo.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 30));
		btnTwo.setBounds(99, 221, 80, 75);
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnThree.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 30));
		btnThree.setBounds(189, 221, 80, 75);
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});


		btnFour.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 30));
		btnFour.setBounds(9, 307, 80, 75);
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnFive.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 30));
		btnFive.setBounds(99, 307, 80, 75);
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		
		btnSix.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 30));
		btnSix.setBounds(189, 307, 80, 75);
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});


		btnSeven.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 30));
		btnSeven.setBounds(9, 393, 80, 75);
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		

		btnEight.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 30));
		btnEight.setBounds(99, 393, 80, 75);
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		

		btnNine.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 30));
		btnNine.setBounds(189, 393, 80, 75);
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});


		btnZero.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 30));
		btnZero.setBounds(99, 479, 80, 75);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});


		btnDot.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 15));
		btnDot.setBounds(9, 479, 80, 75);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		

		btnReset.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 15));
		btnReset.setBounds(189, 479, 80, 75);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		

		btnLess.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 30));
		btnLess.setBounds(279, 221, 80, 75);
		btnLess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		

		btnMultiply.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 30));
		btnMultiply.setBounds(279, 307, 80, 75);
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		

		btnDivide.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 30));
		btnDivide.setBounds(279, 393, 80, 75);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		

		btnEquals.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 30));
		btnEquals.setBounds(279, 479, 80, 75);
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		

		btnClose.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 15));
		btnClose.setBounds(9, 134, 80, 75);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		

		btnSave.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 15));
		btnSave.setBounds(99, 134, 80, 75);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		

		btnBackspace.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 9));
		btnBackspace.setBounds(189, 134, 80, 75);
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		

		btnPlus.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 30));
		btnPlus.setBounds(279, 134, 80, 75);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		frame.getContentPane().add(txtArea);
		frame.getContentPane().add(btnZero);
		frame.getContentPane().add(btnOne);
		frame.getContentPane().add(btnTwo);
		frame.getContentPane().add(btnThree);
		frame.getContentPane().add(btnFour);
		frame.getContentPane().add(btnFive);
		frame.getContentPane().add(btnSix);
		frame.getContentPane().add(btnSeven);
		frame.getContentPane().add(btnEight);
		frame.getContentPane().add(btnNine);
		frame.getContentPane().add(btnPlus);
		frame.getContentPane().add(btnLess);
		frame.getContentPane().add(btnMultiply);
		frame.getContentPane().add(btnEquals);
		frame.getContentPane().add(btnDivide);
		frame.getContentPane().add(btnClose);
		frame.getContentPane().add(btnBackspace);
		frame.getContentPane().add(btnSave);
		frame.getContentPane().add(btnReset);
		frame.getContentPane().add(btnDot);
	}
}
