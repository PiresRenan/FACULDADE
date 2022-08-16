package Exercicio3b;

import java.util.Scanner;

public class Robo {

	int x = 0 , y = 0 , z ;
	int cont = 0;
	Scanner sc = new Scanner(System.in);
	
	public void iniciarRobo() {
		System.out.println("INICIANDO...");
		System.out.println("ROBO INICIALIZADO E PRONTO.");
		System.out.println("LOCAL INICIAL: " + "x[" + x + "]" + "y[" + y + "]");
		System.out.println();
	}
	
	public int move() {
		while(cont == 0) {
			z = sc.nextInt();
			if(z > 0 && z < 6) {
				System.out.print("O robo moveu-se para " );
				cont++;
			}
			else {
				System.out.println("Valor inserido invalido");
			}
		}
		cont = 0;
		return z;
	}
	
	public int norte() {
		y++;
		System.out.println("x[" + x + "]" + "y[" + y + "]");
		return y;
	}
	
	public int sul() {
		y--;
		System.out.println("x[" + x + "]" + "y[" + y + "]");
		return y;
	}
	
	public int leste() {
		x++;
		System.out.println("x[" + x + "]" + "y[" + y + "]");
		return x;
	}
	
	public int oeste() {
		x--;
		System.out.println("x[" + x + "]" + "y[" + y + "]");
		return x;
	}
	
}
