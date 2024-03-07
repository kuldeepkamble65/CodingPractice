package Synchronization.example1;

public class BookTicketSeat {
    int total_Seat = 10;
    synchronized void  bookSeat(int seat){
        if(total_Seat>=seat){

            System.out.println(seat+" Seat Book succesfully");
            total_Seat = total_Seat-seat;
            System.out.println("Seats left "+total_Seat);
        }else{
            System.out.println("seat cannot be booked");
            System.out.println("seats left "+total_Seat);
        }
    }
}
