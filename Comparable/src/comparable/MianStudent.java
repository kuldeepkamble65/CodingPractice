package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MianStudent {
    public static void main(String args[]){
        ArrayList studentList = new ArrayList();

        studentList.add(new Student("Sandy", "23UCS12065", 28));
        studentList.add(new Student("Roxy", "23UCS12066", 28));
        studentList.add(new Student("Sunil", "23UCS12067", 27));
        studentList.add(new Student("Munish", "23UCS12068", 27));

        Collections.sort(studentList);

        Iterator iterator=studentList.iterator();
        while(iterator.hasNext()){
            Student student=(Student)iterator.next();
            System.out.println("Name: " + student.getName()+
                    ", " + "RollNo: "+student.getRollNo()+
                    ", Age: "+student.getAge());
        }
    }
}
