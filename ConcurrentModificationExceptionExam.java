package IQ.collectionss;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionExam {

public static void main(String[]args) {
    List<Integer> numbers=new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(3);
    System.out.println("List of numbers= " + numbers);

    // Create an iterator
    Iterator<Integer> iterator=numbers.iterator();

    // Try to remove an element while iterating
    try{
        while(iterator.hasNext()){
            Integer number=iterator.next();
            if(number==5){
                numbers.remove(number); // This will throw ConcurrentModificationException
            }
        }
    }catch(ConcurrentModificationException e){
        System.out.println("ConcurrentModificationException caught!");
    }
    System.out.println("Numbers after Collection.remove() method : " + numbers);
}
}