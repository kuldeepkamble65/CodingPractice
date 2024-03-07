package Thread_Seanario;

public class ThreadB implements Runnable{
    static int i=0;
    @Override
    public void run() {
      synchronized (ThreadB.class){
          i++;
          System.out.println("value of i "+i);
      }

    }
}
