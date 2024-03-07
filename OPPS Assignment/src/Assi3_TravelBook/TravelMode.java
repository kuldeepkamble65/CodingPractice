package Assi3_TravelBook;

public class TravelMode {
    private String source;
    private String destination;
    private String arrivalTime;
    private String departureTime;

    public TravelMode(String source, String destination, String arrivalTime, String departureTime) {
        this.source = source;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "Source: " + source + "\nDestination: " + destination + "\nArrival Time: " + arrivalTime + "\nDeparture Time: " + departureTime;
    }
}
