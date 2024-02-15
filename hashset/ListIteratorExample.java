package IQ.collectionss.hashset;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Creating a ListIterator to traverse the list
        ListIterator<String> listIterator = names.listIterator();

        // Using previousIndex() and nextIndex() methods
//        while (listIterator.hasNext()) {
//            String currentName = listIterator.next();
//            int currentIndex = listIterator.previousIndex();  // Index of the previously returned element
//            int nextIndex = listIterator.nextIndex();          // Index of the next element
//
//            System.out.println("Current Name: " + currentName);
//            System.out.println("Current Index: " + currentIndex);
//            System.out.println("Next Index: " + nextIndex);
//            System.out.println();
//        }

        // Forward traversal using next()
        System.out.println("Forward traversal:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Backward traversal using previous()
        System.out.println("\nBackward traversal:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        // Adding and modifying an element while iterating
        System.out.println("\nAdding an element while iterating");
        while (listIterator.hasNext()){
            String currentName= listIterator.next();
            if(currentName.equals("Bob")){
                listIterator.add("David"); // adding
               // listIterator.set("David"); // modifying
            }
        }
        // Printing the modified list
        System.out.println(names);


    }
}