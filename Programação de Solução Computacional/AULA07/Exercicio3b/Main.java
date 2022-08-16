package Exercicio3b;

public class Main {

	public static void main(String[] args) {
		
		Robo robo = new Robo();
		int cont = 0;
		
		robo.iniciarRobo();
		
		System.out.println("Digite o comando para que o robo se mova, deve-se digitar valores de 1 a 5 para isso, vide a"
				+ " tabela abaixo: ");
		while(cont < 2) {
			if(cont == 0) {
				
			}
			System.out.println("1 - Andar para o Norte");
			System.out.println("2 - Andar para o Sul");
			System.out.println("3 - Andar para o Leste");
			System.out.println("4 - Andar para o Oeste");
			System.out.println("5 - Sair");
			robo.move();
			if(robo.z == 1) {
				robo.norte();
			}
			else if(robo.z == 2) {
				robo.sul();
			}
			else if(robo.z == 3) {
			robo.leste();
		    }
			else if(robo.z == 4) {
				robo.oeste();
			}
			else {
				break;
			}
		}
	}

}
