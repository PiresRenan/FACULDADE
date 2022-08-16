package Exercicio02;

import javax.swing.JOptionPane;

public class CelularPrePago {

	private String name;
	private String numeroTel;
	private double saldo;
	
	CelularPrePago(String name, String numeroTel){
		
		this.name = name;
		this.numeroTel = numeroTel;
		
	}
	
    CelularPrePago(String name, String numeroTel, double saldo){
		
		this.name = name;
		this.numeroTel = numeroTel;
		this.saldo = saldo;
		
	}
    
    public double fazerLigacao() {
    	if(saldo >= 0.750) {
    		saldo = saldo - 0.75;
    	}else {
    		JOptionPane.showMessageDialog(null, "Você não tem saldo suficiente para completar a ligação!");
    	}
    	return saldo;
    }
	
    public double recarregar() {
    	double saldoAdd = 0;
    	while (saldoAdd <= 0) {
    	saldoAdd = Double.parseDouble(JOptionPane.showInputDialog("Quanto quer recarregar?"));
    	}
    	saldo = saldo + saldoAdd;
    	return saldo;
    }
    
    public String toString() {
    	String myString = name + "\n" + "(11) " + numeroTel + "\n" + "R$ " + saldo;
    	return myString;
    }
}
