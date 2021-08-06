package classi_i_biblioteki.rabota_s_setyu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class GreetingServer extends Thread {
    private ServerSocket serverSocket;

    public GreetingServer(int port) throws Exception {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Ожидание клиент на порт " + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();

                System.out.println("Просто подключается к " + server.getRemoteSocketAddress());
                DataInputStream inputStream = new DataInputStream(server.getInputStream());

                System.out.println(inputStream.readUTF());
                DataOutputStream outputStream = new DataOutputStream(server.getOutputStream());
                outputStream.writeUTF("Спасибо за подключениек " + server.getOutputStream() + "\nПока");
                server.close();

            } catch (SocketTimeoutException e1) {
                System.out.println("время сокета истекло !");
                break;
            } catch (IOException e2) {
                e2.printStackTrace();
            }

        }
    }

    public static void main(String[] args) throws Exception {
        int port = 2026;
        try {
            Thread t = new GreetingServer((port));
            t.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
