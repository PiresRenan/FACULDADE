package Correcao;

public class Carro {
	
	private String marca , modelo;
	private double combustivel, consumo, kmAtual;
	
	public Carro(String marca, String modelo, double combustivel, double consumo, double kmAtual) {
		this(marca,modelo,consumo);
		if(combustivel > 0) {
			this.combustivel = combustivel;
		}
		if(consumo > 0) {
			this.consumo = consumo;
		}
		if(kmAtual > 0) {
			this.kmAtual = kmAtual;
		}
	}
	
	public Carro(String marca, String modelo, double consumo) {
	
		if(marca.length()>0 && marca != null) {
			this.marca = marca;
		}else {
			this.marca = "Não Informada!";
		}
		if(modelo != null && modelo.length()>0) {
			this.modelo = modelo;
		}else {
			this.modelo = "Não Informada!";
		}
		if(consumo > 0) {
			this.consumo = consumo;
		}
	}	
	
	public void andar(double km) {
		double combustivelNecessario;
		
		if(km > 0) {
			combustivelNecessario = km / consumo;
			if(combustivel >= (combustivelNecessario)) {
				kmAtual += km;
				combustivel -= combustivelNecessario;
			}
		}
	}
	
	public void abastecer(double litros) {
		if(litros > 0) {
			combustivel += litros;
		}
	}
	
	public String exibir() {
		return "Marca/Modelo: " + marca + "/" + modelo + "\n" + "KM: " +
 kmAtual + "\n" + "Combustivel: " + combustivel;
	}

}
