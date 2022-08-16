import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("usage : java FileCopy file1 file2");
            System.exit(0);
        }

        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader(args[0]);
            fw = new FileWriter(args[1]);
            char[] buffer = new char[512];
            int readCount = 0;
            while((readCount = fr.read(buffer)) != -1) {
                fw.write(buffer, 0, readCount);
            }
            System.out.println("success copying file");
        } catch (Exception ex) {

        } finally {
            try {
                fr.close();
                fw.close();
            } catch (Exception e) {}

        }
    }
}
