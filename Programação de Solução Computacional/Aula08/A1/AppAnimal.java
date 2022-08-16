package A1;

public class AppAnimal {

	public static void main(String[] args) {

		Owner owner = new Owner();
		
		Owner owner2 = new Owner("Renan", "(11)9 9359-7029");
		Animal a = new Animal("Cachorrin","Labrador", 2020, owner2 );
		
		System.out.println(owner.getDados());
		
		System.out.println(a.getDados());
	}

}
