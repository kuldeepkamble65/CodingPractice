package Thread_Seanario;

public class ThreadAMain {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        Thread t1 = new Thread(a);
        t1.start();

        Thread t2 = new Thread(a);
        t2.start();

        Thread t3 = new Thread(a);
        t3.start();

        Thread t4 = new Thread(a);
        t4.start();
    }
}
