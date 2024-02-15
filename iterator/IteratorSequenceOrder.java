package IQ.collectionss.iterator;

import java.util.*;

public class IteratorSequenceOrder {
    public static void main(String[] args) {
        // List Example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("List Iteration Order:");
        iterateAndPrint(list);

        // Set Example
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        System.out.println("\nSet Iteration Order (Unpredictable):");
        iterateAndPrint(set);

        // SortedSet Example
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Cat");
        sortedSet.add("Dog");
        sortedSet.add("Elephant");

        System.out.println("\nSortedSet Iteration Order (Sorted):");
        iterateAndPrint(sortedSet);

        // Map Example
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println("\nMap Iteration Order (Unpredictable):");
        iterateAndPrint(map.keySet());

        // SortedMap Example
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(5, "Five");
        sortedMap.put(2, "Two");
        sortedMap.put(8, "Eight");

        System.out.println("\nSortedMap Iteration Order (Sorted by Key):");
        iterateAndPrint(sortedMap.keySet());
    }

   private static <T> void iterateAndPrint(Collection<T> collection){
        Iterator<T> iterator=collection.iterator();

        while (iterator.hasNext()){
            T element= iterator.next();
            System.out.print(element + " ");
        }
   }
}
