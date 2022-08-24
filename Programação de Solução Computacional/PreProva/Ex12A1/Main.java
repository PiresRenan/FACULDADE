/*
 * 12. Crie dois vetores de 50 posi��es com valores inteiros aleat�rios, ordene cada vetor
individualmente, e combine os dois vetores gerando um novo vetor de 100 posi��es, de
forma que esse novo vetor j� seja criado ordenado.
 */
package Ex12A1;

import java.util.Random;
public class Main {

	public static void main(String[] args) {

		int[] v1 = new int[50];
		int[] v2 = new int[50];
		int[] vT = new int[100];
		Random r = new Random();
		
		for(int i = 0 ; i < 50 ; i++) {
			v1[i] = r.nextInt(500);
			v2[i] = r.nextInt(500);
		}
		for(int i = 0 ; i < 50 ; i++) {
			for(int j = 0,temp ; j < 50 ; j++) {
				if(v1[i] <= v1[j]) {
					temp = v1[i];
					v1[i] = v1[j];
					v1[j] = temp;
				}
			}
		}
		for(int i = 0 ; i < 50 ; i++) {
			for(int j = 0,temp ; j < 50 ; j++) {
				if(v2[i] <= v2[j]) {
					temp = v2[i];
					v2[i] = v2[j];
					v2[j] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < 50 ; i++) {
			for(int j = 0 ; j < 100 ; j++) {
				if(v1[i] <= v2[i]) {
					vT = v1;
				}else {
					vT = v2;
				}if(j == 49) {
					
				}
			}
		}	
		for(int i = 0 ; i < 100 ; i++) {
			if(i == 99) {
				System.out.print(vT[i] + ".");
			}else {
				System.out.print(vT[i] + ",");
			}
		}
		/*for(int i = 0 ; i < 50 ; i++) {
			if(i == 49) {
				System.out.print(v1[i] + ".");
			}else {
				System.out.print(v1[i] + ",");
			}
		}
		System.out.println();
		for(int i = 0 ; i < 50 ; i++) {
			if(i == 49) {
				System.out.print(v2[i] + ".");
			}else {
				System.out.print(v2[i] + ",");
			}
		}*/
	}

}
