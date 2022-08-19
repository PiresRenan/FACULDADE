package Ex17A1;

public class Estoque extends Supermercado {

	protected int[] qttProd = new int[6];
	
	Estoque(int qtt, int codPrd, int qttProd[]) {
		super(qtt,codPrd);
		this.qttProd = qttProd;
	}
	
	public int confCod() {
		if(codPrd== 101) {
			qttProd[1] = 20;
			qttProd[1] = qtt - qttProd[1];
		}
		else if (codPrd == 205) {
			qttProd[2] = 10;
			qttProd[2] = qtt - qttProd[2];
		}
		else if (codPrd == 161) {
			qttProd[3] = 2;
			qttProd[3] = qtt - qttProd[3];
		}
		else if (codPrd == 247) {
			qttProd[4] = 6;
			qttProd[4] = qtt - qttProd[4];
		}
		else if (codPrd == 201) {
			qttProd[5] = 15;
			qttProd[5] = qtt - qttProd[5];
		}	
		for(int i = 1 ; i < 6 ; i++) {
			if(qttProd[i] != 0) {
				qttProd[0] = qttProd[i];
			}
		}
		return qttProd[0] + qttProd[1] + qttProd[2] + qttProd[3] + qttProd[4] + qttProd[5];
	}
}