package SheduledThreadPool.example2;

public class Task2 implements Runnable {
    @Override
    public void run() {

        System.out.println("Thread name(task 2): " + Thread.currentThread().getName());

    }
}
