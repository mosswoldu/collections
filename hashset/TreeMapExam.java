package IQ.collectionss.hashset;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {

    //sorts in natural order based in key
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(1100,"Mike");
        map.put(2100,"Adam");
        map.put(1410,"John");
        map.put(14100,"Johni");
        map.put(3100,"Ellen");
        map.put(5990,"Elleni");
        map.put(1300,"Sandra");


        System.out.println(map);
        map.forEach((k,v)-> System.out.println(k + ": " + v));
        System.out.println(map.lastKey());//Returns the last (highest) key currently in this map
        System.out.println(map.firstKey());
        System.out.println(map.lastEntry());
        //Returns a key-value mapping associated with the greatest key in this map, or null if the map is empty.
    Set<Integer> salaryLessThan3000=map.headMap(3000).keySet();
        System.out.println(salaryLessThan3000);
        Set<Integer>salaryGreaterThan3k=map.tailMap(3000).keySet();
        System.out.println("Salary > $3000 = " + salaryGreaterThan3k);

    }
}
