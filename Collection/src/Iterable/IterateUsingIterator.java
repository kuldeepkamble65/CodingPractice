package Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateUsingIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("abc");
        list.add("def");
        list.add("pqr");

        Iterator<String> iterator =list.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }


}
