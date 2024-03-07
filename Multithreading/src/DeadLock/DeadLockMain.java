package DeadLock;

public class DeadLockMain {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        DeadLock d1 = new DeadLock(a,b);
        DeadLock d2 = new DeadLock(a,b);

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);

        t1.start();
        t2.start();
    }
}
