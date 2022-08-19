package Ex09A1;

import java.util.Scanner;
public class Calculadora {

	private int numero;
	Scanner sc = new Scanner(System.in);
	
	public void messages() {
		System.out.println("Digite o numero que deseja saber a raiz quadrada: ");
		numero = sc.nextInt();
		sc.close();
	}
	
	Calculadora(int numero){
		this.numero = numero;
	}
	
	public int calcularRaiz() {
		int numeroS = numero;
		for(int i = 0 ; i < numero ; i++) {
			if(i * i == numero) {
				numero = i;
				break;
			}
		}
		if(numero == numeroS) {
			System.out.println("Numero digitado não possui raiz!");
		}
		return numero;
	}
	
	@Override
	public String toString() {
		return "A raiz quadrada do numero digitado é: " + numero;
	}
}
