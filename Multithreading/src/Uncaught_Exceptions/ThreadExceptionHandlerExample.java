package Uncaught_Exceptions;

public class ThreadExceptionHandlerExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());

        // Set the custom uncaught exception handler
        thread.setUncaughtExceptionHandler(new CustomUncaughtExceptionHandler());

        thread.start();
    }
}
