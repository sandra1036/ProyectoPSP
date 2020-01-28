package sample.Servicio;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {
    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(1234);
        System.out.println("ESPERANDO AL CLIENTE...");
        Socket socket = servidor.accept();
        System.out.println("RECIBIENDO DEL CLIENTE...");
        DataInputStream in = new DataInputStream(socket.getInputStream());
        try {
            do {
                String mensaje = in.readUTF();
                System.out.println(mensaje);
            } while (!servidor.isClosed());
        } catch (EOFException e) {
            System.out.println("FIN DE LA COMUNICACIÓN");
        }

    }
}
