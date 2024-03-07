package Future;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        // Simulate a time-consuming computation
        Thread.sleep(2000);

        // Return a result
        return 42;
    }
}