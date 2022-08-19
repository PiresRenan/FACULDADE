 /*
  * 6. Determine o número de dígitos de um número informado.
  */
package Ex06A1;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		String a;
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		a = sc.nextLine();
		
		for(int i = 0 ; i < a.length() ; i++) {
			cont++;
		}

		System.out.println("O numero digitado possui " + cont + " caracteres.");
		sc.close();
	}

}
