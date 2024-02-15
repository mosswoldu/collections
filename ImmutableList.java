package IQ.collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {

        List<String> myList= new ArrayList<>();
        myList.add("Mike");
        myList.add("Tome");
        myList.add("Sam");

        System.out.println(myList);

        myList= Collections.unmodifiableList(myList); // will be immutable
       // myList.add("Ali");  //Throws unsupportedOperationException
        //System.out.println(myList);
        try {
            myList.add("Ali");
            System.out.println(myList);
        }catch (Exception e){
            System.out.println("Exception thrown" );
        }
//        List<String> list= Collections.unmodifiableList(myList);
//        myList.add("Jack");
//        System.out.println(list);
    }

}
