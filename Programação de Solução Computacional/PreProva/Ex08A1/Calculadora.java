package Ex08A1;

public class Calculadora {

	private double value;
	private double tax;
	double test;
	
	Calculadora(double value,double tax){
		this.value = value;
		this.tax = tax;
	}
	
	public double calcular() {
		double valueWtax = 0;
		for(int i = 0 ; i < 12 ; i++) {
			valueWtax = (value*tax)/100;
			value = value + valueWtax;
			test = value;
			System.out.println(value + test );
		}
		return value;
	}
	
	public String toString() {
		return "Saldo do investimento após 1 ano: " + value;
	}
}
