import java.io.FileInputStream;
import java.io.IOException;

public class FileView2 {

    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("usage : java FileView filename");
            System.exit(0);
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(args[0]);
            int readcount = 0;
            byte[] buffer = new byte[512];
            while((readcount = fis.read(buffer)) != -1) {
                System.out.write(buffer,0,readcount);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                fis.close();
            } catch (IOException e) { }
        }
    }
}
