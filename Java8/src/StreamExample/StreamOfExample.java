package StreamExample;

import java.util.stream.Stream;

public class StreamOfExample {
    public static void main(String[] args) {
        // Creating a stream from individual elements
        Stream<String> stringStream = Stream.of("apple", "banana", "orange");

        // Processing the stream (e.g., print each element)
        stringStream.forEach(System.out::println);
    }
}

