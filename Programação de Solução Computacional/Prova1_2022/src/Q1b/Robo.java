package Q1b;

import java.util.Scanner;
public class Robo {

	private char[][] matrix = new char[15][15];
	private int x = 0 , y = 0;
	private String move;
	Scanner entrada = new Scanner(System.in);
	
	Robo(){
		
		for(int i = -7 ; i < 8 ; i++) {
			for(int j = -7 ; j < 8 ; j++) {
				if(i == 0 && j == 0) {
					matrix[i+7][j+7] = 'X';
				}else {
					matrix[i+7][j+7] = 'o';
				}
			}
		}
		for(int i = -7 ; i < 8 ; i++) {
			for(int j = -7 ; j < 8 ; j++) {
				System.out.print(matrix[i+7][j+7] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("A matriz a cima representa o campo de possibilidades de "
				+ "movimentos do robo, onde sua posição inicial é no centro(["+x+"]x,["+y+"]y).");
		girarPara();
	}
	
	public String girarPara() {
		String answer;
		
		System.out.println("O robo deve girar para N(norte),S(sul),L(leste),O(oeste)?");
		move = entrada.nextLine().toUpperCase();
		
		if(move.equals("N")) {
			move = "NORTE";
			System.out.println("O robo vira-se na posição " + move);
			System.out.println("Deseja mover-se?(S/N)");
			answer = entrada.nextLine().toUpperCase();
			if(answer.equals("S")) {
				andar();
			}else if(answer.equals("N")) {
				System.out.println("Deseja voltar a rotação ou sair?(Voltar/Sair)");
				answer = entrada.nextLine().toLowerCase();
				if(answer.equals("voltar")) {
					girarPara();
				}else if(answer.equals("sair")) {
					System.out.println("Ok,adeus!");
				}else {
					System.out.println("ERROR ERROR ERROR" + "\n" + "COMANDO INVALIDO!");
				}
			}else {
				System.out.println("ERROR ERROR ERROR" + "\n" + "COMANDO INVALIDO!");
			}
			
		}
		return move;
		}
	
	public String mostrarPosicao() {
		for(int i = -7 ; i < 8 ; i++) {
			for(int j = -7 ; j < 8 ; j++) {
				if(i == x && j == y) {
					System.out.print(matrix[i+7][j+7] = 'X');
				}else {
					System.out.print(matrix[i+7][j+7] + " ");		
				}
			}
			System.out.println();
		}
		return "O robo se encontra na seguinte posição: [" + x + "]x, [" + y + "]y.\n" + "Ele atualmente está virado para " + 
	move;
	    }
	
	public int andar() {
		
		String answer;
		
		if(move.equals("NORTE")) {
			y++;
			int control = 0;
			while(control == 0) {
				System.out.print("O robo avançou uma casa na direção " + move + ".\nDevo mostrar a posição "
						+ "de forma grafica ou por estenso?(G/E).");
				answer = entrada.nextLine().toLowerCase();
				if(answer.equals('g')) {
					mostrarPosicao();
				}else if(answer.equals('e')) {
					System.out.println(mostrarPosicao());
				}
				System.out.print("O Robo deve manter a direção ou seguir para outro caminho?(M/C)");
				answer = entrada.nextLine().toLowerCase();
				if(answer.equals('m')) {
					y++;
				}else if(answer.equals('c')) {
					girarPara();
				}else {
					System.out.println("ERROR O ROBO PAROU PARA PRESERVAR SUA INTEGRIDADE.");
					mostrarPosicao();
					break;
				}
			}	
		}
		return x + y ;
	}
}
