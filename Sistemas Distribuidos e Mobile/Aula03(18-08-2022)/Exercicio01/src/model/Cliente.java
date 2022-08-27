package model;

public class Cliente extends Pessoa {

    private float saldo;
    private int id;

    public Cliente(String nome, int idade, float saldo) {
        super(nome, idade);
        this.saldo = saldo;
    }
    public Cliente(String nome, int idade, float saldo, int id) {
        super(nome, idade);
        this.saldo = saldo;
        this.id = id;
    }        

    public float getSaldo() {
        return saldo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "[Nome= " + nome + ", Idade= " + idade + ", saldo= US$" + saldo + "0]";
    }

}