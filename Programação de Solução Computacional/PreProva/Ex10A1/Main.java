/*
 * 10. Leia uma matriz 3 x 3 que representa um tabuleiro de jogo da velha e indique qual posição
deveria ser jogada para ganhar o jogo (se possível) ou ao menos para evitar uma derrota.
 */
package Ex10A1;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		char[][] m = new char[3][3];
		Random r = new Random();
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 , a ; j < 3 ; j++) {
				a = r.nextInt(2);
				if(a == 1) {
					m[i][j] = 'x';
				}else if(i == 2 && j == 2){
					m[i][j] = '?';
				}
				else if ( a == 0){
					m[i][j] = 'o';
				}
			}
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

}
