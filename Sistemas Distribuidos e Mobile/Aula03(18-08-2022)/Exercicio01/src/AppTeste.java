import model.Cliente;
import model.Pessoa;
public class AppTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Renan", 26);
        Cliente novo_cliente = new Cliente(pessoa.getNome(), pessoa.getIdade(), 2500);

        System.out.println(pessoa.toString());
        System.out.println(novo_cliente.toString());
    }
}
