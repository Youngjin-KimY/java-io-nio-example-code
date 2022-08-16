import java.io.*;

public class CharArrayInputOutputTest {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("usage : java CharArrayInputOutputTest filename");
            System.exit(0);
        }

        FileReader fis = null;
        CharArrayReader bais = null;
        CharArrayWriter baos = null;

        try {
            fis = new FileReader(args[0]);
            baos = new CharArrayWriter();
            char[] buffer = new char[512];
            int readcount = 0;

            while((readcount = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, readcount);
            }

            char[] fileArray = baos.toCharArray();
            System.out.println("reading all content as Char[].");
            System.out.println("number of char: "+ fileArray.length);
            bais = new CharArrayReader(fileArray);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            while((readcount = bais.read(buffer)) != -1) {
                bw.write(buffer,0,readcount);
                bw.flush();
            }

            System.out.println();
            System.out.println("print all content");
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
