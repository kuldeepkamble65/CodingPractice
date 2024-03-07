package Inheritance;

class Bike extends Vehicle {
    public Bike(String brand, String model, int year) {

        super(brand, model, year);
    }

    public void wheelie() {
        System.out.println("The Bike is doing a wheelie.");
    }
}
