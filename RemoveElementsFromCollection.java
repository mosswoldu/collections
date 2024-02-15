package IQ.collectionss;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class RemoveElementsFromCollection {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(7);

        // Use ListIterator to efficiently remove elements while iterating
        ListIterator<Integer> iter = myList.listIterator();
        while (iter.hasNext()) {
            int element = iter.next();
            if (element % 2 == 0) {
                iter.remove(); // Efficiently remove the element from the list
            }
        }

        // Print the modified list after removal
        System.out.println("List after removing even elements:");
        for (int num : myList) {
            System.out.print(num + ",");  // result will be  1,3,5,
        }
        // Print the modified list after removal
        System.out.print("\n List after removing even elements: ");
        boolean firstElementPrinted = false;
        for (int num : myList) {
            if (firstElementPrinted) {
                System.out.print(",");
            } else {
                firstElementPrinted = true;
            }
            System.out.print(num);
        }
    }
    }


