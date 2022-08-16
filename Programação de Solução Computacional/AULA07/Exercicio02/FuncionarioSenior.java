package Exercicio02;

public class FuncionarioSenior extends Funcionario {
	
	private double bonus,bCalculado, salarioFinal;
	
	
	public FuncionarioSenior(String name, int horasTrabalhadas, double valorHora, double bonus) {
		super(name, horasTrabalhadas, valorHora);
		this.bonus = bonus;
	}

	public double calcularBonus() {
		salarioFinal = horasTrabalhadas*valorHora;
		bCalculado = ((salarioFinal)*bonus)/100;
		System.out.println(bCalculado);
		for(int i = 0,j = 0 ; i < horasTrabalhadas+1 ; i++,j++) {
			if(j == 10) {
				salarioFinal = bCalculado + salarioFinal;
				System.out.println(salarioFinal);
				j = 0;
			}
			
		}
		return salarioFinal;
	}
	@Override
	public String toString() {
		return "\n" +"Nome: " + name + "\n" +
			   "Horas que foram trabalhadas: " + horasTrabalhadas + "\n" +
			   "valor da Hora: " + "R$ " +valorHora + "\n" +
			   "Bonus a cada 10 horas: " + bonus + "%" +"\n" +
			   "Valor final do salário: " + "R$ " + salarioFinal;
	}
}
