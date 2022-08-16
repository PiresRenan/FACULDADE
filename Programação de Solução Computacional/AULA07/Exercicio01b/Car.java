package Exercicio01b;

import java.util.Scanner;
public class Car {
	
	private String make;
	private String model;
	private double qtdCombustivel;
	private double consMed;
	private double kms;
	Scanner sc = new Scanner(System.in);
	
	Car(String make, String model, double consMed){
		this.make = make;
		this.model = model;
		this.consMed = consMed;
	}
	
	Car(String make, String model, double consMed,
	double qtdCombustivel, double kms){
		this.make = make;
		this.model = model;
		this.consMed = consMed;
		this.qtdCombustivel = qtdCombustivel;
		this.kms = kms;
	}
	
	public double walk() {
		int a=0;
		
		System.out.println("Vamos dar uma volta?");
		System.out.println("Digite 1 para SIM e digite 2 para NÃO");
		a = sc.nextInt();
		
		if(a == 2) {
			System.out.println("Ok, vejo você por ai!");
		}
		a = 0;
		
		while(a <= 0) {
			System.out.println("Qual a distancia que iremos percorrer?");
			a = sc.nextInt();
		}
		
		qtdCombustivel = qtdCombustivel - (consMed * a);
		
		if(qtdCombustivel <= 0 ) {
			
			System.out.println("Ops, o combustivel disponivel é "
					+ "insuficiente para completar o trajeto, vamos "
					+ "reabastecer?");
			refull();
		}else {
			System.out.println("Boa viagem!");
			kms = kms + a;
		}
		
		return consMed + qtdCombustivel + kms;
	}
	
	public double refull() {
		double gasosa;
		System.out.println("Certo meu Patrão, quanto vai ser hoje?");
		gasosa = sc.nextDouble();
		qtdCombustivel = qtdCombustivel + gasosa;
		System.out.println("Certin, pode seguir viagem agora parcerinho");
		walk();
		return qtdCombustivel;
	}
	public  String toString() {
		String myString;
		return myString = make + ", " + model + "\n" +" o consumo desse carro é de " + consMed + "\n" +
		"o tanque contém " + qtdCombustivel + "L" + "\n" + "Agora seu carro possui " +
				kms + "km rodados.";
	}
}
