import java.io.File;
import java.io.IOException;

public class TempFile {
    public static void main(String[] args) {
        try {
            File f = File.createTempFile("tmp_","");
            System.out.println("60초 동안 프로그램이 멈춰있습니다.");
            System.out.println(f.getAbsolutePath());
            try {
                System.out.println(Thread.currentThread());
                Thread.sleep(60000);
            } catch (InterruptedException e1) {
                System.out.println(e1);
            }
            f.deleteOnExit();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

class t implements Runnable {
    @Override
    public void run() {
        System.out.println("hi");
    }
}