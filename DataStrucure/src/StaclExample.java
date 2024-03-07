import java.util.Stack;

public class StaclExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Print the stack
        System.out.println("Stack after pushing elements: " + stack);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Get the top element without removing it (peek)
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Pop an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Print the updated stack
        System.out.println("Stack after popping one element: " + stack);

        // Get the size of the stack
        int stackSize = stack.size();
        System.out.println("Stack size: " + stackSize);
    }
}
