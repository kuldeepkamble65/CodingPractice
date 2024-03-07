package Abstraction;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public String makeSound(){
        return "bark";
    }
}
