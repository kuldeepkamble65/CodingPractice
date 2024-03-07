package Upper_LowerBound;

import java.util.ArrayList;
import java.util.List;

public class BoundsExample {

    // Upper bound example
    public static <T extends Number> double sumOfNumbers(List<T> numbers) {
        double sum = 0.0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // Lower bound example
    public static void addIntegers(List<? super Integer> integerList) {
        for (int i = 1; i <= 5; i++) {
            integerList.add(i);
        }
    }

    public static void main(String[] args) {
        // Upper bound example
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        double sum = sumOfNumbers(integers);
        System.out.println("Sum of Integers: " + sum);

        // Lower bound example
        List<Object> objectList = new ArrayList<>();
        addIntegers(objectList);
        System.out.println("List of Integers: " + objectList);
    }
}
