package IQ.collectionss.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> al=new ArrayList<>();
        al.add("Banana");
        al.add("Lemon");
        al.add("Orange");

        Iterator<String>itr=al.iterator();

        while (itr.hasNext()){
            String str= itr.next();
            System.out.println(str);
        }
        al.remove("Orange");
        System.out.println(al);

        // Example with removing elements using Iterator's remove() method
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);

        Iterator<Integer> numb = numbers.iterator();

        while ( numb.hasNext()) {
            int num = numb.next();
            System.out.println("Original: " + num);

            if (num % 2 == 0) { // Remove even numbers using Iterator's remove() method
                numb.remove();
            }
        }
        System.out.println("List after removing even numbers: " + numbers);

    }
}
