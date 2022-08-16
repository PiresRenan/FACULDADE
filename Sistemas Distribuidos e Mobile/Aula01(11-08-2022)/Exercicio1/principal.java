import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Automovel carro = new Automovel("Renan", "BMW X1", "PAX3733", 2022);

        System.out.println("Nome do atual proprietario: "+ carro.nome_do_proprietario + "\n" +
        "Modelo do carro: " + carro.modelo + "\n" +
        "Placa do carro: " + carro.placa + "\n" +
        "Ano do carro: " + carro.ano + "\n");        

    }
}
