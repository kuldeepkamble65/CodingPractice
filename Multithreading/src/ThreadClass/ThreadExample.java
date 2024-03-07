package ThreadClass;

public class ThreadExample extends Thread {

    public void run(){

        for(int i=0 ; i<5; i++){
            System.out.println("thread are running "+i);
        }
    }

}
