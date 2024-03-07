package Inheritance;

public class Car extends Vehicle {
    public Car(String brand, String model, int year) {

        super(brand, model, year);
    }

    public void drift() {

        System.out.println("The car is drifting.");
    }
}
