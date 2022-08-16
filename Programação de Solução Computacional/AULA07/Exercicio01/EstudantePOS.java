package Exercicio01;

public class EstudantePOS extends Estudante {
	private String dissertacao, orientador;

	public EstudantePOS(String nome, String email, String telefone, int ra, String orientador) {
		super(nome,email,telefone,ra);
		this.orientador = orientador;
	}
	
	@Override //anotação que indica que a o metodo foi sobreescrito
	public String toString() {
		return super.toString() + "," + "Orientador: " + orientador;
	}
}
