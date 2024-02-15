package IQ.collectionss.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> map=new TreeMap<>(Comparator.reverseOrder());

        map.put("Alex",4300);
        map.put("Wasl",4300);
        map.put("Miller",4300);
        map.put("Nora",4300);
        map.put("Siphora",4300);

        map.forEach((k,v)-> System.out.println(k + ": " + v));

    }
}
