package Ex14A1;

import java.util.Scanner;
public class Relogio {
	
	Scanner sc = new Scanner(System.in);
	private int segundos=0,horas=0,minutos=0,dias=0,segundos2;

	Relogio(){
		this.segundos = segundos;
	}
	
	public int input() {
		System.out.println("Digite um valor para os segundos a serem calculados: ");
		segundos = sc.nextInt();
		return segundos;
	}
	public int horas() {
		for(int i = 0 , j = 0 ; i < segundos ; i++ , j++) {
			if(j==3600) {
				horas++;
				if(horas >= 24) {
					horas = 0;
					dias++;
				}
				j = 0;
			}
		}
		return horas;
	}
	public int minutos() {
		for(int i = 0 , j = 0 ; i < segundos ; i++ , j++) {
			if(j==60) {
				minutos++;
				if(minutos >= 60) {
					minutos = 0;
				}
				j = 0;
			}
		}
		return minutos;
	}
	public int segundos() {
		int t = segundos;
		segundos2 = segundos;
		segundos = 0;
		for(int i = 0 ; i < t ; i++) {
			segundos++;
			if(segundos >= 60) {
				segundos = 0;
			}
		}
		return minutos;
	}
	public String toString() {
		return "O tempo dado foi: " + segundos2 + "\n"
			  +"O tempo equivalente a isso é de: " + dias + "d " 
			  + horas + ":" + minutos + ":" + segundos ;
	}
}
