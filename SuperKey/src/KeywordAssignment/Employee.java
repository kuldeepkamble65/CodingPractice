package KeywordAssignment;

public class Employee {
    public String name;
    public static String location = "nashik";

    public Employee(String name) {
        this.name = name;
    }

    public static void changeLocation() {
        location = "pune";
    }
}
