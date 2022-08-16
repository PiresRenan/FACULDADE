package AULA01;
import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        int idade;
        idade = 26;
        
        System.out.println("Sua idade é " + idade);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade1 = entrada.nextInt();
        System.out.println("Sua idade é " + idade1);

        Double nota1, nota2, media;
        System.out.println("Digite a primeira nota:");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = entrada.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.println("A media é:" + media);
        entrada.close();
    }
}