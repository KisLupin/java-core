package thread_test;

public class DemoSleep extends Thread{
    public void run() {
        super.run();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Đây là Thread thứ " + i);
            System.out.println("Tạm dừng 5000 milliseconds trước khi chuyển sang Thread tiếp theo");
            if (i == 5) {
                System.out.println("Kết thúc!");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }   // tạm dừng 5000 milliseconds trước khi in ra câu tiếp theo
        }
    }
}
