package Uncaught_Exceptions;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            // Code that may throw an exception
            throw new RuntimeException("An unhandled exception occurred.");
        } catch (Exception e) {
            // Handle the exception if needed
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}
