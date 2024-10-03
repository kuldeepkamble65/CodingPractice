package JavaPractice;

import java.util.Scanner;

public class MinMaxNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the no");
        for(int i=0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] >max){
                max = arr[i];
            }
        }
        System.out.println("Largest no is : "+max);
        System.out.println("Smalles no is : "+min);
    }
}
