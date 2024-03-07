package StaticSychronization;

public class MyThread1 extends Thread{
    BookThreaterSeats b;
    int seats;
    MyThread1(BookThreaterSeats b, int seats){
        this.b=b;
        this.seats=seats;
    }
    public void run(){
        b.bookTicket(seats);
    }
}

class MyThread2 extends Thread{
    BookThreaterSeats b;
    int seats;
    MyThread2(BookThreaterSeats b, int seats){
        this.b=b;
        this.seats=seats;
    }
    public void run(){
        b.bookTicket(seats);
    }
}