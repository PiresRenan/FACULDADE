/*
 * 13. Faça um método que calcule a média de um aluno de acordo com o critério definido neste
curso. Além disso, faça um outro método que informe o status do aluno de acordo com a
tabela a seguir:
Nota acima de 6 à “Aprovado”
Nota entre 4 e 6 à Conceito “Verificação Suplementar”
Nota abaixo de 4 à Conceito “Reprovado”
 */
package Ex13A1;

public class Main {

	public static void main(String[] args) {

		Estudante e = new Estudante();
		
		e.obterNota();
		e.showNota();
		e.aprovadoReprovado();
	}

}
