package model;

public class Cliente extends Pessoa {

    private float saldo;

    public Cliente(String nome, int idade, float saldo) {
        super(nome, idade);
        this.saldo = saldo;
    }    

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente [saldo=" + saldo + "]";
    }

}