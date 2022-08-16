package Exercicio02;

public class Funcionario {

	protected String name;
	protected int horasTrabalhadas;
	protected double valorHora;
	protected double salario;
	
	public Funcionario(String name, int horasTrabalhadas, double valorHora) {
		this.name = name;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	public double calcularSalario() {
		salario = horasTrabalhadas * valorHora;
		return salario;
	}
	
	public String toString() {
		return "Nome: " + name + "\n" +
			   "Horas que foram trabalhadas: " + horasTrabalhadas + "\n" +
			   "valor da Hora: " + "R$ " +valorHora + "\n" +
			   "Valor final do salário: " + "R$ " + salario;
	}
	
}
