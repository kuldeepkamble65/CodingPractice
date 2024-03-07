package comparable;

public class Employee implements Comparable{
    private String name;
    private String phoNo;
    private int empId;

    public Employee(String name, String phoNo, int empId) {
        this.name = name;
        this.phoNo = phoNo;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoNo() {
        return phoNo;
    }

    public void setPhoNo(String phoNo) {
        this.phoNo = phoNo;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phoNo='" + phoNo + '\'' +
                ", empId=" + empId +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee employee =(Employee) o;
        return this.name.compareTo(employee.name);
    }
}
