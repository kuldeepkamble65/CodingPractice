package SheduledThreadPool;

public class Task1 implements Runnable{
    @Override
    public void run() {
        System.out.println("I am Task 1     "+ System.currentTimeMillis());

    }
}
