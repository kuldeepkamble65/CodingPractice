package Iterable;

import java.util.ArrayList;
import java.util.List;

public class IterateUsingEnhancedForLoop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); //create list

        //add element
        list.add("abc");
        list.add("def");
        list.add("ghi");
        //Iterating the list

        for(String element : list){
            System.out.println(element);
        }


    }
}
