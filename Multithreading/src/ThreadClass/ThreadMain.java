package ThreadClass;

public class ThreadMain {
    public static void main(String[] args) {
        // Create and start a thread
        ThreadMethod thread = new ThreadMethod("Thread 1");
        thread.start();

        try {
            // Sleep for 3 seconds in the main thread
            Thread.sleep(3000);

            // Interrupt the thread after 3 seconds
            thread.interrupt();

            // Wait for the thread to complete
            thread.join();

            // Check if the thread is alive
            if (thread.isAlive()) {
                System.out.println("Thread is still alive.");
            } else {
                System.out.println("Thread has completed.");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
