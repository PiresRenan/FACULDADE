/*
 * 17. Identifique as classes e implemente um programa para a seguinte especificação: “O
supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma
quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada item
especifica o produto que o cliente deseja e a respectiva quantidade. Esse pedido pode ser
pago em dinheiro, cheque ou cartão.”
 */
package Ex17A1;

public class Main {

	public static void main(String[] args) {
		
		Supermercado m = new Supermercado(0, 0);
		
		m.input();
		m.calcValor();
		System.out.println(m.toString());

	}

}
