package KeywordAssignment;

import KeywordAssignment.Employee.*;

import java.util.ArrayList;
import java.util.List;

import static KeywordAssignment.Employee.changeLocation;
import static KeywordAssignment.Employee.location;

public class Main {


    public static void main(String[] args) {

        Employee e1 = new Employee("Kuldeep  ");
        Employee e2 = new Employee("Omkar    ");
        Employee e3 = new Employee("Vaibhav  ");
        Employee e4 = new Employee("ram      ");
        Employee e5 = new Employee("ed       ");
        Employee e6 = new Employee("anil     ");
        Employee e7 = new Employee("amar     ");
        Employee e8 = new Employee("kk       ");
        Employee e9 = new Employee("sham     ");
        Employee e10 = new Employee("rohan   ");

        System.out.println(e1.name + " " + location);
        System.out.println(e2.name + " " + location);
        System.out.println(e3.name + " " + location);
        System.out.println(e4.name + " " + location);
        System.out.println(e5.name + " " + location);
        System.out.println(e6.name + " " + location);
        System.out.println(e7.name + " " + location);
        System.out.println(e8.name + " " + location);
        System.out.println(e9.name + " " + location);
        System.out.println(e10.name + " " + location);
        System.out.println("------------------------------------------------------------");
        changeLocation();
        System.out.println("After Changing the location");

        System.out.println(e1.name + " " + location);
        System.out.println(e2.name + " " + location);
        System.out.println(e3.name + " " + location);
        System.out.println(e4.name + " " + location);
        System.out.println(e5.name + " " + location);
        System.out.println(e6.name + " " + location);
        System.out.println(e7.name + " " + location);
        System.out.println(e8.name + " " + location);
        System.out.println(e9.name + " " + location);
        System.out.println(e10.name + " " + location);
    }

}
