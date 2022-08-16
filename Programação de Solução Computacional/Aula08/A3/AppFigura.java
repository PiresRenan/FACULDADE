package A3;

import java.util.ArrayList;

public class AppFigura {

	public static void main(String[] args) {

		ArrayList<FormaGeometrica> formas = new ArrayList<>();
		
		formas.add(new Square(9));
		formas.add(new Square(8));
		formas.add(new Square(16));
		formas.add(new Square(11));
		formas.add(new Circle(6));
		formas.add(new Circle(23));
		formas.add(new Circle(7));
		formas.add(new Circle(3));
		
		for(FormaGeometrica formaGeometrica : formas) {
			System.out.println("Área: " + formaGeometrica.calculateArea());
		}
	}

}
