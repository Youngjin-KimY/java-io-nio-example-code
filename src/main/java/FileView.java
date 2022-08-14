import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileView {

    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("usage : java FileView filename");
            System.exit(0);
        }

        FileInputStream fis = null;

        try {
            fis = new FileInputStream(args[0]);
            int  i = 0;
            while((i = fis.read()) != -1) {
                System.out.write(i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {}
        }
    }
}
