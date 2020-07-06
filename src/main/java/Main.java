import date_test.DateBase;
import exception.InvalidProductException;
import number_test.NumberBase;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        MyThread myThread0 = new MyThread();
//        myThread0.start();  // kích hoạt luồng
//
//        // Tạo ra luồng myThread1 từ lớp MyThread
//        MyThread myThread1 = new MyThread();
//        myThread1.start();
//
//        // Tạo ra luồng myThread2 từ lớp MyThread
//        MyThread myThread2 = new MyThread();
//        myThread2.setName("Luồng 2");   // thay đổi tên luồng thành Luồng 2
//        myThread2.start();

//        DemoThread demoThread0 = new DemoThread();
//        Thread thread0 = new Thread(demoThread0);
//        thread0.start();
//
//        DemoThread demoThread1 = new DemoThread();
//        Thread thread1 = new Thread(demoThread1);
//        thread1.setName("Luồng 1");
//        thread1.start();
//
//        DemoThread demoThread2 = new DemoThread();
//        Thread thread2 = new Thread(demoThread2);
//        thread2.start();

//        ShareThread shareThread = new ShareThread();
//
//        Thread thread0 = new Thread(shareThread);
//        thread0.setName("Luồng 1");
//        thread0.start();
//
//        Thread thread1 = new Thread(shareThread);
//        thread1.setName("Luồng 2");
//        thread1.start();
//
//        Thread thread2 = new Thread(shareThread);
//        thread2.setName("Luồng 3");
//        thread2.start();
//
//        System.out.println("Giá trị thuộc tính shareVariable = " + shareThread.getShareVariable());
//        final Customer customer = new Customer();
//
//        new Thread(() -> customer.rutTien(20000)).start();
//        new Thread(() -> customer.nopTien(30000)).start();
//        DemoSleep t1 = new DemoSleep();
//        t1.start();
//        NoneJoinThread thread1 = new NoneJoinThread();
//        thread1.setName("Thread 1");
//        NoneJoinThread thread2 = new NoneJoinThread();
//        thread2.setName("Thread 2");
//        NoneJoinThread thread3 = new NoneJoinThread();
//        thread3.setName("Thread 3");
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        JoinThread thread1 = new JoinThread();
//        thread1.setName("Thread 1");
//        thread1.start();    // khởi chạy thread 1
//        try {
//            thread1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        JoinThread thread2 = new JoinThread();
//        thread2.setName("Thread 2");
//        thread2.start();    // khởi chạy thread2
//        try {
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        JoinThread thread3 = new JoinThread();
//        thread3.setName("Thread 3");
//        thread3.start();    // khởi chạy thread3
//        try {
//            thread3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        ArrayBlockingQueue<Runnable> hangDoi = new ArrayBlockingQueue<>(100);
//
//        // khi số tiến trình của chúng ta vượt quá maxSize ở đây là 5
//        // ví dụ như đối số thứ nhất = 6
//        // thì tất cả những tiến trình mới mà chúng ta tạo ra sẽ được đưa vào hangDoi
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 12,
//                TimeUnit.SECONDS, hangDoi);
//
//        // dùng vòng lặp for để có thể chạy các Thread
//        for (int i = 0; i < 10; i++) {
//            // trong phương thức execute() thì đối số truyền vào phải là một Runnable
//            // đó là lý do mà lớp RunPool phải implements từ interface Runnable
//            threadPoolExecutor.execute(new RunPool(i));
//
//        ExecutorService pool = Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 10; i++) {
//            pool.submit(new RunPool(i));    // chay ThreadPool, đối số là 1 Runnable
//        }
//
//        try {
//            // thời gian sống của mỗi Thread là 1 ngày (nếu nó chưa thực thi xong)
//            pool.awaitTermination(1, TimeUnit.DAYS);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        pool.shutdown();    // tắt ThreadPool

//        DemoNonCountDownLatch demoNonCountDownLatch = new DemoNonCountDownLatch();
//        demoNonCountDownLatch.dem();
//        DemoCountDownLatch demo = new DemoCountDownLatch();
//        demo.doWork();

//        new FileBase().createAFile();
//        new FileBase().readFile();
//        new FileBase().writeFile("add this content");
//        new FileBase().writeFileWriter("add another content to this file");
//        new FileBase().writeFilePrinter();
//        new FileBase().deleteFile();

        new NumberBase().currencyAndPercent();
    }
}
