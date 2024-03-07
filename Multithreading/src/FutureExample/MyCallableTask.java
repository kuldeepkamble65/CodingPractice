package FutureExample;

import java.util.concurrent.Callable;

public class MyCallableTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(3000);
        return "Task completed";
    }
}
