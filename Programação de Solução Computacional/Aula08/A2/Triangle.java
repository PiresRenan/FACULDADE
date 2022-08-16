package A2;

public class Triangle extends FormaGeometrica{

	private float base, height;
	
	public Triangle() {
		
	}
	
	public Triangle(float base, float height, String name) {
		super(name);
		this.base = base;
		this.height = height;
	}
	
	@Override
	public float calculateArea() {
		return (base*height)/2;
	}
	public String print() {
		return super.print() + ", Base: " + base + ", Altura: " + height;
	}

}
