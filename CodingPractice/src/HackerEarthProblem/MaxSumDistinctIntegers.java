package HackerEarthProblem;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumDistinctIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no of test case");
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            System.out.println("enter lenght of array");
            int n = scanner.nextInt();
            System.out.println("enter Maximum number of distinct integers ");
            int k = scanner.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int result = maxSumDistinctIntegers(arr, n, k);
            System.out.println(result);
        }
    }

    private static int maxSumDistinctIntegers(int[] arr, int n, int k) {
        Arrays.sort(arr);

        int sum = 0;
        int distinctCount = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1 && arr[i] != arr[i + 1]) {
                distinctCount++;
            }

            if (distinctCount < k) {
                sum = sum + arr[i];
            }
        }

        return sum;
    }
}