package Assi3_TravelBook;

public class Flight extends TravelMode{
    private String flightNumber;

    public Flight(String flightNumber, String source, String destination, String arrivalTime, String departureTime) {
        super(source, destination, arrivalTime, departureTime);
        this.flightNumber = flightNumber;
    }
    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String toString() {
        return "Flight Number: " + flightNumber + "\n" + super.toString();
    }
}
