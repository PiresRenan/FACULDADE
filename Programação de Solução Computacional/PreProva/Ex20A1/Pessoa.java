package Ex20A1;

import java.util.Scanner;
import java.util.Random;
public class Pessoa {

	private String name;
	private int age, variable;
	private int ageA, ageB;
	private String[] parent = {
			                   "MÃE","PAI",
			                   "AVÓ","AVÔ",
			                   "BISAVÓ","BISAVÔ"
	                          };
	private String[] nameA = {
			                  "Adriana","Eva","Kimberly","Lívia","Naomi",
			                  "Marcela","Yasmin","Kate","Valquiria","Ana"
	                         };
	private String[] nameB = {
			                  "Leon","Nicolau","Alexandre","Paulo","André",
			                  "Pedro","João","Antonio","Claudio","Jubileu"
	                         };
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	Pessoa(){
		this.name = name;
		this.age = age;
	}

	
	public String input() {
		System.out.println("Digite o seu nome: ");
		name = sc.nextLine();
		System.out.println("Digite sua idade: ");
		age = sc.nextInt();
		inputHowMany();
		return name + age;
	}
	
	public int inputHowMany() {
		System.out.println("Quantos ancestrais tu quer conhecer? 1(para para PAI e MÃE), 2(para AVÔ e AVÓ),"
				+ "3(para BISAVÔ e BISAVÓ)");
		variable = sc.nextInt();
		if(variable == 1) {
			System.out.println("Selecionou pai e mãe. ");
			nameSort();
			ageSort();
		}
		return variable;
	}
	
	public String nameSort() {
		int a = r.nextInt(10);
		nameA[0] = nameA[a];
		nameB[0] = nameB[a];
		return nameA[0] + nameB[0];
	}
	
	public String ageSort() {
		int a ;
		int control = 0;
		
		while(control < 2 ) {
			a = r.nextInt(90);
			if(control == 0 && a > 30 && a != 0) {
				ageA = a;
				control++;
			}else if(control == 1 && a > 30 && a != 0) {
				ageB = a;
				ageA = (ageA > ageB) ? ageB : ageA;
				if((ageA - ageB) <= 5 && ageA != ageB) {
					control++;
					showResults();
				}else {
					control = 0;
					ageSort();
				}
			}
		}
		return null;
	}
	
	public void showResults() {
		System.out.println("Sua " + parent[0] + ", " + nameA[0] + ", tem " + ageA + " anos.\nSeu " + parent[1] +", " + nameB[0] + ", tem " + ageB + " anos.");
	}
	
	
	
}
