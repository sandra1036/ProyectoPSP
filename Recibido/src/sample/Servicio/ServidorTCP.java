package sample.Servicio;

import sample.Objetos.Email;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {
    public static void main(String[] args) throws IOException {

        //Creamos el socket del servidor
        ServerSocket servidor = new ServerSocket(1234);
        System.out.println("ESPERANDO AL CLIENTE...");
        //Esperamos a que el cliente conecte
        Socket socket = servidor.accept();
        System.out.println("RECIBIENDO DEL CLIENTE...");
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

        try {
            do {
                //Leo el mensaje que me envia el cliente
                Email mensaje = (Email) in.readObject();
                System.out.println(mensaje.toString());
            } while (!servidor.isClosed());
        } catch (EOFException | ClassNotFoundException e) {
            System.out.println("FIN DE LA COMUNICACIÓN");
        }

    }
}
