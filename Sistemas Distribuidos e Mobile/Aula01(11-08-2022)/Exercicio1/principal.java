import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Automovel a = new Automovel("Renan", "BMW X1", "PAX3333", 2022);

        System.out.println("Digite o nome do proprietário inicial: ");
        a.setNome_do_proprietario(sc.nextLine());

        

        System.out.println("Nome do atual proprietario: "+ a.getNome_do_proprietario() + "\n" +
        "Modelo do carro: " + a.getModelo() + "\n" +
        "Placa do carro: " + a.getPlaca() + "\n" +
        "Ano do carro: " + a.getAno() + "\n");        

        sc.close();
    }
}
