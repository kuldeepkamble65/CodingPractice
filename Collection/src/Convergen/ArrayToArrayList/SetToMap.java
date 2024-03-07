package Convergen.ArrayToArrayList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetToMap {
    public static void main(String[] args) {
        // Create a Map with key-value pairs
        Map<String, Integer> keyValueMap = new HashMap<>();
        keyValueMap.put("Alice", 28);
        keyValueMap.put("Bob", 35);
        keyValueMap.put("Carol", 42);

        // Convert the Map keys to a Set
        Set<String> keySet = keyValueMap.keySet();

        // Convert the Map values to a Set
        Set<Integer> valueSet = new HashSet<>(keyValueMap.values());

        // Print the key and value sets
        System.out.println("Key Set: " + keySet);
        System.out.println("Value Set: " + valueSet);
    }
}


