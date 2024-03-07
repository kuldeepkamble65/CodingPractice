package Comparator;



import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee t1) {
        return employee.getEmpId() - t1.getEmpId();
    }
}
