package Thread;

public class MythreadMain {
    public static void main(String[] args) {
        MyThread th1 = new MyThread();
        Thread t1 = new Thread(th1);
        t1.setName("Thread-1");
        System.out.println(t1.getName());
        t1.start();

        Thread t2 = new Thread(th1);
        t2.setName("Thread-2");
        System.out.println(t2.getName());
        t2.start();

        Thread t3 = new Thread(th1);
        t3.setName("Thread-3");
        System.out.println(t3.getName());
        t3.start();

        Thread t4 = new Thread(th1);
        t4.setName("Thread-4");
        System.out.println(t4.getName());
        t4.start();
    }

}
