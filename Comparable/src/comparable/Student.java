package comparable;

public class Student implements Comparable{
    private String name;
    private String rollNo;
    private int age;

    //no-argument constructor
    public Student(){

    }

    //argument cnstructor
    public Student(String name, String rollNo, int age){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //Method for sorting logic
    public int compareTo(Object obj){
        Student student=(Student)obj;
        return (this.name).compareTo(student.name);
    }

}
