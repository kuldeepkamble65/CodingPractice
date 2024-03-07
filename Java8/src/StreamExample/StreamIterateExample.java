package StreamExample;

import java.util.stream.Stream;

public class StreamIterateExample {
    public static void main(String[] args) {
        // Generating a stream of integers starting from 2, doubling each time, and limiting to 8 elements
        Stream<Integer> integerStream = Stream.iterate(2, n -> n * 2)
                .limit(8);

        // Processing the stream (e.g., print each element)
        integerStream.forEach(System.out::println);
    }
}

