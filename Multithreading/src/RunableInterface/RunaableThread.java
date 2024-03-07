package RunableInterface;

public class RunaableThread implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread are running "+i);
        }
    }
}
