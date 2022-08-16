package AULA05EX2;

public class Veiculo {

    String modelo , marca;
    Double consumo;

    double calcConsumo(){
        Double km = 100.0;
        Double litros = 5.0;
        consumo = km/litros;
        return consumo;
    }

    void mostrarModeloMarca(){
        System.out.println("O carro exemplo é do modelo " 
        + modelo + " e a marca dele é " + marca + "\n" +
        "Seu consumo é de " + consumo + "km/l.");
    }
}
