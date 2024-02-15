package IQ.collectionss.FailFast_FailSave;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        Iterator<Integer> itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
          //fail fast throws ConcurrencyModificationException
            list.add(1);
            //itr.remove();

        }
        System.out.println("list after remove method: " + list);

    }
}
