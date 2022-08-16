package AULA01;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1, v2 , valor;
        
        System.out.println("Digite ai:");
        v1 = sc.nextInt();
        System.out.println("Digite novamente:");
        v2 = sc.nextInt();
        sc.close();
        
        if (v1>v2) {
            valor = v1 - v2;
            System.out.println("V1 é maior que V2 e a diferenca entre eles e de " + valor);
        }else{
            valor = v2 - v1;
            System.out.println("V2 é maior que V1 e a diferenca entre eles e de 56" + valor);
        }
    }
}    