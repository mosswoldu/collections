package IQ.collectionss;

public class CustomArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public CustomArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(E element) {
        if (size == elements.length) {
            // If the array is full, create a new larger array and copy elements
            int newCapacity = elements.length + (elements.length / 2);
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        elements[size] = element;
        size++;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }

        if (size == elements.length) {
            // If the array is full, create a new larger array and copy elements
            int newCapacity = elements.length + (elements.length / 2);
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, index);
            System.arraycopy(elements, index, newElements, index + 1, size - index);
            newElements[index] = element;
            elements = newElements;
        } else {
            // Shift elements to the right to make space for the new element
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = element;
        }
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
        return (E) elements[index];
    }

    public int size() {
        return size;
    }
//    public E remove(int index) {
//        checkIndex(index);
//        E removedElement = (E) elements[index];
//
//        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
//        size--;
//
//        // Clear the reference to the removed element
//        elements[size] = null;
//
//        return removedElement;
//    }
public E remove(int index) {
    checkIndex(index);
    E removedElement = (E) elements[index];

    System.arraycopy(elements, index + 1, elements, index, size - index - 1);
    size--;

    // Clear the reference to the removed element
    elements[size] = null;

    // Resize the array if it's less than half full
    if (size < elements.length / 2) {
        resizeArray(elements.length / 2);
    }

    return removedElement;
}

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
    }

    private void resizeArray(int newCapacity) {
        Object[] newElements = new Object[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> arrayList = new CustomArrayList<>();
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(1, 10);
        arrayList.add(2,23);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(5, 10);
        arrayList.add(6,23);
        arrayList.add(1);
        arrayList.add(0);
        arrayList.add(1, 10);
        arrayList.add(2,23);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
           // System.out.println(arrayList.get(11));
           // System.out.println(arrayList.);
        }
        System.out.println("\n"+arrayList.get(11));
        arrayList.remove(1);

        System.out.println("\nArray after removing index 1:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}

