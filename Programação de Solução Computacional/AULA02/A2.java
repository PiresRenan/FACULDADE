package AULA02;
import java.util.Scanner;

//Criar uma calculadora de operacoes basicas(+,-,*,/).O algoritmo deve ler dois numeros e o sinal correspondente
//a operacao desejada(usar char), no final deve ser impresso o resultado.
//Restricoes; Se o sinal digitado nao corresponder a uma operacao apresentar a mensagem 'sinal invalido' e finalizar.
//Para a operacao de divisao verificar se o divisor e valido(maior que zero).Caso contrario, "impossivel dividir".

public class A2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1 , n2 ;
        

        System.out.println("Digite:");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        char op;

        System.out.println("Qual operacao deve ser feita(+,-,*,/)?");
        op = entrada.next().charAt(0);
        int total; 

        if (op == '+') {
            total =  n1 + n2 ; 
            System.out.println("O resultado e: " + total);
        } else {
            if (op == '-') {
                total =  n1 - n2;
                System.out.println("O resultado e: " + total);
            } else {
                if (op == '*') {
                    total = n1 * n2;
                    System.out.println("O resultado e: " + total);
                } else {
                    if (op == '/') {
                        total = n1 / n2;
                        if (total > 0) {
                             System.out.println("O resultado e: " + total);
                        }else 
                        System.out.println("Impossivel dividir!");
                    } else {
                        System.out.println("Sinal invalido!");
                    } 
                }
            }
        }
        entrada.close();
    }
}
