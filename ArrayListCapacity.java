package IQ.collectionss;

public class ArrayListCapacity {

    public static void main(String[] args) {
        int oldCapacity=10;
        int newCapacity=oldCapacity + (oldCapacity >> 1); //bitwise right shift operation
        System.out.println(newCapacity);
    }
}
