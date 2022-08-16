package AULA03;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float notas[] = new float[5];
        float media = 0 ; 

        for (int i = 0 ; i < 5 ; i++) {

            System.out.println("Digite a nota " + (i+1) + " : ");
            notas[i] = sc.nextFloat();
            media = media + notas[i];

        }
        sc.close();
        media = media / 5;
        System.out.println("A media das notas é: " + media);
    }
}