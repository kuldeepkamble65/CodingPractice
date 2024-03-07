package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store a list of fruits
        ArrayList<String> fruitList = new ArrayList<>();

        // Add fruits to the list
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        fruitList.add("Date");

        // Display the initial list
        System.out.println("Initial List of Fruits:");
        displayFruits(fruitList);

        // Add a fruit at a specific position
        fruitList.add(1, "Grapes");

        // Update a fruit
        fruitList.set(3, "Blueberry");

        // Remove a fruit
        fruitList.remove("Cherry");

        // Check if a fruit is in the list
        boolean containsMango = fruitList.contains("Mango");
        System.out.println("Does the list contain Mango? " + containsMango);

        // Find the index of a fruit
        int indexOfBanana = fruitList.indexOf("Banana");
        System.out.println("Index of Banana: " + indexOfBanana);

        // Iterate and display the list using an Iterator
        System.out.println("\nUpdated List of Fruits:");
        Iterator<String> iterator = fruitList.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }

    public static void displayFruits(ArrayList<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
