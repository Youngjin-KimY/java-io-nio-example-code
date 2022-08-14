public class Tester {
    public static void main(String[] args) throws InterruptedException {
        //queue 생성
        Queue queue = JobQueue.getInstance();

        Thread c1 = new Thread(new Consumer(queue,"1"));
        Thread c2 = new Thread(new Consumer(queue, "2"));
        Thread c3 = new Thread(new Consumer(queue, "3"));

        c1.start();
        c2.start();
        c3.start();

//        Thread pro = new Thread(new Producer(queue));
//
//        pro.start();

//        Thread.sleep(500);
//
//        pro.interrupt();

        Thread.sleep(5000);

        c1.interrupt();
        c2.interrupt();
        c3.interrupt();
    }
}
