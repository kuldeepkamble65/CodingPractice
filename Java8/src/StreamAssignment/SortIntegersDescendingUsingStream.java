package StreamAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntegersDescendingUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3, 7, 4, 6);

        List<Integer> sortedDescendingNumbers = numbers.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("Sorted Descending List: " + sortedDescendingNumbers);
    }
}

