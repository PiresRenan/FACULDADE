package AULA01;
import java.io.DataInputStream;
import java.io.IOException;

public class A1 {
    public static void main(String[] args) {

        String s;  
        float largura, comprimento, area, perimetro;
        DataInputStream dado;

        try {
            System.out.println("Comprimento:");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            comprimento = Float.parseFloat(s);

            System.out.println("largura:");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            largura = Float.parseFloat(s);

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println("Area:" + area);
            System.out.println("Perimetro:" + perimetro);
        } 
        catch (IOException erro) {
           System.out.println("houve erro"+ erro.toString()) ;
        }
        catch(NumberFormatException erro){
            System.out.println("erro de conversão" + erro.toString());
        }

    }
}    