package A2;

public abstract class FormaGeometrica {

	private String name;
	
	public FormaGeometrica() {
		
	}
	 
    public FormaGeometrica(String name) {
		this.name = name;
	}
    
    public abstract float calculateArea();
    
    public String print() {
    	return "Forma: " + name;
    }
}
