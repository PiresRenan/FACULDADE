package AULA04;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class A3 { 

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        Double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
        Double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
        Double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3"));
        Double media = (n1 + n2 + n3) / 3.0 ;
        df.applyPattern("#.00");

        if (media >= 0 && media <= 10.0) {

            if(media >= 6.0){
                JOptionPane.showMessageDialog(null," Aprovado e sua média é " + df.format(media));
            }
            else {
                JOptionPane.showMessageDialog(null," Reprovado e sua média é " + df.format(media));
            }
        }else
        {
            JOptionPane.showMessageDialog(null," Nota invalida ");
        }
    }
}