package Assi3_TravelBook;

import java.util.Scanner;

public class MainTravel {
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\nTravel Booking System Menu");
            System.out.println("1. Book Travel");
            System.out.println("2. Check Status");
            System.out.println("3. Cancel");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter source: ");
                    String source = scanner.nextLine();
                    System.out.print("Enter destination: ");
                    String destination = scanner.nextLine();
                    System.out.print("Enter arrival time: ");
                    String arrivalTime = scanner.nextLine();
                    System.out.print("Enter departure time: ");
                    String departureTime = scanner.nextLine();
                    System.out.print("Enter travel mode (Bus/Train/Flight): ");
                    String mode = scanner.nextLine();

                    if ("Bus".equalsIgnoreCase(mode)) {
                        bookingSystem.bookTravel(new Bus(source, destination, arrivalTime, departureTime));
                    } else if ("Train".equalsIgnoreCase(mode)) {
                        bookingSystem.bookTravel(new Train(source, destination, arrivalTime, departureTime));
                    } else if ("Flight".equalsIgnoreCase(mode)) {
                        System.out.print("Enter flight number: ");
                        String flightNumber = scanner.nextLine();
                        bookingSystem.bookTravel(new Flight(flightNumber, source, destination, arrivalTime, departureTime));
                    } else {
                        System.out.println("Invalid travel mode.");
                    }
                    break;

                case 2:
                    bookingSystem.checkStatus();
                    break;

                case 3:
                    bookingSystem.cancel();
                    break;

                case 4:
                    System.out.println("Exiting Travel Booking System.");
                    System.exit(0);
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
