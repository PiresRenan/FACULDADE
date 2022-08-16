package Exercicio01;

public class Pessoa {
	protected String nome, email, telefone;
	
	public Pessoa(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override //indica que a o metodo foi sobreescrito
	public String toString() {
		return "Nome: " + nome;
	}
}
