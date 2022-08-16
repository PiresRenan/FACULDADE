package A2;

public class Circle extends FormaGeometrica {

	private float radius;
	
	public Circle() {
		super();
	}
	
	public Circle(float radius, String name) {
		super(name);
		this.radius = radius;
	}
	
	@Override
	public float calculateArea() {
		return (float)Math.PI * radius * radius;
	}
	
	@Override
	public String print() {
		return super.print() + ", Raio: " + radius ;
	}
}
