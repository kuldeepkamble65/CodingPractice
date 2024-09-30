package HackerEarthProblem;

import java.util.*;

public class DistinctIntegerProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            System.out.println("enter lenght of array");
            int n = sc.nextInt();
            System.out.println("enter Maximum number of distinct integers ");
            int k = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Map<Integer, Integer> countMap = new HashMap<>();
            // Array to store the results
            List<Integer> results = new ArrayList<>();

            for (int num : arr) {
                if (countMap.containsKey(num)) {
                    int count = countMap.get(num) + 1;
                    countMap.put(num, count);
                    if (count == 2) {
                        results.add(num * count);
                    }
                } else {
                    countMap.put(num, 1);
                }
            }

            System.out.println("Result array: " + results);
        }
    }
}

