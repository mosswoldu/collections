package IQ.collectionss.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        // Example with ArrayList
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Watermelon");

        // Creating ListIterator
        ListIterator<String> listIterator = list.listIterator();

        System.out.println("Forward Traversal:");
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.print(element + " ");
        }

        System.out.println("\nBackward Traversal:");
        while(listIterator.hasPrevious()){
            String strr= listIterator.previous();
            System.out.print(strr + " ");
        }

        // Using additional ListIterator methods
        listIterator = list.listIterator();
        System.out.println("\n==============");

        // Adding an element in front of the element returned by next() and after the
        // element returned by next()
        listIterator.next();
        listIterator.add("Grapes");
        /*
        Adds the element "Grapes" in front of the element returned by the last call to next()
        (which is the first element in the list).
         */
        listIterator.add("Peach");
        System.out.println(list);
        System.out.println("\n==============");
        // Modifying an element
        listIterator.next();
        listIterator.set("Mango");


        System.out.println("\nList after modifications:");
        System.out.println(list);
        listIterator.remove();
        System.out.println("\nList after remove():" + list);
    }
}

