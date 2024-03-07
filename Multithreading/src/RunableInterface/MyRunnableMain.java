package RunableInterface;

public class MyRunnableMain {
    public static void main(String[] args) {
        // Create and start a thread
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        thread1.start();

        // Create and start another thread
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        thread2.start();
    }
}
