package A2;

public class Square extends FormaGeometrica{

	private float side;
	public Square() {
		super();
	}
	
	public Square(float side, String name) {
		super(name);
		this.side = side;
	}
	
	@Override
	public float calculateArea() {
		return side * side;
	}
	
	@Override
	public String print() {
		return super.print() + ", Lado: " + side;
	}
}
