package ParallelArraySorting;

import java.util.Arrays;

public class ParallelStringArraySorting {
    public static void main(String[] args) {
        // Creating an array of strings
        String[] words = {"apple", "banana", "orange", "grape", "kiwi"};

        // Using parallelSort to sort the array of strings in parallel
        Arrays.parallelSort(words);

        // Printing the sorted array of strings
        System.out.println("Sorted Array: " + Arrays.toString(words));
    }
}
