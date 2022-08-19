package Ex15A1;

import java.util.Scanner;
public class Numero {

	char[] digit = new char[3];
	int num;
	Scanner sc = new Scanner(System.in);
	
	public int input() {
		int cont = 0;
		while(cont == 0) {
			System.out.println("Digite um valor a ser dado em numeros romanos, com no maximo 3 digitos: ");
			num = sc.nextInt();
			if(num < 1000) {
				cont++;
			}else {
				System.out.println("Valor invalido!" + "\n" + "Tente novamente");
			}
		}
		return num;
	}
    public int NumeroRomano(){
    	for(int i = 0 ; i < num;) {
    		if(num >= 500) {
    		   digit[0] = 'D';
    		   num = num-500;
    		}
    	    if(num >= 100) {
    	 	   digit[1] = 'C';
    	 	   num = num-100;
    	 	}
    	    if(num >= 50 ) {
    	    	digit[2] = 'L';
     	 	   num = num-50;
    	    }
    	}
		return digit[0] + digit[1] + digit[2];
	}
}
