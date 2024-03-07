package Abstraction;

public class Animal implements SoundMaker {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }


    @Override
    public String makeSound() {
        return null;
    }
}
