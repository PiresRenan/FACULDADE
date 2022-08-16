package Questão1;

public class Treino {

	public static void main(String[] args) {

		char[][] matrix = new char[7][7];
		
		for(int i = 0 ; i < 7 ; i++) {
			for(int j = 0 ; j < 7 ; j++) {
				matrix[i][j] = 'O';
			}
		}

		for(int i = 0 ; i < 7 ; i++) {
			for(int j = 0 ; j < 7 ; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
