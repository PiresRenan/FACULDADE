import java.io.IOException;
import java.net.*;

public class Cliente {
    static Conexao c;
    static Socket socket;

    // quando um cliente jé criado, ele realiza a conexão
    public Cliente() {
        try {
            // Cliente se conectando ao servidor
            socket = new Socket("localhost", 9600);
        } catch (Exception e) {
            System.out.println("Não consegui resolver o host.");
        }
    }

    public static void main(String[] args) {
        String msg = "Cliente envia: Olá!"; // mensagem enviada pelo cliente
        String texto; // resposta recebida
        new Cliente(); // conexão feita
        
        // enviar uma mensagem 10x
        for(int i=0; i<10; i++) {
            c.send(socket, msg);
            // Resposta d servidor
            texto = c.receive(socket);
            System.out.println(texto);
        }
        try {
            socket.close(); // no final, a conexão com o socket é fechada
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   
}