package HackerEarthProblem;

import java.util.*;

public class ProblemArrayDuplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");

        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the element of the arrray");
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
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
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = k - arr[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return null;
    }
}