package AULA05EX2;

public class appVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo();

    v.modelo = "HB20";
    v.marca = "Hyundai";

    v.calcConsumo();

    v.mostrarModeloMarca();
    }
}
