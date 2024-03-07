package Thread_Seanario;

public class ThreadC implements Runnable{
    @Override
    public void run() {
            synchronized (this){
                int i=0;
                i++;
                System.out.println("value of i "+i);
            }
    }
}
