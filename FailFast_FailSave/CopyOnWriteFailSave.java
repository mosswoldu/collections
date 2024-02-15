package IQ.collectionss.FailFast_FailSave;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteFailSave {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();

        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        Iterator<Integer> itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            list.add(5);
            list.add(9);
            list.add(12);
           // list.remove(4);
        }
        list.add(8);
        System.out.println("list: " + list);
        System.out.println(list.indexOf(8));

    }
}
