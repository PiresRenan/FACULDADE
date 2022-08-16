package Exercicio02;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		CelularPrePago celularPrePago1 = new CelularPrePago(
				JOptionPane.showInputDialog("Qual o nome do usuário?"),
				JOptionPane.showInputDialog("Digite o numero do telefone:"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial:"))
				);

		JOptionPane.showMessageDialog(null, "Olá, vamos ver se funciona...");
		int resp;
		resp = JOptionPane.showConfirmDialog(
				null, "Vai efetuar uma ligação?", "Ligação", JOptionPane.YES_NO_OPTION);
		if(resp == 0) {
			resp = JOptionPane.showConfirmDialog(null,
					"Vai precisar de uma recarga?","Recharge message"
					
					, JOptionPane.YES_NO_CANCEL_OPTION);
			if(resp == 0) {
				celularPrePago1.recarregar();
				celularPrePago1.fazerLigacao();
			}else if(resp == 1) {
				celularPrePago1.fazerLigacao();
			}else {
				JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
			}
		}
		JOptionPane.showMessageDialog(null,"Seus dados: " + "\n" + celularPrePago1.toString());
	
		resp = 0;
		while(resp < 1) {
			resp = JOptionPane.showConfirmDialog(
					null, "Quer fazer a operação por outro celular?", "Mais um celular?",JOptionPane.YES_NO_OPTION);
			if(resp == 0) {
				CelularPrePago celularPrePago2 = new CelularPrePago(
						JOptionPane.showInputDialog("Qual o nome do usuário?"),
						JOptionPane.showInputDialog("Digite o numero do telefone:"));
				celularPrePago2.recarregar();
				celularPrePago2.fazerLigacao();
				JOptionPane.showMessageDialog(null,"Seus dados: " + "\n" + celularPrePago2.toString());
			}
			resp++;
		}
	}

}
