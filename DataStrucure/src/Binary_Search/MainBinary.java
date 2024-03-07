package Binary_Search;

import java.util.Scanner;

import static Binary_Search.BinarySearch.binarySearch;

public class MainBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int [] arr= new int[size];

        System.out.println("Enter the element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the element which you want to search");
        int target = sc.nextInt();
        int result = binarySearch(arr , target);
        if (result != -1) {
            System.out.println(target + " found at index " + result);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
