package IQ.collectionss.collectionMethodsImp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection<E> implements Collection<E> {
    private ArrayList<E> elements = new ArrayList<>();

    @Override
    public boolean add(E e) {
        return elements.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return elements.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return elements.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return elements.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return elements.removeAll(c);
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return elements.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return elements.iterator();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return elements.retainAll(c);
    }

    @Override
    public void clear() {

    }

    @Override
    public Object[] toArray() {
        return elements.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return elements.toArray(a);
    }
    @Override
    public String toString() {
        return elements.toString();
    }


    // Other methods from the Collection interface (not explicitly mentioned in the question) can be implemented as needed.

    public static void main(String[] args) {
        MyCollection<Integer> myCollection = new MyCollection<>();

        // Adding elements
        myCollection.add(1);
        myCollection.add(2);
        myCollection.add(3);

        // Printing the collection
        System.out.println("Original Collection: " + myCollection);

        // Removing an element
        myCollection.remove(2);
        System.out.println("Collection after removing 2: " + myCollection);

        // Adding a new collection
        Collection<Integer> anotherCollection = new ArrayList<>();
        anotherCollection.add(4);
        anotherCollection.add(5);
        myCollection.addAll(anotherCollection);
        System.out.println("Collection after adding another collection: " + myCollection);

        // Checking if the collection contains a specific element
        System.out.println("Does the collection contain 3? " + myCollection.contains(3));

        System.out.println("Size of the collection = " + myCollection.size());
        System.out.println("Is the collection empty? "+ myCollection.isEmpty());

        // Iterating over the collection
        System.out.print("Iterating over the collection: ");
        for (Integer element : myCollection) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Clearing the collection
        myCollection.clear();
        System.out.println("Collection after clearing: " + myCollection);

        // Other operations can be performed similarly
    }
}
