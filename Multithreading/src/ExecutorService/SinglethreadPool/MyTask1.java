package ExecutorService.SinglethreadPool;

public class MyTask1 implements Runnable{
    private int taskId;

    public MyTask1(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " executed by thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Task " + taskId + " executed by thread: " + Thread.currentThread().getName());
    }

}
