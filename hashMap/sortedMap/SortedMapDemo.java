package IQ.collectionss.hashMap.sortedMap;

import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {
        // Creating a TreeMap (implements SortedMap)
        SortedMap<String, Integer> sortedMap = new TreeMap<>();

        // Adding elements
        sortedMap.put("Three", 3);
        sortedMap.put("One", 1);
        sortedMap.put("Four", 4);
        sortedMap.put("Two", 2);
        sortedMap.put("Aab", 2);
        System.out.println(sortedMap);
        // Iterating over elements (sorted order)
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

