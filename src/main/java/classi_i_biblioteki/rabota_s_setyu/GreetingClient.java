package classi_i_biblioteki.rabota_s_setyu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class GreetingClient {
    public static void main(String[] args) {
        String serverName = args[1];
        int port = 2026;
        try {
            System.out.println("Подключение к " + serverName + " на порт " + port);
            Socket client = new Socket(serverName, port);

            System.out.println("Просто подключается к " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Привет из " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);

            System.out.println("Сервер ответил " + in.readUTF());
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
