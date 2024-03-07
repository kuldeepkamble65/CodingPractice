package Sychronization_Block;

public class TicketBook {
    int total_Seat = 10;
     void  bookSeat(int seat){
         System.out.println("hi : "+Thread.currentThread().getName());
         System.out.println("hi : "+Thread.currentThread().getName());
         System.out.println("hi : "+Thread.currentThread().getName());
         System.out.println("hi : "+Thread.currentThread().getName());
         System.out.println("hi : "+Thread.currentThread().getName());

       synchronized (this){
           if(total_Seat>=seat){

               System.out.println(seat+" Seat Book successfully");
               total_Seat = total_Seat-seat;
               System.out.println("Seats left "+total_Seat);
           }else{
               System.out.println("seat cannot be booked");
               System.out.println("seats left "+total_Seat);
           }
       }
         System.out.println("hi : "+Thread.currentThread().getName());
         System.out.println("hi : "+Thread.currentThread().getName());
         System.out.println("hi : "+Thread.currentThread().getName());
         System.out.println("hi : "+Thread.currentThread().getName());
         System.out.println("hi : "+Thread.currentThread().getName());
    }
}
