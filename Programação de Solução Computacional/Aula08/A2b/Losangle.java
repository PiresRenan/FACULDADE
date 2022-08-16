package A2b;

public class Losangle extends FormaGeometrica {

	private float side_one , side_two;
	
	public Losangle(){
		super();
	}
	
	public Losangle(float side_one, float side_two){
		this.side_one = side_one;
		this.side_two = side_two;
	}

	@Override
	public float calculateArea() {
		return (float) ((side_one * side_two) / 2.0);
	}
	
	@Override
	public String print() {
		return super.print() + ", Lado maior: " + side_one + " ,Lado menor: " + side_two;
	}
}
