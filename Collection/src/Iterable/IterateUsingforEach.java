package Iterable;

import java.util.ArrayList;
import java.util.List;

public class IterateUsingforEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("kul");
        list.add("deep");

        list.forEach((element) -> {System.out.println(element);});

    }
}
