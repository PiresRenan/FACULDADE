package Exercicio03;

public class Robo {
	
	int x;
	int y;
	
	Robo(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void iniciarRobo() {
		System.out.println("O robo se encontra na posição inicial: " + x + ", " + y + "\n" );
	}
	
	public int norte() {
		y++;
		System.out.println("O robo se moveu para: " + x + ", " + y );
		return y;
	}
	
	public int sul() {
		y--;
		System.out.println("O robo se moveu para: " + x + ", " + y );
		return y;
	}
	
	public int leste() {
		x++;
		System.out.println("O robo se moveu para: " + x + ", " + y );
		return x;
	}
	
	public int oeste() {
		x--;
		System.out.println("O robo se moveu para: " + x + ", " + y );
		return x;
	}

}
