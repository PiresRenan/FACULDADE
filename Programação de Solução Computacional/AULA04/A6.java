package AULA04;
import javax.swing.JOptionPane;

public class A6 {
    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        String fraseInvertida = "";

        for(int i = frase.length() - 1; i >= 0 ; i--){
            if (frase.charAt(i) != ' ') {
                fraseInvertida = fraseInvertida + frase.charAt(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Frase fornecida: \n" + frase + "\n" +"\n"
        + "Frase de trás para frente: \n" + fraseInvertida);
    }
}
/*
Construa uma classe que receba uma frase qualquer e mostre essa frase de trás para frente e
 sem espaços em branco.
 */