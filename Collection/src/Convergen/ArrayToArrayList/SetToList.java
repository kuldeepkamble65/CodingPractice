package Convergen.ArrayToArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("mango");

        // Convert the Set to a List
        List<String> list = new ArrayList<>(set);


        System.out.println("List elements: " + list);
    }
}
