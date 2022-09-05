import java.util.*;

import methods.BaseMethods;
import model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa(sc.next().charAt(0),sc.nextFloat(), sc.nextFloat());

        switch (pessoa.getOperador()) {
            case '+':
                System.out.println(BaseMethods.soma(pessoa.getN1(), pessoa.getN2()));
                break;
            case '-':
                System.out.println(BaseMethods.subtracao(pessoa.getN1(), pessoa.getN2()));
                break;
            case '*':
                System.out.println(BaseMethods.multiplicacao(pessoa.getN1(), pessoa.getN2()));
                break;
            case '/':
                System.out.println(BaseMethods.divisao(pessoa.getN1(), pessoa.getN2()));
                break;
            default:
                break;
        }
        sc.close();
    }
}
