package Ex17A1;

import java.util.Scanner;
public class Supermercado {

	Scanner sc = new Scanner(System.in);
	private double[] valor = {785.99,356.99,2533.99,2.99,1599.99};
	private double valorTotal;
	protected int qtt;
	protected int codPrd;
	Estoque e = new Estoque(codPrd, codPrd, null);
	
	Supermercado(int qtt, int codPrd){
		// this.valor = valor;
		this.qtt = qtt;
		this.codPrd = codPrd;
	}
	
	public int input() {
		System.out.println("Digite o c�digo do produto desejado: ");
		System.out.println("101. Bicicleta");
		System.out.println("205. Pneu");
		System.out.println("161. Radio");
		System.out.println("247. Caneta");
		System.out.println("201. celular");
		codPrd = sc.nextInt();
		
		System.out.println();
		System.out.println("Digite a quantidade desejada do produto: ");
		qtt = sc.nextInt();
		return qtt + codPrd;
	}
	
	public double calcValor() {
		if(codPrd == 101) {
			valorTotal = qtt * valor[0];
		}
		else if(codPrd == 205) {
			valorTotal = qtt * valor[1];
		}
	    else if(codPrd == 161) {
		    valorTotal = qtt * valor[2];
	    }
        else if(codPrd == 247) {
	        valorTotal = qtt * valor[3];
        }
        else if(codPrd == 201) {
	        valorTotal = qtt * valor[4];
        }
		e.confCod();
		return valorTotal;
	}
	
	@Override
	public String toString() {
		return "O valor total a ser pago � de: " + "R$ " +  valorTotal + "em " + qtt + "do produto escolhido." ;
	}
	
}
