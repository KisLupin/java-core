package thread_test.syn;

public class Customer {

    private int taiKhoan = 10000;

    public Customer() {
        System.out.println("Tài khoản hiện có = " + taiKhoan);
    }

    public synchronized void rutTien(int soTienRut) {
        System.out.println("Giao dịch rút tiền đang được thực hiện với" +
                " số tiền = " + soTienRut + "...");

        if (taiKhoan < soTienRut) {
            System.out.println("Số tiền trong tài khoản không đủ!");
            try {
                wait(); // phương thức wail sẽ đưa Thread rơi vào trạng thái sleeping
            } catch (InterruptedException ie) {
                System.out.println(ie.toString());
            }
        }

        taiKhoan -= soTienRut;
        System.out.println("Rút tiền thành công. Số tiền hiện có trong tài khoản = " + taiKhoan);
    }

    public synchronized void nopTien(int soTienNop) {
        System.out.println("Giao dịch nộp tiền đang được thực hiện với" +
                " số tiền nộp = " + soTienNop + "...");
        taiKhoan += soTienNop;
        System.out.println("Nộp tiền thành công. Số tiền hiện có trong tài khoản = " + taiKhoan);
        notify();
    }

}