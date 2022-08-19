package Ex1A1;

import java.util.Scanner;
@SuppressWarnings("unused")
public class Pessoa {

	private String name;
	private int[] birth_date = new int[3];
	private int height;
	private int age;
	Scanner sc = new Scanner(System.in);
	
	Pessoa(){
	}
	
	public void setName() {
		System.out.println("Digite seu nome: ");
		this.name = sc.nextLine();
	}
	public void getName() {
		this.name = name;
	}
	
	public int setBD() {
		for(int i = 0 ; i < 3 ; i++) {
			String[] date = { "dia" , "mês","ano"};
			System.out.println("Digite o " + date[i] + " de nascimento: ");
			this.birth_date[i] = sc.nextInt();
		}
		age = 2022 - birth_date[2]; 
		return age;
	}
	public void getBD() {
		this.age = age;
	}
	
	public int setHeight() {
		System.out.println("Digite sua altura (em cm): ");
		height = sc.nextInt();
		return height;
	}
	public void getHeight() {
		this.height = height;
	}
	
	public void showInfos() {
		System.out.println("\n" + "\n" +
				           "Seu nome é " + name + "\n" +
				           "Sua data de nascimento é " + birth_date[0] + "/" + birth_date[1] + "/" + birth_date[2] + "\n" +
				           "Você tem " + age + " anos de idade." + "\n" +
				           "Você tem " + height + "cm de altura."
				           );
	}
}
