package AULA06EX2;

public class ImpresoraExe {
    public static void main(String[] args) {
        Impressora i = new Impressora();
        i.exibir(35.7);
        //1
        i.exibir(35.7,45.4);
        //2
        i.exibir(35.7 , "999.4");
        //3
        i.exibir("É o resultado: ", 54.7);
        //4
        i.exibir(7, 3 , "é o fluxo, vem!");
        //5
    }
}
/*
Escreva uma classe chamada Impressora. Essa classe deve exibir diversos conteudos na tela.
Ela deve possuir metodos chamdos exibir().
Eles poderão coexistir graças ao mecanismo chamado overload.
Escreva versões do metodo exibir que tenham as seguintes listas de paramentros:
1. valor do double.
2. dois valores double.
3. um double e um String, nessa ordem.
4. uma String e um double, nessa ordem.
5. dois int e uma String, nessa ordem.
Em todos os casos exiba todos os valores usando System.out.println, separando
cada informação por virgula.
Escreva uma classe de testes que chama cada um dos metodos que voce escreveu.
*/