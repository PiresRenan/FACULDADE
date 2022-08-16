package A3;

public class Square implements FormaGeometrica {

	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public double calculateArea() {
		return side * side;
	}
}
