package SortByComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingWithComparator {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22)
        );

        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .toList();

        System.out.println("Sorted by age (Comparator): " + sortedPeople);
    }
}
