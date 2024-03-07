package Convergen.ArrayToArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistToLinkedList {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("cherry");
        arrayList.add("date");

        // Convert the ArrayList to a LinkedList
        LinkedList<String> linkedList = new LinkedList<>(arrayList);


        System.out.println("LinkedList elements: " + linkedList);
    }
}
