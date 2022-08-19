package Ex13A1;

import java.util.Scanner;
public class Estudante {

	private double[] nota = new double[5];
	private Scanner sc = new Scanner(System.in);
	
	Estudante(){
		this.nota[0] = nota[0];
		this.nota[1] = nota[1];
		this.nota[2] = nota[2];
		this.nota[3] = nota[3];
		this.nota[4] = nota[4];
	}
	
	public double obterNota() {
		System.out.print("Digite um valor para a nota 1: " + "\n");
		nota[1] = sc.nextDouble();
		System.out.print("Digite um valor para a nota 2: " + "\n");
		nota[2] = sc.nextDouble();
		System.out.print("Digite um valor para a nota 3: " + "\n");
		nota[3] = sc.nextDouble();
		System.out.print("Digite um valor para a nota 4: " + "\n");
		nota[4] = sc.nextDouble();
		
		return nota[0] = (nota[1]+nota[2]+nota[3]+nota[4]) / 4;	
	}
	
	public void aprovadoReprovado() {
		if(nota[0] >= 6.0) {
			System.out.println("Aluno aprovado!");
		}else if(nota[0] >= 4.0 && nota[0] < 6) {
			System.out.println("Verificação Suplementar!");
		}else {
			System.out.println("Reprovado!");
		}
	}
	
	public void showNota() {
		System.out.print("As notas digitadas e a media final foram: "+ "\n" + "N1: " + nota[1] + 
				 "\n" + "N2: " + nota[2] + "\n" + "N3: " + nota[3] + "\n" + "N4: " + nota[4]+
				 "\n" + "MEDIA FINAL: " + nota[0] + "\n");
	}
}
