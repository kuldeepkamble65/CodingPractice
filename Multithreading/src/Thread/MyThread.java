package Thread;

public class MyThread implements Runnable{
 int a=10;
 int i=0;
    @Override
    public void run() {
        i++;
        System.out.println("Starting the thread" );
        int sum = a+i;
        System.out.println("sum is "+sum);
    }
}
