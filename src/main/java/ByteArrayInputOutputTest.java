import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayInputOutputTest {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("usage : java ByteArrayInputOutputTest filename");
            System.exit(0);
        }

        FileInputStream fis = null;
        ByteArrayInputStream bais = null;
        ByteArrayOutputStream baos = null;

        try {
            fis = new FileInputStream(args[0]);
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[512];
            int readcount = 0;

            while((readcount = fis.read(buffer)) != -1){
                baos.write(buffer,0,readcount);
            }

            byte[] fileArray = baos.toByteArray();
            System.out.println("reading all contents and converting byte arry");
            System.out.println("number of reading byte : "+ fileArray.length);

            bais = new ByteArrayInputStream(fileArray);

            while((readcount = bais.read(buffer)) != -1) {
                System.out.write(buffer, 0, readcount);
            }

            System.out.println("\n\n");
            System.out.println("print all");

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                fis.close();
                bais.close();
                baos.close();
            } catch (IOException ioe) {
                System.out.println(ioe);
            }
        }
    }
}
