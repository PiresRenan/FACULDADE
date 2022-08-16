package Correcao;

public class Main {
	
public static void main(String[] args) {
		Carro carro1 = new Carro("BMW", "X6" , 10 );
		
		carro1.andar(5);
		
		System.out.println(carro1.exibir());
		
		carro1.abastecer(10);
		
		System.out.println(carro1.exibir());
	}
}
