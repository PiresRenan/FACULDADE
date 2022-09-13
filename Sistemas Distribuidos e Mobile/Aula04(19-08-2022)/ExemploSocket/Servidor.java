// netbeans cria packages, não apague o package

import java.net.*;

public class Servidor {
    static ServerSocket serversocket;
    static Socket client_socket;
    static Conexao c;
    static String msg;

    public Servidor() {
        try {
            // Mesma porta que o cliente acessa
            serversocket = new ServerSocket(9600);
            System.out.println("Criando o Server Socket.");

        } catch (Exception e) {
            System.out.println("Não criei o serve socket...");
        }
    }

    public static void main(String[] args) {
        String texto;
        new Servidor();
        c = new Conexao();
        // método para verificar se o cliente conseguiu conectar com sucesso
        if (connect()) {
            for (int i = 0; i < 10; i++) {
                texto = c.receive(client_socket);
                System.out.println(texto);
                c.send(client_socket,"Servidor envia: olá cliente");
            }
        }
        try {
            client_socket.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erro de desconexão");
        }
    }            

    static boolean connect() {
        try {
            // Aceitar conexão
            client_socket = serversocket.accept();
            return true;
        } catch (Exception e) {
            // se houver algum problema, retorna falso
            System.out.println("Não fez a conexão.");
            return false;
        }
    }
}
