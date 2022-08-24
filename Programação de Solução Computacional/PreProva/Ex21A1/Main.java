/*
 * 21. Fa�a um programa que calcule a �rea de uma figura geom�trica. Aceite quatro tipos de
figura geom�trica: quadrado, ret�ngulo, tri�ngulo e c�rculo. Use heran�a e polimorfismo.
 */
package Ex21A1;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a figura geom�trica que deseja obter a area: ");
		String figGeo = sc.nextLine();
		figGeo = figGeo.toLowerCase();
		
		if(figGeo == "triangulo" || figGeo == "triangule" || figGeo == "t") {
			
		}else if(figGeo == "circulo" || figGeo == "circle" || figGeo == "c") {
			
		}else if(figGeo == "retangulo" || figGeo == "retangule" || figGeo == "r") {
			
		}else if(figGeo == "quadrado" || figGeo == "square" ||  figGeo == "q") {
			
		}else {
			System.out.println("Valor digitado inv�lido.");
		}
		sc.close();
	}

}
