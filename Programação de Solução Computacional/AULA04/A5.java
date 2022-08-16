package AULA04;
import java.util.Random;
import javax.swing.JOptionPane;

public class A5 {

    public static void main(String[] args) {
        int a[] = new int[3];
        int b = 0;
        Random dado = new Random();

        for(int i = 0 ; i < 3 ; i++){
            a[i] = dado.nextInt(6) + 1;
            b = b + a[i];
        }
        JOptionPane.showMessageDialog(null, "Os numeros sorteados foram: \n" + a[0] + "\n" + 
        a[1] + "\n" + a[2] + "\n" + "E o total da soma é: " + b);
    }
}
/*
Crie uma classe que simule a jogada de um dado de seis lados( 1 a 6) por três vezes.
Ao final some seus valores e apresente o resultado das três jogadas. Em Janela.
*/