package ThreadClass;

import java.time.LocalTime;

public class IntrruptExample extends Thread{
    public void run(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println(i+" Time "+ LocalTime.now());
               Thread.sleep(3000);
            }
        }catch(Exception e){
            System.out.println("Thread interrupted : -"+e);

        }
    }

    public static void main(String[] args) {
        IntrruptExample intrruptExample=new IntrruptExample();
        intrruptExample.start();
    //    intrruptExample.interrupt();
    }
}
