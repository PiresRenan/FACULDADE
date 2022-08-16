package AULA06EX3;
import java.util.Scanner;

public class PessoaExe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa("Renan", 5000);
        Pessoa p2;
        Pessoa p3 = new Pessoa();
        String nome;
        double salario;

        System.out.println("Digite o nome: ");
        nome = sc.nextLine();
        System.out.println("Digite o salário: ");
        salario = sc.nextDouble();

        p2 = new Pessoa(nome, salario);

        p.exibir();
        p2.exibir();
        p3.exibir();

        sc.close();
    }
}
