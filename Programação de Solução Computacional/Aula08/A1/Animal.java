package A1;

public class Animal {

	private String race, name;
	private int birth_date;
	private Owner owner;
	
	public Animal() {
		owner = new Owner();
	}
	
	public Animal(String name, String race, int birth_date, Owner owner) {
		this.name = name;
		this.race = race;
		this.birth_date = birth_date;
		if(owner != null) {
			this.owner = owner;			
		}else {
			this.owner = new Owner();
		}
	}
	
	public String getDados() {
		return name + ", " + race + ", " + birth_date + "\n" + owner.getDados();
	}
}
