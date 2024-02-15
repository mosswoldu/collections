package IQ.collectionss.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet to store strings
        //contains unique values only, no keys
        Set<String> namesSet = new HashSet<>();

        // Adding elements to the HashSet
        namesSet.add("Alice");
        namesSet.add("Bob");
        namesSet.add("Charlie");
        namesSet.add("David");
        namesSet.add("Alice"); // Adding a duplicate, which will be ignored

        System.out.print("HashSet contains: " + namesSet +"\n");

        // Checking if an element exists in the HashSet
        System.out.println("Does the HashSet contain 'Bob'? " + namesSet.contains("Bob"));

        // Removing an element from the HashSet
        namesSet.remove("Charlie");
        System.out.println("HashSet after removing 'Charlie': " + namesSet);

        // Iterating over the HashSet
        System.out.print("Iterating over the HashSet:");
        for (String name : namesSet) {
            System.out.print(name + " ");
        }
        System.out.print("\nUsing the iterator() method: ");
        Iterator<String> iterator= namesSet.iterator();
        while (iterator.hasNext()){
            String name= iterator.next();
            System.out.print( name + " ");
        }

        // Getting the size of the HashSet
        System.out.println("\nSize of the HashSet: " + namesSet.size());

        // Clearing the HashSet
        namesSet.clear();
        System.out.println("HashSet after clearing: " + namesSet);
        System.out.println(namesSet.isEmpty());


        //decending order

    }
}
