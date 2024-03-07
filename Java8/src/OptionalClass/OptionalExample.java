package OptionalClass;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Creating an Optional with a non-null value
        Optional<String> nonNullOptional = Optional.of("Hello, Optional!");

        // Creating an empty Optional
        Optional<String> emptyOptional = Optional.empty();

        // Checking if a value is present
        if (nonNullOptional.isPresent()) {
            System.out.println("Value is present: " + nonNullOptional.get());
        } else {
            System.out.println("Value is not present");
        }

        // Conditional action if a value is present
        nonNullOptional.ifPresent(value -> System.out.println("Action with the value: " + value));

        // Default value if the Optional is empty
        String result = emptyOptional.orElse("Default Value");
        System.out.println("Result: " + result);

        // Handling with a custom action if the Optional is empty
        emptyOptional.ifPresentOrElse(
                value -> System.out.println("Value is present: " + value),
                () -> System.out.println("Value is not present, handling with a custom action")
        );
    }
}

