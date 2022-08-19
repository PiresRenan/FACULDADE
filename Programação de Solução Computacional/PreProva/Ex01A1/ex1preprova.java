/*1. Determine as ra�zes de uma equa��o de 2 grau: ax2 + bx + c = 0 (recordar que o
	discriminante delta = b2 � 4ac, e que a raiz r = (�b � raiz/delta)/2a).*/
import java.util.Scanner;
public class ex1preprova {
	
	public static void main(String[] args) {

		double a, b , c, delta,x1,x2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor pra a: ");
		a = sc.nextDouble();		
		System.out.println("Digite um valor pra b: ");
		b = sc.nextDouble();		
		System.out.println("Digite um valor pra c: ");
		c = sc.nextDouble();
		System.out.println(b);
		delta = (b * b) - 4 * a * c;
		System.out.println(Math.sqrt(delta));
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("As raizes do 2 grau para os numeros digitados s�o: " + x1 + ", " + x2);
		
		sc.close();
	}

}