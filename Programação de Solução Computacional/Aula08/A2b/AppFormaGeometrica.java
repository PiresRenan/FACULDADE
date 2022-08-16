package A2b;

import javax.swing.JOptionPane;

public class AppFormaGeometrica {

	public static void main(String[] args) {
		
		int resposta;
		String[] options = {"Quadrado", "Círculo", "Elipse","Losango","Trapézio","Triângulo"};
		
		resposta = JOptionPane.showOptionDialog(null, "Escolha a forma geometrica que "
				+ "deseja calcular a area:","Formas Geométricas",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
		
		switch(resposta) { 
		case 0:
			FormaGeometrica square = new Square(
					Float.parseFloat(JOptionPane.showInputDialog("Digite valor para os lados: ")));
			JOptionPane.showMessageDialog(null,"Area:   " + square.calculateArea() + " m.");
			break;
		case 1:
			FormaGeometrica circle = new Circle(
					Float.parseFloat(JOptionPane.showInputDialog("Digite valor para o raio: ")));
			JOptionPane.showMessageDialog(null,"Area:   " + circle.calculateArea() + " m.");
			break;
		case 2:
			FormaGeometrica ellipse = new Ellipse(
					Float.parseFloat(JOptionPane.showInputDialog("Digite valor para o arco menor: ")),
					Float.parseFloat(JOptionPane.showInputDialog("Digite valor para o arco maior: "))
					);
			JOptionPane.showMessageDialog(null,"Area:   " + ellipse.calculateArea() + " m.");
			break;
		case 3:
			FormaGeometrica losangle = new Losangle(
					Float.parseFloat(JOptionPane.showInputDialog("Digite valor para o lado menor: ")),
					Float.parseFloat(JOptionPane.showInputDialog("Digite valor para o lado maior: "))
					);
			JOptionPane.showMessageDialog(null,"Area:   " + losangle.calculateArea() + " m.");
			break;
		case 4:
			FormaGeometrica trapezoid = new Trapezoid(
					Float.parseFloat(JOptionPane.showInputDialog("Digite valor para o lado superior: ")),
					Float.parseFloat(JOptionPane.showInputDialog("Digite valor para o lado inferior: ")),
					Float.parseFloat(JOptionPane.showInputDialog("Digite valor para a altura: "))
					);
			JOptionPane.showMessageDialog(null,"Area:   " + trapezoid.calculateArea() + " m.");
			break;
		case 5:
			FormaGeometrica triangle = new Triangle(
					Float.parseFloat(JOptionPane.showInputDialog("Digite valor para a base: ")),
					Float.parseFloat(JOptionPane.showInputDialog("Digite valor para a altura: "))
					);
			JOptionPane.showMessageDialog(null,"Area:   " + triangle.calculateArea() + " m.");
			break;
		}
	}
}
