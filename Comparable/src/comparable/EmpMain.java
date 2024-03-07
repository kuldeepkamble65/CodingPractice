package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpMain {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("kuldep", "7263925264", 11));
        list.add(new Employee("vaibhav", "3425617263", 8));
        list.add(new Employee("amar", "8263729282", 9));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
