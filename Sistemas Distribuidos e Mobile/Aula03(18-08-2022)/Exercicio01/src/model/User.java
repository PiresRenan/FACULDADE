package model;

public class User {

	private String name, email, senha;
	private int id;

	public User(int id, String name, String email, String senha) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.senha = senha;
	}

	public User(String name, String email, String senha) {
		this.name = name;
		this.email = email;
		this.senha = senha;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", senha=" + senha + ", id=" + id + "]";
	}

}