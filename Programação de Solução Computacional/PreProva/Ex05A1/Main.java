/*
5. Construa a tabela de multiplicação de números de 1 a 10 (ex.: 1 x 1 = 1, 1 x 2 = 2, etc.).
 */
package Ex05A1;

public class Main {

	public static void main(String[] args) {
		
		int[][] numeros = new int[10][10];

		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				numeros[j][i] = (i+1) * (j+1) ; 
			}
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print("[");
			for(int j = 0 ; j < 10 ; j++) {
				if (j == 9) {
					System.out.print(numeros[i][j]);
				}else {
					System.out.print(numeros[i][j] + " ");	
				}
			}
			System.out.print("]");
			System.out.println();
		}
	}

}
