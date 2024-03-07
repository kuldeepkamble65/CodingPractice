package StreamExample;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
    public static void main(String[] args) {
        // Create an array
        String[] array = {"apple", "banana", "orange"};

        // Convert array to stream
        Stream<String> stream = Arrays.stream(array);

        // Process the stream (e.g., print each element)
        stream.forEach(System.out::println);
    }
}

