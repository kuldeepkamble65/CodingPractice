package Wait_Notify;

public class MBookApp {
    public static void main(String[] args) throws InterruptedException{
        TotalEarnings t1 = new TotalEarnings();
        t1.start();
    synchronized (t1){
        t1.wait();
        System.out.println("Total earnings : "+t1.total+ " Rs");
    }

    }
}
