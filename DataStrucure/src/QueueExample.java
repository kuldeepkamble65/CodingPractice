import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Insert elements without checking Queue full or not
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Remove elements without checking Queue empty or not
        int removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        // Insert more elements
        queue.add(4);
        queue.add(5);

        // Remove another element
        removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

    }
}
