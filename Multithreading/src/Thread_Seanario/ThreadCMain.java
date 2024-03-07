package Thread_Seanario;

public class ThreadCMain {
    public static void main(String[] args) {
        ThreadC c = new ThreadC();
        Thread t1 = new Thread(c);
        t1.start();

        Thread t2 = new Thread(c);
        t2.start();

        Thread t3 = new Thread(c);
        t3.start();

        Thread t4 = new Thread(c);
        t4.start();
    }
}
