package A1;

public class Owner {

	private String name;
	private String tel_number;
	
	public Owner() {
		name = "Não cadastrado";
		tel_number = "()X XXXX-XXXX";
	}
	
	public Owner(String name, String tel_number) {
		this.name = name;
		this.tel_number = tel_number;
	}
	
	public String getDados() {
		return name + " : " + tel_number;
	}

}
