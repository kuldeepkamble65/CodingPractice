package NestedTryBlock;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {1, 2, 3};
            System.out.println("Trying to access an element outside the array bounds:");

            try {
                // Inner try block
                int result = numbers[5] / 0; // This line will cause an ArrayIndexOutOfBoundsException
                System.out.println("Result: " + result); // This line will not be executed
            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            } catch (ArithmeticException e) {

                System.out.println("Caught ArithmeticException: " + e.getMessage());
            }

            System.out.println("This line will be executed even though there was an exception in the inner try block.");
        } catch (Exception e) {
            // Outer catch block, catches any remaining exceptions
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            // Finally block, always executed whether an exception occurred or not
            System.out.println("Finally block - this code always gets executed.");
        }
    }
}

