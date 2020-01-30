package sample.Servicio;

import sample.Objetos.Email;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTCP {
        public static void main(String[] args) throws IOException {
            //Creo el Socket para el cliente conecte
            Socket socket = new Socket("127.0.0.1", 1234);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            do {
                //Escribe el mensaje
                out.writeObject(new Email("oatata", "127.0.0.1", "127.0.0.1", "patata"));
                out.writeUTF("\t" + sc.nextLine() + "\n");
                System.out.println(out);
            } while (socket.isConnected());
        }
}
