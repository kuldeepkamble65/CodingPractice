package ThreadClass;

public class ThreadPriority {

        public static void main(String[] args) {
            Thread thread1 = new Thread(() -> {
                int priority = Thread.currentThread().getPriority();
                System.out.println("Thread 1 priority: " + priority);
            });

            Thread thread2 = new Thread(() -> {
                int priority = Thread.currentThread().getPriority();
                System.out.println("Thread 2 priority: " + priority);
            });

            // Set the priorities of the threads
            thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
            thread2.setPriority(Thread.MAX_PRIORITY); // Priority 10

            // Start the threads
            thread1.start();
            thread2.start();
    }
}
