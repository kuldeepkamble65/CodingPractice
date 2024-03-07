package DeadLock;

public class ClassA {
    public synchronized void first(ClassB b) {
        System.out.println("thread 1 starts execution of first() method");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e) {}
        System.out.println("Thread 1 trying to call ClassB.last()");
        b.last();
    }

    public synchronized void last() {
        System.out.println("inside classA, this is last method");
    }
}
