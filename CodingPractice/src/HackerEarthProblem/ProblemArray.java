package HackerEarthProblem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProblemArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");

        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the element of the arrray");
        Set<Integer> uniqueElements = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int element = sc.nextInt();
            if(uniqueElements.contains(element)){
                System.out.println("duplicate element found, enter distinct element");
                i--;
                continue;
            }
            arr[i] = element;
            uniqueElements.add(element);
        }

        System.out.println("enter the value of k");
        int k = sc.nextInt();

        int[] result = findTwoSum(arr, k);
        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Two indices with values equal to " + k + " are: " + result[0] + " and " + result[1]);
        }else {
            System.out.println("not such element found");
        }
    }
    public static int[] findTwoSum(int [] arr, int k){
        for(int i=0;i< arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1, -1};
    }

}
