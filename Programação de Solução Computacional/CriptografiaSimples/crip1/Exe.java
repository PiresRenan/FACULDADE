package crip1;

import java.util.*;
import javax.swing.*;
public class Exe {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String a = JOptionPane.showInputDialog("Digite o que deve ser criptografado: " + sc.next());
		Cripto1 n = new Cripto1(a);
		n.criptografador();

	}

}
