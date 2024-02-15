package IQ.collectionss.hashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Create a LinkedHashSet to maintain insertion order
        LinkedHashSet<String> namesSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        namesSet.add("Alice");
        namesSet.add("Bob");
        namesSet.add("Charlie");
        namesSet.add("David");
        namesSet.add("Alice");

        System.out.println("LinkedHashSet contains: " + namesSet);
        for(String name:namesSet){
            System.out.print(name + " ");
        }
    }
}
