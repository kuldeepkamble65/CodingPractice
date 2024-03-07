package Thread_Seanario;

public class ThreadBMain {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        Thread t1 = new Thread(b);
        t1.start();

        Thread t2 = new Thread(b);
        t2.start();

        Thread t3 = new Thread(b);
        t3.start();

        Thread t4 = new Thread(b);
        t4.start();
    }
}
