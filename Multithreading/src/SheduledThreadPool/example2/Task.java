package SheduledThreadPool.example2;

public class Task implements Runnable {
    @Override
    public void run() {

        System.out.println("Thread name(task 1): " + Thread.currentThread().getName());

    }
}
