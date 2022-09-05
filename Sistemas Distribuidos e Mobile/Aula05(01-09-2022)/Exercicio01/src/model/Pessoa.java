package model;

public class Pessoa {
    char operador;
    float n1, n2;

    public Pessoa(char operador, float n1, float n2){
        this.operador = operador;
        this.n1 = n1;
        this.n2 = n2;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }
}
