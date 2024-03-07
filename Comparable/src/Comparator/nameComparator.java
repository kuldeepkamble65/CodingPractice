package Comparator;

import java.util.Comparator;

public class nameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee,Employee t1) {
        return employee.getName().compareTo(t1.getName());
    }
}
