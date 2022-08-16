package Exercicio01;

public class AppPessoa{

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Renan","Renan.sp.121@hotmail.com","(11)9 9359-7029");
		Estudante e = new Estudante("Yasmin","Yasmin@outlook.com","(11)9 95653-6548", 651561);
		EstudantePOS ep = new EstudantePOS("Renan", "Renan.sp.121@gamil.com", "651561651",9451, "Adalto");
		
		System.out.println(p.toString());
		System.out.println(e.toString());
		System.out.println(ep.toString());

	}

}
