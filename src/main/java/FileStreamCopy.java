import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamCopy {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("usage : java FileStramCopy file1 ,file2");
        }

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(args[0]);
            fos = new FileOutputStream(args[1]);
            byte[] buffer = new byte[512];
            int readCount = 0;
            while((readCount = fis.read(buffer)) != -1) {
                fos.write(buffer,0,readCount);
            }
            System.out.println("completing flie copy");
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) { }
            try {
                fos.close();
            } catch (IOException ex) {}
        }
    }
}
