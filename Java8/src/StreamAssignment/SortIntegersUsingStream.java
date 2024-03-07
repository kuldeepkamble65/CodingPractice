package StreamAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntegersUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3, 7, 4, 6);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("Sorted List: " + sortedNumbers);
    }
}

