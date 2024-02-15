package IQ.collectionss.concurrentHashmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        concurrentMap.put("One", 1);
        concurrentMap.put("Two", 2);
        concurrentMap.put("Three", 3);


        // Print the contents of the map
        System.out.println("Initial ConcurrentHashMap: " + concurrentMap);

        // Perform operations atomically
        concurrentMap.putIfAbsent("Four", 4);
        concurrentMap.put("Five",5);
        concurrentMap.putIfAbsent("Two",234);
        concurrentMap.compute("Three", (key, value) -> value * 10); // Multiply the value for key "Three" by 10
        concurrentMap.merge("Two", 10, Integer::sum); // Add 10 to the value for key "Two"
        concurrentMap.compute("Five",(key,value)->value*12);

        // Print the modified map
        System.out.println("Modified ConcurrentHashMap: " + concurrentMap);

        // Iterate over the map entries
        System.out.println("Iterating over ConcurrentHashMap entries:");

        //iterators returned by ConcurrentHashMap are fail-safe and never
        //throw ConcurrentModificationException
        //concurrentMap.forEach((key, value) -> System.out.println(key + ": " + value));
        concurrentMap.forEach((k,v)-> System.out.println(k + ": " + v));

        // Remove a key-value pair
        concurrentMap.remove("Two");
      //  concurrentMap.put(null,77);
        //concurrentMap.put("Ten",null);

        // Print the final state of the map
        System.out.println("Final ConcurrentHashMap: " + concurrentMap);
    }
}

