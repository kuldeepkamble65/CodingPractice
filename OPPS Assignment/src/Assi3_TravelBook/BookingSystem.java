package Assi3_TravelBook;

import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    private ArrayList<TravelMode> bookings = new ArrayList<>();

    public void bookTravel(TravelMode travelMode) {
        bookings.add(travelMode);
        System.out.println("Booking successful!");
    }

    public void checkStatus() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
        } else {
            System.out.println("Booked Travel Details:");
            for (TravelMode mode : bookings) {
                System.out.println(mode);
            }
        }
    }

    public void cancel() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings to cancel.");
        } else {
            bookings.remove(bookings.size() - 1);
            System.out.println("Booking canceled successfully.");
        }
    }
    List<String> a = new ArrayList<>();
}
