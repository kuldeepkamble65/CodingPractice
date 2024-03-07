package Uncaught_Exceptions;

public class CustomUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Uncaught exception in thread " + t.getName() + ": " + e.getMessage());

    }
}
