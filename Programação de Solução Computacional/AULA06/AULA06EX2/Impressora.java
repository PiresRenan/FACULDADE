package AULA06EX2;

public class Impressora {

    public void exibir(double valor) {
        System.out.println(valor);
    }

    public void exibir(double valor1, double valor2) {
        System.out.println(valor1 + " , " + valor2);
    }

    public void exibir(double valor, String texto) {
        System.out.println(valor + " , " + texto);
    }

    public void exibir(String texto, double valor) {
        System.out.println(texto + " , " + valor);
    }

    public void exibir(int a, int b, String texto) {
        System.out.println(a + " , " + b + " , " + texto);
    }
}
 