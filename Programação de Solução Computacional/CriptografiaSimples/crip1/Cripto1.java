package crip1;
import javax.swing.*;
public class Cripto1 {

	private String a ;
	String b = "";
	
	
	Cripto1(String a){
		this.a = a;
	}
	
	public void criptografador() {
		for(int i = 0 ; i < a.length() ; i++) {
			switch(a.charAt(i)) {
			case 'a':
				b = b.concat("@$fSa45");
				break;
			case 'b':
				b = b.concat("187&1");
				break;
			case 'c':
				b = b.concat("197%¨#");
				break;
			case 'd':
				b = b.concat("*125");
				break;
			case 'e':
				b = b.concat("!@$¨$");
				break;
			case 'f':
				b = b.concat("(*¨&");
				break;
			case 'g':
				b = b.concat("&*¨&*¨%¨&");
				break;
			case 'h':
				b = b.concat("$#@");
				break;
			case 'i':
				b = b.concat("08&¨$");
				break;
			case 'j':
				b = b.concat("%!@");
				break;
			case 'k':
				b = b.concat("£$$");
				break;
			case 'l':
				b = b.concat("&%#");
				break;
			case 'm':
				b = b.concat("fasd");
				break;
			case 'n':
				b = b.concat("%$F5");
				break;
			case 'o':
				b = b.concat("%@@566d");
				break;
			case 'p':
				b = b.concat("186&1");
				break;
			case 'q':
				b = b.concat("@$fa45");
				break;
			case 'r':
				b = b.concat("uyt#64");
				break;
			case 's':
				b = b.concat("@!$gdf54");
				break;
			case 't':
				b.concat("%%%%!@6");
				break;
			case 'u':
				b = b.concat("fsd1A$#");
				break;
			case 'v':
				b = b.concat("945gA@!");
				break;
			case 'x':
				b = b.concat("944Pa&%");
				break;
			case 'y':
				b.concat("812dPR**1");
				break;
			case 'z':
				b = b.concat("2&13TqB%@");
				break;
			case '0':
				b = b.concat("y&$$$$A");
				break;
			case '1':
				b = b.concat("9(*$#");
				break;
			case '2':
				b = b.concat("Adfa%3");
				break;
			case '3':
				b = b.concat("64%dGt$");
				break;
			case '4':
				b = b.concat("%%%%%%x#!64Af");
				break;
			case '5':
				b = b.concat("*&%$asd547");
				break;
			case '6':
				b = b.concat("***!5545dasd");
				break;
			case '7':
				b = b.concat("*71&%#24Ptxxx54!$");
				break;
			case '8':
				b = b.concat("9447dasd&*$@##");
				break;
			case '9':
				b = b.concat("999!$%sdfA$$");
				break;
			case ' ':
				b = b.concat("@@656sf");
				break;
			}
		}
		a = "";
		JOptionPane.showMessageDialog(null, b);
	}
	public void decriptografador() {
		
		
		for(int i = 0 ; i < b.length() ; i++) {
			switch(a) {
			case "@$fSa45":
				a = a + 'a';
				break;
			case "187&1":
				a = a + 'b';
				break;
			case "197%¨#":
				a = a + 'c';
				break;
			case "*125":
				a = a + 'd';
				break;
			case "!@$¨$":
				a = a + 'e';
				break;
			case "(*¨&":
				a = a + 'f';
				break;
			case "&*¨&*¨%¨&":
				a = a + 'g';
				break;
			case "$#@":
				a = a + 'h';
				break;
			case "08&¨$":
				a = a + 'i';
				break;
			case "%!@":
				a = a + 'j';
				break;
			case "£$$":
				a = a + 'k';
				break;
			case "&%#":
				a = a + 'l';
				break;
			case "fasd":
				a = a + 'm';
				break;
			case "%$F5":
				a = a + 'n';
				break;
			case "%@@566d":
				a = a + 'o';
				break;
			case "186&1":
				a = a + 'p';
				break;
			case "@$fa45":
				a = a + 'q';
				break;
			case "uyt#64":
				a = a + 'r';
				break;
			case "@!$gdf54":
				a = a + 's';
				break;
			case "%%%%!@6":
				a = a + 't';
				break;
			case "fsd1A$#":
				a = a + 'u';
				break;
			case "945gA@!":
				a = a + 'v';
				break;
			case "944Pa&%":
				a = a + 'x';
				break;
			case "812dPR**1":
				a = a + 'y';
				break;
			case "2&13TqB%@":
				a = a + 'z';
				break;
			case "y&$$$$A":
				a = a + '0';
				break;
			case "9(*$#":
				a = a + '1';
				break;
			case "Adfa%3":
				a = a + '2';
				break;
			case "64%dGt$":
				a = a + '3';
				break;
			case "%%%%%%x#!64Af":
				a = a + '4';
				break;
			case "*&%$asd547":
				a = a + '5';
				break;
			case "***!5545dasd":
				a = a + '6';
				break;
			case "*71&%#24Ptxxx54!$":
				a = a + '7';
				break;
			case "9447dasd&*$@##":
				a = a + '8';
				break;
			case "999!$%sdfA$$":
				a = a + '9';
				break;
			case "@@656sf":
				a = a + ' ';
				break;
			}
		}
		System.out.println(a);
	}
}
