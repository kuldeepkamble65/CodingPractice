package Encapsulation;

public class Student {
    private String name; // Encapsulated attribute
    private int age;    // Encapsulated attribute

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name; // Getter method to access the name attribute
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name; // Setter method to modify the name attribute
        }
    }

    public int getAge() {
        return age; // Getter method to access the age attribute
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age; // Setter method to modify the age attribute
        }
    }
}
