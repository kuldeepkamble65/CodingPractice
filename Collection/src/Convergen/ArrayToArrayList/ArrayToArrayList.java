package Convergen.ArrayToArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date"};
        List<String> list = Arrays.asList(arr);

        ArrayList<String> arrayList = new ArrayList<>(list);

        System.out.println(arrayList);
    }
}
