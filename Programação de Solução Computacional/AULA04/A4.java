package AULA04;
import javax.swing.JOptionPane;

public class A4 {
    public static void main(String[] args) {

        int  n = Integer.parseInt(JOptionPane.showInputDialog("Deseja a tabuada de qual numero? \n"));
        int count = 1 ;
        int result[] = new int[10];
    
        while(count <= 10){
            result[count - 1] = n * count;
            count++;
        }
        JOptionPane.showMessageDialog(null,"A tabuada de " + n + " é \n" + n +" x  1" + " = " + result[0] + 
        "\n" + n +" x  2" +" = " + result[1] + "\n" + n +" x  3" + " = " + result[2] + "\n" + n +" x  4" +
         " = " +  result[3] + "\n" + n +" x  5" + " = " + result[4] + "\n" + n +" x  6" + " = " + result[5] +
          "\n" + n +" x  7" + " = " + result[6] + "\n" + n +" x  8" + " = " + result[7] + "\n" + 
          n +" x  9" + " = " + result[8] + "\n" + n +" x  10" + " = " + result[9] + "\n" );
    }
}
/*
 Faça uma classe que apresente a tabuada em tela de qualquer numero. O usuario fornece o numero desejado e
 a classe apresenta a relação de todos os cálculos de 1 a 10. 
*/