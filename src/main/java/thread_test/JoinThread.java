package thread_test;

public class JoinThread extends Thread{
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName() + " đang chạy.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Kết thúc " + Thread.currentThread().getName());
    }
}
