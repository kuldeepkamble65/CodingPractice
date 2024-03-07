package StaticSychronization;

public class BookThreaterMain {
    public static void main(String[] args) {
        BookThreaterSeats b1 = new BookThreaterSeats();
        MyThread1 thread1 = new MyThread1(b1, 7);
        thread1.start();

        MyThread2 thread2 = new MyThread2(b1, 6);
        thread2.start();

        //-------------------------
        BookThreaterSeats b2 = new BookThreaterSeats();
        MyThread1 thread3 = new MyThread1(b2, 7);
        thread3.start();

        MyThread2 thread4 = new MyThread2(b1, 6);
        thread4.start();
    }
}
