package AULA06EX4;

public class PlacarExe {
    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("Corinthians",
         "São Paulo");
        Placar p3 = new Placar("Corinthians", "São Paulo", 5, 0);

        p1.exibir();
        p2.exibir();
        p3.exibir();
    }
}
