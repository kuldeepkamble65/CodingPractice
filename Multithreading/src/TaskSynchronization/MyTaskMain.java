package TaskSynchronization;

public class MyTaskMain {
    public static void main(String[] args) {
        MyTask obj1 = new MyTask();
        MyTask obj2 = new MyTask();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
