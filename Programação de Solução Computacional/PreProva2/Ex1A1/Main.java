/*
 1. Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura. 
    Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma pessoa.
    Crie um método para calcular a idade da pessoa. 
 */
package Ex1A1;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();

		p.setName();
		p.getName();
		p.setBD();
		p.getBD();
		p.setHeight();
		p.getHeight();
		p.showInfos();
	}

}
