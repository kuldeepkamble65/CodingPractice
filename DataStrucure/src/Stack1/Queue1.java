package Stack1;

public class Queue1 {
    public static void main(String[] args) {
        QueueImpl queueExample = new QueueImpl();

//        queueExample.enQueue(42);
//        queueExample.enQueue(17);
//        queueExample.enQueue(18);
//        queueExample.enQueue(19);
//        queueExample.enQueue(10);
        queueExample.display();
        queueExample.deQueue();
        queueExample.display();
        queueExample.peak();
    }
}
