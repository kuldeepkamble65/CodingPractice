package Abstraction;

public class MainAnimal {
    public static void main(String[] args) {
        Animal a1 = new Cat("munny");
        Animal a2 = new Dog("tomy");

        System.out.println("Animal: " + a1.getName());
        System.out.println("Sound: " + ((SoundMaker) a1).makeSound());

        System.out.println();

        System.out.println("Animal: " + a2.getName());
        System.out.println("Sound: " + ((SoundMaker) a2).makeSound());

    }
}
