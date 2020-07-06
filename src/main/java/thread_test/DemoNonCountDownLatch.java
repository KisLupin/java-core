package thread_test;

public class DemoNonCountDownLatch {
    private int count = 2000;

    public void dem() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count--;
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count--;
            }
        });

        thread1.start();
        thread2.start();

//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException ignored) {
//        }

        System.out.println("Count = " + count);
    }
}
