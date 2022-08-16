package AULA06EX4;

public class Placar {

    private String nomeTime1, nomeTime2;
    private int golTime1, golTime2;

    public Placar(){
        nomeTime1 = "Time da casa";
        nomeTime2 = "Time visitante";
    }

    public Placar(String nomeTime1, String nomeTime2){
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
    }

    public Placar(String nomeTime1, String nomeTime2,
     int golTime1, int golTime2){
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
        this.golTime1 = golTime1;
        this.golTime2 = golTime2;
    }

    public void exibir(){
        System.out.println(nomeTime1 + " " + 
        golTime1 + " X " + golTime2 + " " +
        nomeTime2);
    }
}
