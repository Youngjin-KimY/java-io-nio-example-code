import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        access();
    }

    public static void access() throws IOException {
        Socket scok = new Socket("127.0.0.1", 10001);
    }
}
