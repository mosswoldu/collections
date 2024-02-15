package IQ.collectionss.collectionsSynchronizedMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayListDemo {
    public static void main(String[] args) {

        List<Integer> originalList = new ArrayList<>();// non-synchronized ArrayList

        // Wrapping the original list to make it synchronized
        List<Integer> synchronizedList = Collections.synchronizedList(originalList);

        // Creating and starting multiple threads to modify the list concurrently
        Thread writerThread1 = new Thread(new ListWriter(synchronizedList, 1));
        Thread writerThread2 = new Thread(new ListWriter(synchronizedList, 2));

        writerThread1.start();
        writerThread2.start();

        // Creating a thread to iterate over the list
        Thread readerThread = new Thread(new ListReader(synchronizedList));
        readerThread.start();
    }
}

class ListWriter implements Runnable {
    private List<Integer> list;
    private int id;

    public ListWriter(List<Integer> list, int id) {
        this.list = list;
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int value = id * 10 + i;
            list.add(value);
            System.out.println("Thread " + id + " added: " + value);
            try {
                Thread.sleep(100); // Simulating some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ListReader implements Runnable {
    private List<Integer> list;

    public ListReader(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        // Iterating over the synchronized list
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("Thread Reader read: " + value);
        }
    }
}

