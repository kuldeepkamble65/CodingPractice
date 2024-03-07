package ThreadClass;

public class MyThreadMain {
    public static void main(String[] args) throws InterruptedException {
        // Create and start a thread
        MyThread thread1 = new MyThread("Thread 1");
        thread1.start();
        thread1.join(3000);
        System.out.println(thread1.isInterrupted());

        // Create and start another thread
        MyThread thread2 = new MyThread("Thread 2");
        thread2.start();
    }
}
