package Stack_Assignment;

import java.util.Scanner;
import java.util.Stack;

public class StackOperation {
    public int size;
    public int top;
    public int[] stackArray;

    public StackOperation(int size) {
        this.size = size;
        stackArray = new int[size];
        top = -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackOperation stack = new StackOperation(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack:");
        stack.printStack();

        System.out.println("Top Element: " + stack.peek());


        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);


        System.out.println("Stack after increasing size and pushing more elements:");
        stack.printStack();

    }

    public void pushExtra(int value) {
        if (top == size - 1) {
            int newSize = size * 2;
            int[] newArray = new int[newSize];
            for (int i = 0; i <= top; i++) {
                newArray[i] = stackArray[i];
            }
            stackArray = newArray;
            size = newSize;
        }
        stackArray[++top] = value;
    }

    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public void push(int value) {
        if (top < size - 1) {
            stackArray[++top] = value;
        } else {
            pushExtra(value);
        }
    }

    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
    }
}
