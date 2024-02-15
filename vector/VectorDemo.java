package IQ.collectionss.vector;

import java.util.Vector;

public class VectorDemo{
    public static void main(String[] args) {
        // Creating a Vector of integers
        Vector<Integer> vector = new Vector<>();

        // Adding elements to the vector
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        // Accessing elements by index
        System.out.println("Element at index 1: " + vector.get(1));

        // Size of the vector
        System.out.println("Size of the vector: " + vector.size());

        // Iterating through the vector
        System.out.print("Vector elements: ");
        for (Integer element : vector) {
            System.out.print(element + " ");
        }
        vector.remove(2);
        System.out.println();
        System.out.println(vector.toString());
    }
}
