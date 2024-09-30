package HackerEarthProblem;

import java.util.Arrays;
import java.util.Scanner;

public class EasyGoingSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int k=0; k<T;k++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[] = new int[n];

            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
           for(int i=0; i<arr.length;i++){
               for(int j=i+1; j<arr.length;j++){
                   if(arr[i]>arr[j]){
                       int temp = arr[i];
                       arr[i] = arr[j];
                       arr[j] = temp;
                   }
               }
           }
            int element = n-m;
            int minSum = 0;
            for(int i=0;i<element;i++){
                minSum = minSum + arr[i];

            }
            int maxSum = 0;
            for(int i=n-1; i>m-1;i--){
                maxSum = maxSum + arr[i];

            }
            int diff = maxSum-minSum;
            System.out.println(diff);
        }
    }
}
