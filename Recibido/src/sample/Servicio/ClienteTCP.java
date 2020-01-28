package sample.Servicio;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTCP {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 1234);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        Scanner sc = new Scanner(System.in);
        do {
            out.writeUTF("\t" + sc.nextLine() + "\n");
        } while (socket.isConnected());
    }
}
