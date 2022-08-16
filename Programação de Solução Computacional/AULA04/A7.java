package AULA04;
//import javax.swing.JOptionPane;
import java.util.Random;

public class A7 {
    public static void main(String[] args) {

        Random dado = new Random();
        int a[][] = new int[40][40];

        for (int i = 0, k = 0 ; i < 40 ; i++) {
            a[i][k] = dado.nextInt(255) + 1 ;
            for (int j = 0; j < 40; j++) {
                a[i][j] = dado.nextInt(255) + 1 ;
            }
            k++;
        }
        /*
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                JOptionPane.showMessageDialog(null,a[i][j]);
            }
            JOptionPane.showMessageDialog(null,"\n");
        }
        */
        for (int i = 0 ; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                System.out.printf("%d ", a[i][j] );
            }
            System.out.println();
        }
    }
}
/* 
 Uma imagem é formada por pixels. Considere uma imagem com dimensões de 40x40 e
 faça uma classe que contenha um array bidimensional com essas dimensões.A seguir, para
 cada posição desse array bidimensional armazene um valor aleatório entre 0 e 255 
 (esses valores correspondem às tonalidades aplicadas sobre a imagem). Apresente em tela
 os 1600 valores gerados. 
*/ 