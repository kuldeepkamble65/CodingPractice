package StreamAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 9, 1);

        // Using streams to find duplicate elements
        List<Integer> duplicateElements = numbers.stream()
                .collect(Collectors.groupingBy(i -> i))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("Duplicate Elements: " + duplicateElements);
    }
}
