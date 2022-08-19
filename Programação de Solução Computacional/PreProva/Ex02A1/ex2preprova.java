/*2. Calcule a dist�ncia entre dois pontos num espa�o de 3 dimens�es.*/
import java.util.Scanner;
public class ex2preprova {

	public static void main(String[] args) {
		
		double xa, xb, xc, ya, yb, yc, distancia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores de acordo com o pedido."+"\n");
		System.out.println("Digite valor para x do objeto 1: ");
		xa = sc.nextDouble();
		System.out.println("Digite valor para y do objeto 1: ");
		xb = sc.nextDouble();
		System.out.println("Digite valor para z do objeto 1: ");
		xc = sc.nextDouble();
		System.out.println("Agora para o objeto 2: ");
		System.out.println("Digite valor para x do objeto 2: ");
		ya = sc.nextDouble();
		System.out.println("Digite valor para y do objeto 2: ");
		yb = sc.nextDouble();
		System.out.println("Digite valor para z do objeto 2: ");
		yc = sc.nextDouble();
		
		distancia = Math.sqrt(((ya - xa)*(ya - xa))+((yb - xb)*(yb - xb))+((yc - xc)*(yc - xc)));
		
		System.out.println("A dist�ncia entre o objeto 1 e o objeto 2 � de: " + distancia);

		sc.close();
	}

}
