package AULA02;
import java.util.Scanner;

//Utilize operador ternario para resolver
//Leia um valor inteiro digitado pelo usuario e exiba uma mensagem informando se o valor e positivo(>=0) ou negativo.

public class A3 {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        int a;
        System.out.println("Digite um valor:");
        a = valor.nextInt();
        valor.close();

        if (a >= 0) {
            System.out.println("Numero positivo!");
        }else if(a < 0){
            System.out.println("Numero negativo!");
        }
    }
}