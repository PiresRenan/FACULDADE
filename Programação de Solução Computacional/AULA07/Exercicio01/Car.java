package Exercicio01;

import javax.swing.JOptionPane;

public class Car {

	private String make;
	private String model;
	private double qtdCombustivel;
	private double consMed;
	private double kms;
	private int cont = 0;
	private int cont2 = 0;
	
	Car(String make, String model, double consMed){
		
		this.make = make;
		this.model = model;
		this.consMed = consMed;
		
	}
	
    Car(String make, String model, double qtdCombustivel, double consMed, double kms) {
		
		this.make = make;
		this.model = model;
		this.qtdCombustivel = qtdCombustivel;
		this.consMed = consMed;
		this.kms = kms;
		
	}
	
	public double walk(){
		
		double kmP = 0;
		int resp;
		while(cont == 0) {
			kmP = Double.parseDouble(JOptionPane.showInputDialog("Qual é a distância a ser percorrida(em KM)?"));
			if(kmP > 0) {
				cont++;
			}
		}
		
		qtdCombustivel = qtdCombustivel - (consMed * kmP);
		
		if(qtdCombustivel >= kmP) {
			JOptionPane.showMessageDialog(null, "Boa viagem!");
			kms = kms + kmP;
		}
		else {
			resp = JOptionPane.showConfirmDialog(null, "O carro está com combustivel insuficiente, deseja reabastecer?",
					"Refull", JOptionPane.YES_NO_OPTION);
			if (resp == 0) {
				refull();
				walk();
			}else {
				JOptionPane.showMessageDialog(null, "Tchau!");
			}
		}
		
		return qtdCombustivel + consMed + kms;
	}
	
	public double refull() {
		while(cont2 == 0) {
			int resp = Integer.parseInt(JOptionPane.showInputDialog("Quanto quer colocar de combustivel, chefia?"));
			if(resp > 0) {
				qtdCombustivel = qtdCombustivel + resp;
				cont2++;
			}
		}
		return qtdCombustivel;
	}
	
	public String toString() {
		String myString = make + " " + model + "\n" + qtdCombustivel + "\n" + consMed + "\n" + kms;;
		return myString;
	}
	
}
