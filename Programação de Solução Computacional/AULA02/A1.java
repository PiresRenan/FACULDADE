package AULA02;
import java.util.Scanner;
// Faca um programa que leia o salario de uma pessoa e exiba o desconto do INSS segundo a tabela a seguir.
//<=600 - ISENTO; >600 && <= 1200 - 20%; >1200 && <= 2000 - 25%; >2000- 30%

public class A1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Double salario;

        System.out.println("Digite o seu salario:");
        salario = teclado.nextDouble();

        System.out.println("Seu salário é de: R$" + salario);

        if (salario <= 600) {
            System.out.println("Isento!");
        }
        else {
            if (salario <= 1200) {
                System.out.println("20%");
            }else{
                if (salario <= 2000) {
                    System.out.println("25%");
                } else {
                    System.out.println("30%");
                }
            }
        }
        teclado.close();
    }
}