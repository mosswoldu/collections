package IQ.collectionss.hashMap.concurentHashMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapDemo {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap with an initial concurrency level of 16
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        // Add elements to the map
        concurrentMap.put("one", 1);
        concurrentMap.put("two", 2);
        concurrentMap.put("three", 3);
        concurrentMap.put("five", 0);

        // Iterate through the map using a forEach loop
        System.out.println("Iterating through Concurrent Map:");
        for (Map.Entry<String, Integer> entry : concurrentMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Retrieve and print values using multiple threads
        Runnable readTask = () -> {
            System.out.println(Thread.currentThread().getName() + " - Iterating through all key-value pairs:");
            for (Map.Entry<String, Integer> entry : concurrentMap.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println(key + ": " + value);
            }
        };

        // Create multiple threads to read from the map concurrently
        Thread thread1 = new Thread(readTask);
        Thread thread2 = new Thread(readTask);
        Thread thread3 = new Thread(readTask);
        Thread thread4 = new Thread(readTask);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the map contents
        System.out.println("Concurrent Map Contents: " + concurrentMap);
    }
}


