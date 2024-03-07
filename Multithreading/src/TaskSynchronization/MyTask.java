package TaskSynchronization;

public class MyTask implements Runnable{
    @Override
    public void run() {
                System.out.println(Thread.currentThread().getName());
        System.out.println("Thread running ");
        System.out.println(Thread.currentThread().getName());
    }
}
