package MethodReference;

import java.util.function.Function;

public class MethodReferenceExample {
    public static void main(String[] args) {
        // Lambda expression
        Function<Integer, String> lambda = (x) -> String.valueOf(x);

        // Method reference
        Function<Integer, String> reference = String::valueOf;

        // Test with lambda expression
        String resultFromLambda = lambda.apply(123);
        System.out.println("Result from Lambda: " + resultFromLambda);

        // Test with method reference
        String resultFromReference = reference.apply(456);
        System.out.println("Result from Method Reference: " + resultFromReference);
    }
}

