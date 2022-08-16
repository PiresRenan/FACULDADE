package Exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Robo robo = new Robo(0,0);
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		int temp;
		
		robo.iniciarRobo();

		 while(cont < 1) {
		 
			System.out.println("1 - Andar para o Norte");
			System.out.println("2 - Andar para o Sul");
			System.out.println("3 - Andar para o Leste");
			System.out.println("4 - Andar para o Oeste");
			System.out.println("5 - Sair");
			temp = sc.nextInt();
			
			if(temp == 1 && robo.y < 6 && robo.y > -6) {
				robo.norte();
			}
			else if(temp == 2 && robo.y < 6 && robo.y > -6) {
				robo.sul();
			}
			else if(temp == 3 && robo.x < 6 && robo.x > -6) {
				robo.leste();
			}
			else if(temp == 4 && robo.x < 6 && robo.x > -6) {
				robo.oeste();
			}
			else if(temp == 5) {
				break;
			}
			else if(temp != 1 && temp != 2 && temp != 3 && temp != 4 && temp != 5) {
				System.out.println("Valor inserido invalido");
			}
			else {
				System.out.println("Você saiu fora dos limites da sala.");
				break;
			}
	
		}
	}

}
