package JavaPractice;

import java.util.Scanner;

public class ArraysHW1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();

        String name[] = new String[size];

        System.out.println("Enter the names ");
        for(int i=0;i<size;i++){
            name[i] = sc.next();
        }
        for(int i=0;i<name.length;i++){
            System.out.println("Name "+ (i+1) +" is "+name[i]);
        }
    }
}
