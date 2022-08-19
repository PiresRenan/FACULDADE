/*
 * 9. Calcule a raiz quadrada aproximada de um número inteiro informado pelo usuário,
respeitando o erro máximo também informado pelo usuário. Não utilize funções
predefinidas.
 */
package Ex09A1;

public class Main {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora(5);
		
		c.messages();
		c.calcularRaiz();
		System.out.println(c.toString());
	}

}
