package Exercicio01b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int resp;

		System.out.println("Carro é novo(0KM), ou o carro é semi-novo ?");
		System.out.println("Digite 1 para SIM e digite 2 para NÃO");
		resp = sc.nextInt();
		
		if(resp == 1) {
			System.out.println("Digite a marca do carro,"
					+ " o modelo e em seguida seu consumo médio de combustivel(KM/L),"
					+ " respectivamente: ");
			Car car = new Car(
					          "BMW","X6",20.5
					          );
			car.walk();
		}
		else {
			System.out.println("Digite a marca do carro,"
					+ " o modelo, seu consumo médio de combustivel(KM/L), a "
					+ "quantidade de combustivel presente no tanque, e por fim, a"
					+ " quilometragem de uso do carro, respectivamente:  ");
			Car car = new Car(
					          sc.nextLine(),
					          sc.nextLine(),
					          sc.nextDouble(),
					          sc.nextDouble(),
					          sc.nextDouble()
					          );
			car.walk();
			System.out.println("Seus dados finais são: \n" + car.toString());
		}
		
		sc.close();
		
	}


}
