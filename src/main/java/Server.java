import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        startServer(10001);
    }

    public static void startServer(int port) throws IOException {
        ServerSocket server = new ServerSocket(port);
        System.out.println("접속을 기다립니다.");
        Socket sock = server.accept();
    }
}
