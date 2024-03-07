public class Car {
    private Engine engine;
    private Wheels wheels;

    public Car() {

        this.engine = new Engine(); // Composition: Car has an Engine
        this.wheels = new Wheels(); // Composition: Car has Wheels
    }

    public void startCar() {
        engine.start(); // Delegating the start action to the Engine
    }

    public void drive() {
        wheels.rotate(); // Delegating the rotation to the Wheels
    }
}
