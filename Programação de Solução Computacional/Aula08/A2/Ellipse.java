package A2;

public class Ellipse extends FormaGeometrica{

	private float minor_axis, major_axis;
	
	public Ellipse() {
		super();
	}
	
	public Ellipse(float minor_axis, float major_axis, String name) {
		super(name);
		this.major_axis = major_axis;
		this.minor_axis = minor_axis;
	}
	
	@Override
	public float calculateArea() {
		return (float)Math.PI * major_axis * minor_axis;
	}
	
	@Override
	public String print() {
		return super.print() + ", Arco menor: " + minor_axis + ", Arco maior: " + major_axis;
	}
}
