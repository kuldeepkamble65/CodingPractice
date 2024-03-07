package Encapsulation;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student("kuldeep", 25);

        // Accessing attributes using getters
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        // Modifying attributes using setters
        student.setName("Vaibhav");
        student.setAge(24);

        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());
    }
}
