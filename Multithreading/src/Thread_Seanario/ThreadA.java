package Thread_Seanario;

import StaticSychronization.MyThread1;

public class ThreadA implements Runnable {
    // senario 1
//    int i=0;
//
//    @Override
//    synchronized public void run() {
//        i++;
//        System.out.println("value of i "+i);
//    }

    // senario 2

    int i=0;


    @Override
    public void run() {
       synchronized (this){
           i++;
           System.out.println(i);

           Print p = new Print(i);

          // System.out.println("Synchronized with i"+ T1.currentThread().getName());
           p.print(i);
          // Print p1 = new Print();
           System.out.println("Without passing i");
           p.print();


       }
    }
}
