package Synchronization.example1;

public class MovieBookApp extends Thread{
    static BookTicketSeat b;
    public int seat;
    public void run(){
        b.bookSeat(seat);
    }
    public static void main(String[] args) {
        b = new BookTicketSeat();
        MovieBookApp kuldeep = new MovieBookApp();
        kuldeep.seat=7;
        kuldeep.start();

        MovieBookApp vaibhav = new MovieBookApp();
        vaibhav.seat= 6;
        vaibhav.start();
    }
}
