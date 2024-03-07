package Convergen.ArrayToArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayListToHashSet {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("cherry");
        arrayList.add("date");

        // Convert the ArrayList to a HashSet
        HashSet<String> hashSet = new HashSet<>(arrayList);


        System.out.println("HashSet elements: " + hashSet);
    }
}
