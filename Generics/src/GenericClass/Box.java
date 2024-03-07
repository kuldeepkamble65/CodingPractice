package GenericClass;

// Generic class
public class Box<T> {
    private T value;


    public Box(T value) {
        this.value = value;
    }


    public T getValue() {
        return value;
    }


    public void setValue(T value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Box containing: " + value;
    }

    public static void main(String[] args) {
        // Creating a Box of Integer
        Box<Integer> intBox = new Box<>(42);
        System.out.println("Integer Box: " + intBox);

        // Creating a Box of String
        Box<String> strBox = new Box<>("Hello, Generics!");
        System.out.println("String Box: " + strBox);
    }
}
