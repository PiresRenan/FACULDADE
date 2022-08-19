package Ex03A1;
/*
3. O programa a seguir estranhamente sempre escreve �A distancia e: 1.0�. Identifique onde
est� o defeito.
import java.util.Scanner;
public class Distancia {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
double x1, y1, x2, y2, distancia;
System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
x1 = teclado.nextFloat();
y1 = teclado.nextFloat();
x2 = teclado.nextFloat();
y2 = teclado.nextFloat();
distancia = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 1/2);
System.out.println("A dist�ncia �: " + distancia);
}
}
 */
import java.util.Scanner;
public class ex3preprova {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
		float x1 = sc.nextFloat();
		float y1 = sc.nextFloat();
		float x2 = sc.nextFloat();
		float y2 = sc.nextFloat();

		double distancia = Math.sqrt(Math.pow(y1 - x1, 2) + Math.pow(y2 - x2, 2));
		System.out.println("A distancia e: " + distancia);

		sc.close();
	}

}
