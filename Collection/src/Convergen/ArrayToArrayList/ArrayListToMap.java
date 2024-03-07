package Convergen.ArrayToArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListToMap {
    public static void main(String[] args) {
        // Converting ArrayList to Map
        List<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            map.put(i, arrayList.get(i));
        }

        // Printing the Map
        System.out.println("Map: " + map);

        // Converting Map to ArrayList
        List<String> convertedArrayList = new ArrayList<>(map.values());

        // Printing the ArrayList
        System.out.println("Converted ArrayList: " + convertedArrayList);
    }
}
