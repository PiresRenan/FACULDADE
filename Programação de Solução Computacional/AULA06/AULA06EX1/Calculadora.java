package AULA06EX1;

public class Calculadora {
    
    public int soma(int a , int b){
        return a + b ;
    }
    
    //overlaod = sobrecarga
    public double soma(double a, double b) {
        return a + b;        
    }

    //overload2
    public double soma(String a, String b) {
        double d1,d2;
        d1= Double.parseDouble(a);
        d2= Double.parseDouble(b);
        return d1 + d2;
    }
}
