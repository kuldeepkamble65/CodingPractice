package JavaPractice;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class IsSortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the array");
        int number[] = new int[size];

        for(int i=0; i<size;i++){
            number[i] = sc.nextInt();
        }

        boolean isAssending = true;
        for(int i=0; i<number.length-1;i++){
            if(number[i] > number[i+1]){
                isAssending = false;
            }
        }
        if(isAssending){
            System.out.println("The array is sorted in ascending order ");
        } else{
            System.out.println("The array is not sorted in ascending order ");
        }

    }
}
