package JavaPractice;

import java.util.Scanner;

public class StringPracitce {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

        String firstName = "tony";
        String lastName = "Stark";
        String fullName = firstName + "@" + lastName;

        System.out.println(fullName.length());

        for(int i=0; i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
