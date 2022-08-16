package A2b;

public class Trapezoid extends FormaGeometrica{

	private float side_up, side_down, height;
	
	public Trapezoid() {
		super();
	}
	
	public Trapezoid(float side_up, float side_down, float height) {
		this.side_up = side_up;
		this.side_down = side_down;
		this.height = height;
	}
	
	@Override
	public float calculateArea() {
		return ((side_up + side_down)/2) * height;
	}
	
	@Override
	public String print() {
		return super.print() + ", Lado inferior: " + side_down + ", Lado superior: " + side_up + ", Altura: " + height ;
	}
}
