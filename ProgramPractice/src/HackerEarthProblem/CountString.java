package HackerEarthProblem;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T > 0) {
            String S = scanner.next();
            char k = scanner.next().charAt(0);
            int result = countK(S, k);
            System.out.println(result);
        }
    }

    public static int countK(String S, char k) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == k) {
                count++;
            }
        }
        return count;
    }
}


