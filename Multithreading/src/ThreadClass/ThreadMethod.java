package ThreadClass;

public class ThreadMethod extends Thread{
    public ThreadMethod(String name) {
        super(name); // Set the thread's name
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running, count: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
                return; // Terminate the thread when interrupted
            }
        }
        System.out.println(getName() + " has finished.");
    }

}
