/*
 * 11. Ordene um vetor de 100 números inteiros gerados aleatoriamente.
 */
package Ex11A1;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int[] v = new int[100];
		Random r = new Random();
		
		for(int i = 0 ; i < 100 ; i++) {
			v[i] = r.nextInt(500);
		}
		
		for(int i = 0 ; i < 100 ; i++) {
			for(int j = 0,temp ; j < 100 ; j++) {
				if(v[i] <= v[j] ) {
					temp = v[i];
					v[i] = v[j];
					v[j] = temp;
				}
			}
		}
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(v[i]);
		}
	}

}
