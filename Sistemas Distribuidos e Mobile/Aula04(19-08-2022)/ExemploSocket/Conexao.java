import java.io.*;
import java.net.Socket;

public class Conexao {

    public static void send(Socket socket, String txt) {
        OutputStream out;
        
        try {
            out = socket.getOutputStream();
            out.write(txt.getBytes());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // recebe os bytes da mensagem e devolve uma String
    public static String receive(Socket socket) {
        InputStream in;
        int bt; // número de bytes
        String txt = ""; // conteúdo convertido para string
        byte btxt[] = new byte[79]; // conteúdo em bytes

        try{
            in = socket.getInputStream();
            bt = in.read(btxt); // tam. da mensagem
            if (bt > 0) { // mensagem recebida
                // converto a mensagem em bytes p/ String
                txt = new String(btxt);
            }

        } catch (Exception e) {
            System.out.println("Exceção no InputStream");
        }
        return txt; // retorno a mensagem final
    }
}
