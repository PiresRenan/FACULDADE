package Questão1;

import java.util.Scanner;
public class Robo {

	Scanner sc = new Scanner(System.in);
	private int x = 0;
	private int y = 0;
    private String move;
    private int cont = 0;
	
	public Robo() {
		this.move = move;
		this.x = x;
		this.y = y;
	}
	public void girarPara() {
		System.out.println("Para qual direção o robo irá seguir?" + "\n" +"Caso deseje sair, digite SAIR.");
		move = sc.nextLine().toLowerCase();
		System.out.println(move);
		if(move.equals("norte") || move.equals("north") || move.equals("n")) {
			System.out.println("O robo se virou para o NORTE.");
			andar();
		}else if(move.equals("sul")|| move.equals("south")|| move.equals("s")) {
			System.out.println("O robo se virou para o SUL.");
			andar();
		}else if(move.equals("leste")|| move.equals("east") || move.equals("l") || move.equals("e")) {
			System.out.println("O robo se virou para o LESTE.");
			andar();
		}else if(move.equals("oeste") || move.equals("west") || move.equals("o") || move.equals("w")) {
			System.out.println("O robo se virou para o OESTE.");
			andar();
		}else if(move.equals("sair") || move.equals("exit")) {
			System.out.println("Até logo!");
		}
	}
	
	public void mostrarPosicao() {

		if(cont == 0) {
			System.out.println("A posição atual do robo é [" + x + "] no eixo x, [" + y + "] no eixo y.");
			cont++;
		}else {
			System.out.println("A posição atual do robo é [" + x + "] no eixo x, [" + y + "] no eixo y.E ele aponta para " + move);
		}
	}
	
	public int andar() {
		String conf;
		System.out.println("Confirme o andar com sim, ou nao para voltar a rotação anterior.");
		conf = sc.nextLine();
		if(conf.equals("sim") ||conf.equals("s") ||conf.equals("yes") ||conf.equals("y")) {
			if(move.equals("norte") || move.equals("north") || move.equals("n")) {
				if(x < 6) {
					x++;
					mostrarPosicao();
					andar();
				}else {
					System.out.println("Fora dos limites");
					mostrarPosicao();
					girarPara();
				}
			}else if(move.equals("sul")|| move.equals("south")|| move.equals("s")) {
				if(x > -6) {
					x--;
					mostrarPosicao();
					andar();
				}else {
					System.out.println("Fora dos limites");
					mostrarPosicao();
					girarPara();
				}
			}else if(move.equals("leste") || move.equals("east") || move.equals("l") || move.equals("e")) {
				if(x < 6) {
					y++;
					mostrarPosicao();
					andar();
				}else {
					System.out.println("Fora dos limites");
					mostrarPosicao();
					girarPara();
				}
			}else if(move.equals("oeste") || move.equals("west") || move.equals("o") || move.equals("w")) {
				if(y > -6) {
					y--;
					mostrarPosicao();
					andar();
				}else {
					System.out.println("Fora dos limites");
					mostrarPosicao();
					girarPara();
				}
			}else if(move.equals("sair") || move.equals("exit")) {
				System.out.println("Até logo!");
			}
		}else if (conf.equals("não") ||conf.equals("nao") ||conf.equals("no") ||conf.equals("n")) {
			girarPara();
		}else {
			andar();
		}
		return x + y;
	}
}
