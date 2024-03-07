package StaticSychronization;

public class BookThreaterSeats {
    int total_seats = 10;
    synchronized void bookTicket(int seats){
        if(total_seats>=seats){
            System.out.println(seats+" Seat Book successfully");
            total_seats = total_seats-seats;
            System.out.println("seates left "+total_seats);
        }else {
            System.out.println("seats can not be booked");
            System.out.println("seates left "+total_seats);
        }

    }
}
