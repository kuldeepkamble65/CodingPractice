package ThreadClass;

import java.time.LocalTime;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // Set the thread's name
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running, count: " + i +" time "+ LocalTime.now());
            try {
                sleep(1000); // Sleep for 1 second
                System.out.println(isAlive()+ " is alive");
                stop();
                System.out.println("Hello");
                System.out.println(isAlive()+ " is alive "+getName());
                System.out.println(isAlive()+ " is alive");
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
            }
        }
        System.out.println(getName() + " has finished.");
        System.out.println(isAlive()+ " is alive "+getName());


    }
}
