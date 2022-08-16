package AULA01;
import javax.swing.JOptionPane;

public class A3 {
    public static void main(String[] args) {
        Object[] op = {"masculino" , "feminino"};
        String resp = (String) JOptionPane.showInputDialog(null, "Selecione o sexo:", "Pesquisa",
         JOptionPane.PLAIN_MESSAGE, null, op, null);

        if (resp == null) {
            JOptionPane.showMessageDialog(null, "Voce pressionou 'Cancelar'.");
        }
        else if (resp == "masculino") {
            JOptionPane.showMessageDialog(null, "Seu genero é masculino.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Seu genero é feminino.");
        }
    }
    
}