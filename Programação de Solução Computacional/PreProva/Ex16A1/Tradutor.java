package Ex16A1;

import java.util.Scanner;
public class Tradutor {

	Scanner sc = new Scanner(System.in);
	private int num = 0;
	
	// Tradutor(){
	// 	this.num = num;
	// }
	
	public int input() {
		System.out.println("Digite um valor de at� 9 d�gitos: ");
		num = sc.nextInt();
		return num;	
	}
	
	public String toString() {
		
		return "Oi";
	}
}
