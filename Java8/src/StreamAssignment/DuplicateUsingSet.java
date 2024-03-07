package StreamAssignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateUsingSet {

    public static void main(String[] args) {

        // 3, 4, 9
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);

        Set<Integer> items = new HashSet<>();
        Set<Integer> result = list.stream()
                .filter(n -> !items.add(n))
                .collect(Collectors.toSet());

        System.out.println(result);
    }
}
