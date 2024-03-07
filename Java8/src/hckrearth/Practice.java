package hckrearth;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxCount = 0;

        // Find the maximum count
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        // Count the number of favorite singers
        int favoriteSingerCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == maxCount) {
                favoriteSingerCount++;
            }
        }

        // Output the result
        System.out.println(favoriteSingerCount);

        // Close the scanner
        sc.close();
    }
}
