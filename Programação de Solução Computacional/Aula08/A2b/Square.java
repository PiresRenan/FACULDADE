package A2b;

public class Square extends FormaGeometrica{

	private float side;
	public Square() {
		super();
	}
	
	public Square(float side) {
		this.side = side;
	}
	
	@Override
	public float calculateArea() {
	    return side * side;
	}
	
}
