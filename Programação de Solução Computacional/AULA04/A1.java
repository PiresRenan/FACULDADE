package AULA04;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de pontos que o primeiro colocado possui, e em seguida, o que o ultimo colocado possui, respectivamente: ");
        int TimeL = sc.nextInt(), TimeU = sc.nextInt();
        sc.close();
        int totaljogos = (TimeL - TimeU) / 3;

        System.out.println("O numero de jogos necessarios para que o lanterna atinja ou ultrapasse o primeiro colocado é de " + totaljogos + " jogos.");
    }
}
/*
 Usando a classe Scanner para entrada de dados, faça uma classe que receba dois valores inteiros.
O primeiro valor corresponde a quantidade de pontos que o lider do campeonato brasileiro possui.
O segundo corresponde aos pontos do time lanterna. Considere que cada vitória vale 3 pontos, elabore
uma classe que calcule a quantidade de vitorias necessarias para que o time lanterna alcance(ou ultrapasse)
o líder. Por exemplo, supondo que a quantidade de pontos fornecidas sejam 40 e 22, então o numero de vitorias apresentadas
deverá ser 6, pois (40 - 22)/3 = 6. 
*/