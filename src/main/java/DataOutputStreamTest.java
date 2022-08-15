import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            fos = new FileOutputStream("data");
            dos = new DataOutputStream(fos);
            dos.writeBoolean(true);
            dos.writeByte((byte) 5);
            dos.writeInt(100);
            dos.writeDouble(200.5);
            dos.writeUTF("hello world");
            System.out.println("save file");
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                fos.close();
            } catch (IOException e) {}
            try {
                dos.close();
            } catch (IOException e) {}
        }
    }
}
