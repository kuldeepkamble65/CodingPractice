package HackerEarthProblem;

import java.util.Scanner;

public class VillageDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the village layout:");
        String village = scanner.nextLine();

        divideVillage(village);
    }

    static void divideVillage(String village) {
        int n = village.length();

        // Step 2: Checking Possibility
        int maxDistance = 0;
        for (int i = 0; i < n; i++) {
            if (village.charAt(i) == 'H') {
                int leftDistance = countChar(village.substring(0, i), '.');
                int rightDistance = countChar(village.substring(i + 1), '.');
                
                if (maxDistance == 0) {
                    maxDistance = leftDistance + rightDistance;
                } else if (maxDistance != leftDistance + rightDistance) {
                    System.out.println("No solution exists.");
                    return;
                }
            }
        }

        // Step 3: Printing Solution
        StringBuilder modifiedVillage = new StringBuilder(village);
        for (int i = 0; i < n; i++) {
            if (village.charAt(i) == 'H') {
                int leftDistance = countChar(village.substring(0, i), '.');
                int rightDistance = countChar(village.substring(i + 1), '.');
                int distance = Math.min(leftDistance, rightDistance);

                modifiedVillage.setCharAt(i - distance, 'B');
                modifiedVillage.setCharAt(i + distance + 1, 'B');
            }
        }

        // Step 4: Output
        System.out.println(modifiedVillage.toString());
    }

    static int countChar(String str, char target) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }
        return count;
    }
}
