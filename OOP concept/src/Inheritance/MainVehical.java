package Inheritance;

public class MainVehical {
    public static void main(String[] args) {
        Car myCar = new Car("BMW", "XM", 2023);
        Bike bike = new Bike("Royal Enfield", "Hunter 350", 2023);

        myCar.start();
        myCar.accelerate();
        myCar.drift();
        myCar.stop();
        System.out.println(" ");
        bike.start();
        bike.accelerate();
        bike.wheelie();
        bike.stop();
    }
}
