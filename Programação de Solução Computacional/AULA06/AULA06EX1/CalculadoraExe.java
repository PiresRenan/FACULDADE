package AULA06EX1;

public class CalculadoraExe {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.soma(5, 7);
        System.out.println("O resultado é: " + resultado);

        resultado = calculadora.soma(5.5, 9.5);
        System.out.println("o resultado é: " + resultado);
        
        resultado = calculadora.soma("9","8.5");
        System.out.println("o resultado é: " + resultado);
    }
}
