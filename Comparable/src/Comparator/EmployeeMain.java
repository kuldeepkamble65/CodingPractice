package Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("kuldep", "7263925264", 11));
        list.add(new Employee("vaibhav", "3425617263", 8));
        list.add(new Employee("amar", "8263729282", 9));

      //  System.out.println(list);

        Collections.sort(list, new IdComparator());

        System.out.println(list);

        List<Employee> list1 =new ArrayList<>(list);
        Collections.sort(list1, new nameComparator());
        System.out.println(list1);
    }
}
