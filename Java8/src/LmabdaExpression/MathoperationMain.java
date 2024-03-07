package LmabdaExpression;

public class MathoperationMain {
    public static void main(String[] args) {
        // Lambda expression for addition
        MathOperation addition = (a, b) -> a + b;

        // Using the lambda expression
        int result = addition.operate(5, 3);
        System.out.println("Result of addition: " + result);
    }
}
