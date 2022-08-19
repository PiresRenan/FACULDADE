package Ex2A1;

import java.util.Scanner;
public class Agenda {

	private String name;
	private int age;
	private float height;
	Scanner sc = new Scanner(System.in);
	
	Agenda(){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public void  armazenaPessoa(String nome, int idade, float altura) {
		System.out.println("Digite o nome a ser armazenado na agenda: ");
		name = sc.nextLine();
		System.out.println("Digite a idade da pessoa a ser armazenado na agenda: ");
		age = sc.nextInt();
		System.out.println("Digite a altura da pessoa a ser armazenado na agenda: ");
		height = sc.nextFloat();
		
	}
	
	public void  removePessoa(String nome) {
		
	}
	public int buscaPessoa(String nome) {
		return 0;
	}
	public void  imprimeAgenda() {
		
	}
	public void  imprimePessoa(int index) {
		
	}
}
