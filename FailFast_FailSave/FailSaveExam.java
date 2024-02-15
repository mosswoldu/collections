package IQ.collectionss.FailFast_FailSave;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSaveExam {
    public static void main(String[] args) {
        //egs of failSAve are CopyOnWriteArrayList,ConcurrentHashMap
        ConcurrentHashMap<Integer,String>map=new ConcurrentHashMap<>();
        map.put(1,"Mike");
        map.put(2,"Alex");
        map.put(3,"Miki");
        map.put(5,"Solo");

        Iterator<Integer> itr= map.keySet().iterator();
        while (itr.hasNext()){
            Integer key=itr.next();
            System.out.println(key + ": " + map.get(key));
            map.put(4,"Ryan");
        }
        System.out.println("Map: " + map);
    }
}
