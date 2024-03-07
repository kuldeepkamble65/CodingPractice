package Linear_Search;

import java.util.Scanner;

import static Linear_Search.LinearSearch.linearSearch;

public class Linear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] Arr = new int[size];

        System.out.println("Enter the element of array");
        for (int i = 0; i < Arr.length; i++) {

            Arr[i] = sc.nextInt();


        }

            System.out.println("Enter the element which you want to search");
             int target = sc.nextInt();
            int result = linearSearch(Arr , target);

            if (result != -1) {
                System.out.println(target + " found at index " + result);
            } else {
                System.out.println(target + " not found in the array.");
            }


        }
    }

