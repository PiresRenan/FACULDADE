package Exercicio02;

public class AppFuncionario {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario(
				                        "Renan",
				                        50,
				                        250
				                        );
		FuncionarioSenior fS = new FuncionarioSenior(
				                                     "Renan",
				                                      50,
				                                      250,
				                                      15.75
				                                     );
		
		f.calcularSalario();
		System.out.println(f.toString());
	
		fS.calcularBonus();
		System.out.println(fS.toString());
	}

}
