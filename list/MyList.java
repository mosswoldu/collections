package IQ.collectionss.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class MyList<E> extends ArrayList<E> {

    // Additional methods specific to the List interface

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return super.addAll(index, c);
    }

    @Override
    public E get(int index) {
        return super.get(index);
    }

    @Override
    public E set(int index, E element) {
        return super.set(index, element);
    }

    @Override
    public void add(int index, E element) {
        super.add(index, element);
    }

    @Override
    public E remove(int index) {
        return super.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    @Override
    public ListIterator<E> listIterator() {
        return super.listIterator();
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return super.subList(fromIndex, toIndex);
    }

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        // Adding elements
        myList.add(1);
        myList.add(2);
        myList.add(3);

        // Printing the list
        System.out.println("Original List: " + myList);

        // Adding a new collection at a specific index
        Collection<Integer> additionalCollection = new ArrayList<>();
        additionalCollection.add(9);
        additionalCollection.add(5);
        myList.addAll(1, additionalCollection);
        System.out.println("List after adding a collection at index 1: " + myList);

        // Getting an element at a specific index
        System.out.println("Element at index 2: " + myList.get(2));

        // Setting an element at a specific index
        myList.set(0,23);
        System.out.println("List after setting element at index 0 to 10: " + myList);

        // Removing an element at a specific index
        myList.remove(2);
        System.out.println("List after removing element at index 2: " + myList);

        // Getting the index of an element
        System.out.println("Index of 5: " + myList.indexOf(5));

        // Creating a sublist
        List<Integer> subList = myList.subList(1, 3);
        System.out.println("Sublist from index 1 to 3: " + subList);
    }
}
