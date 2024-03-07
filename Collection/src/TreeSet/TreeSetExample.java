package TreeSet;

import java.util.TreeSet;

public class TreeSetExample {
        public static void main(String[] args) {
            // Create a TreeSet of Strings
            TreeSet<String> treeSet = new TreeSet<>();

            // Add elements to the TreeSet
            treeSet.add("Apple");
            treeSet.add("Banana");
            treeSet.add("Orange");
            treeSet.add("Grapes");
            treeSet.add("Mango");

            // Duplicate elements are not allowed
            treeSet.add("Apple");

            // Display the TreeSet (sorted order)
            System.out.println("TreeSet elements: " + treeSet);

            // Size of the TreeSet
            System.out.println("Size of TreeSet: " + treeSet.size());

            // Check if an element is present
            boolean containsMango = treeSet.contains("Mango");
            System.out.println("Contains Mango: " + containsMango);

            // Removing an element
            treeSet.remove("Banana");
            System.out.println("After removing Banana: " + treeSet);

            // Iterate over the elements
            System.out.println("Iterating over the TreeSet:");
            for (String fruit : treeSet) {
                System.out.println(fruit);
            }

            // Clear the TreeSet
            treeSet.clear();
            System.out.println("TreeSet after clearing: " + treeSet);
        }

}
