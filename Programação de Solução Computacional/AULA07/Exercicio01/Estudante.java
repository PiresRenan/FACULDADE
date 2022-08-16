package Exercicio01;

public class Estudante extends Pessoa {
	private int ra;
	private String curso, turma;
	
	public Estudante(String nome, String email, String telefone, int ra) {
		super(nome, email, telefone);
		this.ra = ra;
	}
	
	@Override //anotação que indica que a o metodo foi sobreescrito
	public String toString() {
		return super.toString() + "," + "RA: " + ra;
	}
}
