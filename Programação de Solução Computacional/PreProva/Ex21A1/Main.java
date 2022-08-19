/*
 * 21. Faça um programa que calcule a área de uma figura geométrica. Aceite quatro tipos de
figura geométrica: quadrado, retângulo, triângulo e círculo. Use herança e polimorfismo.
 */
package Ex21A1;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Area a = new Area();
		
		System.out.println("Digite a figura geométrica que deseja obter a area: ");
		String figGeo = sc.nextLine();
		figGeo = figGeo.toLowerCase();
		
		if(figGeo == "triangulo" || figGeo == "triangule" || figGeo == "t") {
			
		}else if(figGeo == "circulo" || figGeo == "circle" || figGeo == "c") {
			
		}else if(figGeo == "retangulo" || figGeo == "retangule" || figGeo == "r") {
			
		}else if(figGeo == "quadrado" || figGeo == "square" ||  figGeo == "q") {
			
		}else {
			System.out.println("Valor digitado inválido.");
		}
		
	}

}
