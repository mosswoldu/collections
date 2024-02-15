package IQ.collectionss.FailFast_FailSave;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo2 {
    public static void main(String[] args) {
        // Using CopyOnWriteArrayList for fail-safe behavior
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        Iterator<Integer> iterator = list.iterator();

        // Modifying the list while iterating
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println("Element: " + element);

            // Modifying the list (this won't affect the ongoing iteration)
            list.add(5);


             //list.remove(element);
            // Uncommenting the next line will throw UnsupportedOperationException
            // iterator.remove();
        }

        System.out.println("List after modification: " + list);
    }
}

