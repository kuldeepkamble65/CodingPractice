import java.util.Stack;

public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {15, 7, 20, 9, 14, 11};
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Maximum element in the array: " + max);
    }

    public static class StackofPlatesExample {
        public static void main(String[] args) {
            Stack<String> stackOfPlates = new Stack<>();

            // Push plates onto the stack
            stackOfPlates.push("Plate 1");
            stackOfPlates.push("Plate 2");
            stackOfPlates.push("Plate 3");

            // Peek at the top plate
            String topPlate = stackOfPlates.peek();
            System.out.println("Top Plate: " + topPlate);

            // Pop (remove) the top plate
            String removedPlate = stackOfPlates.pop();
            System.out.println("Removed Plate: " + removedPlate);

            // Peek at the new top plate
            topPlate = stackOfPlates.peek();
            System.out.println("Top Plate: " + topPlate);
        }
    }
}
