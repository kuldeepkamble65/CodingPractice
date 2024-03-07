package ExecutorService.FixedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        // Create an ExecutorService with a fixed pool of 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit tasks to the ExecutorService
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executorService.submit(new MyTask(taskId));
        }

        // Shutdown the ExecutorService to stop accepting new tasks
        executorService.shutdown();
    }
}
