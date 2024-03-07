package Sychronization_Block;


import Synchronization.example1.BookTicketSeat;

public class TicketBookMain extends Thread{
    static TicketBook b;
    public int seat;
    public void run(){
        b.bookSeat(seat);
    }
    public static void main(String[] args) {
        b = new TicketBook();
        TicketBookMain kuldeep = new TicketBookMain();
        kuldeep.seat=7;
        kuldeep.start();

        TicketBookMain vaibhav = new TicketBookMain();
        vaibhav.seat= 6;
        vaibhav.start();
    }
}
