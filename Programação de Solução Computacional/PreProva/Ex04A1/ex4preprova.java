/*
 * 
4. Para cada produto informado (nome, pre�o e quantidade), escreva o nome do produto
comprado e o valor total a ser pago, considerando que s�o oferecidos descontos pelo
n�mero de unidades compradas, segundo a tabela abaixo:
a. At� 10 unidades: valor total
b. de 11 a 20 unidades: 10% de desconto
c. de 21 a 50 unidades: 20% de desconto
d. acima de 50 unidades: 25% de desconto
 */
package Ex04A1;

import java.util.Scanner;
public class ex4preprova {

	public static void main(String[] args) {

		String name;
		double cost, qtt;
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		
		while(cont == 0){
			System.out.println("Digite o nome do produto: ");
			name = sc.nextLine();
			System.out.println("Digite o valor do produto: ");
			cost = sc.nextDouble();
			System.out.println("Digite quantidade desejada do produto: ");
			qtt = sc.nextDouble();
			
			if(qtt > 10 && qtt <= 20) {
				cost = cost - ((cost*10)/100);
				cost = cost * qtt;
				System.out.println("Valor total a pagar � de: " + cost + "\n" + "Foram compradas " + qtt + " de " +
				name);
			}else if(qtt > 20 && qtt <= 50) {
				cost = cost - ((cost*20)/100);
				cost = cost * qtt;
				System.out.println("Valor total a pagar � de: " + cost + "\n" + "Foram compradas " + qtt + " de " +
				name);
			}else if(qtt > 50) {
				cost = cost - ((cost*25)/100);
				cost = cost * qtt;
				System.out.println("Valor total a pagar � de: " + cost + "\n" + "Foram compradas " + qtt + " de " +
				name);
			}else {
				cost = cost * qtt;
				System.out.println("Valor total a pagar � de: " + cost + "\n" + "Foram compradas " + qtt + " de " +
						name);
			}
			
			System.out.println("Gostaria de comprar mais um produto? Digite 0 para Sim");
			cont = sc.nextInt();
			if(cont != 0) {
				cont = 1;
			}
		}
		sc.close();
	}

}
