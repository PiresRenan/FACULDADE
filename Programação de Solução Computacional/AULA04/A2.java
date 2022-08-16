package AULA04;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class A2 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat();
        String nomeProd = JOptionPane.showInputDialog("Digite o produto: ");
        Double valorOrig = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
        Double desconto ;
        df.applyPattern("#.00");

        if (valorOrig > 0 ) {

            if(valorOrig >= 50 && valorOrig < 200){
                desconto = valorOrig - (valorOrig * 0.05) ; 
            }
            else if (valorOrig >= 200 && valorOrig < 500) {
                desconto = valorOrig - (valorOrig * 0.06) ; 
            }
            else if(valorOrig >= 500 && valorOrig < 1000){
                desconto = valorOrig - (valorOrig * 0.07) ; 
            }   
            else{
                desconto = valorOrig - (valorOrig * 0.08) ; 
            }
        }
        else{
        JOptionPane.showMessageDialog(null," Valor inserido incorreto ");
        return;
        }
        JOptionPane.showMessageDialog(null,"O produto selecionado é:   " + nomeProd + "\n" + 
        "Valor do produto:   R$" + df.format(valorOrig) + "\n" + "Valor Final a pagar:   R$" + df.format(desconto));
    }
}
/*
 Usando o JOptionPane, elabore uma classe que receba o nome de um produto e o seu valor. O desconto
 deve ser calculado de acordo com o valor fornecido conforme a tabela 1.
 Utilizando a estrutura if-else, aprensente em tela o nome do produto, o seu valor original e o valor
 com desconto. Caso o valor digitado seja menor que zero, deve ser emitida uma mensagem de aviso.
 

Valor R$            |     Desconto (%)
>= 50 e < 200       |         5
>=200 e < 500       |         6
>=500 e < 1000      |         7
>=1000              |         8

*/