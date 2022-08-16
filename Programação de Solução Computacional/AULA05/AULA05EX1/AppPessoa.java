package AULA05EX1;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3;

        p.nome = "Renan";
        p.age = 26 ;
        p.altura = 1.81 ;
        p.nTel = "(11)9 9359-7029" ;
        p.apresentar();
        p2.nome = "Priscila";
        p2.age = 26 ;
        p2.altura = 1.63 ;
        p2.nTel = "(11)9 9985-5622" ;
        p2.apresentar();

        p3 = p;
        p3.apresentar();
    }
}
